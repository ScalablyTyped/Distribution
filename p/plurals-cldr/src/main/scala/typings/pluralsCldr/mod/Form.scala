package typings.pluralsCldr.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.pluralsCldr.pluralsCldrStrings.zero
  - typings.pluralsCldr.pluralsCldrStrings.one
  - typings.pluralsCldr.pluralsCldrStrings.two
  - typings.pluralsCldr.pluralsCldrStrings.few
  - typings.pluralsCldr.pluralsCldrStrings.many
  - typings.pluralsCldr.pluralsCldrStrings.other
*/
trait Form extends js.Object

object Form {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def few: typings.pluralsCldr.pluralsCldrStrings.few = this.cast("few")
  @scala.inline
  def many: typings.pluralsCldr.pluralsCldrStrings.many = this.cast("many")
  @scala.inline
  def one: typings.pluralsCldr.pluralsCldrStrings.one = this.cast("one")
  @scala.inline
  def other: typings.pluralsCldr.pluralsCldrStrings.other = this.cast("other")
  @scala.inline
  def two: typings.pluralsCldr.pluralsCldrStrings.two = this.cast("two")
  @scala.inline
  def zero: typings.pluralsCldr.pluralsCldrStrings.zero = this.cast("zero")
}

