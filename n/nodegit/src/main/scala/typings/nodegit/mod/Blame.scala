package typings.nodegit.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodegit", "Blame")
@js.native
class Blame ()
  extends typings.nodegit.blameMod.Blame
/* static members */
object Blame {
  
  /**
    * Retrieve the blame of a file
    *
    * @param repo - Repository that contains the file
    * @param path - to the file to get the blame of
    * @param [options] - Options for the blame
    */
  @JSImport("nodegit", "Blame.file")
  @js.native
  def file(repo: typings.nodegit.repositoryMod.Repository, path: String): js.Promise[typings.nodegit.blameMod.Blame] = js.native
  @JSImport("nodegit", "Blame.file")
  @js.native
  def file(
    repo: typings.nodegit.repositoryMod.Repository,
    path: String,
    options: typings.nodegit.blameOptionsMod.BlameOptions
  ): js.Promise[typings.nodegit.blameMod.Blame] = js.native
  
  /**
    * @param opts - The git_blame_options struct to initialize
    * @param version - Version of struct; pass GIT_BLAME_OPTIONS_VERSION
    */
  @JSImport("nodegit", "Blame.initOptions")
  @js.native
  def initOptions(opts: typings.nodegit.blameOptionsMod.BlameOptions, version: Double): Double = js.native
}
