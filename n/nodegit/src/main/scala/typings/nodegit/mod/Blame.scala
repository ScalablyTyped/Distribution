package typings.nodegit.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodegit", "Blame")
@js.native
class Blame ()
  extends typings.nodegit.blameMod.Blame
/* static members */
@JSImport("nodegit", "Blame")
@js.native
object Blame extends js.Object {
  
  /**
    * Retrieve the blame of a file
    *
    * @param repo - Repository that contains the file
    * @param path - to the file to get the blame of
    * @param [options] - Options for the blame
    */
  def file(repo: typings.nodegit.repositoryMod.Repository, path: String): js.Promise[typings.nodegit.blameMod.Blame] = js.native
  def file(
    repo: typings.nodegit.repositoryMod.Repository,
    path: String,
    options: typings.nodegit.blameOptionsMod.BlameOptions
  ): js.Promise[typings.nodegit.blameMod.Blame] = js.native
  
  /**
    * @param opts - The git_blame_options struct to initialize
    * @param version - Version of struct; pass GIT_BLAME_OPTIONS_VERSION
    */
  def initOptions(opts: typings.nodegit.blameOptionsMod.BlameOptions, version: Double): Double = js.native
}
