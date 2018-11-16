package typings
package powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait VisualEventType extends js.Object

/**
     * Defines various events Visuals can notify the host on.
     */
@JSImport("powerbi-visuals-tools/powerbi", "VisualEventType")
@js.native
object VisualEventType extends js.Object {
  /** Should be used by visuals to trace errors in PBI telemetry. */
  @js.native
  sealed trait Error
    extends powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs.VisualEventType
  
  /** Should be used at the end of a visual's rendering operation. */
  @js.native
  sealed trait RenderCompleted
    extends powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs.VisualEventType
  
  /** Should be used at the beginning of a visual's rendering operation. */
  @js.native
  sealed trait RenderStarted
    extends powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs.VisualEventType
  
  /** Should be used by visuals to trace information in PBI telemetry. */
  @js.native
  sealed trait Trace
    extends powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs.VisualEventType
  
}

