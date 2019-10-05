package typings.atOracleOraclejet

import typings.atOracleOraclejet.atOracleOraclejetStrings.disable
import typings.atOracleOraclejet.atOracleOraclejetStrings.enable
import typings.atOracleOraclejet.ojdatagridMod.ojDataGrid.HeaderContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ContextDisable[K, D] extends js.Object {
  var height: enable | disable
  var width: js.UndefOr[(js.Function1[/* context */ HeaderContext[K, D], String]) | String | Null] = js.undefined
}

object Anon_ContextDisable {
  @scala.inline
  def apply[K, D](
    height: enable | disable,
    width: (js.Function1[/* context */ HeaderContext[K, D], String]) | String = null
  ): Anon_ContextDisable[K, D] = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ContextDisable[K, D]]
  }
}

