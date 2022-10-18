package typings.pdfjsDist.typesSrcDisplayApiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetViewportParameters extends StObject {
  
  /**
    * - If true, the y-axis will not be
    * flipped. The default value is `false`.
    */
  var dontFlip: js.UndefOr[Boolean] = js.undefined
  
  /**
    * - The horizontal, i.e. x-axis, offset.
    * The default value is `0`.
    */
  var offsetX: js.UndefOr[Double] = js.undefined
  
  /**
    * - The vertical, i.e. y-axis, offset.
    * The default value is `0`.
    */
  var offsetY: js.UndefOr[Double] = js.undefined
  
  /**
    * - The desired rotation, in degrees, of
    * the viewport. If omitted it defaults to the page rotation.
    */
  var rotation: js.UndefOr[Double] = js.undefined
  
  /**
    * - The desired scale of the viewport.
    */
  var scale: Double
}
object GetViewportParameters {
  
  inline def apply(scale: Double): GetViewportParameters = {
    val __obj = js.Dynamic.literal(scale = scale.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetViewportParameters]
  }
  
  extension [Self <: GetViewportParameters](x: Self) {
    
    inline def setDontFlip(value: Boolean): Self = StObject.set(x, "dontFlip", value.asInstanceOf[js.Any])
    
    inline def setDontFlipUndefined: Self = StObject.set(x, "dontFlip", js.undefined)
    
    inline def setOffsetX(value: Double): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
    
    inline def setOffsetXUndefined: Self = StObject.set(x, "offsetX", js.undefined)
    
    inline def setOffsetY(value: Double): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
    
    inline def setOffsetYUndefined: Self = StObject.set(x, "offsetY", js.undefined)
    
    inline def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    
    inline def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
    
    inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
  }
}
