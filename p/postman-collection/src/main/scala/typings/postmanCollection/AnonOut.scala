package typings.postmanCollection

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOut extends js.Object {
  def in[T](`val`: T): T
  def out[T](`val`: T): T
}

object AnonOut {
  @scala.inline
  def apply(in: js.Any => js.Any, out: js.Any => js.Any): AnonOut = {
    val __obj = js.Dynamic.literal(in = js.Any.fromFunction1(in), out = js.Any.fromFunction1(out))
    __obj.asInstanceOf[AnonOut]
  }
}

