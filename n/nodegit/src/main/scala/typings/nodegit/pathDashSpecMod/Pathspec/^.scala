package typings.nodegit.pathDashSpecMod.Pathspec

import typings.nodegit.diffDashDeltaMod.DiffDelta
import typings.nodegit.strDashArrayMod.Strarray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit/path-spec", "Pathspec")
@js.native
object ^ extends js.Object {
  def create(pathspec: String): typings.nodegit.pathDashSpecMod.Pathspec = js.native
  def create(pathspec: js.Array[String]): typings.nodegit.pathDashSpecMod.Pathspec = js.native
  def create(pathspec: Strarray): typings.nodegit.pathDashSpecMod.Pathspec = js.native
  def matchListDiffEntry(m: js.Any, pos: Double): DiffDelta = js.native
  def matchListEntry(m: js.Any, pos: Double): String = js.native
  def matchListEntrycount(m: js.Any): Double = js.native
  def matchListFailedEntry(m: js.Any, pos: Double): String = js.native
  def matchListFailedEntrycount(m: js.Any): Double = js.native
}

