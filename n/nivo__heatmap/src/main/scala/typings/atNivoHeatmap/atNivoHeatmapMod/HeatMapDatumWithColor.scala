package typings.atNivoHeatmap.atNivoHeatmapMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined @nivo/heatmap.@nivo/heatmap.HeatMapDatum & {  color  :string} */
trait HeatMapDatumWithColor extends /* key */ StringDictionary[String | Double] {
  var color: String
}

object HeatMapDatumWithColor {
  @scala.inline
  def apply(color: String, StringDictionary: /* key */ StringDictionary[String | Double] = null): HeatMapDatumWithColor = {
    val __obj = js.Dynamic.literal(color = color)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[HeatMapDatumWithColor]
  }
}

