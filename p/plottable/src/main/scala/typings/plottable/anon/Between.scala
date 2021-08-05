package typings.plottable.anon

import typings.plottable.plottableStrings.between
import typings.plottable.plottableStrings.center
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Between extends StObject {
  
  var between: typings.plottable.plottableStrings.between
  
  var center: typings.plottable.plottableStrings.center
}
object Between {
  
  inline def apply(): Between = {
    val __obj = js.Dynamic.literal(between = "between", center = "center")
    __obj.asInstanceOf[Between]
  }
  
  extension [Self <: Between](x: Self) {
    
    inline def setBetween(value: between): Self = StObject.set(x, "between", value.asInstanceOf[js.Any])
    
    inline def setCenter(value: center): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
  }
}
