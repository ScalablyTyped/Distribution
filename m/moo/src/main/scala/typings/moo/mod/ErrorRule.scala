package typings.moo.mod

import typings.moo.mooBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorRule extends js.Object {
  var error: `true`
}

object ErrorRule {
  @scala.inline
  def apply(error: `true`): ErrorRule = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ErrorRule]
  }
}

