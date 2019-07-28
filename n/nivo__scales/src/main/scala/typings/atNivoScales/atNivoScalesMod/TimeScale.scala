package typings.atNivoScales.atNivoScalesMod

import typings.atNivoScales.atNivoScalesStrings.day
import typings.atNivoScales.atNivoScalesStrings.hour
import typings.atNivoScales.atNivoScalesStrings.millisecond
import typings.atNivoScales.atNivoScalesStrings.minute
import typings.atNivoScales.atNivoScalesStrings.month
import typings.atNivoScales.atNivoScalesStrings.second
import typings.atNivoScales.atNivoScalesStrings.time
import typings.atNivoScales.atNivoScalesStrings.year
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimeScale extends Scale {
  var format: js.UndefOr[String] = js.undefined
  var precision: js.UndefOr[millisecond | second | minute | hour | month | year | day] = js.undefined
  var `type`: time
}

object TimeScale {
  @scala.inline
  def apply(
    `type`: time,
    format: String = null,
    precision: millisecond | second | minute | hour | month | year | day = null
  ): TimeScale = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (format != null) __obj.updateDynamic("format")(format)
    if (precision != null) __obj.updateDynamic("precision")(precision.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeScale]
  }
}

