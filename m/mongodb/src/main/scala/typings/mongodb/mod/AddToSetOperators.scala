package typings.mongodb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddToSetOperators[Type] extends js.Object {
  @JSName("$each")
  var $each: Type = js.native
}

object AddToSetOperators {
  @scala.inline
  def apply[Type]($each: Type): AddToSetOperators[Type] = {
    val __obj = js.Dynamic.literal($each = $each.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddToSetOperators[Type]]
  }
  @scala.inline
  implicit class AddToSetOperatorsOps[Self <: AddToSetOperators[_], Type] (val x: Self with AddToSetOperators[Type]) extends AnyVal {
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
    def set$each(value: Type): Self = this.set("$each", value.asInstanceOf[js.Any])
  }
  
}

