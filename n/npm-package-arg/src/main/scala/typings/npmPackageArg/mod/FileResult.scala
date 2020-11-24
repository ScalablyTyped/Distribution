package typings.npmPackageArg.mod

import typings.npmPackageArg.npmPackageArgStrings.directory
import typings.npmPackageArg.npmPackageArgStrings.file
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileResult extends Result {
  
  @JSName("fetchSpec")
  var fetchSpec_FileResult: Null | String = js.native
  
  @JSName("saveSpec")
  var saveSpec_FileResult: String = js.native
  
  @JSName("type")
  var type_FileResult: file | directory = js.native
  
  var where: String = js.native
}
