package typings
package nodegitLib.nodegitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit", "Index")
@js.native
class Index ()
  extends nodegitLib.indexUnderscoreMod.Index

@JSImport("nodegit", "Index")
@js.native
object Index extends js.Object {
  def entryIsConflict(entry: nodegitLib.indexDashEntryMod.IndexEntry): scala.Boolean = js.native
  def entryStage(entry: nodegitLib.indexDashEntryMod.IndexEntry): scala.Double = js.native
  def open(indexPath: java.lang.String): js.Promise[nodegitLib.indexUnderscoreMod.Index] = js.native
}

