package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Data
  extends /* key */ StringDictionary[js.Any] {
  var data: js.Object = js.native
  var group: String = js.native
  var groupData: js.Array[_] = js.native
  var id: String = js.native
  var itemData: js.Object = js.native
  var series: String = js.native
  var seriesData: js.Object = js.native
}

object Data {
  @scala.inline
  def apply(
    data: js.Object,
    group: String,
    groupData: js.Array[_],
    id: String,
    itemData: js.Object,
    series: String,
    seriesData: js.Object
  ): Data = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], group = group.asInstanceOf[js.Any], groupData = groupData.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], itemData = itemData.asInstanceOf[js.Any], series = series.asInstanceOf[js.Any], seriesData = seriesData.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data]
  }
  @scala.inline
  implicit class DataOps[Self <: Data] (val x: Self) extends AnyVal {
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
    def setData(value: js.Object): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setGroup(value: String): Self = this.set("group", value.asInstanceOf[js.Any])
    @scala.inline
    def setGroupDataVarargs(value: js.Any*): Self = this.set("groupData", js.Array(value :_*))
    @scala.inline
    def setGroupData(value: js.Array[_]): Self = this.set("groupData", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setItemData(value: js.Object): Self = this.set("itemData", value.asInstanceOf[js.Any])
    @scala.inline
    def setSeries(value: String): Self = this.set("series", value.asInstanceOf[js.Any])
    @scala.inline
    def setSeriesData(value: js.Object): Self = this.set("seriesData", value.asInstanceOf[js.Any])
  }
  
}

