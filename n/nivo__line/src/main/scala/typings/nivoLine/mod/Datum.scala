package typings.nivoLine.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Datum
  extends /* key */ StringDictionary[js.Any] {
  var x: js.UndefOr[DatumValue | Null] = js.undefined
  var y: js.UndefOr[DatumValue | Null] = js.undefined
}

object Datum {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    x: DatumValue = null,
    y: DatumValue = null
  ): Datum = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Datum]
  }
}

