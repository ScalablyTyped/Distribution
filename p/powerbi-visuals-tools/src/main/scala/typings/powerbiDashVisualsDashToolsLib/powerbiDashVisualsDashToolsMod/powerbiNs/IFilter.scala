package typings
package powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFilter extends js.Object {
  var conditions: js.UndefOr[js.Any] = js.undefined
}

object IFilter {
  @scala.inline
  def apply(conditions: js.Any = null): IFilter = {
    val __obj = js.Dynamic.literal()
    if (conditions != null) __obj.updateDynamic("conditions")(conditions)
    __obj.asInstanceOf[IFilter]
  }
}

