package typings
package nodegitLib.blameMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit/blame", "Blame")
@js.native
class Blame () extends js.Object {
  def buffer(buffer: java.lang.String, bufferLen: scala.Double): stdLib.Promise[Blame] = js.native
  def free(): scala.Unit = js.native
  /**
       * @returns - the hunk at the given index, or NULL on error
       */
  def getHunkByIndex(index: scala.Double): nodegitLib.blameDashHunkMod.BlameHunk = js.native
  /**
       * @returns - the hunk that contains the given line, or NULL on error
       */
  def getHunkByLine(lineNo: scala.Double): nodegitLib.blameDashHunkMod.BlameHunk = js.native
  def getHunkCount(): scala.Double = js.native
}

@JSImport("nodegit/blame", "Blame")
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
  /**
       * Retrieve the blame of a file
       *
       * @param repo - Repository that contains the file
       * @param path - to the file to get the blame of
       * @param [options] - Options for the blame
       */
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

