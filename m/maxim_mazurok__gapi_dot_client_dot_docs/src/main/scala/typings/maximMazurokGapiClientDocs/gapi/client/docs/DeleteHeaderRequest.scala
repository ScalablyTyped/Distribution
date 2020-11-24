package typings.maximMazurokGapiClientDocs.gapi.client.docs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteHeaderRequest extends js.Object {
  
  /**
    * The id of the header to delete. If this header is defined on DocumentStyle, the reference to this header is removed, resulting in no header of that type for the first section of the
    * document. If this header is defined on a SectionStyle, the reference to this header is removed and the header of that type is now continued from the previous section.
    */
  var headerId: js.UndefOr[String] = js.native
}
object DeleteHeaderRequest {
  
  @scala.inline
  def apply(): DeleteHeaderRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteHeaderRequest]
  }
  
  @scala.inline
  implicit class DeleteHeaderRequestOps[Self <: DeleteHeaderRequest] (val x: Self) extends AnyVal {
    
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
    def setHeaderId(value: String): Self = this.set("headerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderId: Self = this.set("headerId", js.undefined)
  }
}
