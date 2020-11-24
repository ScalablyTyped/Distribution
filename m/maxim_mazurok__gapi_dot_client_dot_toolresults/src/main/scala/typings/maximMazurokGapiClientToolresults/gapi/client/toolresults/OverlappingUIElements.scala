package typings.maximMazurokGapiClientToolresults.gapi.client.toolresults

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OverlappingUIElements extends js.Object {
  
  /** Resource names of the overlapping screen elements */
  var resourceName: js.UndefOr[js.Array[String]] = js.native
  
  /** The screen id of the elements */
  var screenId: js.UndefOr[String] = js.native
}
object OverlappingUIElements {
  
  @scala.inline
  def apply(): OverlappingUIElements = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OverlappingUIElements]
  }
  
  @scala.inline
  implicit class OverlappingUIElementsOps[Self <: OverlappingUIElements] (val x: Self) extends AnyVal {
    
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
    def setResourceNameVarargs(value: String*): Self = this.set("resourceName", js.Array(value :_*))
    
    @scala.inline
    def setResourceName(value: js.Array[String]): Self = this.set("resourceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceName: Self = this.set("resourceName", js.undefined)
    
    @scala.inline
    def setScreenId(value: String): Self = this.set("screenId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScreenId: Self = this.set("screenId", js.undefined)
  }
}
