package typings
package atNivoLineLib.atNivoLineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineComputedSerieData
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var color: js.UndefOr[java.lang.String] = js.undefined
  var data: js.Array[LineComputedSerieDatum]
  var id: java.lang.String | scala.Double
}

object LineComputedSerieData {
  @scala.inline
  def apply(
    data: js.Array[LineComputedSerieDatum],
    id: java.lang.String | scala.Double,
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    color: java.lang.String = null
  ): LineComputedSerieData = {
    val __obj = js.Dynamic.literal(data = data, id = id.asInstanceOf[js.Any])
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (color != null) __obj.updateDynamic("color")(color)
    __obj.asInstanceOf[LineComputedSerieData]
  }
}

