package typings
package npmDashPackageDashArgLib.npmDashPackageDashArgMod.npaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileResult extends Result {
  @JSName("fetchSpec")
  var fetchSpec_FileResult: scala.Null | java.lang.String
  @JSName("saveSpec")
  var saveSpec_FileResult: java.lang.String
  @JSName("type")
  var type_FileResult: npmDashPackageDashArgLib.npmDashPackageDashArgLibStrings.file | npmDashPackageDashArgLib.npmDashPackageDashArgLibStrings.directory
  var where: java.lang.String
}

object FileResult {
  @scala.inline
  def apply(
    raw: java.lang.String,
    rawSpec: java.lang.String,
    registry: scala.Boolean,
    saveSpec: java.lang.String,
    `type`: npmDashPackageDashArgLib.npmDashPackageDashArgLibStrings.file | npmDashPackageDashArgLib.npmDashPackageDashArgLibStrings.directory,
    where: java.lang.String,
    escapedName: java.lang.String = null,
    fetchSpec: java.lang.String = null,
    gitCommittish: java.lang.String = null,
    gitRange: java.lang.String = null,
    hosted: HostedGit = null,
    name: java.lang.String = null,
    scope: java.lang.String = null
  ): FileResult = {
    val __obj = js.Dynamic.literal(raw = raw, rawSpec = rawSpec, registry = registry, saveSpec = saveSpec, where = where)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (escapedName != null) __obj.updateDynamic("escapedName")(escapedName)
    if (fetchSpec != null) __obj.updateDynamic("fetchSpec")(fetchSpec)
    if (gitCommittish != null) __obj.updateDynamic("gitCommittish")(gitCommittish)
    if (gitRange != null) __obj.updateDynamic("gitRange")(gitRange)
    if (hosted != null) __obj.updateDynamic("hosted")(hosted)
    if (name != null) __obj.updateDynamic("name")(name)
    if (scope != null) __obj.updateDynamic("scope")(scope)
    __obj.asInstanceOf[FileResult]
  }
}

