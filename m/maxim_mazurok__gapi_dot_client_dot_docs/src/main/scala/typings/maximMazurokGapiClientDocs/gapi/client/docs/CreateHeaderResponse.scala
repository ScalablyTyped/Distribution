package typings.maximMazurokGapiClientDocs.gapi.client.docs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateHeaderResponse extends js.Object {
  
  /** The ID of the created header. */
  var headerId: js.UndefOr[String] = js.native
}
object CreateHeaderResponse {
  
  @scala.inline
  def apply(): CreateHeaderResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateHeaderResponse]
  }
  
  @scala.inline
  implicit class CreateHeaderResponseOps[Self <: CreateHeaderResponse] (val x: Self) extends AnyVal {
    
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
