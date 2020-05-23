package typings.postmanCollection.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait In extends js.Object {
  def in(`val`: js.Any): String
  def out(`val`: String): js.Any
}

object In {
  @scala.inline
  def apply(in: js.Any => String, out: String => js.Any): In = {
    val __obj = js.Dynamic.literal(in = js.Any.fromFunction1(in), out = js.Any.fromFunction1(out))
    __obj.asInstanceOf[In]
  }
}

