package typings.mvdanSh.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Stmt extends Node {
  var Background: Boolean = js.native
  var Cmd: Command = js.native
  var Comments: js.Array[Comment] = js.native
  var Coprocess: Boolean = js.native
  var Negated: Boolean = js.native
  var Position: Pos = js.native
  var Semicolon: Pos = js.native
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
  @scala.inline
  implicit class StmtOps[Self <: Stmt] (val x: Self) extends AnyVal {
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
    def setBackground(value: Boolean): Self = this.set("Background", value.asInstanceOf[js.Any])
    @scala.inline
    def setCmd(value: Command): Self = this.set("Cmd", value.asInstanceOf[js.Any])
    @scala.inline
    def setCommentsVarargs(value: Comment*): Self = this.set("Comments", js.Array(value :_*))
    @scala.inline
    def setComments(value: js.Array[Comment]): Self = this.set("Comments", value.asInstanceOf[js.Any])
    @scala.inline
    def setCoprocess(value: Boolean): Self = this.set("Coprocess", value.asInstanceOf[js.Any])
    @scala.inline
    def setNegated(value: Boolean): Self = this.set("Negated", value.asInstanceOf[js.Any])
    @scala.inline
    def setPosition(value: Pos): Self = this.set("Position", value.asInstanceOf[js.Any])
    @scala.inline
    def setSemicolon(value: Pos): Self = this.set("Semicolon", value.asInstanceOf[js.Any])
  }
  
}

