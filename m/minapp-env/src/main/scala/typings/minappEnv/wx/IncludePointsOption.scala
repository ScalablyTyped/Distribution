package typings.minappEnv.wx

import typings.minappEnv.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IncludePointsOption extends js.Object {
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[IncludePointsCompleteCallback] = js.undefined
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[IncludePointsFailCallback] = js.undefined
  /** 坐标点形成的矩形边缘到地图边缘的距离，单位像素。格式为[上,右,下,左]，安卓上只能识别数组第一项，上下左右的padding一致。开发者工具暂不支持padding参数。 */
  var padding: js.UndefOr[Array[Double]] = js.undefined
  /** 要显示在可视区域内的坐标点列表 */
  var points: MapPostion
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[IncludePointsSuccessCallback] = js.undefined
}

object IncludePointsOption {
  @scala.inline
  def apply(
    points: MapPostion,
    complete: /* res */ GeneralCallbackResult => Unit = null,
    fail: /* res */ GeneralCallbackResult => Unit = null,
    padding: Array[Double] = null,
    success: /* res */ GeneralCallbackResult => Unit = null
  ): IncludePointsOption = {
    val __obj = js.Dynamic.literal(points = points.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[IncludePointsOption]
  }
}

