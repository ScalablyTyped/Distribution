package typings.maximMazurokGapiClientStoragetransfer.gapi.client.storagetransfer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AzureBlobStorageData extends StObject {
  
  /**
    * Required. Input only. Credentials used to authenticate API requests to Azure. For information on our data retention policy for user credentials, see [User
    * credentials](data-retention#user-credentials).
    */
  var azureCredentials: js.UndefOr[AzureCredentials] = js.undefined
  
  /** Required. The container to transfer from the Azure Storage account. */
  var container: js.UndefOr[String] = js.undefined
  
  /** Required. The name of the Azure Storage account. */
  var storageAccount: js.UndefOr[String] = js.undefined
}
object AzureBlobStorageData {
  
  @scala.inline
  def apply(): AzureBlobStorageData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AzureBlobStorageData]
  }
  
  @scala.inline
  implicit class AzureBlobStorageDataMutableBuilder[Self <: AzureBlobStorageData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAzureCredentials(value: AzureCredentials): Self = StObject.set(x, "azureCredentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAzureCredentialsUndefined: Self = StObject.set(x, "azureCredentials", js.undefined)
    
    @scala.inline
    def setContainer(value: String): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    @scala.inline
    def setStorageAccount(value: String): Self = StObject.set(x, "storageAccount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorageAccountUndefined: Self = StObject.set(x, "storageAccount", js.undefined)
  }
}
