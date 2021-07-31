package typings.openseadragon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavImages extends StObject {
  
  var flip: NavImagesValues
  
  var fullpage: NavImagesValues
  
  var home: NavImagesValues
  
  var next: NavImagesValues
  
  var previous: NavImagesValues
  
  var rotateleft: NavImagesValues
  
  var rotateright: NavImagesValues
  
  var zoomIn: NavImagesValues
  
  var zoomOut: NavImagesValues
}
object NavImages {
  
  @scala.inline
  def apply(
    flip: NavImagesValues,
    fullpage: NavImagesValues,
    home: NavImagesValues,
    next: NavImagesValues,
    previous: NavImagesValues,
    rotateleft: NavImagesValues,
    rotateright: NavImagesValues,
    zoomIn: NavImagesValues,
    zoomOut: NavImagesValues
  ): NavImages = {
    val __obj = js.Dynamic.literal(flip = flip.asInstanceOf[js.Any], fullpage = fullpage.asInstanceOf[js.Any], home = home.asInstanceOf[js.Any], next = next.asInstanceOf[js.Any], previous = previous.asInstanceOf[js.Any], rotateleft = rotateleft.asInstanceOf[js.Any], rotateright = rotateright.asInstanceOf[js.Any], zoomIn = zoomIn.asInstanceOf[js.Any], zoomOut = zoomOut.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavImages]
  }
  
  @scala.inline
  implicit class NavImagesMutableBuilder[Self <: NavImages] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFlip(value: NavImagesValues): Self = StObject.set(x, "flip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullpage(value: NavImagesValues): Self = StObject.set(x, "fullpage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHome(value: NavImagesValues): Self = StObject.set(x, "home", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNext(value: NavImagesValues): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrevious(value: NavImagesValues): Self = StObject.set(x, "previous", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotateleft(value: NavImagesValues): Self = StObject.set(x, "rotateleft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotateright(value: NavImagesValues): Self = StObject.set(x, "rotateright", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoomIn(value: NavImagesValues): Self = StObject.set(x, "zoomIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoomOut(value: NavImagesValues): Self = StObject.set(x, "zoomOut", value.asInstanceOf[js.Any])
  }
}
