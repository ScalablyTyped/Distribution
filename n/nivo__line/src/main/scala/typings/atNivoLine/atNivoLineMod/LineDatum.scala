package typings.atNivoLine.atNivoLineMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineDatum
  extends /* key */ StringDictionary[js.Any] {
  var x: js.UndefOr[LineValue | Null] = js.undefined
  var y: js.UndefOr[LineValue | Null] = js.undefined
}

object LineDatum {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    x: LineValue = null,
    y: LineValue = null
  ): LineDatum = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineDatum]
  }
}

