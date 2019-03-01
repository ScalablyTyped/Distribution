package typings
package npmDashPackageDashArgLib.npmDashPackageDashArgMod.npaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait URLResult extends Result {
  @JSName("fetchSpec")
  var fetchSpec_URLResult: java.lang.String
  @JSName("saveSpec")
  var saveSpec_URLResult: java.lang.String
  @JSName("type")
  var type_URLResult: npmDashPackageDashArgLib.npmDashPackageDashArgLibStrings.git | npmDashPackageDashArgLib.npmDashPackageDashArgLibStrings.remote
}

object URLResult {
  @scala.inline
  def apply(
    fetchSpec: java.lang.String,
    raw: java.lang.String,
    rawSpec: java.lang.String,
    registry: scala.Boolean,
    saveSpec: java.lang.String,
    `type`: npmDashPackageDashArgLib.npmDashPackageDashArgLibStrings.git | npmDashPackageDashArgLib.npmDashPackageDashArgLibStrings.remote,
    escapedName: java.lang.String = null,
    gitCommittish: java.lang.String = null,
    gitRange: java.lang.String = null,
    hosted: HostedGit = null,
    name: java.lang.String = null,
    scope: java.lang.String = null
  ): URLResult = {
    val __obj = js.Dynamic.literal(`type` = `type`.asInstanceOf[js.Any])
    __obj.updateDynamic("fetchSpec")(fetchSpec)
    __obj.updateDynamic("raw")(raw)
    __obj.updateDynamic("rawSpec")(rawSpec)
    __obj.updateDynamic("registry")(registry)
    __obj.updateDynamic("saveSpec")(saveSpec)
    if (escapedName != null) __obj.updateDynamic("escapedName")(escapedName)
    if (gitCommittish != null) __obj.updateDynamic("gitCommittish")(gitCommittish)
    if (gitRange != null) __obj.updateDynamic("gitRange")(gitRange)
    if (hosted != null) __obj.updateDynamic("hosted")(hosted)
    if (name != null) __obj.updateDynamic("name")(name)
    if (scope != null) __obj.updateDynamic("scope")(scope)
    __obj.asInstanceOf[URLResult]
  }
}

