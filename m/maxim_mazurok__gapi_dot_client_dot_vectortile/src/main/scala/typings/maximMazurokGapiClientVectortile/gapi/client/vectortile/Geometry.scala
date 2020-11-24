package typings.maximMazurokGapiClientVectortile.gapi.client.vectortile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Geometry extends js.Object {
  
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
  implicit class GeometryOps[Self <: Geometry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAreasVarargs(value: Area*): Self = this.set("areas", js.Array(value :_*))
    
    @scala.inline
    def setAreas(value: js.Array[Area]): Self = this.set("areas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAreas: Self = this.set("areas", js.undefined)
    
    @scala.inline
    def setExtrudedAreasVarargs(value: ExtrudedArea*): Self = this.set("extrudedAreas", js.Array(value :_*))
    
    @scala.inline
    def setExtrudedAreas(value: js.Array[ExtrudedArea]): Self = this.set("extrudedAreas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtrudedAreas: Self = this.set("extrudedAreas", js.undefined)
    
    @scala.inline
    def setLinesVarargs(value: Line*): Self = this.set("lines", js.Array(value :_*))
    
    @scala.inline
    def setLines(value: js.Array[Line]): Self = this.set("lines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLines: Self = this.set("lines", js.undefined)
    
    @scala.inline
    def setModeledVolumesVarargs(value: ModeledVolume*): Self = this.set("modeledVolumes", js.Array(value :_*))
    
    @scala.inline
    def setModeledVolumes(value: js.Array[ModeledVolume]): Self = this.set("modeledVolumes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModeledVolumes: Self = this.set("modeledVolumes", js.undefined)
  }
}
