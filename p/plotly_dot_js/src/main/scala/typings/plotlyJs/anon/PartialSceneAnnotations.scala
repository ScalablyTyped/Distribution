package typings.plotlyJs.anon

import typings.plotlyJs.plotlyJsBooleans.`false`
import typings.plotlyJs.plotlyJsStrings.auto
import typings.plotlyJs.plotlyJsStrings.closest
import typings.plotlyJs.plotlyJsStrings.cube
import typings.plotlyJs.plotlyJsStrings.data
import typings.plotlyJs.plotlyJsStrings.manual
import typings.plotlyJs.plotlyJsStrings.orbit
import typings.plotlyJs.plotlyJsStrings.pan
import typings.plotlyJs.plotlyJsStrings.turntable
import typings.plotlyJs.plotlyJsStrings.zoom
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<plotly.js.plotly.js.Scene> */
@js.native
trait PartialSceneAnnotations extends StObject {
  
  var annotations: js.UndefOr[PartialAnnotationsArrowcolor | js.Array[PartialAnnotationsArrowcolor]] = js.native
  
  var aspectmode: js.UndefOr[auto | cube | data | manual] = js.native
  
  var aspectratio: js.UndefOr[PartialPoint] = js.native
  
  var bgcolor: js.UndefOr[String] = js.native
  
  var camera: js.UndefOr[PartialCameraCenter] = js.native
  
  var captureevents: js.UndefOr[Boolean] = js.native
  
  var domain: js.UndefOr[PartialDomain] = js.native
  
  var dragmode: js.UndefOr[orbit | turntable | zoom | pan | `false`] = js.native
  
  var hovermode: js.UndefOr[closest | `false`] = js.native
  
  var xaxis: js.UndefOr[PartialSceneAxisAutorange] = js.native
  
  var yaxis: js.UndefOr[PartialSceneAxisAutorange] = js.native
  
  var zaxis: js.UndefOr[PartialSceneAxisAutorange] = js.native
}
object PartialSceneAnnotations {
  
  @scala.inline
  def apply(): PartialSceneAnnotations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialSceneAnnotations]
  }
  
  @scala.inline
  implicit class PartialSceneAnnotationsMutableBuilder[Self <: PartialSceneAnnotations] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnnotations(value: PartialAnnotationsArrowcolor | js.Array[PartialAnnotationsArrowcolor]): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnnotationsUndefined: Self = StObject.set(x, "annotations", js.undefined)
    
    @scala.inline
    def setAnnotationsVarargs(value: PartialAnnotationsArrowcolor*): Self = StObject.set(x, "annotations", js.Array(value :_*))
    
    @scala.inline
    def setAspectmode(value: auto | cube | data | manual): Self = StObject.set(x, "aspectmode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAspectmodeUndefined: Self = StObject.set(x, "aspectmode", js.undefined)
    
    @scala.inline
    def setAspectratio(value: PartialPoint): Self = StObject.set(x, "aspectratio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAspectratioUndefined: Self = StObject.set(x, "aspectratio", js.undefined)
    
    @scala.inline
    def setBgcolor(value: String): Self = StObject.set(x, "bgcolor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBgcolorUndefined: Self = StObject.set(x, "bgcolor", js.undefined)
    
    @scala.inline
    def setCamera(value: PartialCameraCenter): Self = StObject.set(x, "camera", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCameraUndefined: Self = StObject.set(x, "camera", js.undefined)
    
    @scala.inline
    def setCaptureevents(value: Boolean): Self = StObject.set(x, "captureevents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaptureeventsUndefined: Self = StObject.set(x, "captureevents", js.undefined)
    
    @scala.inline
    def setDomain(value: PartialDomain): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
    
    @scala.inline
    def setDragmode(value: orbit | turntable | zoom | pan | `false`): Self = StObject.set(x, "dragmode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDragmodeUndefined: Self = StObject.set(x, "dragmode", js.undefined)
    
    @scala.inline
    def setHovermode(value: closest | `false`): Self = StObject.set(x, "hovermode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHovermodeUndefined: Self = StObject.set(x, "hovermode", js.undefined)
    
    @scala.inline
    def setXaxis(value: PartialSceneAxisAutorange): Self = StObject.set(x, "xaxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXaxisUndefined: Self = StObject.set(x, "xaxis", js.undefined)
    
    @scala.inline
    def setYaxis(value: PartialSceneAxisAutorange): Self = StObject.set(x, "yaxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYaxisUndefined: Self = StObject.set(x, "yaxis", js.undefined)
    
    @scala.inline
    def setZaxis(value: PartialSceneAxisAutorange): Self = StObject.set(x, "zaxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZaxisUndefined: Self = StObject.set(x, "zaxis", js.undefined)
  }
}
