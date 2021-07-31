package typings.plotlyJs.anon

import typings.plotlyJs.mod.Annotations
import typings.plotlyJs.mod.Camera
import typings.plotlyJs.mod.Domain
import typings.plotlyJs.mod.Point
import typings.plotlyJs.mod.SceneAxis
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
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<plotly.js.plotly.js.Scene> */
trait PartialSceneAspectmode extends StObject {
  
  var annotations: js.UndefOr[Partial[Annotations] | js.Array[Partial[Annotations]]] = js.undefined
  
  var aspectmode: js.UndefOr[auto | cube | data | manual] = js.undefined
  
  var aspectratio: js.UndefOr[Partial[Point]] = js.undefined
  
  var bgcolor: js.UndefOr[String] = js.undefined
  
  var camera: js.UndefOr[Partial[Camera]] = js.undefined
  
  var captureevents: js.UndefOr[Boolean] = js.undefined
  
  var domain: js.UndefOr[Partial[Domain]] = js.undefined
  
  var dragmode: js.UndefOr[orbit | turntable | zoom | pan | `false`] = js.undefined
  
  var hovermode: js.UndefOr[closest | `false`] = js.undefined
  
  var xaxis: js.UndefOr[Partial[SceneAxis]] = js.undefined
  
  var yaxis: js.UndefOr[Partial[SceneAxis]] = js.undefined
  
  var zaxis: js.UndefOr[Partial[SceneAxis]] = js.undefined
}
object PartialSceneAspectmode {
  
  @scala.inline
  def apply(): PartialSceneAspectmode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialSceneAspectmode]
  }
  
  @scala.inline
  implicit class PartialSceneAspectmodeMutableBuilder[Self <: PartialSceneAspectmode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnnotations(value: Partial[Annotations] | js.Array[Partial[Annotations]]): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnnotationsUndefined: Self = StObject.set(x, "annotations", js.undefined)
    
    @scala.inline
    def setAnnotationsVarargs(value: Partial[Annotations]*): Self = StObject.set(x, "annotations", js.Array(value :_*))
    
    @scala.inline
    def setAspectmode(value: auto | cube | data | manual): Self = StObject.set(x, "aspectmode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAspectmodeUndefined: Self = StObject.set(x, "aspectmode", js.undefined)
    
    @scala.inline
    def setAspectratio(value: Partial[Point]): Self = StObject.set(x, "aspectratio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAspectratioUndefined: Self = StObject.set(x, "aspectratio", js.undefined)
    
    @scala.inline
    def setBgcolor(value: String): Self = StObject.set(x, "bgcolor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBgcolorUndefined: Self = StObject.set(x, "bgcolor", js.undefined)
    
    @scala.inline
    def setCamera(value: Partial[Camera]): Self = StObject.set(x, "camera", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCameraUndefined: Self = StObject.set(x, "camera", js.undefined)
    
    @scala.inline
    def setCaptureevents(value: Boolean): Self = StObject.set(x, "captureevents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaptureeventsUndefined: Self = StObject.set(x, "captureevents", js.undefined)
    
    @scala.inline
    def setDomain(value: Partial[Domain]): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
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
    def setXaxis(value: Partial[SceneAxis]): Self = StObject.set(x, "xaxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXaxisUndefined: Self = StObject.set(x, "xaxis", js.undefined)
    
    @scala.inline
    def setYaxis(value: Partial[SceneAxis]): Self = StObject.set(x, "yaxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYaxisUndefined: Self = StObject.set(x, "yaxis", js.undefined)
    
    @scala.inline
    def setZaxis(value: Partial[SceneAxis]): Self = StObject.set(x, "zaxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZaxisUndefined: Self = StObject.set(x, "zaxis", js.undefined)
  }
}
