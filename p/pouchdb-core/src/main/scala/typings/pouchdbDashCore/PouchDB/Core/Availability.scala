package typings.pouchdbDashCore.PouchDB.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.pouchdbDashCore.pouchdbDashCoreStrings.available
  - typings.pouchdbDashCore.pouchdbDashCoreStrings.compacted
  - typings.pouchdbDashCore.pouchdbDashCoreStrings.`not compacted`
  - typings.pouchdbDashCore.pouchdbDashCoreStrings.missing
*/
trait Availability extends js.Object

object Availability {
  @scala.inline
  def available: typings.pouchdbDashCore.pouchdbDashCoreStrings.available = this.cast("available")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def compacted: typings.pouchdbDashCore.pouchdbDashCoreStrings.compacted = this.cast("compacted")
  @scala.inline
  def missing: typings.pouchdbDashCore.pouchdbDashCoreStrings.missing = this.cast("missing")
  @scala.inline
  def `not compacted`: typings.pouchdbDashCore.pouchdbDashCoreStrings.`not compacted` = this.cast("not compacted")
}

