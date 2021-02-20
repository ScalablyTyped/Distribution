package typings.pkgcloud.mod

import typings.pkgcloud.pkgcloudStrings.azure
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AzureProviderOptions extends StObject {
  
  var location: js.UndefOr[String] = js.native
  
  var provider: azure = js.native
  
  var storageAccessKey: String = js.native
  
  var storageAccount: String = js.native
}
object AzureProviderOptions {
  
  @scala.inline
  def apply(provider: azure, storageAccessKey: String, storageAccount: String): AzureProviderOptions = {
    val __obj = js.Dynamic.literal(provider = provider.asInstanceOf[js.Any], storageAccessKey = storageAccessKey.asInstanceOf[js.Any], storageAccount = storageAccount.asInstanceOf[js.Any])
    __obj.asInstanceOf[AzureProviderOptions]
  }
  
  @scala.inline
  implicit class AzureProviderOptionsMutableBuilder[Self <: AzureProviderOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setProvider(value: azure): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorageAccessKey(value: String): Self = StObject.set(x, "storageAccessKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorageAccount(value: String): Self = StObject.set(x, "storageAccount", value.asInstanceOf[js.Any])
  }
}
