package typings.minappEnv.wx

import typings.minappEnv.Array
import typings.minappEnv.minappEnvStrings.album
import typings.minappEnv.minappEnvStrings.camera
import typings.minappEnv.minappEnvStrings.compressed
import typings.minappEnv.minappEnvStrings.original
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChooseImageOption extends js.Object {
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[ChooseImageCompleteCallback] = js.undefined
  /** 最多可以选择的图片张数 */
  var count: js.UndefOr[Double] = js.undefined
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[ChooseImageFailCallback] = js.undefined
  /** 所选的图片的尺寸
    *
    * 可选值：
    * - 'original': 原图;
    * - 'compressed': 压缩图; */
  var sizeType: js.UndefOr[Array[original | compressed]] = js.undefined
  /** 选择图片的来源
    *
    * 可选值：
    * - 'album': 从相册选图;
    * - 'camera': 使用相机; */
  var sourceType: js.UndefOr[Array[album | camera]] = js.undefined
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[ChooseImageSuccessCallback] = js.undefined
}

object ChooseImageOption {
  @scala.inline
  def apply(
    complete: /* res */ GeneralCallbackResult => Unit = null,
    count: Int | Double = null,
    fail: /* res */ GeneralCallbackResult => Unit = null,
    sizeType: Array[original | compressed] = null,
    sourceType: Array[album | camera] = null,
    success: /* result */ ChooseImageSuccessCallbackResult => Unit = null
  ): ChooseImageOption = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (sizeType != null) __obj.updateDynamic("sizeType")(sizeType.asInstanceOf[js.Any])
    if (sourceType != null) __obj.updateDynamic("sourceType")(sourceType.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[ChooseImageOption]
  }
}

