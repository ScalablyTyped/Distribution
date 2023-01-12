package typings.minappEnv.wx

import typings.minappEnv.Uint8ClampedArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CanvasGetImageDataOption extends StObject {
  
  /** 画布标识，传入 `<canvas>` 组件的 `canvas-id` 属性。 */
  var canvasId: String
  
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[CanvasGetImageDataCompleteCallback] = js.undefined
  
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[CanvasGetImageDataFailCallback] = js.undefined
  
  /** 将要被提取的图像数据矩形区域的高度 */
  var height: Double
  
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[CanvasGetImageDataSuccessCallback] = js.undefined
  
  /** 将要被提取的图像数据矩形区域的宽度 */
  var width: Double
  
  /** 将要被提取的图像数据矩形区域的左上角横坐标 */
  var x: Double
  
  /** 将要被提取的图像数据矩形区域的左上角纵坐标 */
  var y: Double
}
object CanvasGetImageDataOption {
  
  inline def apply(canvasId: String, height: Double, width: Double, x: Double, y: Double): CanvasGetImageDataOption = {
    val __obj = js.Dynamic.literal(canvasId = canvasId.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanvasGetImageDataOption]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CanvasGetImageDataOption] (val x: Self) extends AnyVal {
    
    inline def setCanvasId(value: String): Self = StObject.set(x, "canvasId", value.asInstanceOf[js.Any])
    
    inline def setComplete(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setFail(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction1(value))
    
    inline def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setSuccess(
      value: (/* result */ CanvasGetImageDataSuccessCallbackResult, /* data */ Uint8ClampedArray) => Unit
    ): Self = StObject.set(x, "success", js.Any.fromFunction2(value))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
