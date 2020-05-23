package typings.oracleOraclejet.anon

import typings.oracleOraclejet.ojdatagridMod.ojDataGrid.HeaderContext
import typings.oracleOraclejet.oracleOraclejetStrings.disable
import typings.oracleOraclejet.oracleOraclejetStrings.enable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Width[K, D] extends js.Object {
  var height: js.UndefOr[(js.Function1[/* context */ HeaderContext[K, D], String]) | String | Null] = js.undefined
  var width: enable | disable
}

object Width {
  @scala.inline
  def apply[K, D](
    width: enable | disable,
    height: js.UndefOr[Null | (js.Function1[/* context */ HeaderContext[K, D], String]) | String] = js.undefined
  ): Width[K, D] = {
    val __obj = js.Dynamic.literal(width = width.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    __obj.asInstanceOf[Width[K, D]]
  }
}

