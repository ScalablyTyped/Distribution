package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddProtectedRangeRequest extends js.Object {
  
  /**
    * The protected range to be added. The protectedRangeId field is optional; if one is not set, an id will be randomly generated. (It is an error to specify the ID of a range that
    * already exists.)
    */
  var protectedRange: js.UndefOr[ProtectedRange] = js.native
}
object AddProtectedRangeRequest {
  
  @scala.inline
  def apply(): AddProtectedRangeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddProtectedRangeRequest]
  }
  
  @scala.inline
  implicit class AddProtectedRangeRequestOps[Self <: AddProtectedRangeRequest] (val x: Self) extends AnyVal {
    
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
    def setProtectedRange(value: ProtectedRange): Self = this.set("protectedRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProtectedRange: Self = this.set("protectedRange", js.undefined)
  }
}
