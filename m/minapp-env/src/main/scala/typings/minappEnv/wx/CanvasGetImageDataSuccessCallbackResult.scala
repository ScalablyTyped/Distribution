package typings.minappEnv.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CanvasGetImageDataSuccessCallbackResult extends StObject {
  
  /** 图像数据矩形的高度 */
  var height: Double
  
  /** 图像数据矩形的宽度 */
  var width: Double
}
object CanvasGetImageDataSuccessCallbackResult {
  
  inline def apply(height: Double, width: Double): CanvasGetImageDataSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanvasGetImageDataSuccessCallbackResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CanvasGetImageDataSuccessCallbackResult] (val x: Self) extends AnyVal {
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
