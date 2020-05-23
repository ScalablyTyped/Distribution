package typings.octokitTypes.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MACOS extends js.Object {
  var MACOS: Jobs
  var UBUNTU: Jobs
  var WINDOWS: Jobs
}

object MACOS {
  @scala.inline
  def apply(MACOS: Jobs, UBUNTU: Jobs, WINDOWS: Jobs): MACOS = {
    val __obj = js.Dynamic.literal(MACOS = MACOS.asInstanceOf[js.Any], UBUNTU = UBUNTU.asInstanceOf[js.Any], WINDOWS = WINDOWS.asInstanceOf[js.Any])
    __obj.asInstanceOf[MACOS]
  }
}

