package typings.mvdanSh.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Command extends Node {
  var OpPos: Pos = js.native
}

object Command {
  @scala.inline
  def apply(End: () => Pos, OpPos: Pos, Pos: () => Pos): Command = {
    val __obj = js.Dynamic.literal(End = js.Any.fromFunction0(End), OpPos = OpPos.asInstanceOf[js.Any], Pos = js.Any.fromFunction0(Pos))
    __obj.asInstanceOf[Command]
  }
  @scala.inline
  implicit class CommandOps[Self <: Command] (val x: Self) extends AnyVal {
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
    def setOpPos(value: Pos): Self = this.set("OpPos", value.asInstanceOf[js.Any])
  }
  
}

