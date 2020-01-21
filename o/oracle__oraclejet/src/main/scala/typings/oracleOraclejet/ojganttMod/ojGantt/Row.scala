package typings.oracleOraclejet.ojganttMod.ojGantt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait Row[K2] extends js.Object {
  var id: js.UndefOr[js.Any] = js.undefined
  var label: js.UndefOr[String] = js.undefined
  var labelStyle: js.UndefOr[js.Object] = js.undefined
  var tasks: js.UndefOr[js.Array[RowTask[K2]]] = js.undefined
}

object Row {
  @scala.inline
  def apply[K2](
    id: js.Any = null,
    label: String = null,
    labelStyle: js.Object = null,
    tasks: js.Array[RowTask[K2]] = null
  ): Row[K2] = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (labelStyle != null) __obj.updateDynamic("labelStyle")(labelStyle.asInstanceOf[js.Any])
    if (tasks != null) __obj.updateDynamic("tasks")(tasks.asInstanceOf[js.Any])
    __obj.asInstanceOf[Row[K2]]
  }
}

