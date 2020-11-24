package typings.npmPackageArg.mod

import typings.npmPackageArg.npmPackageArgStrings.git
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HostedGitResult extends Result {
  
  @JSName("fetchSpec")
  var fetchSpec_HostedGitResult: Null | String = js.native
  
  @JSName("gitCommittish")
  var gitCommittish_HostedGitResult: js.UndefOr[String] = js.native
  
  @JSName("gitRange")
  var gitRange_HostedGitResult: js.UndefOr[String] = js.native
  
  @JSName("hosted")
  var hosted_HostedGitResult: HostedGit = js.native
  
  @JSName("saveSpec")
  var saveSpec_HostedGitResult: String = js.native
  
  @JSName("type")
  var type_HostedGitResult: git = js.native
}
