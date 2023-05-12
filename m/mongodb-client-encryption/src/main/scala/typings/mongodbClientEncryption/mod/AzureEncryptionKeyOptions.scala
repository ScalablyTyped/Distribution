package typings.mongodbClientEncryption.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AzureEncryptionKeyOptions extends StObject {
  
  /**
    * Key name
    */
  var keyName: String
  
  /**
    * Key vault URL, typically `<name>.vault.azure.net`
    */
  var keyVaultEndpoint: String
  
  /**
    * Key version
    */
  var keyVersion: js.UndefOr[String] = js.undefined
}
object AzureEncryptionKeyOptions {
  
  inline def apply(keyName: String, keyVaultEndpoint: String): AzureEncryptionKeyOptions = {
    val __obj = js.Dynamic.literal(keyName = keyName.asInstanceOf[js.Any], keyVaultEndpoint = keyVaultEndpoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[AzureEncryptionKeyOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AzureEncryptionKeyOptions] (val x: Self) extends AnyVal {
    
    inline def setKeyName(value: String): Self = StObject.set(x, "keyName", value.asInstanceOf[js.Any])
    
    inline def setKeyVaultEndpoint(value: String): Self = StObject.set(x, "keyVaultEndpoint", value.asInstanceOf[js.Any])
    
    inline def setKeyVersion(value: String): Self = StObject.set(x, "keyVersion", value.asInstanceOf[js.Any])
    
    inline def setKeyVersionUndefined: Self = StObject.set(x, "keyVersion", js.undefined)
  }
}
