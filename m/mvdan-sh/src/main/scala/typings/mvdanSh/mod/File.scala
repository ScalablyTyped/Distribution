package typings.mvdanSh.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait File extends Node {
  var Last: js.Array[Stmt] = js.native
  var Name: String = js.native
  var Stmts: js.UndefOr[js.Array[Stmt]] = js.native
}

object File {
  @scala.inline
  def apply(End: () => Pos, Last: js.Array[Stmt], Name: String, Pos: () => Pos): File = {
    val __obj = js.Dynamic.literal(End = js.Any.fromFunction0(End), Last = Last.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Pos = js.Any.fromFunction0(Pos))
    __obj.asInstanceOf[File]
  }
  @scala.inline
  implicit class FileOps[Self <: File] (val x: Self) extends AnyVal {
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
    def setLastVarargs(value: Stmt*): Self = this.set("Last", js.Array(value :_*))
    @scala.inline
    def setLast(value: js.Array[Stmt]): Self = this.set("Last", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setStmtsVarargs(value: Stmt*): Self = this.set("Stmts", js.Array(value :_*))
    @scala.inline
    def setStmts(value: js.Array[Stmt]): Self = this.set("Stmts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStmts: Self = this.set("Stmts", js.undefined)
  }
  
}

