package typings.postmanCollection

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIn extends js.Object {
  def in(`val`: js.Any): String
  def out(`val`: String): js.Any
}

object AnonIn {
  @scala.inline
  def apply(in: js.Any => String, out: String => js.Any): AnonIn = {
    val __obj = js.Dynamic.literal(in = js.Any.fromFunction1(in), out = js.Any.fromFunction1(out))
  
    __obj.asInstanceOf[AnonIn]
  }
}

