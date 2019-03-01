package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DataGroupData extends js.Object {
  var data: js.Object
  var groupData: js.Array[_]
  var itemData: js.Object
  var seriesData: js.Object
}

object Anon_DataGroupData {
  @scala.inline
  def apply(data: js.Object, groupData: js.Array[_], itemData: js.Object, seriesData: js.Object): Anon_DataGroupData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("data")(data)
    __obj.updateDynamic("groupData")(groupData)
    __obj.updateDynamic("itemData")(itemData)
    __obj.updateDynamic("seriesData")(seriesData)
    __obj.asInstanceOf[Anon_DataGroupData]
  }
}

