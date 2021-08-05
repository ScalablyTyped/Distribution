package typings.naverWhale.whale.tabs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TabWindowInfo extends StObject {
  
  /** The ID of the window of where the tab is located. */
  var windowId: Double
}
object TabWindowInfo {
  
  inline def apply(windowId: Double): TabWindowInfo = {
    val __obj = js.Dynamic.literal(windowId = windowId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabWindowInfo]
  }
  
  extension [Self <: TabWindowInfo](x: Self) {
    
    inline def setWindowId(value: Double): Self = StObject.set(x, "windowId", value.asInstanceOf[js.Any])
  }
}
