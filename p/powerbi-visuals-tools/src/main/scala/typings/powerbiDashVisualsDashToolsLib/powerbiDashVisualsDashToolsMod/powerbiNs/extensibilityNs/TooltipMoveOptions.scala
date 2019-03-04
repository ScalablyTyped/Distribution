package typings
package powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs.extensibilityNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TooltipMoveOptions extends js.Object {
  var coordinates: js.Array[scala.Double]
  var dataItems: js.UndefOr[js.Array[VisualTooltipDataItem]] = js.undefined
  var identities: js.Array[
    powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs.visualsNs.ISelectionId
  ]
  var isTouchEvent: scala.Boolean
}

object TooltipMoveOptions {
  @scala.inline
  def apply(
    coordinates: js.Array[scala.Double],
    identities: js.Array[
      powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs.visualsNs.ISelectionId
    ],
    isTouchEvent: scala.Boolean,
    dataItems: js.Array[VisualTooltipDataItem] = null
  ): TooltipMoveOptions = {
    val __obj = js.Dynamic.literal(coordinates = coordinates, identities = identities, isTouchEvent = isTouchEvent)
    if (dataItems != null) __obj.updateDynamic("dataItems")(dataItems)
    __obj.asInstanceOf[TooltipMoveOptions]
  }
}

