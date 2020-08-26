package typings.mongorito.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Args extends js.Object {
  var args: js.Any = js.native
  var method: String = js.native
}

object Args {
  @scala.inline
  def apply(args: js.Any, method: String): Args = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any])
    __obj.asInstanceOf[Args]
  }
  @scala.inline
  implicit class ArgsOps[Self <: Args] (val x: Self) extends AnyVal {
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
    def setArgs(value: js.Any): Self = this.set("args", value.asInstanceOf[js.Any])
    @scala.inline
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
  }
  
}

