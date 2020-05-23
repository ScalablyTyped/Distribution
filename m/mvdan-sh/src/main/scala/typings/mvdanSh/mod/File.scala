package typings.mvdanSh.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait File extends Node {
  var Last: js.Array[Stmt]
  var Name: String
  var Stmts: js.UndefOr[js.Array[Stmt]] = js.undefined
}

object File {
  @scala.inline
  def apply(End: () => Pos, Last: js.Array[Stmt], Name: String, Pos: () => Pos, Stmts: js.Array[Stmt] = null): File = {
    val __obj = js.Dynamic.literal(End = js.Any.fromFunction0(End), Last = Last.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Pos = js.Any.fromFunction0(Pos))
    if (Stmts != null) __obj.updateDynamic("Stmts")(Stmts.asInstanceOf[js.Any])
    __obj.asInstanceOf[File]
  }
}

