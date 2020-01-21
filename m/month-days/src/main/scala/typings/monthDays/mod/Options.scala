package typings.monthDays.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
  		Note that the month is zero-index to be consistent with the native date methods.
  		@default (new Date()).getUTCMonth()
  		*/
  val month: js.UndefOr[Double] = js.undefined
  /**
  		@default (new Date).getUTCFullYear()
  		*/
  val year: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(month: Int | Double = null, year: Int | Double = null): Options = {
    val __obj = js.Dynamic.literal()
    if (month != null) __obj.updateDynamic("month")(month.asInstanceOf[js.Any])
    if (year != null) __obj.updateDynamic("year")(year.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

