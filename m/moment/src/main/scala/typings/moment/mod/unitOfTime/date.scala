package typings.moment.mod.unitOfTime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.moment.momentStrings.date
  - typings.moment.momentStrings.dates
  - typings.moment.momentStrings.D
*/
trait date extends _StartOf

object date {
  @scala.inline
  def D: typings.moment.momentStrings.D = this.cast("D")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def date: typings.moment.momentStrings.date = this.cast("date")
  @scala.inline
  def dates: typings.moment.momentStrings.dates = this.cast("dates")
}

