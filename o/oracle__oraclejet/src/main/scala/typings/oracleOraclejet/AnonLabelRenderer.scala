package typings.oracleOraclejet

import typings.oracleOraclejet.ojdatagridMod.ojDataGrid.HeaderContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLabelRenderer[K, D] extends js.Object {
  var className: js.UndefOr[
    (js.Function1[/* context */ HeaderContext[K, D], String | Unit | Null]) | String | Null
  ] = js.undefined
  var label: AnonStyle[K, D]
  var renderer: js.UndefOr[(js.Function1[/* context */ HeaderContext[K, D], Anon1 | Unit | Null]) | Null] = js.undefined
  var resizable: AnonWidth[K, D]
  var style: js.UndefOr[
    (js.Function1[/* context */ HeaderContext[K, D], String | Unit | Null]) | String | Null
  ] = js.undefined
}

object AnonLabelRenderer {
  @scala.inline
  def apply[K, D](
    label: AnonStyle[K, D],
    resizable: AnonWidth[K, D],
    className: (js.Function1[/* context */ HeaderContext[K, D], String | Unit | Null]) | String = null,
    renderer: /* context */ HeaderContext[K, D] => Anon1 | Unit | Null = null,
    style: (js.Function1[/* context */ HeaderContext[K, D], String | Unit | Null]) | String = null
  ): AnonLabelRenderer[K, D] = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], resizable = resizable.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (renderer != null) __obj.updateDynamic("renderer")(js.Any.fromFunction1(renderer))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLabelRenderer[K, D]]
  }
}

