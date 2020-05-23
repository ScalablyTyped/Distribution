package typings.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateShareMenuOption extends js.Object {
  /** 动态消息的 activityId。通过 [createActivityId]((createActivityId)) 接口获取
    *
    * 最低基础库： `2.4.0` */
  var activityId: js.UndefOr[String] = js.undefined
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[UpdateShareMenuCompleteCallback] = js.undefined
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[UpdateShareMenuFailCallback] = js.undefined
  /** 是否是动态消息，详见[动态消息]((updatable-message))
    *
    * 最低基础库： `2.4.0` */
  var isUpdatableMessage: js.UndefOr[Boolean] = js.undefined
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[UpdateShareMenuSuccessCallback] = js.undefined
  /** 动态消息的模板信息
    *
    * 最低基础库： `2.4.0` */
  var templateInfo: js.UndefOr[UpdatableMessageFrontEndTemplateInfo] = js.undefined
  /** 是否使用带 shareTicket 的转发[详情]((转发#获取更多转发信息)) */
  var withShareTicket: js.UndefOr[Boolean] = js.undefined
}

object UpdateShareMenuOption {
  @scala.inline
  def apply(
    activityId: String = null,
    complete: /* res */ GeneralCallbackResult => Unit = null,
    fail: /* res */ GeneralCallbackResult => Unit = null,
    isUpdatableMessage: js.UndefOr[Boolean] = js.undefined,
    success: /* res */ GeneralCallbackResult => Unit = null,
    templateInfo: UpdatableMessageFrontEndTemplateInfo = null,
    withShareTicket: js.UndefOr[Boolean] = js.undefined
  ): UpdateShareMenuOption = {
    val __obj = js.Dynamic.literal()
    if (activityId != null) __obj.updateDynamic("activityId")(activityId.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (!js.isUndefined(isUpdatableMessage)) __obj.updateDynamic("isUpdatableMessage")(isUpdatableMessage.get.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    if (templateInfo != null) __obj.updateDynamic("templateInfo")(templateInfo.asInstanceOf[js.Any])
    if (!js.isUndefined(withShareTicket)) __obj.updateDynamic("withShareTicket")(withShareTicket.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateShareMenuOption]
  }
}

