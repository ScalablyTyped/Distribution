package typings.postmanCollection.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Out extends js.Object {
  def in[T](`val`: T): T
  def out[T](`val`: T): T
}

object Out {
  @scala.inline
  def apply(in: js.Any => js.Any, out: js.Any => js.Any): Out = {
    val __obj = js.Dynamic.literal(in = js.Any.fromFunction1(in), out = js.Any.fromFunction1(out))
    __obj.asInstanceOf[Out]
  }
}

