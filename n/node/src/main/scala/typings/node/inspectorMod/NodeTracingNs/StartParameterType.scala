package typings.node.inspectorMod.NodeTracingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartParameterType extends js.Object {
  var traceConfig: TraceConfig
}

object StartParameterType {
  @scala.inline
  def apply(traceConfig: TraceConfig): StartParameterType = {
    val __obj = js.Dynamic.literal(traceConfig = traceConfig)
  
    __obj.asInstanceOf[StartParameterType]
  }
}

