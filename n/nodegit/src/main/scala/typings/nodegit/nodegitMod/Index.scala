package typings.nodegit.nodegitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit", "Index")
@js.native
class Index ()
  extends typings.nodegit.indexUnderscoreMod.Index

/* static members */
@JSImport("nodegit", "Index")
@js.native
object Index extends js.Object {
  def entryIsConflict(entry: typings.nodegit.indexDashEntryMod.IndexEntry): Boolean = js.native
  def entryStage(entry: typings.nodegit.indexDashEntryMod.IndexEntry): Double = js.native
  def open(indexPath: String): js.Promise[typings.nodegit.indexUnderscoreMod.Index] = js.native
}

