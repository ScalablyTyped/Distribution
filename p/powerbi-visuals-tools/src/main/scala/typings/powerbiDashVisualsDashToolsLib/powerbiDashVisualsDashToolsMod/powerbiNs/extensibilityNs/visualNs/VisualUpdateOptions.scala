package typings
package powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs.extensibilityNs.visualNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VisualUpdateOptions
  extends powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs.extensibilityNs.VisualUpdateOptions {
  var dataViews: js.Array[powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs.DataView]
  var editMode: js.UndefOr[powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs.EditMode] = js.undefined
  var viewMode: js.UndefOr[powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs.ViewMode] = js.undefined
  var viewport: powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs.IViewport
}

object VisualUpdateOptions {
  @scala.inline
  def apply(
    dataViews: js.Array[powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs.DataView],
    `type`: powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs.VisualUpdateType,
    viewport: powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs.IViewport,
    editMode: powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs.EditMode = null,
    viewMode: powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs.ViewMode = null
  ): VisualUpdateOptions = {
    val __obj = js.Dynamic.literal(dataViews = dataViews, viewport = viewport)
    __obj.updateDynamic("type")(`type`)
    if (editMode != null) __obj.updateDynamic("editMode")(editMode)
    if (viewMode != null) __obj.updateDynamic("viewMode")(viewMode)
    __obj.asInstanceOf[VisualUpdateOptions]
  }
}

