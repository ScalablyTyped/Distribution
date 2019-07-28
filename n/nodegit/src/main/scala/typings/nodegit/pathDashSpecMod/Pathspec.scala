package typings.nodegit.pathDashSpecMod

import typings.nodegit.diffDashDeltaMod.DiffDelta
import typings.nodegit.diffMod.Diff
import typings.nodegit.nodegitMod.Index
import typings.nodegit.repositoryMod.Repository
import typings.nodegit.strDashArrayMod.Strarray
import typings.nodegit.treeMod.Tree
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit/path-spec", "Pathspec")
@js.native
class Pathspec () extends js.Object {
  def free(): Unit = js.native
  def matchDiff(diff: Diff, flags: Double): js.Promise[_] = js.native
  def matchIndex(index: Index, flags: Double): js.Promise[_] = js.native
  def matchTree(tree: Tree, flags: Double): js.Promise[_] = js.native
  def matchWorkdir(repo: Repository, flags: Double): js.Promise[_] = js.native
  def matchesPath(flags: Double, path: String): Double = js.native
}

/* static members */
@JSImport("nodegit/path-spec", "Pathspec")
@js.native
object Pathspec extends js.Object {
  def create(pathspec: String): Pathspec = js.native
  def create(pathspec: js.Array[String]): Pathspec = js.native
  def create(pathspec: Strarray): Pathspec = js.native
  def matchListDiffEntry(m: js.Any, pos: Double): DiffDelta = js.native
  def matchListEntry(m: js.Any, pos: Double): String = js.native
  def matchListEntrycount(m: js.Any): Double = js.native
  def matchListFailedEntry(m: js.Any, pos: Double): String = js.native
  def matchListFailedEntrycount(m: js.Any): Double = js.native
}

