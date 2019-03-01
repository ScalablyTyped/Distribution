package typings
package powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VisualObjectInstanceContainer extends js.Object {
  var displayName: powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs.dataNs.DisplayNameGetter
}

object VisualObjectInstanceContainer {
  @scala.inline
  def apply(
    displayName: powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs.dataNs.DisplayNameGetter
  ): VisualObjectInstanceContainer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    __obj.asInstanceOf[VisualObjectInstanceContainer]
  }
}

