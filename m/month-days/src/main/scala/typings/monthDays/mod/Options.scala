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
  def apply(month: js.UndefOr[Double] = js.undefined, year: js.UndefOr[Double] = js.undefined): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(month)) __obj.updateDynamic("month")(month.get.asInstanceOf[js.Any])
    if (!js.isUndefined(year)) __obj.updateDynamic("year")(year.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

