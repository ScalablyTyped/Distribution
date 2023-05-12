package typings.playcanvas.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DecimalPlaces extends StObject {
  
  var decimalPlaces: Double
  
  var name: String
  
  var stats: js.Array[String]
  
  var unitsName: String
  
  var watermark: Double
}
object DecimalPlaces {
  
  inline def apply(decimalPlaces: Double, name: String, stats: js.Array[String], unitsName: String, watermark: Double): DecimalPlaces = {
    val __obj = js.Dynamic.literal(decimalPlaces = decimalPlaces.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any], unitsName = unitsName.asInstanceOf[js.Any], watermark = watermark.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecimalPlaces]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DecimalPlaces] (val x: Self) extends AnyVal {
    
    inline def setDecimalPlaces(value: Double): Self = StObject.set(x, "decimalPlaces", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setStats(value: js.Array[String]): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
    
    inline def setStatsVarargs(value: String*): Self = StObject.set(x, "stats", js.Array(value*))
    
    inline def setUnitsName(value: String): Self = StObject.set(x, "unitsName", value.asInstanceOf[js.Any])
    
    inline def setWatermark(value: Double): Self = StObject.set(x, "watermark", value.asInstanceOf[js.Any])
  }
}
