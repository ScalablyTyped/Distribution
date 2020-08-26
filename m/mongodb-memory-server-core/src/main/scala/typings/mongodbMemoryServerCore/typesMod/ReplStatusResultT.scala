package typings.mongodbMemoryServerCore.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReplStatusResultT extends js.Object {
  var repl: ReplStatusReplT = js.native
}

object ReplStatusResultT {
  @scala.inline
  def apply(repl: ReplStatusReplT): ReplStatusResultT = {
    val __obj = js.Dynamic.literal(repl = repl.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplStatusResultT]
  }
  @scala.inline
  implicit class ReplStatusResultTOps[Self <: ReplStatusResultT] (val x: Self) extends AnyVal {
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
    def setRepl(value: ReplStatusReplT): Self = this.set("repl", value.asInstanceOf[js.Any])
  }
  
}

