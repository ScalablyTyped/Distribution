package typings.oracleOraclejet

import typings.oracleOraclejet.oracleOraclejetStrings.disabled
import typings.oracleOraclejet.oracleOraclejetStrings.enabled
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDisabled extends js.Object {
  var tasks: js.UndefOr[disabled | enabled] = js.undefined
}

object AnonDisabled {
  @scala.inline
  def apply(tasks: disabled | enabled = null): AnonDisabled = {
    val __obj = js.Dynamic.literal()
    if (tasks != null) __obj.updateDynamic("tasks")(tasks.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDisabled]
  }
}

