package typings.mongodb.mod

import typings.bson.mod.Document
import typings.mongodb.anon.Aws
import typings.mongodb.anon.Azure
import typings.mongodb.anon.CryptSharedLibPath
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoEncryptionOptions extends StObject {
  
  /** Allows the user to bypass auto encryption, maintaining implicit decryption */
  var bypassAutoEncryption: js.UndefOr[Boolean] = js.undefined
  
  /** @experimental Public Technical Preview: Allows users to bypass query analysis */
  var bypassQueryAnalysis: js.UndefOr[Boolean] = js.undefined
  
  /** @experimental Public Technical Preview: Supply a schema for the encrypted fields in the document  */
  var encryptedFieldsMap: js.UndefOr[Document] = js.undefined
  
  var extraOptions: js.UndefOr[CryptSharedLibPath] = js.undefined
  
  /* Excluded from this release type: bson */
  /* Excluded from this release type: metadataClient */
  /** A `MongoClient` used to fetch keys from a key vault */
  var keyVaultClient: js.UndefOr[MongoClient] = js.undefined
  
  /** The namespace where keys are stored in the key vault */
  var keyVaultNamespace: js.UndefOr[String] = js.undefined
  
  /** Configuration options that are used by specific KMS providers during key generation, encryption, and decryption. */
  var kmsProviders: js.UndefOr[Aws] = js.undefined
  
  var options: js.UndefOr[typings.mongodb.anon.Logger] = js.undefined
  
  var proxyOptions: js.UndefOr[ProxyOptions] = js.undefined
  
  /**
    * A map of namespaces to a local JSON schema for encryption
    *
    * **NOTE**: Supplying options.schemaMap provides more security than relying on JSON Schemas obtained from the server.
    * It protects against a malicious server advertising a false JSON Schema, which could trick the client into sending decrypted data that should be encrypted.
    * Schemas supplied in the schemaMap only apply to configuring automatic encryption for Client-Side Field Level Encryption.
    * Other validation rules in the JSON schema will not be enforced by the driver and will result in an error.
    */
  var schemaMap: js.UndefOr[Document] = js.undefined
  
  /** The TLS options to use connecting to the KMS provider */
  var tlsOptions: js.UndefOr[Azure] = js.undefined
}
object AutoEncryptionOptions {
  
  inline def apply(): AutoEncryptionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoEncryptionOptions]
  }
  
  extension [Self <: AutoEncryptionOptions](x: Self) {
    
    inline def setBypassAutoEncryption(value: Boolean): Self = StObject.set(x, "bypassAutoEncryption", value.asInstanceOf[js.Any])
    
    inline def setBypassAutoEncryptionUndefined: Self = StObject.set(x, "bypassAutoEncryption", js.undefined)
    
    inline def setBypassQueryAnalysis(value: Boolean): Self = StObject.set(x, "bypassQueryAnalysis", value.asInstanceOf[js.Any])
    
    inline def setBypassQueryAnalysisUndefined: Self = StObject.set(x, "bypassQueryAnalysis", js.undefined)
    
    inline def setEncryptedFieldsMap(value: Document): Self = StObject.set(x, "encryptedFieldsMap", value.asInstanceOf[js.Any])
    
    inline def setEncryptedFieldsMapUndefined: Self = StObject.set(x, "encryptedFieldsMap", js.undefined)
    
    inline def setExtraOptions(value: CryptSharedLibPath): Self = StObject.set(x, "extraOptions", value.asInstanceOf[js.Any])
    
    inline def setExtraOptionsUndefined: Self = StObject.set(x, "extraOptions", js.undefined)
    
    inline def setKeyVaultClient(value: MongoClient): Self = StObject.set(x, "keyVaultClient", value.asInstanceOf[js.Any])
    
    inline def setKeyVaultClientUndefined: Self = StObject.set(x, "keyVaultClient", js.undefined)
    
    inline def setKeyVaultNamespace(value: String): Self = StObject.set(x, "keyVaultNamespace", value.asInstanceOf[js.Any])
    
    inline def setKeyVaultNamespaceUndefined: Self = StObject.set(x, "keyVaultNamespace", js.undefined)
    
    inline def setKmsProviders(value: Aws): Self = StObject.set(x, "kmsProviders", value.asInstanceOf[js.Any])
    
    inline def setKmsProvidersUndefined: Self = StObject.set(x, "kmsProviders", js.undefined)
    
    inline def setOptions(value: typings.mongodb.anon.Logger): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setProxyOptions(value: ProxyOptions): Self = StObject.set(x, "proxyOptions", value.asInstanceOf[js.Any])
    
    inline def setProxyOptionsUndefined: Self = StObject.set(x, "proxyOptions", js.undefined)
    
    inline def setSchemaMap(value: Document): Self = StObject.set(x, "schemaMap", value.asInstanceOf[js.Any])
    
    inline def setSchemaMapUndefined: Self = StObject.set(x, "schemaMap", js.undefined)
    
    inline def setTlsOptions(value: Azure): Self = StObject.set(x, "tlsOptions", value.asInstanceOf[js.Any])
    
    inline def setTlsOptionsUndefined: Self = StObject.set(x, "tlsOptions", js.undefined)
  }
}
