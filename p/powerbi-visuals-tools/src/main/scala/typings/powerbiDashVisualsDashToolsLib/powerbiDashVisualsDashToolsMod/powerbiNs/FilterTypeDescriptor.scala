package typings
package powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterTypeDescriptor extends js.Object {
  var selfFilter: js.UndefOr[scala.Boolean] = js.undefined
}

object FilterTypeDescriptor {
  @scala.inline
  def apply(selfFilter: js.UndefOr[scala.Boolean] = js.undefined): FilterTypeDescriptor = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(selfFilter)) __obj.updateDynamic("selfFilter")(selfFilter)
    __obj.asInstanceOf[FilterTypeDescriptor]
  }
}

