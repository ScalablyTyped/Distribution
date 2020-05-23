package typings.mvdanSh.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Node extends js.Object {
  def End(): Pos
  def Pos(): typings.mvdanSh.mod.Pos
}

object Node {
  @scala.inline
  def apply(End: () => Pos, Pos: () => Pos): Node = {
    val __obj = js.Dynamic.literal(End = js.Any.fromFunction0(End), Pos = js.Any.fromFunction0(Pos))
    __obj.asInstanceOf[Node]
  }
}

