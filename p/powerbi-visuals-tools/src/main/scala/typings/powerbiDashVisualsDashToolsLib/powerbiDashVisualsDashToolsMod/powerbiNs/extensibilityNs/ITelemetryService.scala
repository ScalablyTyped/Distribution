package typings
package powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs.extensibilityNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITelemetryService extends js.Object {
  val instanceId: java.lang.String = js.native
  def trace(`type`: powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs.VisualEventType): scala.Unit = js.native
  def trace(
    `type`: powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs.VisualEventType,
    payload: java.lang.String
  ): scala.Unit = js.native
}

