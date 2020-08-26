package typings.node.inspectorMod.NodeTracing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartParameterType extends js.Object {
  var traceConfig: TraceConfig = js.native
}

object StartParameterType {
  @scala.inline
  def apply(traceConfig: TraceConfig): StartParameterType = {
    val __obj = js.Dynamic.literal(traceConfig = traceConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartParameterType]
  }
  @scala.inline
  implicit class StartParameterTypeOps[Self <: StartParameterType] (val x: Self) extends AnyVal {
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
    def setTraceConfig(value: TraceConfig): Self = this.set("traceConfig", value.asInstanceOf[js.Any])
  }
  
}

