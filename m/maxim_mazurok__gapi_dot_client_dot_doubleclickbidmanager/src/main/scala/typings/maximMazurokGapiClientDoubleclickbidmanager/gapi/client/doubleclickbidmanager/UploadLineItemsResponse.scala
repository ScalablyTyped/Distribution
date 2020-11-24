package typings.maximMazurokGapiClientDoubleclickbidmanager.gapi.client.doubleclickbidmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UploadLineItemsResponse extends js.Object {
  
  /** Status of upload. */
  var uploadStatus: js.UndefOr[UploadStatus] = js.native
}
object UploadLineItemsResponse {
  
  @scala.inline
  def apply(): UploadLineItemsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UploadLineItemsResponse]
  }
  
  @scala.inline
  implicit class UploadLineItemsResponseOps[Self <: UploadLineItemsResponse] (val x: Self) extends AnyVal {
    
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
    def setUploadStatus(value: UploadStatus): Self = this.set("uploadStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUploadStatus: Self = this.set("uploadStatus", js.undefined)
  }
}
