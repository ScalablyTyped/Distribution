package typings.npmPackageArg.mod

import typings.npmPackageArg.npmPackageArgStrings.git
import typings.npmPackageArg.npmPackageArgStrings.remote
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait URLResult extends Result {
  
  @JSName("fetchSpec")
  var fetchSpec_URLResult: String = js.native
  
  @JSName("saveSpec")
  var saveSpec_URLResult: String = js.native
  
  @JSName("type")
  var type_URLResult: git | remote = js.native
}
