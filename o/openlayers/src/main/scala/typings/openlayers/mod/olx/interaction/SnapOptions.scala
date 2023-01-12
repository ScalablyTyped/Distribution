package typings.openlayers.mod.olx.interaction

import typings.openlayers.mod.Collection
import typings.openlayers.mod.Feature
import typings.openlayers.mod.source.Vector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options for snap
  */
trait SnapOptions extends StObject {
  
  var edge: js.UndefOr[Boolean] = js.undefined
  
  var features: js.UndefOr[Collection[Feature]] = js.undefined
  
  var pixelTolerance: js.UndefOr[Double] = js.undefined
  
  var source: js.UndefOr[Vector] = js.undefined
  
  var vertex: js.UndefOr[Boolean] = js.undefined
}
object SnapOptions {
  
  inline def apply(): SnapOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SnapOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SnapOptions] (val x: Self) extends AnyVal {
    
    inline def setEdge(value: Boolean): Self = StObject.set(x, "edge", value.asInstanceOf[js.Any])
    
    inline def setEdgeUndefined: Self = StObject.set(x, "edge", js.undefined)
    
    inline def setFeatures(value: Collection[Feature]): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
    
    inline def setFeaturesUndefined: Self = StObject.set(x, "features", js.undefined)
    
    inline def setPixelTolerance(value: Double): Self = StObject.set(x, "pixelTolerance", value.asInstanceOf[js.Any])
    
    inline def setPixelToleranceUndefined: Self = StObject.set(x, "pixelTolerance", js.undefined)
    
    inline def setSource(value: Vector): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setVertex(value: Boolean): Self = StObject.set(x, "vertex", value.asInstanceOf[js.Any])
    
    inline def setVertexUndefined: Self = StObject.set(x, "vertex", js.undefined)
  }
}
