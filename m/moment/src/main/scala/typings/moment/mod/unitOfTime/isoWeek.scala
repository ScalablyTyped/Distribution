package typings.moment.mod.unitOfTime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.moment.momentStrings.isoWeek
  - typings.moment.momentStrings.isoWeeks
  - typings.moment.momentStrings.W
*/
trait isoWeek extends _StartOf

object isoWeek {
  @scala.inline
  def W: typings.moment.momentStrings.W = this.cast("W")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def isoWeek: typings.moment.momentStrings.isoWeek = this.cast("isoWeek")
  @scala.inline
  def isoWeeks: typings.moment.momentStrings.isoWeeks = this.cast("isoWeeks")
}

