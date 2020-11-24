package typings.maximMazurokGapiClientStoragetransfer.gapi.client.storagetransfer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AzureCredentials extends js.Object {
  
  /**
    * Required. Azure shared access signature. (see [Grant limited access to Azure Storage resources using shared access signatures
    * (SAS)](https://docs.microsoft.com/en-us/azure/storage/common/storage-sas-overview)).
    */
  var sasToken: js.UndefOr[String] = js.native
}
object AzureCredentials {
  
  @scala.inline
  def apply(): AzureCredentials = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AzureCredentials]
  }
  
  @scala.inline
  implicit class AzureCredentialsOps[Self <: AzureCredentials] (val x: Self) extends AnyVal {
    
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
    def setSasToken(value: String): Self = this.set("sasToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSasToken: Self = this.set("sasToken", js.undefined)
  }
}
