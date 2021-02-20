package typings.maximMazurokGapiClientToolresults.gapi.client.toolresults

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UIElementTooDeep extends StObject {
  
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
  implicit class UIElementTooDeepMutableBuilder[Self <: UIElementTooDeep] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDepthUndefined: Self = StObject.set(x, "depth", js.undefined)
    
    @scala.inline
    def setScreenId(value: String): Self = StObject.set(x, "screenId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScreenIdUndefined: Self = StObject.set(x, "screenId", js.undefined)
    
    @scala.inline
    def setScreenStateId(value: String): Self = StObject.set(x, "screenStateId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScreenStateIdUndefined: Self = StObject.set(x, "screenStateId", js.undefined)
  }
}
