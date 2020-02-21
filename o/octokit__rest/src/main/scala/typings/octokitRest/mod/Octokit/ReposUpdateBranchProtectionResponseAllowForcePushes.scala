package typings.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposUpdateBranchProtectionResponseAllowForcePushes extends js.Object {
  var enabled: Boolean
}

object ReposUpdateBranchProtectionResponseAllowForcePushes {
  @scala.inline
  def apply(enabled: Boolean): ReposUpdateBranchProtectionResponseAllowForcePushes = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReposUpdateBranchProtectionResponseAllowForcePushes]
  }
}

