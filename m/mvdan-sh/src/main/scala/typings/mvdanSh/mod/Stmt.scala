package typings.mvdanSh.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Stmt extends Node {
  var Background: Boolean
  var Cmd: Command
  var Comments: js.Array[Comment]
  var Coprocess: Boolean
  var Negated: Boolean
  var Position: Pos
  var Semicolon: Pos
}

object Stmt {
  @scala.inline
  def apply(
    Background: Boolean,
    Cmd: Command,
    Comments: js.Array[Comment],
    Coprocess: Boolean,
    End: () => Pos,
    Negated: Boolean,
    Pos: () => Pos,
    Position: Pos,
    Semicolon: Pos
  ): Stmt = {
    val __obj = js.Dynamic.literal(Background = Background.asInstanceOf[js.Any], Cmd = Cmd.asInstanceOf[js.Any], Comments = Comments.asInstanceOf[js.Any], Coprocess = Coprocess.asInstanceOf[js.Any], End = js.Any.fromFunction0(End), Negated = Negated.asInstanceOf[js.Any], Pos = js.Any.fromFunction0(Pos), Position = Position.asInstanceOf[js.Any], Semicolon = Semicolon.asInstanceOf[js.Any])
    __obj.asInstanceOf[Stmt]
  }
}

