package typings.nivoAnnotations.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XY[Datum] extends StObject {
  
  var datum: Datum
  
  var x: Double
  
  var y: Double
}
object XY {
  
  inline def apply[Datum](datum: Datum, x: Double, y: Double): XY[Datum] = {
    val __obj = js.Dynamic.literal(datum = datum.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[XY[Datum]]
  }
  
  extension [Self <: XY[?], Datum](x: Self & XY[Datum]) {
    
    inline def setDatum(value: Datum): Self = StObject.set(x, "datum", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
