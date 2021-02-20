package typings.openlayers.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StyleImageOptions extends StObject {
  
  var opacity: Double = js.native
  
  var rotateWithView: Boolean = js.native
  
  var rotation: Double = js.native
  
  var scale: Double = js.native
  
  var snapToPixel: Boolean = js.native
}
object StyleImageOptions {
  
  @scala.inline
  def apply(opacity: Double, rotateWithView: Boolean, rotation: Double, scale: Double, snapToPixel: Boolean): StyleImageOptions = {
    val __obj = js.Dynamic.literal(opacity = opacity.asInstanceOf[js.Any], rotateWithView = rotateWithView.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], snapToPixel = snapToPixel.asInstanceOf[js.Any])
    __obj.asInstanceOf[StyleImageOptions]
  }
  
  @scala.inline
  implicit class StyleImageOptionsMutableBuilder[Self <: StyleImageOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotateWithView(value: Boolean): Self = StObject.set(x, "rotateWithView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapToPixel(value: Boolean): Self = StObject.set(x, "snapToPixel", value.asInstanceOf[js.Any])
  }
}
