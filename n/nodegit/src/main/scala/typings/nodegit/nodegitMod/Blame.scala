package typings.nodegit.nodegitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def file(repo: typings.nodegit.repositoryMod.Repository, path: String): typings.nodegit.blameMod.Blame = js.native
  def file(
    repo: typings.nodegit.repositoryMod.Repository,
    path: String,
    options: typings.nodegit.blameDashOptionsMod.BlameOptions
  ): typings.nodegit.blameMod.Blame = js.native
  /**
    * @param opts - The git_blame_options struct to initialize
    * @param version - Version of struct; pass GIT_BLAME_OPTIONS_VERSION
    */
  def initOptions(opts: typings.nodegit.blameDashOptionsMod.BlameOptions, version: Double): Double = js.native
  type FLAG = typings.nodegit.blameMod.Blame.FLAG
}

