package typings.nivoAnnotations.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DatumX[Datum] extends StObject {
  
  var datum: Datum
  
  var x: Double
  
  var y: Double
}
object DatumX {
  
  inline def apply[Datum](datum: Datum, x: Double, y: Double): DatumX[Datum] = {
    val __obj = js.Dynamic.literal(datum = datum.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatumX[Datum]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DatumX[?], Datum] (val x: Self & DatumX[Datum]) extends AnyVal {
    
    inline def setDatum(value: Datum): Self = StObject.set(x, "datum", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
