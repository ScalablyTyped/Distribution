package typings.nivoScales.mod

import typings.nivoScales.nivoScalesStrings.day
import typings.nivoScales.nivoScalesStrings.hour
import typings.nivoScales.nivoScalesStrings.millisecond
import typings.nivoScales.nivoScalesStrings.minute
import typings.nivoScales.nivoScalesStrings.month
import typings.nivoScales.nivoScalesStrings.second
import typings.nivoScales.nivoScalesStrings.time
import typings.nivoScales.nivoScalesStrings.year
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimeScale extends Scale {
  var format: js.UndefOr[String] = js.undefined
  var precision: js.UndefOr[millisecond | second | minute | hour | month | year | day] = js.undefined
  var `type`: time
  var useUTC: js.UndefOr[Boolean] = js.undefined
}

object TimeScale {
  @scala.inline
  def apply(
    `type`: time,
    format: String = null,
    precision: millisecond | second | minute | hour | month | year | day = null,
    useUTC: js.UndefOr[Boolean] = js.undefined
  ): TimeScale = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (precision != null) __obj.updateDynamic("precision")(precision.asInstanceOf[js.Any])
    if (!js.isUndefined(useUTC)) __obj.updateDynamic("useUTC")(useUTC.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeScale]
  }
}

