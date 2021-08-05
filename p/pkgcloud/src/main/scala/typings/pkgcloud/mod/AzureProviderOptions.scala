package typings.pkgcloud.mod

import typings.pkgcloud.pkgcloudStrings.azure
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AzureProviderOptions extends StObject {
  
  var location: js.UndefOr[String] = js.undefined
  
  var provider: azure
  
  var storageAccessKey: String
  
  var storageAccount: String
}
object AzureProviderOptions {
  
  inline def apply(storageAccessKey: String, storageAccount: String): AzureProviderOptions = {
    val __obj = js.Dynamic.literal(provider = "azure", storageAccessKey = storageAccessKey.asInstanceOf[js.Any], storageAccount = storageAccount.asInstanceOf[js.Any])
    __obj.asInstanceOf[AzureProviderOptions]
  }
  
  extension [Self <: AzureProviderOptions](x: Self) {
    
    inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setProvider(value: azure): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
    
    inline def setStorageAccessKey(value: String): Self = StObject.set(x, "storageAccessKey", value.asInstanceOf[js.Any])
    
    inline def setStorageAccount(value: String): Self = StObject.set(x, "storageAccount", value.asInstanceOf[js.Any])
  }
}
