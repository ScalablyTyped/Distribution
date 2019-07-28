package typings.npmDashPackageDashArg.npmDashPackageDashArgMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HostedGit extends js.Object {
  var domain: String
  var project: String
  var `type`: String
  var user: String
}

object HostedGit {
  @scala.inline
  def apply(domain: String, project: String, `type`: String, user: String): HostedGit = {
    val __obj = js.Dynamic.literal(domain = domain, project = project, user = user)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[HostedGit]
  }
}

