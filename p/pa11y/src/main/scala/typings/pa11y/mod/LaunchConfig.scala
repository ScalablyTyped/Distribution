package typings.pa11y.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LaunchConfig extends js.Object {
  var executablePath: String
  var ignoreHTTPSErrors: Boolean
}

object LaunchConfig {
  @scala.inline
  def apply(executablePath: String, ignoreHTTPSErrors: Boolean): LaunchConfig = {
    val __obj = js.Dynamic.literal(executablePath = executablePath.asInstanceOf[js.Any], ignoreHTTPSErrors = ignoreHTTPSErrors.asInstanceOf[js.Any])
    __obj.asInstanceOf[LaunchConfig]
  }
}

