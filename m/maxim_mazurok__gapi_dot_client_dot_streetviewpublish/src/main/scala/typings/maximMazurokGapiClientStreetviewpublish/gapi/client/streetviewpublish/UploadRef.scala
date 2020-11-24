package typings.maximMazurokGapiClientStreetviewpublish.gapi.client.streetviewpublish

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UploadRef extends js.Object {
  
  /** Required. An upload reference should be unique for each user. It follows the form: "https://streetviewpublish.googleapis.com/media/user/{account_id}/photo/{upload_reference}" */
  var uploadUrl: js.UndefOr[String] = js.native
}
object UploadRef {
  
  @scala.inline
  def apply(): UploadRef = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UploadRef]
  }
  
  @scala.inline
  implicit class UploadRefOps[Self <: UploadRef] (val x: Self) extends AnyVal {
    
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
    def setUploadUrl(value: String): Self = this.set("uploadUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUploadUrl: Self = this.set("uploadUrl", js.undefined)
  }
}
