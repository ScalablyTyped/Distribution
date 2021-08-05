package typings.openlayers.mod.olx

import typings.openlayers.mod.Coordinate_
import typings.openlayers.mod.Extent_
import typings.openlayers.mod.proj.Units
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Object literal with config options for the projection.
  */
trait ProjectionOptions extends StObject {
  
  var axisOrientation: js.UndefOr[String] = js.undefined
  
  var code: String
  
  var extent: js.UndefOr[Extent_] = js.undefined
  
  var getPointResolution: js.UndefOr[js.Function2[/* resolution */ Double, /* coords */ Coordinate_, Double]] = js.undefined
  
  var global: js.UndefOr[Boolean] = js.undefined
  
  var metersPerUnit: js.UndefOr[Double] = js.undefined
  
  var units: js.UndefOr[Units | String] = js.undefined
  
  var worldExtent: js.UndefOr[Extent_] = js.undefined
}
object ProjectionOptions {
  
  inline def apply(code: String): ProjectionOptions = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectionOptions]
  }
  
  extension [Self <: ProjectionOptions](x: Self) {
    
    inline def setAxisOrientation(value: String): Self = StObject.set(x, "axisOrientation", value.asInstanceOf[js.Any])
    
    inline def setAxisOrientationUndefined: Self = StObject.set(x, "axisOrientation", js.undefined)
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setExtent(value: Extent_): Self = StObject.set(x, "extent", value.asInstanceOf[js.Any])
    
    inline def setExtentUndefined: Self = StObject.set(x, "extent", js.undefined)
    
    inline def setGetPointResolution(value: (/* resolution */ Double, /* coords */ Coordinate_) => Double): Self = StObject.set(x, "getPointResolution", js.Any.fromFunction2(value))
    
    inline def setGetPointResolutionUndefined: Self = StObject.set(x, "getPointResolution", js.undefined)
    
    inline def setGlobal(value: Boolean): Self = StObject.set(x, "global", value.asInstanceOf[js.Any])
    
    inline def setGlobalUndefined: Self = StObject.set(x, "global", js.undefined)
    
    inline def setMetersPerUnit(value: Double): Self = StObject.set(x, "metersPerUnit", value.asInstanceOf[js.Any])
    
    inline def setMetersPerUnitUndefined: Self = StObject.set(x, "metersPerUnit", js.undefined)
    
    inline def setUnits(value: Units | String): Self = StObject.set(x, "units", value.asInstanceOf[js.Any])
    
    inline def setUnitsUndefined: Self = StObject.set(x, "units", js.undefined)
    
    inline def setWorldExtent(value: Extent_): Self = StObject.set(x, "worldExtent", value.asInstanceOf[js.Any])
    
    inline def setWorldExtentUndefined: Self = StObject.set(x, "worldExtent", js.undefined)
  }
}
