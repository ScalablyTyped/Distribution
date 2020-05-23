package typings.mongorito.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Args extends js.Object {
  var args: js.Any
  var method: String
}

object Args {
  @scala.inline
  def apply(args: js.Any, method: String): Args = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any])
    __obj.asInstanceOf[Args]
  }
}

