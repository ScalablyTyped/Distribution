package typings.moment.mod.unitOfTime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.moment.momentStrings.quarter
  - typings.moment.momentStrings.quarters
  - typings.moment.momentStrings.Q
*/
trait quarter extends _StartOf

object quarter {
  @scala.inline
  def Q: typings.moment.momentStrings.Q = this.cast("Q")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def quarter: typings.moment.momentStrings.quarter = this.cast("quarter")
  @scala.inline
  def quarters: typings.moment.momentStrings.quarters = this.cast("quarters")
}

