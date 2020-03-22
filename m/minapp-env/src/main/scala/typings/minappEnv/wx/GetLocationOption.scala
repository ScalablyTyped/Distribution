package typings.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetLocationOption extends js.Object {
  /** 传入 true 会返回高度信息，由于获取高度需要较高精确度，会减慢接口返回速度
    *
    * 最低基础库： `1.6.0` */
  var altitude: js.UndefOr[String] = js.undefined
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[GetLocationCompleteCallback] = js.undefined
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[GetLocationFailCallback] = js.undefined
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[GetLocationSuccessCallback] = js.undefined
  /** wgs84 返回 gps 坐标，gcj02 返回可用于 wx.openLocation 的坐标 */
  var `type`: js.UndefOr[String] = js.undefined
}

object GetLocationOption {
  @scala.inline
  def apply(
    altitude: String = null,
    complete: /* res */ GeneralCallbackResult => Unit = null,
    fail: /* res */ GeneralCallbackResult => Unit = null,
    success: /* result */ GetLocationSuccessCallbackResult => Unit = null,
    `type`: String = null
  ): GetLocationOption = {
    val __obj = js.Dynamic.literal()
    if (altitude != null) __obj.updateDynamic("altitude")(altitude.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLocationOption]
  }
}

