package typings.phaser.spine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextureRegion extends StObject {
  
  var height: Double = js.native
  
  var offsetX: Double = js.native
  
  var offsetY: Double = js.native
  
  var originalHeight: Double = js.native
  
  var originalWidth: Double = js.native
  
  var renderObject: js.Any = js.native
  
  var rotate: Boolean = js.native
  
  var u: Double = js.native
  
  var u2: Double = js.native
  
  var v: Double = js.native
  
  var v2: Double = js.native
  
  var width: Double = js.native
}
object TextureRegion {
  
  @scala.inline
  def apply(
    height: Double,
    offsetX: Double,
    offsetY: Double,
    originalHeight: Double,
    originalWidth: Double,
    renderObject: js.Any,
    rotate: Boolean,
    u: Double,
    u2: Double,
    v: Double,
    v2: Double,
    width: Double
  ): TextureRegion = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], offsetX = offsetX.asInstanceOf[js.Any], offsetY = offsetY.asInstanceOf[js.Any], originalHeight = originalHeight.asInstanceOf[js.Any], originalWidth = originalWidth.asInstanceOf[js.Any], renderObject = renderObject.asInstanceOf[js.Any], rotate = rotate.asInstanceOf[js.Any], u = u.asInstanceOf[js.Any], u2 = u2.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any], v2 = v2.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextureRegion]
  }
  
  @scala.inline
  implicit class TextureRegionMutableBuilder[Self <: TextureRegion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetX(value: Double): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetY(value: Double): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalHeight(value: Double): Self = StObject.set(x, "originalHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalWidth(value: Double): Self = StObject.set(x, "originalWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderObject(value: js.Any): Self = StObject.set(x, "renderObject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotate(value: Boolean): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setU(value: Double): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setU2(value: Double): Self = StObject.set(x, "u2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setV(value: Double): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setV2(value: Double): Self = StObject.set(x, "v2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
