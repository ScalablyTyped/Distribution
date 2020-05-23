package typings.mvdanSh.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Word extends Node {
  var Parts: js.Array[WordPart]
  def Lit(): String
}

object Word {
  @scala.inline
  def apply(End: () => Pos, Lit: () => String, Parts: js.Array[WordPart], Pos: () => Pos): Word = {
    val __obj = js.Dynamic.literal(End = js.Any.fromFunction0(End), Lit = js.Any.fromFunction0(Lit), Parts = Parts.asInstanceOf[js.Any], Pos = js.Any.fromFunction0(Pos))
    __obj.asInstanceOf[Word]
  }
}

