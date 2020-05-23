package typings.minappEnv.wx

import typings.minappEnv.minappEnvStrings.jpg
import typings.minappEnv.minappEnvStrings.png
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CanvasToTempFilePathOption extends js.Object {
  /** 画布标识，传入 `<canvas>` 组件的 canvas-id */
  var canvasId: String
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[CanvasToTempFilePathCompleteCallback] = js.undefined
  /** 输出的图片的高度
    *
    * 最低基础库： `1.2.0` */
  var destHeight: js.UndefOr[Double] = js.undefined
  /** 输出的图片的宽度
    *
    * 最低基础库： `1.2.0` */
  var destWidth: js.UndefOr[Double] = js.undefined
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[CanvasToTempFilePathFailCallback] = js.undefined
  /** 目标文件的类型
    *
    * 可选值：
    * - 'jpg': jpg 图片;
    * - 'png': png 图片;
    *
    * 最低基础库： `1.7.0` */
  var fileType: js.UndefOr[jpg | png] = js.undefined
  /** 指定的画布区域的高度
    *
    * 最低基础库： `1.2.0` */
  var height: js.UndefOr[Double] = js.undefined
  /** 图片的质量，目前仅对 jpg 有效。取值范围为 (0, 1]，不在范围内时当作 1.0 处理。
    *
    * 最低基础库： `1.7.0` */
  var quality: Double
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[CanvasToTempFilePathSuccessCallback] = js.undefined
  /** 指定的画布区域的宽度
    *
    * 最低基础库： `1.2.0` */
  var width: js.UndefOr[Double] = js.undefined
  /** 指定的画布区域的左上角横坐标
    *
    * 最低基础库： `1.2.0` */
  var x: js.UndefOr[Double] = js.undefined
  /** 指定的画布区域的左上角纵坐标
    *
    * 最低基础库： `1.2.0` */
  var y: js.UndefOr[Double] = js.undefined
}

object CanvasToTempFilePathOption {
  @scala.inline
  def apply(
    canvasId: String,
    quality: Double,
    complete: /* res */ GeneralCallbackResult => Unit = null,
    destHeight: js.UndefOr[Double] = js.undefined,
    destWidth: js.UndefOr[Double] = js.undefined,
    fail: /* res */ GeneralCallbackResult => Unit = null,
    fileType: jpg | png = null,
    height: js.UndefOr[Double] = js.undefined,
    success: /* result */ CanvasToTempFilePathSuccessCallbackResult => Unit = null,
    width: js.UndefOr[Double] = js.undefined,
    x: js.UndefOr[Double] = js.undefined,
    y: js.UndefOr[Double] = js.undefined
  ): CanvasToTempFilePathOption = {
    val __obj = js.Dynamic.literal(canvasId = canvasId.asInstanceOf[js.Any], quality = quality.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (!js.isUndefined(destHeight)) __obj.updateDynamic("destHeight")(destHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(destWidth)) __obj.updateDynamic("destWidth")(destWidth.get.asInstanceOf[js.Any])
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (fileType != null) __obj.updateDynamic("fileType")(fileType.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    if (!js.isUndefined(x)) __obj.updateDynamic("x")(x.get.asInstanceOf[js.Any])
    if (!js.isUndefined(y)) __obj.updateDynamic("y")(y.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanvasToTempFilePathOption]
  }
}

