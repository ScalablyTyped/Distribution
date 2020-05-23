package typings.octokitTypes.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Enabled extends js.Object {
  var enabled: Boolean
  var required_status_checks: Contexts
}

object Enabled {
  @scala.inline
  def apply(enabled: Boolean, required_status_checks: Contexts): Enabled = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], required_status_checks = required_status_checks.asInstanceOf[js.Any])
    __obj.asInstanceOf[Enabled]
  }
}

