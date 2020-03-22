package typings.minappEnv.wx

import typings.minappEnv.Uint8ClampedArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CanvasGetImageDataOption extends js.Object {
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
  @scala.inline
  def apply(
    canvasId: String,
    height: Double,
    width: Double,
    x: Double,
    y: Double,
    complete: /* res */ GeneralCallbackResult => Unit = null,
    fail: /* res */ GeneralCallbackResult => Unit = null,
    success: (/* result */ CanvasGetImageDataSuccessCallbackResult, /* data */ Uint8ClampedArray) => Unit = null
  ): CanvasGetImageDataOption = {
    val __obj = js.Dynamic.literal(canvasId = canvasId.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction2(success))
    __obj.asInstanceOf[CanvasGetImageDataOption]
  }
}

