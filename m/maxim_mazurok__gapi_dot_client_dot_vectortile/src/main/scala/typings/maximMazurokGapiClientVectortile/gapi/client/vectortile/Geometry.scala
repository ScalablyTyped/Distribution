package typings.maximMazurokGapiClientVectortile.gapi.client.vectortile

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Geometry extends StObject {
  
  /** The areas present in this geometry. */
  var areas: js.UndefOr[js.Array[Area]] = js.undefined
  
  /**
    * The extruded areas present in this geometry. Not populated if modeled_volumes are included in this geometry unless always_include_building_footprints is set in
    * GetFeatureTileRequest, in which case the client should decide which (extruded areas or modeled volumes) should be used (they should not be rendered together).
    */
  var extrudedAreas: js.UndefOr[js.Array[ExtrudedArea]] = js.undefined
  
  /** The lines present in this geometry. */
  var lines: js.UndefOr[js.Array[Line]] = js.undefined
  
  /** The modeled volumes present in this geometry. Not populated unless enable_modeled_volumes has been set in GetFeatureTileRequest. */
  var modeledVolumes: js.UndefOr[js.Array[ModeledVolume]] = js.undefined
}
object Geometry {
  
  inline def apply(): Geometry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Geometry]
  }
  
  extension [Self <: Geometry](x: Self) {
    
    inline def setAreas(value: js.Array[Area]): Self = StObject.set(x, "areas", value.asInstanceOf[js.Any])
    
    inline def setAreasUndefined: Self = StObject.set(x, "areas", js.undefined)
    
    inline def setAreasVarargs(value: Area*): Self = StObject.set(x, "areas", js.Array(value*))
    
    inline def setExtrudedAreas(value: js.Array[ExtrudedArea]): Self = StObject.set(x, "extrudedAreas", value.asInstanceOf[js.Any])
    
    inline def setExtrudedAreasUndefined: Self = StObject.set(x, "extrudedAreas", js.undefined)
    
    inline def setExtrudedAreasVarargs(value: ExtrudedArea*): Self = StObject.set(x, "extrudedAreas", js.Array(value*))
    
    inline def setLines(value: js.Array[Line]): Self = StObject.set(x, "lines", value.asInstanceOf[js.Any])
    
    inline def setLinesUndefined: Self = StObject.set(x, "lines", js.undefined)
    
    inline def setLinesVarargs(value: Line*): Self = StObject.set(x, "lines", js.Array(value*))
    
    inline def setModeledVolumes(value: js.Array[ModeledVolume]): Self = StObject.set(x, "modeledVolumes", value.asInstanceOf[js.Any])
    
    inline def setModeledVolumesUndefined: Self = StObject.set(x, "modeledVolumes", js.undefined)
    
    inline def setModeledVolumesVarargs(value: ModeledVolume*): Self = StObject.set(x, "modeledVolumes", js.Array(value*))
  }
}
