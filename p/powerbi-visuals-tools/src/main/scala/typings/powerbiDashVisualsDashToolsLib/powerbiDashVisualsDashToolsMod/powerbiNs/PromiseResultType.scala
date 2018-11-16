package typings
package powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PromiseResultType extends js.Object

@JSImport("powerbi-visuals-tools/powerbi", "PromiseResultType")
@js.native
object PromiseResultType extends js.Object {
  @js.native
  sealed trait Failure
    extends powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs.PromiseResultType
  
  @js.native
  sealed trait Success
    extends powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs.PromiseResultType
  
}

