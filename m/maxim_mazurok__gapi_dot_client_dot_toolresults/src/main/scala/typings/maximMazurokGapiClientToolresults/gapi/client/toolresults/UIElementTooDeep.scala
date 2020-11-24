package typings.maximMazurokGapiClientToolresults.gapi.client.toolresults

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UIElementTooDeep extends js.Object {
  
  /** The depth of the screen element */
  var depth: js.UndefOr[Double] = js.native
  
  /** The screen id of the element */
  var screenId: js.UndefOr[String] = js.native
  
  /** The screen state id of the element */
  var screenStateId: js.UndefOr[String] = js.native
}
object UIElementTooDeep {
  
  @scala.inline
  def apply(): UIElementTooDeep = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UIElementTooDeep]
  }
  
  @scala.inline
  implicit class UIElementTooDeepOps[Self <: UIElementTooDeep] (val x: Self) extends AnyVal {
    
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
    def setDepth(value: Double): Self = this.set("depth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDepth: Self = this.set("depth", js.undefined)
    
    @scala.inline
    def setScreenId(value: String): Self = this.set("screenId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScreenId: Self = this.set("screenId", js.undefined)
    
    @scala.inline
    def setScreenStateId(value: String): Self = this.set("screenStateId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScreenStateId: Self = this.set("screenStateId", js.undefined)
  }
}
