package typings.npmDashPackageDashArg.npmDashPackageDashArgMod

import typings.npmDashPackageDashArg.npmDashPackageDashArgBooleans.`true`
import typings.npmDashPackageDashArg.npmDashPackageDashArgStrings.range
import typings.npmDashPackageDashArg.npmDashPackageDashArgStrings.tag
import typings.npmDashPackageDashArg.npmDashPackageDashArgStrings.version
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegistryResult extends Result {
  @JSName("fetchSpec")
  var fetchSpec_RegistryResult: String = js.native
  @JSName("registry")
  var registry_RegistryResult: `true` = js.native
  @JSName("saveSpec")
  var saveSpec_RegistryResult: Null = js.native
  @JSName("type")
  var type_RegistryResult: version | range | tag = js.native
}

