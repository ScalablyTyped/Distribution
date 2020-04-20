package typings.mongorito

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonArgs extends js.Object {
  var args: js.Any
  var method: String
}

object AnonArgs {
  @scala.inline
  def apply(args: js.Any, method: String): AnonArgs = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonArgs]
  }
}

