package typings.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClassName[K, D] extends js.Object {
  var className: js.UndefOr[
    (js.Function1[
      /* context */ typings.oracleOraclejet.ojdatagridMod.ojDataGrid.CellContext[K, D], 
      String | Unit | Null
    ]) | String | Null
  ] = js.undefined
  var renderer: js.UndefOr[
    (js.Function1[
      /* context */ typings.oracleOraclejet.ojdatagridMod.ojDataGrid.CellContext[K, D], 
      `1` | Unit | Null
    ]) | Null
  ] = js.undefined
  var style: js.UndefOr[
    (js.Function1[
      /* context */ typings.oracleOraclejet.ojdatagridMod.ojDataGrid.CellContext[K, D], 
      String | Unit | Null
    ]) | String | Null
  ] = js.undefined
}

object ClassName {
  @scala.inline
  def apply[K, D](
    className: js.UndefOr[
      Null | (js.Function1[
        /* context */ typings.oracleOraclejet.ojdatagridMod.ojDataGrid.CellContext[K, D], 
        String | Unit | Null
      ]) | String
    ] = js.undefined,
    renderer: js.UndefOr[
      Null | (/* context */ typings.oracleOraclejet.ojdatagridMod.ojDataGrid.CellContext[K, D] => `1` | Unit | Null)
    ] = js.undefined,
    style: js.UndefOr[
      Null | (js.Function1[
        /* context */ typings.oracleOraclejet.ojdatagridMod.ojDataGrid.CellContext[K, D], 
        String | Unit | Null
      ]) | String
    ] = js.undefined
  ): ClassName[K, D] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(className)) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(renderer)) __obj.updateDynamic("renderer")(if (renderer != null) js.Any.fromFunction1(renderer.asInstanceOf[/* context */ typings.oracleOraclejet.ojdatagridMod.ojDataGrid.CellContext[K, D] => `1` | Unit | Null]) else null)
    if (!js.isUndefined(style)) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassName[K, D]]
  }
}

