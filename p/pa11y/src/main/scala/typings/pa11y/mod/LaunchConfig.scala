package typings.pa11y.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LaunchConfig extends js.Object {
  var executablePath: String = js.native
  var ignoreHTTPSErrors: Boolean = js.native
}

object LaunchConfig {
  @scala.inline
  def apply(executablePath: String, ignoreHTTPSErrors: Boolean): LaunchConfig = {
    val __obj = js.Dynamic.literal(executablePath = executablePath.asInstanceOf[js.Any], ignoreHTTPSErrors = ignoreHTTPSErrors.asInstanceOf[js.Any])
    __obj.asInstanceOf[LaunchConfig]
  }
  @scala.inline
  implicit class LaunchConfigOps[Self <: LaunchConfig] (val x: Self) extends AnyVal {
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
    def setExecutablePath(value: String): Self = this.set("executablePath", value.asInstanceOf[js.Any])
    @scala.inline
    def setIgnoreHTTPSErrors(value: Boolean): Self = this.set("ignoreHTTPSErrors", value.asInstanceOf[js.Any])
  }
  
}

