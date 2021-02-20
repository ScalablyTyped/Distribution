package typings.openlayers.mod.olx.format

import typings.openlayers.mod.geom.GeometryLayout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PolylineOptions extends StObject {
  
  var factor: js.UndefOr[Double] = js.native
  
  var geometryLayout: js.UndefOr[GeometryLayout] = js.native
}
object PolylineOptions {
  
  @scala.inline
  def apply(): PolylineOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolylineOptions]
  }
  
  @scala.inline
  implicit class PolylineOptionsMutableBuilder[Self <: PolylineOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFactor(value: Double): Self = StObject.set(x, "factor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFactorUndefined: Self = StObject.set(x, "factor", js.undefined)
    
    @scala.inline
    def setGeometryLayout(value: GeometryLayout): Self = StObject.set(x, "geometryLayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeometryLayoutUndefined: Self = StObject.set(x, "geometryLayout", js.undefined)
  }
}
