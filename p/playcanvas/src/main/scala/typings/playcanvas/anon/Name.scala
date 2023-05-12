package typings.playcanvas.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Name extends StObject {
  
  var decimalPlaces: Unit
  
  var name: String
  
  var stats: js.Array[String]
  
  var unitsName: Unit
  
  var watermark: Double
}
object Name {
  
  inline def apply(decimalPlaces: Unit, name: String, stats: js.Array[String], unitsName: Unit, watermark: Double): Name = {
    val __obj = js.Dynamic.literal(decimalPlaces = decimalPlaces.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any], unitsName = unitsName.asInstanceOf[js.Any], watermark = watermark.asInstanceOf[js.Any])
    __obj.asInstanceOf[Name]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Name] (val x: Self) extends AnyVal {
    
    inline def setDecimalPlaces(value: Unit): Self = StObject.set(x, "decimalPlaces", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setStats(value: js.Array[String]): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
    
    inline def setStatsVarargs(value: String*): Self = StObject.set(x, "stats", js.Array(value*))
    
    inline def setUnitsName(value: Unit): Self = StObject.set(x, "unitsName", value.asInstanceOf[js.Any])
    
    inline def setWatermark(value: Double): Self = StObject.set(x, "watermark", value.asInstanceOf[js.Any])
  }
}
