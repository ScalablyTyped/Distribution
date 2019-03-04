package typings
package npmDashPackageDashArgLib.npmDashPackageDashArgMod.npaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AliasResult extends Result {
  @JSName("fetchSpec")
  var fetchSpec_AliasResult: scala.Null
  @JSName("registry")
  var registry_AliasResult: npmDashPackageDashArgLib.npmDashPackageDashArgLibNumbers.`true`
  @JSName("saveSpec")
  var saveSpec_AliasResult: scala.Null
  var subSpec: Result
  @JSName("type")
  var type_AliasResult: npmDashPackageDashArgLib.npmDashPackageDashArgLibStrings.alias
}

object AliasResult {
  @scala.inline
  def apply(
    fetchSpec: scala.Null,
    raw: java.lang.String,
    rawSpec: java.lang.String,
    registry: npmDashPackageDashArgLib.npmDashPackageDashArgLibNumbers.`true`,
    saveSpec: scala.Null,
    subSpec: Result,
    `type`: npmDashPackageDashArgLib.npmDashPackageDashArgLibStrings.alias,
    escapedName: java.lang.String = null,
    gitCommittish: java.lang.String = null,
    gitRange: java.lang.String = null,
    hosted: HostedGit = null,
    name: java.lang.String = null,
    scope: java.lang.String = null
  ): AliasResult = {
    val __obj = js.Dynamic.literal(fetchSpec = fetchSpec, raw = raw, rawSpec = rawSpec, registry = registry, saveSpec = saveSpec, subSpec = subSpec)
    __obj.updateDynamic("type")(`type`)
    if (escapedName != null) __obj.updateDynamic("escapedName")(escapedName)
    if (gitCommittish != null) __obj.updateDynamic("gitCommittish")(gitCommittish)
    if (gitRange != null) __obj.updateDynamic("gitRange")(gitRange)
    if (hosted != null) __obj.updateDynamic("hosted")(hosted)
    if (name != null) __obj.updateDynamic("name")(name)
    if (scope != null) __obj.updateDynamic("scope")(scope)
    __obj.asInstanceOf[AliasResult]
  }
}

