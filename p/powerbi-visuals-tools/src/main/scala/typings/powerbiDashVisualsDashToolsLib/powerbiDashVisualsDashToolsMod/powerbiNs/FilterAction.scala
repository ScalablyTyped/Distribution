package typings
package powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FilterAction extends js.Object

@JSImport("powerbi-visuals-tools/powerbi", "FilterAction")
@js.native
object FilterAction extends js.Object {
  /** Merging filter into existing filters. */
  @js.native
  sealed trait merge
    extends powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs.FilterAction
  
  /** removing existing filter. */
  @js.native
  sealed trait remove
    extends powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs.FilterAction
  
}

