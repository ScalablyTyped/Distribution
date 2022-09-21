package typings.miniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavigateBackArgs extends StObject {
  
  /**
    * Number of pages to return. If delta is greater than the number
    * of open pages, it returns to the home page. Default value is 1
    */
  var delta: js.UndefOr[Double] = js.undefined
}
object NavigateBackArgs {
  
  inline def apply(): NavigateBackArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigateBackArgs]
  }
  
  extension [Self <: NavigateBackArgs](x: Self) {
    
    inline def setDelta(value: Double): Self = StObject.set(x, "delta", value.asInstanceOf[js.Any])
    
    inline def setDeltaUndefined: Self = StObject.set(x, "delta", js.undefined)
  }
}
