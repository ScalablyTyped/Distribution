package typings.mongodbClientEncryption

import typings.mongodbClientEncryption.mod.AWSEncryptionKeyOptions
import typings.mongodbClientEncryption.mod.AzureEncryptionKeyOptions
import typings.mongodbClientEncryption.mod.ClientEncryptionDataKeyProvider
import typings.mongodbClientEncryption.mod.ClientEncryptionTlsOptions
import typings.mongodbClientEncryption.mod.GCPEncryptionKeyOptions
import typings.mongodbClientEncryption.mongodbClientEncryptionStrings.encryptedFields
import typings.node.bufferMod.global.Buffer
import typings.std.Document
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AccessKeyId extends StObject {
    
    /**
      * The access key used for the AWS KMS provider
      */
    var accessKeyId: String
    
    /**
      * The secret access key used for the AWS KMS provider
      */
    var secretAccessKey: String
    
    /**
      * An optional AWS session token that will be used as the
      * X-Amz-Security-Token header for AWS requests.
      */
    var sessionToken: js.UndefOr[String] = js.undefined
  }
  object AccessKeyId {
    
    inline def apply(accessKeyId: String, secretAccessKey: String): AccessKeyId = {
      val __obj = js.Dynamic.literal(accessKeyId = accessKeyId.asInstanceOf[js.Any], secretAccessKey = secretAccessKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[AccessKeyId]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AccessKeyId] (val x: Self) extends AnyVal {
      
      inline def setAccessKeyId(value: String): Self = StObject.set(x, "accessKeyId", value.asInstanceOf[js.Any])
      
      inline def setSecretAccessKey(value: String): Self = StObject.set(x, "secretAccessKey", value.asInstanceOf[js.Any])
      
      inline def setSessionToken(value: String): Self = StObject.set(x, "sessionToken", value.asInstanceOf[js.Any])
      
      inline def setSessionTokenUndefined: Self = StObject.set(x, "sessionToken", js.undefined)
    }
  }
  
  trait AccessToken extends StObject {
    
    /**
      * If present, an access token to authenticate with GCP.
      */
    var accessToken: String
  }
  object AccessToken {
    
    inline def apply(accessToken: String): AccessToken = {
      val __obj = js.Dynamic.literal(accessToken = accessToken.asInstanceOf[js.Any])
      __obj.asInstanceOf[AccessToken]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AccessToken] (val x: Self) extends AnyVal {
      
      inline def setAccessToken(value: String): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
    }
  }
  
  trait ClientId extends StObject {
    
    /**
      * The client ID to authenticate a registered application
      */
    var clientId: String
    
    /**
      * The client secret to authenticate a registered application
      */
    var clientSecret: String
    
    /**
      * If present, a host with optional port. E.g. "example.com" or "example.com:443".
      * This is optional, and only needed if customer is using a non-commercial Azure instance
      * (e.g. a government or China account, which use different URLs).
      * Defaults to "login.microsoftonline.com"
      */
    var identityPlatformEndpoint: js.UndefOr[String] = js.undefined
    
    /**
      * The tenant ID identifies the organization for the account
      */
    var tenantId: String
  }
  object ClientId {
    
    inline def apply(clientId: String, clientSecret: String, tenantId: String): ClientId = {
      val __obj = js.Dynamic.literal(clientId = clientId.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any], tenantId = tenantId.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClientId]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ClientId] (val x: Self) extends AnyVal {
      
      inline def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
      
      inline def setClientSecret(value: String): Self = StObject.set(x, "clientSecret", value.asInstanceOf[js.Any])
      
      inline def setIdentityPlatformEndpoint(value: String): Self = StObject.set(x, "identityPlatformEndpoint", value.asInstanceOf[js.Any])
      
      inline def setIdentityPlatformEndpointUndefined: Self = StObject.set(x, "identityPlatformEndpoint", js.undefined)
      
      inline def setTenantId(value: String): Self = StObject.set(x, "tenantId", value.asInstanceOf[js.Any])
    }
  }
  
  trait Collection extends StObject {
    
    var collection: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Collection<TSchema> */ Any
    
    var encryptedFields: Document
  }
  object Collection {
    
    inline def apply(
      collection: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Collection<TSchema> */ Any,
      encryptedFields: Document
    ): Collection = {
      val __obj = js.Dynamic.literal(collection = collection.asInstanceOf[js.Any], encryptedFields = encryptedFields.asInstanceOf[js.Any])
      __obj.asInstanceOf[Collection]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Collection] (val x: Self) extends AnyVal {
      
      inline def setCollection(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Collection<TSchema> */ Any
      ): Self = StObject.set(x, "collection", value.asInstanceOf[js.Any])
      
      inline def setEncryptedFields(value: Document): Self = StObject.set(x, "encryptedFields", value.asInstanceOf[js.Any])
    }
  }
  
  trait CreateCollectionOptions extends StObject {
    
    var createCollectionOptions: (Omit[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CreateCollectionOptions */ Any, 
        encryptedFields
      ]) & EncryptedFields
    
    var masterKey: js.UndefOr[AWSEncryptionKeyOptions | AzureEncryptionKeyOptions | GCPEncryptionKeyOptions] = js.undefined
    
    var provider: ClientEncryptionDataKeyProvider
  }
  object CreateCollectionOptions {
    
    inline def apply(
      createCollectionOptions: (Omit[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CreateCollectionOptions */ Any, 
          encryptedFields
        ]) & EncryptedFields,
      provider: ClientEncryptionDataKeyProvider
    ): CreateCollectionOptions = {
      val __obj = js.Dynamic.literal(createCollectionOptions = createCollectionOptions.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateCollectionOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CreateCollectionOptions] (val x: Self) extends AnyVal {
      
      inline def setCreateCollectionOptions(
        value: (Omit[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CreateCollectionOptions */ Any, 
              encryptedFields
            ]) & EncryptedFields
      ): Self = StObject.set(x, "createCollectionOptions", value.asInstanceOf[js.Any])
      
      inline def setMasterKey(value: AWSEncryptionKeyOptions | AzureEncryptionKeyOptions | GCPEncryptionKeyOptions): Self = StObject.set(x, "masterKey", value.asInstanceOf[js.Any])
      
      inline def setMasterKeyUndefined: Self = StObject.set(x, "masterKey", js.undefined)
      
      inline def setProvider(value: ClientEncryptionDataKeyProvider): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
    }
  }
  
  trait Email extends StObject {
    
    /**
      * The service account email to authenticate
      */
    var email: String
    
    /**
      * If present, a host with optional port. E.g. "example.com" or "example.com:443".
      * Defaults to "oauth2.googleapis.com"
      */
    var endpoint: js.UndefOr[String] = js.undefined
    
    /**
      * A PKCS#8 encrypted key. This can either be a base64 string or a binary representation
      */
    var privateKey: String | Buffer
  }
  object Email {
    
    inline def apply(email: String, privateKey: String | Buffer): Email = {
      val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], privateKey = privateKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[Email]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Email] (val x: Self) extends AnyVal {
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setEndpoint(value: String): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
      
      inline def setEndpointUndefined: Self = StObject.set(x, "endpoint", js.undefined)
      
      inline def setPrivateKey(value: String | Buffer): Self = StObject.set(x, "privateKey", value.asInstanceOf[js.Any])
    }
  }
  
  trait EncryptedFields extends StObject {
    
    var encryptedFields: Document
  }
  object EncryptedFields {
    
    inline def apply(encryptedFields: Document): EncryptedFields = {
      val __obj = js.Dynamic.literal(encryptedFields = encryptedFields.asInstanceOf[js.Any])
      __obj.asInstanceOf[EncryptedFields]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EncryptedFields] (val x: Self) extends AnyVal {
      
      inline def setEncryptedFields(value: Document): Self = StObject.set(x, "encryptedFields", value.asInstanceOf[js.Any])
    }
  }
  
  trait Endpoint extends StObject {
    
    /**
      * The output endpoint string.
      * The endpoint consists of a hostname and port separated by a colon.
      * E.g. "example.com:123". A port is always present.
      */
    var endpoint: js.UndefOr[String] = js.undefined
  }
  object Endpoint {
    
    inline def apply(): Endpoint = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Endpoint]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Endpoint] (val x: Self) extends AnyVal {
      
      inline def setEndpoint(value: String): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
      
      inline def setEndpointUndefined: Self = StObject.set(x, "endpoint", js.undefined)
    }
  }
  
  trait Key extends StObject {
    
    /**
      * The master key used to encrypt/decrypt data keys.
      * A 96-byte long Buffer or base64 encoded string.
      */
    var key: Buffer | String
  }
  object Key {
    
    inline def apply(key: Buffer | String): Key = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[Key]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Key] (val x: Self) extends AnyVal {
      
      inline def setKey(value: Buffer | String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined {[ kms in keyof mongodb-client-encryption.mongodb-client-encryption.KMSProviders ]:? mongodb-client-encryption.mongodb-client-encryption.ClientEncryptionTlsOptions} */
  trait kmsinkeyofKMSProvidersCli extends StObject {
    
    var aws: js.UndefOr[ClientEncryptionTlsOptions] = js.undefined
    
    var azure: js.UndefOr[ClientEncryptionTlsOptions] = js.undefined
    
    var gcp: js.UndefOr[ClientEncryptionTlsOptions] = js.undefined
    
    var kmip: js.UndefOr[ClientEncryptionTlsOptions] = js.undefined
    
    var local: js.UndefOr[ClientEncryptionTlsOptions] = js.undefined
  }
  object kmsinkeyofKMSProvidersCli {
    
    inline def apply(): kmsinkeyofKMSProvidersCli = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[kmsinkeyofKMSProvidersCli]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: kmsinkeyofKMSProvidersCli] (val x: Self) extends AnyVal {
      
      inline def setAws(value: ClientEncryptionTlsOptions): Self = StObject.set(x, "aws", value.asInstanceOf[js.Any])
      
      inline def setAwsUndefined: Self = StObject.set(x, "aws", js.undefined)
      
      inline def setAzure(value: ClientEncryptionTlsOptions): Self = StObject.set(x, "azure", value.asInstanceOf[js.Any])
      
      inline def setAzureUndefined: Self = StObject.set(x, "azure", js.undefined)
      
      inline def setGcp(value: ClientEncryptionTlsOptions): Self = StObject.set(x, "gcp", value.asInstanceOf[js.Any])
      
      inline def setGcpUndefined: Self = StObject.set(x, "gcp", js.undefined)
      
      inline def setKmip(value: ClientEncryptionTlsOptions): Self = StObject.set(x, "kmip", value.asInstanceOf[js.Any])
      
      inline def setKmipUndefined: Self = StObject.set(x, "kmip", js.undefined)
      
      inline def setLocal(value: ClientEncryptionTlsOptions): Self = StObject.set(x, "local", value.asInstanceOf[js.Any])
      
      inline def setLocalUndefined: Self = StObject.set(x, "local", js.undefined)
    }
  }
}
