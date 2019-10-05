package typings.atOracleOraclejet

import typings.atOracleOraclejet.ojdatagridMod.ojDataGrid.HeaderContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ClassNameContextLabelRendererResizableStyle[K, D] extends js.Object {
  var className: js.UndefOr[
    (js.Function1[/* context */ HeaderContext[K, D], String | Unit | Null]) | String | Null
  ] = js.undefined
  var label: Anon_ClassNameContext[K, D]
  var renderer: js.UndefOr[
    (js.Function1[/* context */ HeaderContext[K, D], Anon_InsertHTMLElement | Unit | Null]) | Null
  ] = js.undefined
  var resizable: Anon_ContextDisableEnable[K, D]
  var style: js.UndefOr[
    (js.Function1[/* context */ HeaderContext[K, D], String | Unit | Null]) | String | Null
  ] = js.undefined
}

object Anon_ClassNameContextLabelRendererResizableStyle {
  @scala.inline
  def apply[K, D](
    label: Anon_ClassNameContext[K, D],
    resizable: Anon_ContextDisableEnable[K, D],
    className: (js.Function1[/* context */ HeaderContext[K, D], String | Unit | Null]) | String = null,
    renderer: /* context */ HeaderContext[K, D] => Anon_InsertHTMLElement | Unit | Null = null,
    style: (js.Function1[/* context */ HeaderContext[K, D], String | Unit | Null]) | String = null
  ): Anon_ClassNameContextLabelRendererResizableStyle[K, D] = {
    val __obj = js.Dynamic.literal(label = label, resizable = resizable)
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (renderer != null) __obj.updateDynamic("renderer")(js.Any.fromFunction1(renderer))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ClassNameContextLabelRendererResizableStyle[K, D]]
  }
}

