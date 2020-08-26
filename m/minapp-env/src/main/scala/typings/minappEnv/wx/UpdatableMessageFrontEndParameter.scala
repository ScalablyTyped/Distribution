package typings.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** 参数列表 */
@js.native
trait UpdatableMessageFrontEndParameter extends js.Object {
  /** 参数名 */
  var name: String = js.native
  /** 参数值 */
  var value: String = js.native
}

object UpdatableMessageFrontEndParameter {
  @scala.inline
  def apply(name: String, value: String): UpdatableMessageFrontEndParameter = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdatableMessageFrontEndParameter]
  }
  @scala.inline
  implicit class UpdatableMessageFrontEndParameterOps[Self <: UpdatableMessageFrontEndParameter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

