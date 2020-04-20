package typings.nodeJose.mod.JWS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Exp extends js.Object {
  def complete(jws: js.Any): js.Any
}

object Exp {
  @scala.inline
  def apply(complete: js.Any => js.Any): Exp = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction1(complete))
    __obj.asInstanceOf[Exp]
  }
}

