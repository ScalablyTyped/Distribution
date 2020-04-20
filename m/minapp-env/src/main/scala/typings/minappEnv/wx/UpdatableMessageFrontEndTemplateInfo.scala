package typings.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** 动态消息的模板信息
  *
  * 最低基础库： `2.4.0` */
trait UpdatableMessageFrontEndTemplateInfo extends js.Object {
  /** 参数列表 */
  var parameterList: UpdatableMessageFrontEndParameter
}

object UpdatableMessageFrontEndTemplateInfo {
  @scala.inline
  def apply(parameterList: UpdatableMessageFrontEndParameter): UpdatableMessageFrontEndTemplateInfo = {
    val __obj = js.Dynamic.literal(parameterList = parameterList.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdatableMessageFrontEndTemplateInfo]
  }
}

