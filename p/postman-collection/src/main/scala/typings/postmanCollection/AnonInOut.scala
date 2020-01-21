package typings.postmanCollection

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonInOut extends js.Object {
  def in[T](`val`: T): T
  def out[T](`val`: T): T
}

object AnonInOut {
  @scala.inline
  def apply(in: js.Any => js.Any, out: js.Any => js.Any): AnonInOut = {
    val __obj = js.Dynamic.literal(in = js.Any.fromFunction1(in), out = js.Any.fromFunction1(out))
  
    __obj.asInstanceOf[AnonInOut]
  }
}

