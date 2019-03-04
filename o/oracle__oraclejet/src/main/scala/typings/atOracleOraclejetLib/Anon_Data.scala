package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Data
  extends /* propName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var data: js.Object
  var group: java.lang.String
  var groupData: js.Array[_]
  var id: java.lang.String
  var itemData: js.Object
  var series: java.lang.String
  var seriesData: js.Object
}

object Anon_Data {
  @scala.inline
  def apply(
    data: js.Object,
    group: java.lang.String,
    groupData: js.Array[_],
    id: java.lang.String,
    itemData: js.Object,
    series: java.lang.String,
    seriesData: js.Object,
    StringDictionary: /* propName */ org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): Anon_Data = {
    val __obj = js.Dynamic.literal(data = data, group = group, groupData = groupData, id = id, itemData = itemData, series = series, seriesData = seriesData)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Anon_Data]
  }
}

