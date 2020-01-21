package typings.oracleOraclejet

import typings.oracleOraclejet.ojdatagridMod.ojDataGrid.HeaderContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonClassNameContextLabelRendererResizable[K, D] extends js.Object {
  var className: js.UndefOr[
    (js.Function1[/* context */ HeaderContext[K, D], String | Unit | Null]) | String | Null
  ] = js.undefined
  var label: AnonClassNameContext[K, D]
  var renderer: js.UndefOr[
    (js.Function1[/* context */ HeaderContext[K, D], AnonInsertHTMLElement | Unit | Null]) | Null
  ] = js.undefined
  var resizable: AnonContextDisableEnable[K, D]
  var sortable: js.UndefOr[(js.Function1[/* context */ HeaderContext[K, D], String]) | String | Null] = js.undefined
  var style: js.UndefOr[
    (js.Function1[/* context */ HeaderContext[K, D], String | Unit | Null]) | String | Null
  ] = js.undefined
}

object AnonClassNameContextLabelRendererResizable {
  @scala.inline
  def apply[K, D](
    label: AnonClassNameContext[K, D],
    resizable: AnonContextDisableEnable[K, D],
    className: (js.Function1[/* context */ HeaderContext[K, D], String | Unit | Null]) | String = null,
    renderer: /* context */ HeaderContext[K, D] => AnonInsertHTMLElement | Unit | Null = null,
    sortable: (js.Function1[/* context */ HeaderContext[K, D], String]) | String = null,
    style: (js.Function1[/* context */ HeaderContext[K, D], String | Unit | Null]) | String = null
  ): AnonClassNameContextLabelRendererResizable[K, D] = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], resizable = resizable.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (renderer != null) __obj.updateDynamic("renderer")(js.Any.fromFunction1(renderer))
    if (sortable != null) __obj.updateDynamic("sortable")(sortable.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonClassNameContextLabelRendererResizable[K, D]]
  }
}

