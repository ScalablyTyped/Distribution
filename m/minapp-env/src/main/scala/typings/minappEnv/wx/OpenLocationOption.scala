package typings.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenLocationOption extends js.Object {
  /** 地址的详细说明 */
  var address: js.UndefOr[String] = js.undefined
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[OpenLocationCompleteCallback] = js.undefined
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[OpenLocationFailCallback] = js.undefined
  /** 纬度，范围为-90~90，负数表示南纬。使用 gcj02 国测局坐标系 */
  var latitude: Double
  /** 经度，范围为-180~180，负数表示西经。使用 gcj02 国测局坐标系 */
  var longitude: Double
  /** 位置名 */
  var name: js.UndefOr[String] = js.undefined
  /** 缩放比例，范围5~18 */
  var scale: js.UndefOr[Double] = js.undefined
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[OpenLocationSuccessCallback] = js.undefined
}

object OpenLocationOption {
  @scala.inline
  def apply(
    latitude: Double,
    longitude: Double,
    address: String = null,
    complete: /* res */ GeneralCallbackResult => Unit = null,
    fail: /* res */ GeneralCallbackResult => Unit = null,
    name: String = null,
    scale: Int | Double = null,
    success: /* res */ GeneralCallbackResult => Unit = null
  ): OpenLocationOption = {
    val __obj = js.Dynamic.literal(latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any])
    if (address != null) __obj.updateDynamic("address")(address.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[OpenLocationOption]
  }
}

