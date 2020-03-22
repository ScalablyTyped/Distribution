package typings.minappEnv.wx

import typings.minappEnv.Uint8ClampedArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CanvasPutImageDataOption extends js.Object {
  /** 画布标识，传入 `<canvas>` 组件的 canvas-id 属性。 */
  var canvasId: String
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[CanvasPutImageDataCompleteCallback] = js.undefined
  /** 图像像素点数据，一维数组，每四项表示一个像素点的 rgba */
  var data: Uint8ClampedArray
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[CanvasPutImageDataFailCallback] = js.undefined
  /** 源图像数据矩形区域的高度 */
  var height: Double
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[CanvasPutImageDataSuccessCallback] = js.undefined
  /** 源图像数据矩形区域的宽度 */
  var width: Double
  /** 源图像数据在目标画布中的位置偏移量（x 轴方向的偏移量） */
  var x: Double
  /** 源图像数据在目标画布中的位置偏移量（y 轴方向的偏移量） */
  var y: Double
}

object CanvasPutImageDataOption {
  @scala.inline
  def apply(
    canvasId: String,
    data: Uint8ClampedArray,
    height: Double,
    width: Double,
    x: Double,
    y: Double,
    complete: /* res */ GeneralCallbackResult => Unit = null,
    fail: /* res */ GeneralCallbackResult => Unit = null,
    success: /* res */ GeneralCallbackResult => Unit = null
  ): CanvasPutImageDataOption = {
    val __obj = js.Dynamic.literal(canvasId = canvasId.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[CanvasPutImageDataOption]
  }
}

