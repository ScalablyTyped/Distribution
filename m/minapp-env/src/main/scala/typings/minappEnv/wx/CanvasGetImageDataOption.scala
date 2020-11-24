package typings.minappEnv.wx

import typings.minappEnv.Uint8ClampedArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CanvasGetImageDataOption extends js.Object {
  
  /** 画布标识，传入 `<canvas>` 组件的 `canvas-id` 属性。 */
  var canvasId: String = js.native
  
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[CanvasGetImageDataCompleteCallback] = js.native
  
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[CanvasGetImageDataFailCallback] = js.native
  
  /** 将要被提取的图像数据矩形区域的高度 */
  var height: Double = js.native
  
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[CanvasGetImageDataSuccessCallback] = js.native
  
  /** 将要被提取的图像数据矩形区域的宽度 */
  var width: Double = js.native
  
  /** 将要被提取的图像数据矩形区域的左上角横坐标 */
  var x: Double = js.native
  
  /** 将要被提取的图像数据矩形区域的左上角纵坐标 */
  var y: Double = js.native
}
object CanvasGetImageDataOption {
  
  @scala.inline
  def apply(canvasId: String, height: Double, width: Double, x: Double, y: Double): CanvasGetImageDataOption = {
    val __obj = js.Dynamic.literal(canvasId = canvasId.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanvasGetImageDataOption]
  }
  
  @scala.inline
  implicit class CanvasGetImageDataOptionOps[Self <: CanvasGetImageDataOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCanvasId(value: String): Self = this.set("canvasId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComplete(value: /* res */ GeneralCallbackResult => Unit): Self = this.set("complete", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteComplete: Self = this.set("complete", js.undefined)
    
    @scala.inline
    def setFail(value: /* res */ GeneralCallbackResult => Unit): Self = this.set("fail", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteFail: Self = this.set("fail", js.undefined)
    
    @scala.inline
    def setSuccess(
      value: (/* result */ CanvasGetImageDataSuccessCallbackResult, /* data */ Uint8ClampedArray) => Unit
    ): Self = this.set("success", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
  }
}
