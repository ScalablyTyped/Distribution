package typings.atOracleOraclejet

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Data
  extends /* propName */ StringDictionary[js.Any] {
  var data: js.Object
  var group: String
  var groupData: js.Array[_]
  var id: String
  var itemData: js.Object
  var series: String
  var seriesData: js.Object
}

object Anon_Data {
  @scala.inline
  def apply(
    data: js.Object,
    group: String,
    groupData: js.Array[_],
    id: String,
    itemData: js.Object,
    series: String,
    seriesData: js.Object,
    StringDictionary: /* propName */ StringDictionary[js.Any] = null
  ): Anon_Data = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], group = group.asInstanceOf[js.Any], groupData = groupData.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], itemData = itemData.asInstanceOf[js.Any], series = series.asInstanceOf[js.Any], seriesData = seriesData.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Anon_Data]
  }
}

