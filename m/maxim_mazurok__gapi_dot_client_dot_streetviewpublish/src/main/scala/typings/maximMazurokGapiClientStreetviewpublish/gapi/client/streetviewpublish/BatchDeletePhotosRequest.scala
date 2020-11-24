package typings.maximMazurokGapiClientStreetviewpublish.gapi.client.streetviewpublish

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchDeletePhotosRequest extends js.Object {
  
  /** Required. IDs of the Photos. HTTP GET requests require the following syntax for the URL query parameter: `photoIds=&photoIds=&...`. */
  var photoIds: js.UndefOr[js.Array[String]] = js.native
}
object BatchDeletePhotosRequest {
  
  @scala.inline
  def apply(): BatchDeletePhotosRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchDeletePhotosRequest]
  }
  
  @scala.inline
  implicit class BatchDeletePhotosRequestOps[Self <: BatchDeletePhotosRequest] (val x: Self) extends AnyVal {
    
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
    def setPhotoIdsVarargs(value: String*): Self = this.set("photoIds", js.Array(value :_*))
    
    @scala.inline
    def setPhotoIds(value: js.Array[String]): Self = this.set("photoIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePhotoIds: Self = this.set("photoIds", js.undefined)
  }
}
