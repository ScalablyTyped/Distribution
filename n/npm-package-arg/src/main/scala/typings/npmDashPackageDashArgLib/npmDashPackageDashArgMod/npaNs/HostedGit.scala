package typings
package npmDashPackageDashArgLib.npmDashPackageDashArgMod.npaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HostedGit extends js.Object {
  var domain: java.lang.String
  var project: java.lang.String
  var `type`: java.lang.String
  var user: java.lang.String
}

object HostedGit {
  @scala.inline
  def apply(
    domain: java.lang.String,
    project: java.lang.String,
    `type`: java.lang.String,
    user: java.lang.String
  ): HostedGit = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("domain")(domain)
    __obj.updateDynamic("project")(project)
    __obj.updateDynamic("user")(user)
    __obj.asInstanceOf[HostedGit]
  }
}

