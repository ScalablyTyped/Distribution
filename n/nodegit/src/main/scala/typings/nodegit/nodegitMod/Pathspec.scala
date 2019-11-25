package typings.nodegit.nodegitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit", "Pathspec")
@js.native
class Pathspec ()
  extends typings.nodegit.pathDashSpecMod.Pathspec

/* static members */
@JSImport("nodegit", "Pathspec")
@js.native
object Pathspec extends js.Object {
  def create(pathspec: String): typings.nodegit.pathDashSpecMod.Pathspec = js.native
  def create(pathspec: js.Array[String]): typings.nodegit.pathDashSpecMod.Pathspec = js.native
  def create(pathspec: typings.nodegit.strDashArrayMod.Strarray): typings.nodegit.pathDashSpecMod.Pathspec = js.native
  def matchListDiffEntry(m: js.Any, pos: Double): typings.nodegit.diffDashDeltaMod.DiffDelta = js.native
  def matchListEntry(m: js.Any, pos: Double): String = js.native
  def matchListEntrycount(m: js.Any): Double = js.native
  def matchListFailedEntry(m: js.Any, pos: Double): String = js.native
  def matchListFailedEntrycount(m: js.Any): Double = js.native
}

