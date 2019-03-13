package typings
package powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines actions to be taken by the visual in response to a selection.
  *
  * An undefined/null VisualInteractivityAction should be treated as Selection,
  * as that is the default action.
  */
@JSImport("powerbi-visuals-tools", "VisualInteractivityAction")
@js.native
object VisualInteractivityAction extends js.Object {
  /* 1 */ val None: powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs.VisualInteractivityAction.None with scala.Double = js.native
  /* 0 */ val Selection: powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs.VisualInteractivityAction.Selection with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs.VisualInteractivityAction with scala.Double
  ] = js.native
}

