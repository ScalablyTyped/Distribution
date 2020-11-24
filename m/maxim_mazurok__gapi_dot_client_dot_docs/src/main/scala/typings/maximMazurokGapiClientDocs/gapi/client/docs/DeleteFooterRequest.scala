package typings.maximMazurokGapiClientDocs.gapi.client.docs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteFooterRequest extends js.Object {
  
  /**
    * The id of the footer to delete. If this footer is defined on DocumentStyle, the reference to this footer is removed, resulting in no footer of that type for the first section of the
    * document. If this footer is defined on a SectionStyle, the reference to this footer is removed and the footer of that type is now continued from the previous section.
    */
  var footerId: js.UndefOr[String] = js.native
}
object DeleteFooterRequest {
  
  @scala.inline
  def apply(): DeleteFooterRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteFooterRequest]
  }
  
  @scala.inline
  implicit class DeleteFooterRequestOps[Self <: DeleteFooterRequest] (val x: Self) extends AnyVal {
    
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
    def setFooterId(value: String): Self = this.set("footerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFooterId: Self = this.set("footerId", js.undefined)
  }
}
