package typings
package powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ViewMode extends js.Object

@JSImport("powerbi-visuals-tools/powerbi", "ViewMode")
@js.native
object ViewMode extends js.Object {
  @js.native
  sealed trait Edit
    extends powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs.ViewMode
  
  @js.native
  sealed trait InFocusEdit
    extends powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs.ViewMode
  
  @js.native
  sealed trait View
    extends powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs.ViewMode
  
}

