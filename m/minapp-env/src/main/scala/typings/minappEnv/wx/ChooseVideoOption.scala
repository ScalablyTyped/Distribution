package typings.minappEnv.wx

import typings.minappEnv.Array
import typings.minappEnv.minappEnvStrings.album
import typings.minappEnv.minappEnvStrings.back
import typings.minappEnv.minappEnvStrings.camera
import typings.minappEnv.minappEnvStrings.front
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChooseVideoOption extends js.Object {
  /** 默认拉起的是前置或者后置摄像头。部分 Android 手机下由于系统 ROM 不支持无法生效
    *
    * 可选值：
    * - 'back': 默认拉起后置摄像头;
    * - 'front': 默认拉起前置摄像头; */
  var camera: js.UndefOr[back | front] = js.undefined
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[ChooseVideoCompleteCallback] = js.undefined
  /** 是否压缩所选择的视频文件
    *
    * 最低基础库： `1.6.0` */
  var compressed: js.UndefOr[Boolean] = js.undefined
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[ChooseVideoFailCallback] = js.undefined
  /** 拍摄视频最长拍摄时间，单位秒 */
  var maxDuration: js.UndefOr[Double] = js.undefined
  /** 视频选择的来源
    *
    * 可选值：
    * - 'album': 从相册选择视频;
    * - 'camera': 使用相机拍摄视频; */
  var sourceType: js.UndefOr[Array[album | camera]] = js.undefined
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[ChooseVideoSuccessCallback] = js.undefined
}

object ChooseVideoOption {
  @scala.inline
  def apply(
    camera: back | front = null,
    complete: /* res */ GeneralCallbackResult => Unit = null,
    compressed: js.UndefOr[Boolean] = js.undefined,
    fail: /* res */ GeneralCallbackResult => Unit = null,
    maxDuration: Int | Double = null,
    sourceType: Array[album | camera] = null,
    success: /* result */ ChooseVideoSuccessCallbackResult => Unit = null
  ): ChooseVideoOption = {
    val __obj = js.Dynamic.literal()
    if (camera != null) __obj.updateDynamic("camera")(camera.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (!js.isUndefined(compressed)) __obj.updateDynamic("compressed")(compressed.asInstanceOf[js.Any])
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (maxDuration != null) __obj.updateDynamic("maxDuration")(maxDuration.asInstanceOf[js.Any])
    if (sourceType != null) __obj.updateDynamic("sourceType")(sourceType.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[ChooseVideoOption]
  }
}

