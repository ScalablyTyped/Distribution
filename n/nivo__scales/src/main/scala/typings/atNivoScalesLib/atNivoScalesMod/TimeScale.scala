package typings
package atNivoScalesLib.atNivoScalesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimeScale extends Scale {
  var format: js.UndefOr[java.lang.String] = js.undefined
  var precision: js.UndefOr[
    atNivoScalesLib.atNivoScalesLibStrings.millisecond | atNivoScalesLib.atNivoScalesLibStrings.second | atNivoScalesLib.atNivoScalesLibStrings.minute | atNivoScalesLib.atNivoScalesLibStrings.hour | atNivoScalesLib.atNivoScalesLibStrings.month | atNivoScalesLib.atNivoScalesLibStrings.year | atNivoScalesLib.atNivoScalesLibStrings.day
  ] = js.undefined
  var `type`: atNivoScalesLib.atNivoScalesLibStrings.time
}

object TimeScale {
  @scala.inline
  def apply(
    `type`: atNivoScalesLib.atNivoScalesLibStrings.time,
    format: java.lang.String = null,
    precision: atNivoScalesLib.atNivoScalesLibStrings.millisecond | atNivoScalesLib.atNivoScalesLibStrings.second | atNivoScalesLib.atNivoScalesLibStrings.minute | atNivoScalesLib.atNivoScalesLibStrings.hour | atNivoScalesLib.atNivoScalesLibStrings.month | atNivoScalesLib.atNivoScalesLibStrings.year | atNivoScalesLib.atNivoScalesLibStrings.day = null
  ): TimeScale = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (format != null) __obj.updateDynamic("format")(format)
    if (precision != null) __obj.updateDynamic("precision")(precision.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeScale]
  }
}

