package typings
package powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EditMode extends js.Object

@JSImport("powerbi-visuals-tools/powerbi", "EditMode")
@js.native
object EditMode extends js.Object {
  /** Indicates the user has asked the visual to display advanced editing controls. */
  @js.native
  sealed trait Advanced
    extends powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs.EditMode
  
  /** Default editing mode for the visual. */
  @js.native
  sealed trait Default
    extends powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs.EditMode
  
}

