package typings.nivoHeatmap.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HeatMapDatum extends StObject {
  
  var x: String | Double
  
  var y: js.UndefOr[Double | Null] = js.undefined
}
object HeatMapDatum {
  
  inline def apply(x: String | Double): HeatMapDatum = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeatMapDatum]
  }
  
  extension [Self <: HeatMapDatum](x: Self) {
    
    inline def setX(value: String | Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYNull: Self = StObject.set(x, "y", null)
    
    inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
