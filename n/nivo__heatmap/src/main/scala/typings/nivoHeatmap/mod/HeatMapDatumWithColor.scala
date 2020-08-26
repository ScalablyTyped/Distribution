package typings.nivoHeatmap.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined @nivo/heatmap.@nivo/heatmap.HeatMapDatum & {  color :string} */
@js.native
trait HeatMapDatumWithColor extends /* key */ StringDictionary[String | Double] {
  var color: String = js.native
}

object HeatMapDatumWithColor {
  @scala.inline
  def apply(color: String): HeatMapDatumWithColor = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeatMapDatumWithColor]
  }
  @scala.inline
  implicit class HeatMapDatumWithColorOps[Self <: HeatMapDatumWithColor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
  }
  
}

