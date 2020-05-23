package typings.oracleOraclejet.anon

import typings.oracleOraclejet.ojdatagridMod.ojDataGrid.HeaderContext
import typings.oracleOraclejet.oracleOraclejetStrings.disable
import typings.oracleOraclejet.oracleOraclejetStrings.enable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Height[K, D] extends js.Object {
  var height: enable | disable
  var width: js.UndefOr[(js.Function1[/* context */ HeaderContext[K, D], String]) | String | Null] = js.undefined
}

object Height {
  @scala.inline
  def apply[K, D](
    height: enable | disable,
    width: js.UndefOr[Null | (js.Function1[/* context */ HeaderContext[K, D], String]) | String] = js.undefined
  ): Height[K, D] = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Height[K, D]]
  }
}

