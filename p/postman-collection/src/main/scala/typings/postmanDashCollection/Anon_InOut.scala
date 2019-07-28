package typings.postmanDashCollection

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_InOut extends js.Object {
  def in[T](`val`: T): T
  def out[T](`val`: T): T
}

object Anon_InOut {
  @scala.inline
  def apply(in: js.Any => js.Any, out: js.Any => js.Any): Anon_InOut = {
    val __obj = js.Dynamic.literal(in = js.Any.fromFunction1(in), out = js.Any.fromFunction1(out))
  
    __obj.asInstanceOf[Anon_InOut]
  }
}

