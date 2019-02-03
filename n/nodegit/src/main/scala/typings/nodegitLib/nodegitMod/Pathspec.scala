package typings
package nodegitLib.nodegitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit", "Pathspec")
@js.native
class Pathspec ()
  extends nodegitLib.pathDashSpecMod.Pathspec

/* static members */
@JSImport("nodegit", "Pathspec")
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

