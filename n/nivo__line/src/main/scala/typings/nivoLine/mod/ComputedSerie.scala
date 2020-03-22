package typings.nivoLine.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComputedSerie
  extends /* key */ StringDictionary[js.Any] {
  var color: js.UndefOr[String] = js.undefined
  var data: js.Array[ComputedDatum]
  var id: String | Double
}

object ComputedSerie {
  @scala.inline
  def apply(
    data: js.Array[ComputedDatum],
    id: String | Double,
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    color: String = null
  ): ComputedSerie = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComputedSerie]
  }
}

