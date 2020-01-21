package typings.oracleOraclejet

import typings.oracleOraclejet.ojganttMod.ojGantt.Row
import typings.oracleOraclejet.ojganttMod.ojGantt.RowTask
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonColorData[K2, D2] extends js.Object {
  var color: String
  var data: RowTask[K2]
  var itemData: D2 | Null
  var rowData: Row[K2]
}

object AnonColorData {
  @scala.inline
  def apply[K2, D2](color: String, data: RowTask[K2], rowData: Row[K2], itemData: D2 = null): AnonColorData[K2, D2] = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], rowData = rowData.asInstanceOf[js.Any])
    if (itemData != null) __obj.updateDynamic("itemData")(itemData.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonColorData[K2, D2]]
  }
}

