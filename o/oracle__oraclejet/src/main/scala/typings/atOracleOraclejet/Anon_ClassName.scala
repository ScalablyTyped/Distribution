package typings.atOracleOraclejet

import typings.atOracleOraclejet.ojdatagridMod.ojDataGridNs.CellContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ClassName[K, D] extends js.Object {
  var className: js.UndefOr[
    (js.Function1[/* context */ CellContext[K, D], String | Unit | Null]) | String | Null
  ] = js.undefined
  var renderer: js.UndefOr[
    (js.Function1[/* context */ CellContext[K, D], Anon_InsertHTMLElement | Unit | Null]) | Null
  ] = js.undefined
  var style: js.UndefOr[
    (js.Function1[/* context */ CellContext[K, D], String | Unit | Null]) | String | Null
  ] = js.undefined
}

object Anon_ClassName {
  @scala.inline
  def apply[K, D](
    className: (js.Function1[/* context */ CellContext[K, D], String | Unit | Null]) | String = null,
    renderer: /* context */ CellContext[K, D] => Anon_InsertHTMLElement | Unit | Null = null,
    style: (js.Function1[/* context */ CellContext[K, D], String | Unit | Null]) | String = null
  ): Anon_ClassName[K, D] = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (renderer != null) __obj.updateDynamic("renderer")(js.Any.fromFunction1(renderer))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ClassName[K, D]]
  }
}

