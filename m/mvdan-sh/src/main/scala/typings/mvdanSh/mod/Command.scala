package typings.mvdanSh.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Command extends Node {
  var OpPos: Pos
}

object Command {
  @scala.inline
  def apply(End: () => Pos, OpPos: Pos, Pos: () => Pos): Command = {
    val __obj = js.Dynamic.literal(End = js.Any.fromFunction0(End), OpPos = OpPos.asInstanceOf[js.Any], Pos = js.Any.fromFunction0(Pos))
    __obj.asInstanceOf[Command]
  }
}

