package typings
package atOracleOraclejetLib.ojganttMod.ojGanttNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait Row[K2] extends js.Object {
  var id: js.UndefOr[js.Any] = js.undefined
  var label: js.UndefOr[java.lang.String] = js.undefined
  var labelStyle: js.UndefOr[js.Object] = js.undefined
  var tasks: js.UndefOr[js.Array[RowTask[K2]]] = js.undefined
}

object Row {
  @scala.inline
  def apply[K2](
    id: js.Any = null,
    label: java.lang.String = null,
    labelStyle: js.Object = null,
    tasks: js.Array[RowTask[K2]] = null
  ): Row[K2] = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    if (label != null) __obj.updateDynamic("label")(label)
    if (labelStyle != null) __obj.updateDynamic("labelStyle")(labelStyle)
    if (tasks != null) __obj.updateDynamic("tasks")(tasks)
    __obj.asInstanceOf[Row[K2]]
  }
}

