package typings.maximMazurokGapiClientStoragetransfer.gapi.client.storagetransfer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AzureBlobStorageData extends js.Object {
  
  /**
    * Required. Input only. Credentials used to authenticate API requests to Azure. For information on our data retention policy for user credentials, see [User
    * credentials](data-retention#user-credentials).
    */
  var azureCredentials: js.UndefOr[AzureCredentials] = js.native
  
  /** Required. The container to transfer from the Azure Storage account. */
  var container: js.UndefOr[String] = js.native
  
  /** Required. The name of the Azure Storage account. */
  var storageAccount: js.UndefOr[String] = js.native
}
object AzureBlobStorageData {
  
  @scala.inline
  def apply(): AzureBlobStorageData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AzureBlobStorageData]
  }
  
  @scala.inline
  implicit class AzureBlobStorageDataOps[Self <: AzureBlobStorageData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAzureCredentials(value: AzureCredentials): Self = this.set("azureCredentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAzureCredentials: Self = this.set("azureCredentials", js.undefined)
    
    @scala.inline
    def setContainer(value: String): Self = this.set("container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainer: Self = this.set("container", js.undefined)
    
    @scala.inline
    def setStorageAccount(value: String): Self = this.set("storageAccount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStorageAccount: Self = this.set("storageAccount", js.undefined)
  }
}
