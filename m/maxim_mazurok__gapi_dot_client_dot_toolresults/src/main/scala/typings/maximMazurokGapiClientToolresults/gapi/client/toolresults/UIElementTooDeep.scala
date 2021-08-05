package typings.maximMazurokGapiClientToolresults.gapi.client.toolresults

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UIElementTooDeep extends StObject {
  
  /** The depth of the screen element */
  var depth: js.UndefOr[Double] = js.undefined
  
  /** The screen id of the element */
  var screenId: js.UndefOr[String] = js.undefined
  
  /** The screen state id of the element */
  var screenStateId: js.UndefOr[String] = js.undefined
}
object UIElementTooDeep {
  
  inline def apply(): UIElementTooDeep = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UIElementTooDeep]
  }
  
  extension [Self <: UIElementTooDeep](x: Self) {
    
    inline def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
    
    inline def setDepthUndefined: Self = StObject.set(x, "depth", js.undefined)
    
    inline def setScreenId(value: String): Self = StObject.set(x, "screenId", value.asInstanceOf[js.Any])
    
    inline def setScreenIdUndefined: Self = StObject.set(x, "screenId", js.undefined)
    
    inline def setScreenStateId(value: String): Self = StObject.set(x, "screenStateId", value.asInstanceOf[js.Any])
    
    inline def setScreenStateIdUndefined: Self = StObject.set(x, "screenStateId", js.undefined)
  }
}
