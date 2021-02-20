package typings.pdfjsDist.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ViewportParameters extends StObject {
  
  // (optional) The vertical, i.e. y-axis, offset. The default value is `0`.
  var dontFlip: js.UndefOr[Boolean] = js.native
  
  // (optional) The desired rotation, in degrees, of the viewport. If omitted it defaults to the page rotation.
  var offsetX: js.UndefOr[Double] = js.native
  
  // (optional) The horizontal, i.e. x-axis, offset. The default value is `0`.
  var offsetY: js.UndefOr[Double] = js.native
  
  // The desired scale of the viewport.
  var rotation: js.UndefOr[Double] = js.native
  
  var scale: Double = js.native
}
object ViewportParameters {
  
  @scala.inline
  def apply(scale: Double): ViewportParameters = {
    val __obj = js.Dynamic.literal(scale = scale.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewportParameters]
  }
  
  @scala.inline
  implicit class ViewportParametersMutableBuilder[Self <: ViewportParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDontFlip(value: Boolean): Self = StObject.set(x, "dontFlip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDontFlipUndefined: Self = StObject.set(x, "dontFlip", js.undefined)
    
    @scala.inline
    def setOffsetX(value: Double): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetXUndefined: Self = StObject.set(x, "offsetX", js.undefined)
    
    @scala.inline
    def setOffsetY(value: Double): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetYUndefined: Self = StObject.set(x, "offsetY", js.undefined)
    
    @scala.inline
    def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
    
    @scala.inline
    def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
  }
}
