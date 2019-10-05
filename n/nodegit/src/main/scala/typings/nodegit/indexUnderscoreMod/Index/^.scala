package typings.nodegit.indexUnderscoreMod.Index

import typings.nodegit.indexDashEntryMod.IndexEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit/index_", "Index")
@js.native
object ^ extends js.Object {
  def entryIsConflict(entry: IndexEntry): Boolean = js.native
  def entryStage(entry: IndexEntry): Double = js.native
  def open(indexPath: String): js.Promise[typings.nodegit.indexUnderscoreMod.Index] = js.native
}

