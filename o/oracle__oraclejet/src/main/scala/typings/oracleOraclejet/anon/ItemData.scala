package typings.oracleOraclejet.anon

import typings.oracleOraclejet.ojganttMod.ojGantt.RowTask
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItemData[K2, D2] extends js.Object {
  var color: String
  var data: RowTask[K2]
  var itemData: D2 | Null
  var rowData: typings.oracleOraclejet.ojganttMod.ojGantt.Row[K2]
}

object ItemData {
  @scala.inline
  def apply[K2, D2](
    color: String,
    data: RowTask[K2],
    rowData: typings.oracleOraclejet.ojganttMod.ojGantt.Row[K2],
    itemData: D2 = null
  ): ItemData[K2, D2] = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], rowData = rowData.asInstanceOf[js.Any], itemData = itemData.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemData[K2, D2]]
  }
}

