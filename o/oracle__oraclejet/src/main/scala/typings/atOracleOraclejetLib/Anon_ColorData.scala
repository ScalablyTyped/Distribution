package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColorData[K2, D2] extends js.Object {
  var color: java.lang.String
  var data: atOracleOraclejetLib.ojganttMod.ojGanttNs.RowTask[K2]
  var itemData: D2 | scala.Null
  var rowData: atOracleOraclejetLib.ojganttMod.ojGanttNs.Row[K2]
}

object Anon_ColorData {
  @scala.inline
  def apply[K2, D2](
    color: java.lang.String,
    data: atOracleOraclejetLib.ojganttMod.ojGanttNs.RowTask[K2],
    rowData: atOracleOraclejetLib.ojganttMod.ojGanttNs.Row[K2],
    itemData: D2 = null
  ): Anon_ColorData[K2, D2] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("color")(color)
    __obj.updateDynamic("data")(data)
    __obj.updateDynamic("rowData")(rowData)
    if (itemData != null) __obj.updateDynamic("itemData")(itemData.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ColorData[K2, D2]]
  }
}

