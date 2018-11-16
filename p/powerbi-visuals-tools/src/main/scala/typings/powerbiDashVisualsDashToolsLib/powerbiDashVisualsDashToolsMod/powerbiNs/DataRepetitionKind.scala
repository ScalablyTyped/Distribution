package typings
package powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DataRepetitionKind extends js.Object

/** Kind of the Data Repetition Selector */
@JSImport("powerbi-visuals-tools/powerbi", "DataRepetitionKind")
@js.native
object DataRepetitionKind extends js.Object {
  @js.native
  sealed trait RoleWildcard
    extends powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs.DataRepetitionKind
  
  @js.native
  sealed trait ScopeIdentity
    extends powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs.DataRepetitionKind
  
  @js.native
  sealed trait ScopeTotal
    extends powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs.DataRepetitionKind
  
  @js.native
  sealed trait ScopeWildcard
    extends powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs.DataRepetitionKind
  
}

