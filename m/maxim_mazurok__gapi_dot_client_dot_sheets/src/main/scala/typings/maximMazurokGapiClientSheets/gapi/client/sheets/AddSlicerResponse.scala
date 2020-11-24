package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddSlicerResponse extends js.Object {
  
  /** The newly added slicer. */
  var slicer: js.UndefOr[Slicer] = js.native
}
object AddSlicerResponse {
  
  @scala.inline
  def apply(): AddSlicerResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddSlicerResponse]
  }
  
  @scala.inline
  implicit class AddSlicerResponseOps[Self <: AddSlicerResponse] (val x: Self) extends AnyVal {
    
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
    def setSlicer(value: Slicer): Self = this.set("slicer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSlicer: Self = this.set("slicer", js.undefined)
  }
}
