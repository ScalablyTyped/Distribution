package typings.nivoHeatmap.distTypesTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultHeatMapDatum extends StObject {
  
  var x: String
  
  var y: js.UndefOr[Double | Null] = js.undefined
}
object DefaultHeatMapDatum {
  
  inline def apply(x: String): DefaultHeatMapDatum = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultHeatMapDatum]
  }
  
  extension [Self <: DefaultHeatMapDatum](x: Self) {
    
    inline def setX(value: String): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYNull: Self = StObject.set(x, "y", null)
    
    inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
