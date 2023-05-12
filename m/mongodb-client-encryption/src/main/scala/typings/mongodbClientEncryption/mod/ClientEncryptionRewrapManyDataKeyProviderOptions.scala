package typings.mongodbClientEncryption.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientEncryptionRewrapManyDataKeyProviderOptions extends StObject {
  
  var masterKey: js.UndefOr[AWSEncryptionKeyOptions | AzureEncryptionKeyOptions | GCPEncryptionKeyOptions] = js.undefined
  
  var provider: ClientEncryptionDataKeyProvider
}
object ClientEncryptionRewrapManyDataKeyProviderOptions {
  
  inline def apply(provider: ClientEncryptionDataKeyProvider): ClientEncryptionRewrapManyDataKeyProviderOptions = {
    val __obj = js.Dynamic.literal(provider = provider.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientEncryptionRewrapManyDataKeyProviderOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClientEncryptionRewrapManyDataKeyProviderOptions] (val x: Self) extends AnyVal {
    
    inline def setMasterKey(value: AWSEncryptionKeyOptions | AzureEncryptionKeyOptions | GCPEncryptionKeyOptions): Self = StObject.set(x, "masterKey", value.asInstanceOf[js.Any])
    
    inline def setMasterKeyUndefined: Self = StObject.set(x, "masterKey", js.undefined)
    
    inline def setProvider(value: ClientEncryptionDataKeyProvider): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
  }
}
