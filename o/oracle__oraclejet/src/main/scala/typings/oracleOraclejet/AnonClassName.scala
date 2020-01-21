package typings.oracleOraclejet

import typings.oracleOraclejet.ojdatagridMod.ojDataGrid.CellContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonClassName[K, D] extends js.Object {
  var className: js.UndefOr[
    (js.Function1[/* context */ CellContext[K, D], String | Unit | Null]) | String | Null
  ] = js.undefined
  var renderer: js.UndefOr[
    (js.Function1[/* context */ CellContext[K, D], AnonInsertHTMLElement | Unit | Null]) | Null
  ] = js.undefined
  var style: js.UndefOr[
    (js.Function1[/* context */ CellContext[K, D], String | Unit | Null]) | String | Null
  ] = js.undefined
}

object AnonClassName {
  @scala.inline
  def apply[K, D](
    className: (js.Function1[/* context */ CellContext[K, D], String | Unit | Null]) | String = null,
    renderer: /* context */ CellContext[K, D] => AnonInsertHTMLElement | Unit | Null = null,
    style: (js.Function1[/* context */ CellContext[K, D], String | Unit | Null]) | String = null
  ): AnonClassName[K, D] = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (renderer != null) __obj.updateDynamic("renderer")(js.Any.fromFunction1(renderer))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonClassName[K, D]]
  }
}

