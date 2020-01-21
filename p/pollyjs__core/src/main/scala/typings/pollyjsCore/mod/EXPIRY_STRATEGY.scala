package typings.pollyjsCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.pollyjsCore.pollyjsCoreStrings.record
  - typings.pollyjsCore.pollyjsCoreStrings.warn
  - typings.pollyjsCore.pollyjsCoreStrings.error
*/
trait EXPIRY_STRATEGY extends js.Object

object EXPIRY_STRATEGY {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def error: typings.pollyjsCore.pollyjsCoreStrings.error = this.cast("error")
  @scala.inline
  def record: typings.pollyjsCore.pollyjsCoreStrings.record = this.cast("record")
  @scala.inline
  def warn: typings.pollyjsCore.pollyjsCoreStrings.warn = this.cast("warn")
}

