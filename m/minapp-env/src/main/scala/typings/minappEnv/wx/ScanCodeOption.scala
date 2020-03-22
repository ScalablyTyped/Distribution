package typings.minappEnv.wx

import typings.minappEnv.Array
import typings.minappEnv.minappEnvStrings.barCode
import typings.minappEnv.minappEnvStrings.datamatrix
import typings.minappEnv.minappEnvStrings.pdf417
import typings.minappEnv.minappEnvStrings.qrCode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScanCodeOption extends js.Object {
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[ScanCodeCompleteCallback] = js.undefined
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[ScanCodeFailCallback] = js.undefined
  /** 是否只能从相机扫码，不允许从相册选择图片
    *
    * 最低基础库： `1.2.0` */
  var onlyFromCamera: js.UndefOr[Boolean] = js.undefined
  /** 扫码类型
    *
    * 可选值：
    * - 'barCode': 一维码;
    * - 'qrCode': 二维码;
    * - 'datamatrix': Data Matrix 码;
    * - 'pdf417': PDF417 条码;
    *
    * 最低基础库： `1.7.0` */
  var scanType: js.UndefOr[Array[barCode | qrCode | datamatrix | pdf417]] = js.undefined
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[ScanCodeSuccessCallback] = js.undefined
}

object ScanCodeOption {
  @scala.inline
  def apply(
    complete: /* res */ GeneralCallbackResult => Unit = null,
    fail: /* res */ GeneralCallbackResult => Unit = null,
    onlyFromCamera: js.UndefOr[Boolean] = js.undefined,
    scanType: Array[barCode | qrCode | datamatrix | pdf417] = null,
    success: /* result */ ScanCodeSuccessCallbackResult => Unit = null
  ): ScanCodeOption = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (!js.isUndefined(onlyFromCamera)) __obj.updateDynamic("onlyFromCamera")(onlyFromCamera.asInstanceOf[js.Any])
    if (scanType != null) __obj.updateDynamic("scanType")(scanType.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[ScanCodeOption]
  }
}

