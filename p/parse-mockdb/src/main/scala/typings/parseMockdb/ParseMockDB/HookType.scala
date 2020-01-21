package typings.parseMockdb.ParseMockDB

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.parseMockdb.parseMockdbStrings.beforeSave
  - typings.parseMockdb.parseMockdbStrings.beforeDelete
*/
trait HookType extends js.Object

object HookType {
  @scala.inline
  def beforeDelete: typings.parseMockdb.parseMockdbStrings.beforeDelete = this.cast("beforeDelete")
  @scala.inline
  def beforeSave: typings.parseMockdb.parseMockdbStrings.beforeSave = this.cast("beforeSave")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

