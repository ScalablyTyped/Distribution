package typings.pouchdbCore.PouchDB.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.pouchdbCore.pouchdbCoreStrings.available
  - typings.pouchdbCore.pouchdbCoreStrings.compacted
  - typings.pouchdbCore.pouchdbCoreStrings.`not compacted`
  - typings.pouchdbCore.pouchdbCoreStrings.missing
*/
trait Availability extends js.Object

object Availability {
  @scala.inline
  def available: typings.pouchdbCore.pouchdbCoreStrings.available = this.cast("available")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def compacted: typings.pouchdbCore.pouchdbCoreStrings.compacted = this.cast("compacted")
  @scala.inline
  def missing: typings.pouchdbCore.pouchdbCoreStrings.missing = this.cast("missing")
  @scala.inline
  def `not compacted`: typings.pouchdbCore.pouchdbCoreStrings.`not compacted` = this.cast("not compacted")
}

