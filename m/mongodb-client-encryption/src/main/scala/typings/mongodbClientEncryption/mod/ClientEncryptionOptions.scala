package typings.mongodbClientEncryption.mod

import typings.mongodbClientEncryption.anon.kmsinkeyofKMSProvidersCli
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientEncryptionOptions extends StObject {
  
  /**
    * A MongoClient used to fetch keys from a key vault. Defaults to client.
    */
  var keyVaultClient: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MongoClient */ Any
  ] = js.undefined
  
  /**
    * The namespace of the key vault, used to store encryption keys
    */
  var keyVaultNamespace: String
  
  /**
    * Options for specific KMS providers to use
    */
  var kmsProviders: js.UndefOr[KMSProviders] = js.undefined
  
  /**
    * Optional callback to override KMS providers per-context.
    *
    * @deprecated Installing optional dependencies will automatically refresh kms
    *             provider credentials.
    */
  var onKmsProviderRefresh: js.UndefOr[js.Function0[js.Promise[KMSProviders]]] = js.undefined
  
  /**
    * Options for specifying a Socks5 proxy to use for connecting to the KMS.
    */
  var proxyOptions: js.UndefOr[ProxyOptions] = js.undefined
  
  /**
    * TLS options for kms providers to use.
    */
  var tlsOptions: js.UndefOr[kmsinkeyofKMSProvidersCli] = js.undefined
}
object ClientEncryptionOptions {
  
  inline def apply(keyVaultNamespace: String): ClientEncryptionOptions = {
    val __obj = js.Dynamic.literal(keyVaultNamespace = keyVaultNamespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientEncryptionOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClientEncryptionOptions] (val x: Self) extends AnyVal {
    
    inline def setKeyVaultClient(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MongoClient */ Any
    ): Self = StObject.set(x, "keyVaultClient", value.asInstanceOf[js.Any])
    
    inline def setKeyVaultClientUndefined: Self = StObject.set(x, "keyVaultClient", js.undefined)
    
    inline def setKeyVaultNamespace(value: String): Self = StObject.set(x, "keyVaultNamespace", value.asInstanceOf[js.Any])
    
    inline def setKmsProviders(value: KMSProviders): Self = StObject.set(x, "kmsProviders", value.asInstanceOf[js.Any])
    
    inline def setKmsProvidersUndefined: Self = StObject.set(x, "kmsProviders", js.undefined)
    
    inline def setOnKmsProviderRefresh(value: () => js.Promise[KMSProviders]): Self = StObject.set(x, "onKmsProviderRefresh", js.Any.fromFunction0(value))
    
    inline def setOnKmsProviderRefreshUndefined: Self = StObject.set(x, "onKmsProviderRefresh", js.undefined)
    
    inline def setProxyOptions(value: ProxyOptions): Self = StObject.set(x, "proxyOptions", value.asInstanceOf[js.Any])
    
    inline def setProxyOptionsUndefined: Self = StObject.set(x, "proxyOptions", js.undefined)
    
    inline def setTlsOptions(value: kmsinkeyofKMSProvidersCli): Self = StObject.set(x, "tlsOptions", value.asInstanceOf[js.Any])
    
    inline def setTlsOptionsUndefined: Self = StObject.set(x, "tlsOptions", js.undefined)
  }
}
