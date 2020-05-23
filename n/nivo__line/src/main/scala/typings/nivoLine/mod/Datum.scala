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
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    x: js.UndefOr[Null | DatumValue] = js.undefined,
    y: js.UndefOr[Null | DatumValue] = js.undefined
  ): Datum = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(x)) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (!js.isUndefined(y)) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Datum]
  }
}

