package typings
package npmDashPackageDashArgLib.npmDashPackageDashArgMod.npaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegistryResult extends Result {
  @JSName("fetchSpec")
  var fetchSpec_RegistryResult: java.lang.String
  @JSName("registry")
  var registry_RegistryResult: npmDashPackageDashArgLib.npmDashPackageDashArgLibNumbers.`true`
  @JSName("saveSpec")
  var saveSpec_RegistryResult: scala.Null
  @JSName("type")
  var type_RegistryResult: npmDashPackageDashArgLib.npmDashPackageDashArgLibStrings.version | npmDashPackageDashArgLib.npmDashPackageDashArgLibStrings.range | npmDashPackageDashArgLib.npmDashPackageDashArgLibStrings.tag
}

object RegistryResult {
  @scala.inline
  def apply(
    fetchSpec: java.lang.String,
    raw: java.lang.String,
    rawSpec: java.lang.String,
    registry: npmDashPackageDashArgLib.npmDashPackageDashArgLibNumbers.`true`,
    saveSpec: scala.Null,
    `type`: npmDashPackageDashArgLib.npmDashPackageDashArgLibStrings.version | npmDashPackageDashArgLib.npmDashPackageDashArgLibStrings.range | npmDashPackageDashArgLib.npmDashPackageDashArgLibStrings.tag,
    escapedName: java.lang.String = null,
    gitCommittish: java.lang.String = null,
    gitRange: java.lang.String = null,
    hosted: HostedGit = null,
    name: java.lang.String = null,
    scope: java.lang.String = null
  ): RegistryResult = {
    val __obj = js.Dynamic.literal(fetchSpec = fetchSpec, raw = raw, rawSpec = rawSpec, registry = registry, saveSpec = saveSpec)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (escapedName != null) __obj.updateDynamic("escapedName")(escapedName)
    if (gitCommittish != null) __obj.updateDynamic("gitCommittish")(gitCommittish)
    if (gitRange != null) __obj.updateDynamic("gitRange")(gitRange)
    if (hosted != null) __obj.updateDynamic("hosted")(hosted)
    if (name != null) __obj.updateDynamic("name")(name)
    if (scope != null) __obj.updateDynamic("scope")(scope)
    __obj.asInstanceOf[RegistryResult]
  }
}

