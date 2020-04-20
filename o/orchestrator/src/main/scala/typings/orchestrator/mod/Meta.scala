package typings.orchestrator.mod

import typings.orchestrator.orchestratorStrings.`catch`
import typings.orchestrator.orchestratorStrings.callback
import typings.orchestrator.orchestratorStrings.promise
import typings.orchestrator.orchestratorStrings.stream
import typings.orchestrator.orchestratorStrings.sync
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Meta extends js.Object {
  var duration: Double
  var hrDuration: js.Tuple2[Double, Double]
  var runMethod: callback | `catch` | promise | stream | sync
}

object Meta {
  @scala.inline
  def apply(
    duration: Double,
    hrDuration: js.Tuple2[Double, Double],
    runMethod: callback | `catch` | promise | stream | sync
  ): Meta = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], hrDuration = hrDuration.asInstanceOf[js.Any], runMethod = runMethod.asInstanceOf[js.Any])
    __obj.asInstanceOf[Meta]
  }
}

