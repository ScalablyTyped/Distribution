package typings.openlayers.mod.olx.format

import typings.openlayers.mod.geom.GeometryLayout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PolylineOptions extends StObject {
  
  var factor: js.UndefOr[Double] = js.undefined
  
  var geometryLayout: js.UndefOr[GeometryLayout] = js.undefined
}
object PolylineOptions {
  
  inline def apply(): PolylineOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolylineOptions]
  }
  
  extension [Self <: PolylineOptions](x: Self) {
    
    inline def setFactor(value: Double): Self = StObject.set(x, "factor", value.asInstanceOf[js.Any])
    
    inline def setFactorUndefined: Self = StObject.set(x, "factor", js.undefined)
    
    inline def setGeometryLayout(value: GeometryLayout): Self = StObject.set(x, "geometryLayout", value.asInstanceOf[js.Any])
    
    inline def setGeometryLayoutUndefined: Self = StObject.set(x, "geometryLayout", js.undefined)
  }
}
