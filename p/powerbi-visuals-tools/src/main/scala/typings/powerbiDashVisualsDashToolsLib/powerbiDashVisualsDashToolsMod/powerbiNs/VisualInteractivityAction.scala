package typings
package powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait VisualInteractivityAction extends js.Object

/**
     * Defines actions to be taken by the visual in response to a selection.
     *
     * An undefined/null VisualInteractivityAction should be treated as Selection,
     * as that is the default action.
     */
@JSImport("powerbi-visuals-tools/powerbi", "VisualInteractivityAction")
@js.native
object VisualInteractivityAction extends js.Object {
  /** No additional action or feedback from the visual is needed */
  @js.native
  sealed trait None
    extends powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs.VisualInteractivityAction
  
  /** Normal selection behavior which should call onSelect */
  @js.native
  sealed trait Selection
    extends powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs.VisualInteractivityAction
  
}

