package typings.nodegit.blameMod

import typings.nodegit.blameDashHunkMod.BlameHunk
import typings.nodegit.blameDashOptionsMod.BlameOptions
import typings.nodegit.repositoryMod.Repository
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit/blame", "Blame")
@js.native
class Blame () extends js.Object {
  def buffer(buffer: String, bufferLen: Double): js.Promise[Blame] = js.native
  def free(): Unit = js.native
  /**
    * @returns - the hunk at the given index, or NULL on error
    */
  def getHunkByIndex(index: Double): BlameHunk = js.native
  /**
    * @returns - the hunk that contains the given line, or NULL on error
    */
  def getHunkByLine(lineNo: Double): BlameHunk = js.native
  def getHunkCount(): Double = js.native
}

/* static members */
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
  def file(repo: Repository, path: String): Blame = js.native
  def file(repo: Repository, path: String, options: BlameOptions): Blame = js.native
  /**
    * @param opts - The git_blame_options struct to initialize
    * @param version - Version of struct; pass GIT_BLAME_OPTIONS_VERSION
    */
  def initOptions(opts: BlameOptions, version: Double): Double = js.native
}

