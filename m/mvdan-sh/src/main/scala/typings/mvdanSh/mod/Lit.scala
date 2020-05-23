package typings.mvdanSh.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Lit extends Node {
  var Value: String
  var ValueEnd: Pos
  var ValuePos: Pos
}

object Lit {
  @scala.inline
  def apply(End: () => Pos, Pos: () => Pos, Value: String, ValueEnd: Pos, ValuePos: Pos): Lit = {
    val __obj = js.Dynamic.literal(End = js.Any.fromFunction0(End), Pos = js.Any.fromFunction0(Pos), Value = Value.asInstanceOf[js.Any], ValueEnd = ValueEnd.asInstanceOf[js.Any], ValuePos = ValuePos.asInstanceOf[js.Any])
    __obj.asInstanceOf[Lit]
  }
}

