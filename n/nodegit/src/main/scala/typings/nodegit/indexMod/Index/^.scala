package typings.nodegit.indexMod.Index

import typings.nodegit.indexEntryMod.IndexEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodegit/index_", "Index")
@js.native
object ^ extends js.Object {
  
  def entryIsConflict(entry: IndexEntry): Boolean = js.native
  
  def entryStage(entry: IndexEntry): Double = js.native
  
  def open(indexPath: String): js.Promise[typings.nodegit.indexMod.Index] = js.native
}
