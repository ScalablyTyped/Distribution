package typings.atNivoLine.atNivoLineMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineComputedSerieData
  extends /* key */ StringDictionary[js.Any] {
  var color: js.UndefOr[String] = js.undefined
  var data: js.Array[LineComputedSerieDatum]
  var id: String | Double
}

object LineComputedSerieData {
  @scala.inline
  def apply(
    data: js.Array[LineComputedSerieDatum],
    id: String | Double,
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    color: String = null
  ): LineComputedSerieData = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineComputedSerieData]
  }
}

