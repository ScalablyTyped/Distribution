package typings.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** 参数列表 */
trait UpdatableMessageFrontEndParameter extends js.Object {
  /** 参数名 */
  var name: String
  /** 参数值 */
  var value: String
}

object UpdatableMessageFrontEndParameter {
  @scala.inline
  def apply(name: String, value: String): UpdatableMessageFrontEndParameter = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdatableMessageFrontEndParameter]
  }
}

