package typings.numeric.anon

import typings.numeric.mod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait E extends js.Object {
  var E: Tensor = js.native
  var lambda: Tensor = js.native
}

object E {
  @scala.inline
  def apply(E: Tensor, lambda: Tensor): E = {
    val __obj = js.Dynamic.literal(E = E.asInstanceOf[js.Any], lambda = lambda.asInstanceOf[js.Any])
    __obj.asInstanceOf[E]
  }
  @scala.inline
  implicit class EOps[Self <: E] (val x: Self) extends AnyVal {
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
    def setE(value: Tensor): Self = this.set("E", value.asInstanceOf[js.Any])
    @scala.inline
    def setLambda(value: Tensor): Self = this.set("lambda", value.asInstanceOf[js.Any])
  }
  
}

