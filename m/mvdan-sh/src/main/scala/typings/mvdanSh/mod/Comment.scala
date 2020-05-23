package typings.mvdanSh.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Comment extends Node {
  var Hash: Pos
  var Text: String
}

object Comment {
  @scala.inline
  def apply(End: () => Pos, Hash: Pos, Pos: () => Pos, Text: String): Comment = {
    val __obj = js.Dynamic.literal(End = js.Any.fromFunction0(End), Hash = Hash.asInstanceOf[js.Any], Pos = js.Any.fromFunction0(Pos), Text = Text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Comment]
  }
}

