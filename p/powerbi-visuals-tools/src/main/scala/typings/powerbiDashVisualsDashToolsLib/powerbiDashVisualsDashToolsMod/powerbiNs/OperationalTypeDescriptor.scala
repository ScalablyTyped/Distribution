package typings
package powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OperationalTypeDescriptor extends js.Object {
  val searchEnabled: js.UndefOr[scala.Boolean] = js.undefined
}

object OperationalTypeDescriptor {
  @scala.inline
  def apply(searchEnabled: js.UndefOr[scala.Boolean] = js.undefined): OperationalTypeDescriptor = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(searchEnabled)) __obj.updateDynamic("searchEnabled")(searchEnabled)
    __obj.asInstanceOf[OperationalTypeDescriptor]
  }
}

