package typings.npmPackageArg.mod

import typings.npmPackageArg.npmPackageArgBooleans.`true`
import typings.npmPackageArg.npmPackageArgStrings.range
import typings.npmPackageArg.npmPackageArgStrings.tag
import typings.npmPackageArg.npmPackageArgStrings.version
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

