package typings.places.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Prefix extends js.Object {
  var prefix: js.Any
  var root: String
}

object Prefix {
  @scala.inline
  def apply(prefix: js.Any, root: String): Prefix = {
    val __obj = js.Dynamic.literal(prefix = prefix.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[Prefix]
  }
}

