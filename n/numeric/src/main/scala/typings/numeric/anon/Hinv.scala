package typings.numeric.anon

import typings.numeric.mod.Matrix
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Hinv extends js.Object {
  var Hinv: Matrix
}

object Hinv {
  @scala.inline
  def apply(Hinv: Matrix): Hinv = {
    val __obj = js.Dynamic.literal(Hinv = Hinv.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hinv]
  }
}

