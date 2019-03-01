package typings
package npmDashPackageDashArgLib.npmDashPackageDashArgMod.npaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HostedGitResult extends Result {
  @JSName("fetchSpec")
  var fetchSpec_HostedGitResult: scala.Null | java.lang.String
  @JSName("hosted")
  var hosted_HostedGitResult: HostedGit
  @JSName("saveSpec")
  var saveSpec_HostedGitResult: java.lang.String
  @JSName("type")
  var type_HostedGitResult: npmDashPackageDashArgLib.npmDashPackageDashArgLibStrings.git
}

object HostedGitResult {
  @scala.inline
  def apply(
    hosted: HostedGit,
    raw: java.lang.String,
    rawSpec: java.lang.String,
    registry: scala.Boolean,
    saveSpec: java.lang.String,
    `type`: npmDashPackageDashArgLib.npmDashPackageDashArgLibStrings.git,
    escapedName: java.lang.String = null,
    fetchSpec: java.lang.String = null,
    gitCommittish: java.lang.String = null,
    gitRange: java.lang.String = null,
    name: java.lang.String = null,
    scope: java.lang.String = null
  ): HostedGitResult = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("hosted")(hosted)
    __obj.updateDynamic("raw")(raw)
    __obj.updateDynamic("rawSpec")(rawSpec)
    __obj.updateDynamic("registry")(registry)
    __obj.updateDynamic("saveSpec")(saveSpec)
    if (escapedName != null) __obj.updateDynamic("escapedName")(escapedName)
    if (fetchSpec != null) __obj.updateDynamic("fetchSpec")(fetchSpec)
    if (gitCommittish != null) __obj.updateDynamic("gitCommittish")(gitCommittish)
    if (gitRange != null) __obj.updateDynamic("gitRange")(gitRange)
    if (name != null) __obj.updateDynamic("name")(name)
    if (scope != null) __obj.updateDynamic("scope")(scope)
    __obj.asInstanceOf[HostedGitResult]
  }
}

