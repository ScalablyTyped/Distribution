package typings.maximMazurokGapiClientVectortile.gapi.client.vectortile

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Geometry extends StObject {
  
  /** The areas present in this geometry. */
  var areas: js.UndefOr[js.Array[Area]] = js.native
  
  /** The extruded areas present in this geometry. */
  var extrudedAreas: js.UndefOr[js.Array[ExtrudedArea]] = js.native
  
  /** The lines present in this geometry. */
  var lines: js.UndefOr[js.Array[Line]] = js.native
  
  /** The modeled volumes present in this geometry. */
  var modeledVolumes: js.UndefOr[js.Array[ModeledVolume]] = js.native
}
object Geometry {
  
  @scala.inline
  def apply(): Geometry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Geometry]
  }
  
  @scala.inline
  implicit class GeometryMutableBuilder[Self <: Geometry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAreas(value: js.Array[Area]): Self = StObject.set(x, "areas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAreasUndefined: Self = StObject.set(x, "areas", js.undefined)
    
    @scala.inline
    def setAreasVarargs(value: Area*): Self = StObject.set(x, "areas", js.Array(value :_*))
    
    @scala.inline
    def setExtrudedAreas(value: js.Array[ExtrudedArea]): Self = StObject.set(x, "extrudedAreas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtrudedAreasUndefined: Self = StObject.set(x, "extrudedAreas", js.undefined)
    
    @scala.inline
    def setExtrudedAreasVarargs(value: ExtrudedArea*): Self = StObject.set(x, "extrudedAreas", js.Array(value :_*))
    
    @scala.inline
    def setLines(value: js.Array[Line]): Self = StObject.set(x, "lines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinesUndefined: Self = StObject.set(x, "lines", js.undefined)
    
    @scala.inline
    def setLinesVarargs(value: Line*): Self = StObject.set(x, "lines", js.Array(value :_*))
    
    @scala.inline
    def setModeledVolumes(value: js.Array[ModeledVolume]): Self = StObject.set(x, "modeledVolumes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeledVolumesUndefined: Self = StObject.set(x, "modeledVolumes", js.undefined)
    
    @scala.inline
    def setModeledVolumesVarargs(value: ModeledVolume*): Self = StObject.set(x, "modeledVolumes", js.Array(value :_*))
  }
}
