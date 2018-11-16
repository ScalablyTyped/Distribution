package typings
package powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AdvancedEditModeSupport extends js.Object

@JSImport("powerbi-visuals-tools/powerbi", "AdvancedEditModeSupport")
@js.native
object AdvancedEditModeSupport extends js.Object {
  /** The visual doesn't support Advanced Edit mode. Do not display the 'Edit' button on this visual. */
  @js.native
  sealed trait NotSupported
    extends powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs.AdvancedEditModeSupport
  
  /** The visual supports Advanced Edit mode, and requires that the host pops out the visual when entering Advanced EditMode. */
  @js.native
  sealed trait SupportedInFocus
    extends powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs.AdvancedEditModeSupport
  
  /** The visual supports Advanced Edit mode, but doesn't require any further changes aside from setting EditMode=Advanced. */
  @js.native
  sealed trait SupportedNoAction
    extends powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs.AdvancedEditModeSupport
  
}

