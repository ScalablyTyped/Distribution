package typings.normalizeScrollLeft.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.normalizeScrollLeft.normalizeScrollLeftStrings.indeterminate
  - typings.normalizeScrollLeft.normalizeScrollLeftStrings.default
  - typings.normalizeScrollLeft.normalizeScrollLeftStrings.negative
  - typings.normalizeScrollLeft.normalizeScrollLeftStrings.reverse
*/
trait ScrollType extends js.Object

object ScrollType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def default: typings.normalizeScrollLeft.normalizeScrollLeftStrings.default = this.cast("default")
  @scala.inline
  def indeterminate: typings.normalizeScrollLeft.normalizeScrollLeftStrings.indeterminate = this.cast("indeterminate")
  @scala.inline
  def negative: typings.normalizeScrollLeft.normalizeScrollLeftStrings.negative = this.cast("negative")
  @scala.inline
  def reverse: typings.normalizeScrollLeft.normalizeScrollLeftStrings.reverse = this.cast("reverse")
}

