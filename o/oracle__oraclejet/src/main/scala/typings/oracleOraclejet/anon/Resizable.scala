package typings.oracleOraclejet.anon

import typings.oracleOraclejet.ojdatagridMod.ojDataGrid.HeaderContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Resizable[K, D] extends js.Object {
  var className: js.UndefOr[
    (js.Function1[/* context */ HeaderContext[K, D], String | Unit | Null]) | String | Null
  ] = js.undefined
  var label: Style[K, D]
  var renderer: js.UndefOr[(js.Function1[/* context */ HeaderContext[K, D], `1` | Unit | Null]) | Null] = js.undefined
  var resizable: Height[K, D]
  var sortable: js.UndefOr[(js.Function1[/* context */ HeaderContext[K, D], String]) | String | Null] = js.undefined
  var style: js.UndefOr[
    (js.Function1[/* context */ HeaderContext[K, D], String | Unit | Null]) | String | Null
  ] = js.undefined
}

object Resizable {
  @scala.inline
  def apply[K, D](
    label: Style[K, D],
    resizable: Height[K, D],
    className: js.UndefOr[
      Null | (js.Function1[/* context */ HeaderContext[K, D], String | Unit | Null]) | String
    ] = js.undefined,
    renderer: js.UndefOr[Null | (/* context */ HeaderContext[K, D] => `1` | Unit | Null)] = js.undefined,
    sortable: js.UndefOr[Null | (js.Function1[/* context */ HeaderContext[K, D], String]) | String] = js.undefined,
    style: js.UndefOr[
      Null | (js.Function1[/* context */ HeaderContext[K, D], String | Unit | Null]) | String
    ] = js.undefined
  ): Resizable[K, D] = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], resizable = resizable.asInstanceOf[js.Any])
    if (!js.isUndefined(className)) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(renderer)) __obj.updateDynamic("renderer")(if (renderer != null) js.Any.fromFunction1(renderer.asInstanceOf[/* context */ HeaderContext[K, D] => `1` | Unit | Null]) else null)
    if (!js.isUndefined(sortable)) __obj.updateDynamic("sortable")(sortable.asInstanceOf[js.Any])
    if (!js.isUndefined(style)) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resizable[K, D]]
  }
}

