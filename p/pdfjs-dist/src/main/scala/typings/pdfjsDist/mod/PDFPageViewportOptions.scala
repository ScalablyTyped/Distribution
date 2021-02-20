package typings.pdfjsDist.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PDFPageViewportOptions extends StObject {
  
  var dontFlip: Boolean = js.native
  
  var offsetX: Double = js.native
  
  var offsetY: Double = js.native
  
  var rotation: Double = js.native
  
  var scale: Double = js.native
  
  var viewBox: js.Any = js.native
}
object PDFPageViewportOptions {
  
  @scala.inline
  def apply(
    dontFlip: Boolean,
    offsetX: Double,
    offsetY: Double,
    rotation: Double,
    scale: Double,
    viewBox: js.Any
  ): PDFPageViewportOptions = {
    val __obj = js.Dynamic.literal(dontFlip = dontFlip.asInstanceOf[js.Any], offsetX = offsetX.asInstanceOf[js.Any], offsetY = offsetY.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], viewBox = viewBox.asInstanceOf[js.Any])
    __obj.asInstanceOf[PDFPageViewportOptions]
  }
  
  @scala.inline
  implicit class PDFPageViewportOptionsMutableBuilder[Self <: PDFPageViewportOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDontFlip(value: Boolean): Self = StObject.set(x, "dontFlip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetX(value: Double): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetY(value: Double): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewBox(value: js.Any): Self = StObject.set(x, "viewBox", value.asInstanceOf[js.Any])
  }
}
