package typings.mongorito.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefaultState extends js.Object {
  var fields: js.Object = js.native
  var unset: js.Array[String] = js.native
}

object DefaultState {
  @scala.inline
  def apply(fields: js.Object, unset: js.Array[String]): DefaultState = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], unset = unset.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultState]
  }
  @scala.inline
  implicit class DefaultStateOps[Self <: DefaultState] (val x: Self) extends AnyVal {
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
    def setFields(value: js.Object): Self = this.set("fields", value.asInstanceOf[js.Any])
    @scala.inline
    def setUnsetVarargs(value: String*): Self = this.set("unset", js.Array(value :_*))
    @scala.inline
    def setUnset(value: js.Array[String]): Self = this.set("unset", value.asInstanceOf[js.Any])
  }
  
}

