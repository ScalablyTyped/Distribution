package typings
package nodegitLib.pathDashSpecMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit/path-spec", "Pathspec")
@js.native
class Pathspec () extends js.Object {
  def free(): scala.Unit = js.native
  def matchDiff(diff: nodegitLib.diffMod.Diff, flags: scala.Double): js.Promise[_] = js.native
  def matchIndex(index: nodegitLib.nodegitMod.Index, flags: scala.Double): js.Promise[_] = js.native
  def matchTree(tree: nodegitLib.treeMod.Tree, flags: scala.Double): js.Promise[_] = js.native
  def matchWorkdir(repo: nodegitLib.repositoryMod.Repository, flags: scala.Double): js.Promise[_] = js.native
  def matchesPath(flags: scala.Double, path: java.lang.String): scala.Double = js.native
}

/* static members */
@JSImport("nodegit/path-spec", "Pathspec")
@js.native
object Pathspec extends js.Object {
  def create(pathspec: java.lang.String): nodegitLib.pathDashSpecMod.Pathspec = js.native
  def create(pathspec: js.Array[java.lang.String]): nodegitLib.pathDashSpecMod.Pathspec = js.native
  def create(pathspec: nodegitLib.strDashArrayMod.Strarray): nodegitLib.pathDashSpecMod.Pathspec = js.native
  def matchListDiffEntry(m: js.Any, pos: scala.Double): nodegitLib.diffDashDeltaMod.DiffDelta = js.native
  def matchListEntry(m: js.Any, pos: scala.Double): java.lang.String = js.native
  def matchListEntrycount(m: js.Any): scala.Double = js.native
  def matchListFailedEntry(m: js.Any, pos: scala.Double): java.lang.String = js.native
  def matchListFailedEntrycount(m: js.Any): scala.Double = js.native
}

