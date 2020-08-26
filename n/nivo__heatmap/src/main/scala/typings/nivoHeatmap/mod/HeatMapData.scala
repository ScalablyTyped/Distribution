package typings.nivoHeatmap.mod

import typings.nivoHeatmap.nivoHeatmapStrings.auto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HeatMapData extends js.Object {
  var data: js.Array[HeatMapDatum] = js.native
  var indexBy: js.UndefOr[String | IndexByFunc] = js.native
  var keys: js.UndefOr[js.Array[String]] = js.native
  var maxValue: js.UndefOr[Double | auto] = js.native
  var minValue: js.UndefOr[Double | auto] = js.native
}

object HeatMapData {
  @scala.inline
  def apply(data: js.Array[HeatMapDatum]): HeatMapData = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeatMapData]
  }
  @scala.inline
  implicit class HeatMapDataOps[Self <: HeatMapData] (val x: Self) extends AnyVal {
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
    def setDataVarargs(value: HeatMapDatum*): Self = this.set("data", js.Array(value :_*))
    @scala.inline
    def setData(value: js.Array[HeatMapDatum]): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setIndexByFunction1(value: /* datum */ HeatMapDatum => String | Double): Self = this.set("indexBy", js.Any.fromFunction1(value))
    @scala.inline
    def setIndexBy(value: String | IndexByFunc): Self = this.set("indexBy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndexBy: Self = this.set("indexBy", js.undefined)
    @scala.inline
    def setKeysVarargs(value: String*): Self = this.set("keys", js.Array(value :_*))
    @scala.inline
    def setKeys(value: js.Array[String]): Self = this.set("keys", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeys: Self = this.set("keys", js.undefined)
    @scala.inline
    def setMaxValue(value: Double | auto): Self = this.set("maxValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxValue: Self = this.set("maxValue", js.undefined)
    @scala.inline
    def setMinValue(value: Double | auto): Self = this.set("minValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinValue: Self = this.set("minValue", js.undefined)
  }
  
}

