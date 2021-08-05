package typings.openlayers.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StyleImageOptions extends StObject {
  
  var opacity: Double
  
  var rotateWithView: Boolean
  
  var rotation: Double
  
  var scale: Double
  
  var snapToPixel: Boolean
}
object StyleImageOptions {
  
  inline def apply(opacity: Double, rotateWithView: Boolean, rotation: Double, scale: Double, snapToPixel: Boolean): StyleImageOptions = {
    val __obj = js.Dynamic.literal(opacity = opacity.asInstanceOf[js.Any], rotateWithView = rotateWithView.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], snapToPixel = snapToPixel.asInstanceOf[js.Any])
    __obj.asInstanceOf[StyleImageOptions]
  }
  
  extension [Self <: StyleImageOptions](x: Self) {
    
    inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setRotateWithView(value: Boolean): Self = StObject.set(x, "rotateWithView", value.asInstanceOf[js.Any])
    
    inline def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    
    inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setSnapToPixel(value: Boolean): Self = StObject.set(x, "snapToPixel", value.asInstanceOf[js.Any])
  }
}
