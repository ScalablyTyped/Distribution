package typings.parseDashMockdb.ParseMockDB

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.parseDashMockdb.parseDashMockdbStrings.beforeSave
  - typings.parseDashMockdb.parseDashMockdbStrings.beforeDelete
*/
trait HookType extends js.Object

object HookType {
  @scala.inline
  def beforeDelete: typings.parseDashMockdb.parseDashMockdbStrings.beforeDelete = this.cast("beforeDelete")
  @scala.inline
  def beforeSave: typings.parseDashMockdb.parseDashMockdbStrings.beforeSave = this.cast("beforeSave")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

