package typings.node.consoleMod.global.NodeJS

import typings.node.consoleMod.global.Console_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Global extends js.Object {
  var console: Console_ = js.native
}

object Global {
  @scala.inline
  def apply(console: Console_): Global = {
    val __obj = js.Dynamic.literal(console = console.asInstanceOf[js.Any])
    __obj.asInstanceOf[Global]
  }
  @scala.inline
  implicit class GlobalOps[Self <: Global] (val x: Self) extends AnyVal {
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
    def setConsole(value: Console_): Self = this.set("console", value.asInstanceOf[js.Any])
  }
  
}

