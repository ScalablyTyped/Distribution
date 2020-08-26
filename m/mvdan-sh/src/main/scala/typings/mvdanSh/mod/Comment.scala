package typings.mvdanSh.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Comment extends Node {
  var Hash: Pos = js.native
  var Text: String = js.native
}

object Comment {
  @scala.inline
  def apply(End: () => Pos, Hash: Pos, Pos: () => Pos, Text: String): Comment = {
    val __obj = js.Dynamic.literal(End = js.Any.fromFunction0(End), Hash = Hash.asInstanceOf[js.Any], Pos = js.Any.fromFunction0(Pos), Text = Text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Comment]
  }
  @scala.inline
  implicit class CommentOps[Self <: Comment] (val x: Self) extends AnyVal {
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
    def setHash(value: Pos): Self = this.set("Hash", value.asInstanceOf[js.Any])
    @scala.inline
    def setText(value: String): Self = this.set("Text", value.asInstanceOf[js.Any])
  }
  
}

