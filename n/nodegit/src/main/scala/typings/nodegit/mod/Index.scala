package typings.nodegit.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit", "Index")
@js.native
class Index ()
  extends typings.nodegit.indexMod.Index

/* static members */
@JSImport("nodegit", "Index")
@js.native
object Index extends js.Object {
  def entryIsConflict(entry: typings.nodegit.indexEntryMod.IndexEntry): Boolean = js.native
  def entryStage(entry: typings.nodegit.indexEntryMod.IndexEntry): Double = js.native
  def open(indexPath: String): js.Promise[typings.nodegit.indexMod.Index] = js.native
}

