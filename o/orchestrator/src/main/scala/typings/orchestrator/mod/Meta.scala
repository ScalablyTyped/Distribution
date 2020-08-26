package typings.orchestrator.mod

import typings.orchestrator.orchestratorStrings.`catch`
import typings.orchestrator.orchestratorStrings.callback
import typings.orchestrator.orchestratorStrings.promise
import typings.orchestrator.orchestratorStrings.stream
import typings.orchestrator.orchestratorStrings.sync
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Meta extends js.Object {
  var duration: Double = js.native
  var hrDuration: js.Tuple2[Double, Double] = js.native
  var runMethod: callback | `catch` | promise | stream | sync = js.native
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
  @scala.inline
  implicit class MetaOps[Self <: Meta] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def setHrDuration(value: js.Tuple2[Double, Double]): Self = this.set("hrDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def setRunMethod(value: callback | `catch` | promise | stream | sync): Self = this.set("runMethod", value.asInstanceOf[js.Any])
  }
  
}

