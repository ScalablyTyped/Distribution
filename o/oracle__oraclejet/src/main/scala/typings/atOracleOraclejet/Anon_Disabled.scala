package typings.atOracleOraclejet

import typings.atOracleOraclejet.atOracleOraclejetStrings.disabled
import typings.atOracleOraclejet.atOracleOraclejetStrings.enabled
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Disabled extends js.Object {
  var tasks: js.UndefOr[disabled | enabled] = js.undefined
}

object Anon_Disabled {
  @scala.inline
  def apply(tasks: disabled | enabled = null): Anon_Disabled = {
    val __obj = js.Dynamic.literal()
    if (tasks != null) __obj.updateDynamic("tasks")(tasks.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Disabled]
  }
}

