package typings.maximMazurokGapiClientDocs.gapi.client.docs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateFootnoteResponse extends js.Object {
  
  /** The ID of the created footnote. */
  var footnoteId: js.UndefOr[String] = js.native
}
object CreateFootnoteResponse {
  
  @scala.inline
  def apply(): CreateFootnoteResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateFootnoteResponse]
  }
  
  @scala.inline
  implicit class CreateFootnoteResponseOps[Self <: CreateFootnoteResponse] (val x: Self) extends AnyVal {
    
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
    def setFootnoteId(value: String): Self = this.set("footnoteId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFootnoteId: Self = this.set("footnoteId", js.undefined)
  }
}
