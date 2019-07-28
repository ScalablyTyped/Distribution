package typings.node.inspectorMod.DebuggerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetAsyncCallStackDepthParameterType extends js.Object {
  /**
    * Maximum depth of async call stacks. Setting to `0` will effectively disable collecting async
    * call stacks (default).
    */
  var maxDepth: Double
}

object SetAsyncCallStackDepthParameterType {
  @scala.inline
  def apply(maxDepth: Double): SetAsyncCallStackDepthParameterType = {
    val __obj = js.Dynamic.literal(maxDepth = maxDepth)
  
    __obj.asInstanceOf[SetAsyncCallStackDepthParameterType]
  }
}

