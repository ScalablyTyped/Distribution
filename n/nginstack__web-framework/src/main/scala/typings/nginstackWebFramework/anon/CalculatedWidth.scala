package typings.nginstackWebFramework.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CalculatedWidth extends StObject {
  
  var calculatedWidth: Double
  
  var leftMargin: Double
  
  var path: String
}
object CalculatedWidth {
  
  inline def apply(calculatedWidth: Double, leftMargin: Double, path: String): CalculatedWidth = {
    val __obj = js.Dynamic.literal(calculatedWidth = calculatedWidth.asInstanceOf[js.Any], leftMargin = leftMargin.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalculatedWidth]
  }
  
  extension [Self <: CalculatedWidth](x: Self) {
    
    inline def setCalculatedWidth(value: Double): Self = StObject.set(x, "calculatedWidth", value.asInstanceOf[js.Any])
    
    inline def setLeftMargin(value: Double): Self = StObject.set(x, "leftMargin", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
