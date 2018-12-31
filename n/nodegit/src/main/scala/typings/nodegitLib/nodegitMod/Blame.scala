package typings
package nodegitLib.nodegitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit", "Blame")
@js.native
class Blame ()
  extends nodegitLib.blameMod.Blame

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
  def file(repo: nodegitLib.repositoryMod.Repository, path: java.lang.String): nodegitLib.blameMod.Blame = js.native
  def file(
    repo: nodegitLib.repositoryMod.Repository,
    path: java.lang.String,
    options: nodegitLib.blameDashOptionsMod.BlameOptions
  ): nodegitLib.blameMod.Blame = js.native
  /**
    * @param opts - The git_blame_options struct to initialize
    * @param version - Version of struct; pass GIT_BLAME_OPTIONS_VERSION
    */
  def initOptions(opts: nodegitLib.blameDashOptionsMod.BlameOptions, version: scala.Double): scala.Double = js.native
}

