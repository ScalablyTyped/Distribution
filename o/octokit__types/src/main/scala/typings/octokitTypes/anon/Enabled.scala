package typings.octokitTypes.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Enabled extends js.Object {
  var enabled: Boolean = js.native
  var required_status_checks: Contexts = js.native
}

object Enabled {
  @scala.inline
  def apply(enabled: Boolean, required_status_checks: Contexts): Enabled = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], required_status_checks = required_status_checks.asInstanceOf[js.Any])
    __obj.asInstanceOf[Enabled]
  }
  @scala.inline
  implicit class EnabledOps[Self <: Enabled] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequired_status_checks(value: Contexts): Self = this.set("required_status_checks", value.asInstanceOf[js.Any])
  }
  
}

