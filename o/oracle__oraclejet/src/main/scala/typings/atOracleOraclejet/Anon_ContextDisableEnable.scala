package typings.atOracleOraclejet

import typings.atOracleOraclejet.atOracleOraclejetStrings.disable
import typings.atOracleOraclejet.atOracleOraclejetStrings.enable
import typings.atOracleOraclejet.ojdatagridMod.ojDataGridNs.HeaderContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ContextDisableEnable[K, D] extends js.Object {
  var height: js.UndefOr[(js.Function1[/* context */ HeaderContext[K, D], String]) | String | Null] = js.undefined
  var width: enable | disable
}

object Anon_ContextDisableEnable {
  @scala.inline
  def apply[K, D](
    width: enable | disable,
    height: (js.Function1[/* context */ HeaderContext[K, D], String]) | String = null
  ): Anon_ContextDisableEnable[K, D] = {
    val __obj = js.Dynamic.literal(width = width.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ContextDisableEnable[K, D]]
  }
}

