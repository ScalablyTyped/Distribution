package typings.maximMazurokGapiClientDocs.gapi.client.docs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReplaceNamedRangeContentRequest extends js.Object {
  
  /** The ID of the named range whose content will be replaced. If there is no named range with the given ID a 400 bad request error is returned. */
  var namedRangeId: js.UndefOr[String] = js.native
  
  /**
    * The name of the NamedRanges whose content will be replaced. If there are multiple named ranges with the given name, then the content of each one will be replaced. If there are no
    * named ranges with the given name, then the request will be a no-op.
    */
  var namedRangeName: js.UndefOr[String] = js.native
  
  /** Replaces the content of the specified named range(s) with the given text. */
  var text: js.UndefOr[String] = js.native
}
object ReplaceNamedRangeContentRequest {
  
  @scala.inline
  def apply(): ReplaceNamedRangeContentRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplaceNamedRangeContentRequest]
  }
  
  @scala.inline
  implicit class ReplaceNamedRangeContentRequestOps[Self <: ReplaceNamedRangeContentRequest] (val x: Self) extends AnyVal {
    
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
    def setNamedRangeId(value: String): Self = this.set("namedRangeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNamedRangeId: Self = this.set("namedRangeId", js.undefined)
    
    @scala.inline
    def setNamedRangeName(value: String): Self = this.set("namedRangeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNamedRangeName: Self = this.set("namedRangeName", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
}
