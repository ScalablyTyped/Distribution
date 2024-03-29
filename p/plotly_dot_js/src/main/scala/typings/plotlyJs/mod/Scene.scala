package typings.plotlyJs.mod

import typings.plotlyJs.anon.PartialAnnotationsAlign
import typings.plotlyJs.anon.PartialCamera
import typings.plotlyJs.anon.PartialDomain
import typings.plotlyJs.anon.PartialPoint
import typings.plotlyJs.anon.PartialSceneAxisBackgroundcolor
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

trait Scene extends StObject {
  
  var annotations: PartialAnnotationsAlign | js.Array[PartialAnnotationsAlign]
  
  var aspectmode: auto | cube | data | manual
  
  var aspectratio: PartialPoint
  
  var bgcolor: String
  
  var camera: PartialCamera
  
  var captureevents: Boolean
  
  var domain: PartialDomain
  
  var dragmode: orbit | turntable | zoom | pan | `false`
  
  var hovermode: closest | `false`
  
  var xaxis: PartialSceneAxisBackgroundcolor
  
  var yaxis: PartialSceneAxisBackgroundcolor
  
  var zaxis: PartialSceneAxisBackgroundcolor
}
object Scene {
  
  inline def apply(
    annotations: PartialAnnotationsAlign | js.Array[PartialAnnotationsAlign],
    aspectmode: auto | cube | data | manual,
    aspectratio: PartialPoint,
    bgcolor: String,
    camera: PartialCamera,
    captureevents: Boolean,
    domain: PartialDomain,
    dragmode: orbit | turntable | zoom | pan | `false`,
    hovermode: closest | `false`,
    xaxis: PartialSceneAxisBackgroundcolor,
    yaxis: PartialSceneAxisBackgroundcolor,
    zaxis: PartialSceneAxisBackgroundcolor
  ): Scene = {
    val __obj = js.Dynamic.literal(annotations = annotations.asInstanceOf[js.Any], aspectmode = aspectmode.asInstanceOf[js.Any], aspectratio = aspectratio.asInstanceOf[js.Any], bgcolor = bgcolor.asInstanceOf[js.Any], camera = camera.asInstanceOf[js.Any], captureevents = captureevents.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any], dragmode = dragmode.asInstanceOf[js.Any], hovermode = hovermode.asInstanceOf[js.Any], xaxis = xaxis.asInstanceOf[js.Any], yaxis = yaxis.asInstanceOf[js.Any], zaxis = zaxis.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scene]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Scene] (val x: Self) extends AnyVal {
    
    inline def setAnnotations(value: PartialAnnotationsAlign | js.Array[PartialAnnotationsAlign]): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
    
    inline def setAnnotationsVarargs(value: PartialAnnotationsAlign*): Self = StObject.set(x, "annotations", js.Array(value*))
    
    inline def setAspectmode(value: auto | cube | data | manual): Self = StObject.set(x, "aspectmode", value.asInstanceOf[js.Any])
    
    inline def setAspectratio(value: PartialPoint): Self = StObject.set(x, "aspectratio", value.asInstanceOf[js.Any])
    
    inline def setBgcolor(value: String): Self = StObject.set(x, "bgcolor", value.asInstanceOf[js.Any])
    
    inline def setCamera(value: PartialCamera): Self = StObject.set(x, "camera", value.asInstanceOf[js.Any])
    
    inline def setCaptureevents(value: Boolean): Self = StObject.set(x, "captureevents", value.asInstanceOf[js.Any])
    
    inline def setDomain(value: PartialDomain): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setDragmode(value: orbit | turntable | zoom | pan | `false`): Self = StObject.set(x, "dragmode", value.asInstanceOf[js.Any])
    
    inline def setHovermode(value: closest | `false`): Self = StObject.set(x, "hovermode", value.asInstanceOf[js.Any])
    
    inline def setXaxis(value: PartialSceneAxisBackgroundcolor): Self = StObject.set(x, "xaxis", value.asInstanceOf[js.Any])
    
    inline def setYaxis(value: PartialSceneAxisBackgroundcolor): Self = StObject.set(x, "yaxis", value.asInstanceOf[js.Any])
    
    inline def setZaxis(value: PartialSceneAxisBackgroundcolor): Self = StObject.set(x, "zaxis", value.asInstanceOf[js.Any])
  }
}
