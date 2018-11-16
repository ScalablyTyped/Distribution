package typings
package powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait VisualDataRoleKind extends js.Object

@JSImport("powerbi-visuals-tools/powerbi", "VisualDataRoleKind")
@js.native
object VisualDataRoleKind extends js.Object {
  /** Indicates that the role should be bound to something that evaluates to a grouping of values. */
  @js.native
  sealed trait Grouping
    extends powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs.VisualDataRoleKind
  
  /** Indicates that the role can be bound to either Grouping or Measure. */
  @js.native
  sealed trait GroupingOrMeasure
    extends powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs.VisualDataRoleKind
  
  /** Indicates that the role should be bound to something that evaluates to a single value in a scope. */
  @js.native
  sealed trait Measure
    extends powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs.VisualDataRoleKind
  
}

