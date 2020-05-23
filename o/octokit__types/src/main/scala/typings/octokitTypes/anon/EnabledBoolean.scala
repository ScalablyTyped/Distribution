package typings.octokitTypes.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnabledBoolean extends js.Object {
  var enabled: Boolean
}

object EnabledBoolean {
  @scala.inline
  def apply(enabled: Boolean): EnabledBoolean = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnabledBoolean]
  }
}

