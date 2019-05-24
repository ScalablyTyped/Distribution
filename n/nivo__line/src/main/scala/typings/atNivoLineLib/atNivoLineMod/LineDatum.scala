package typings
package atNivoLineLib.atNivoLineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineDatum
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var x: js.UndefOr[LineValue | scala.Null] = js.undefined
  var y: js.UndefOr[LineValue | scala.Null] = js.undefined
}

object LineDatum {
  @scala.inline
  def apply(
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
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

