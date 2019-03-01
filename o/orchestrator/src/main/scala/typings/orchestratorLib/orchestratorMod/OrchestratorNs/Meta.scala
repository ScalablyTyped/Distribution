package typings
package orchestratorLib.orchestratorMod.OrchestratorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Meta extends js.Object {
  var duration: scala.Double
  var hrDuration: js.Tuple2[scala.Double, scala.Double]
  var runMethod: orchestratorLib.orchestratorLibStrings.callback | orchestratorLib.orchestratorLibStrings.`catch` | orchestratorLib.orchestratorLibStrings.promise | orchestratorLib.orchestratorLibStrings.stream | orchestratorLib.orchestratorLibStrings.sync
}

object Meta {
  @scala.inline
  def apply(
    duration: scala.Double,
    hrDuration: js.Tuple2[scala.Double, scala.Double],
    runMethod: orchestratorLib.orchestratorLibStrings.callback | orchestratorLib.orchestratorLibStrings.`catch` | orchestratorLib.orchestratorLibStrings.promise | orchestratorLib.orchestratorLibStrings.stream | orchestratorLib.orchestratorLibStrings.sync
  ): Meta = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("duration")(duration)
    __obj.updateDynamic("hrDuration")(hrDuration)
    __obj.updateDynamic("runMethod")(runMethod.asInstanceOf[js.Any])
    __obj.asInstanceOf[Meta]
  }
}

