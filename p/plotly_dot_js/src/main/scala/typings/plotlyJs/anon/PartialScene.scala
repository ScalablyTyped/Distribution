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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<plotly.js.plotly.js.Scene> */
trait PartialScene extends StObject {
  
  var annotations: js.UndefOr[PartialAnnotations | js.Array[PartialAnnotations]] = js.undefined
  
  var aspectmode: js.UndefOr[auto | cube | data | manual] = js.undefined
  
  var aspectratio: js.UndefOr[PartialPoint] = js.undefined
  
  var bgcolor: js.UndefOr[String] = js.undefined
  
  var camera: js.UndefOr[PartialCamera] = js.undefined
  
  var captureevents: js.UndefOr[Boolean] = js.undefined
  
  var domain: js.UndefOr[PartialDomain] = js.undefined
  
  var dragmode: js.UndefOr[orbit | turntable | zoom | pan | `false`] = js.undefined
  
  var hovermode: js.UndefOr[closest | `false`] = js.undefined
  
  var xaxis: js.UndefOr[PartialSceneAxis] = js.undefined
  
  var yaxis: js.UndefOr[PartialSceneAxis] = js.undefined
  
  var zaxis: js.UndefOr[PartialSceneAxis] = js.undefined
}
object PartialScene {
  
  inline def apply(): PartialScene = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialScene]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialScene] (val x: Self) extends AnyVal {
    
    inline def setAnnotations(value: PartialAnnotations | js.Array[PartialAnnotations]): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
    
    inline def setAnnotationsUndefined: Self = StObject.set(x, "annotations", js.undefined)
    
    inline def setAnnotationsVarargs(value: PartialAnnotations*): Self = StObject.set(x, "annotations", js.Array(value*))
    
    inline def setAspectmode(value: auto | cube | data | manual): Self = StObject.set(x, "aspectmode", value.asInstanceOf[js.Any])
    
    inline def setAspectmodeUndefined: Self = StObject.set(x, "aspectmode", js.undefined)
    
    inline def setAspectratio(value: PartialPoint): Self = StObject.set(x, "aspectratio", value.asInstanceOf[js.Any])
    
    inline def setAspectratioUndefined: Self = StObject.set(x, "aspectratio", js.undefined)
    
    inline def setBgcolor(value: String): Self = StObject.set(x, "bgcolor", value.asInstanceOf[js.Any])
    
    inline def setBgcolorUndefined: Self = StObject.set(x, "bgcolor", js.undefined)
    
    inline def setCamera(value: PartialCamera): Self = StObject.set(x, "camera", value.asInstanceOf[js.Any])
    
    inline def setCameraUndefined: Self = StObject.set(x, "camera", js.undefined)
    
    inline def setCaptureevents(value: Boolean): Self = StObject.set(x, "captureevents", value.asInstanceOf[js.Any])
    
    inline def setCaptureeventsUndefined: Self = StObject.set(x, "captureevents", js.undefined)
    
    inline def setDomain(value: PartialDomain): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
    
    inline def setDragmode(value: orbit | turntable | zoom | pan | `false`): Self = StObject.set(x, "dragmode", value.asInstanceOf[js.Any])
    
    inline def setDragmodeUndefined: Self = StObject.set(x, "dragmode", js.undefined)
    
    inline def setHovermode(value: closest | `false`): Self = StObject.set(x, "hovermode", value.asInstanceOf[js.Any])
    
    inline def setHovermodeUndefined: Self = StObject.set(x, "hovermode", js.undefined)
    
    inline def setXaxis(value: PartialSceneAxis): Self = StObject.set(x, "xaxis", value.asInstanceOf[js.Any])
    
    inline def setXaxisUndefined: Self = StObject.set(x, "xaxis", js.undefined)
    
    inline def setYaxis(value: PartialSceneAxis): Self = StObject.set(x, "yaxis", value.asInstanceOf[js.Any])
    
    inline def setYaxisUndefined: Self = StObject.set(x, "yaxis", js.undefined)
    
    inline def setZaxis(value: PartialSceneAxis): Self = StObject.set(x, "zaxis", value.asInstanceOf[js.Any])
    
    inline def setZaxisUndefined: Self = StObject.set(x, "zaxis", js.undefined)
  }
}
