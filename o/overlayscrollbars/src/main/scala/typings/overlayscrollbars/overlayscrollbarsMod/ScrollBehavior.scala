package typings.overlayscrollbars.overlayscrollbarsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.overlayscrollbars.overlayscrollbarsStrings.always
  - typings.overlayscrollbars.overlayscrollbarsStrings.ifneeded
  - typings.overlayscrollbars.overlayscrollbarsStrings.never
*/
trait ScrollBehavior extends js.Object

object ScrollBehavior {
  @scala.inline
  def always: typings.overlayscrollbars.overlayscrollbarsStrings.always = this.cast("always")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def ifneeded: typings.overlayscrollbars.overlayscrollbarsStrings.ifneeded = this.cast("ifneeded")
  @scala.inline
  def never: typings.overlayscrollbars.overlayscrollbarsStrings.never = this.cast("never")
}

