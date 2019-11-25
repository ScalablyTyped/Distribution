package typings.node.inspectorMod.Debugger

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetAsyncCallStackDepthParameterType extends js.Object {
  /**
    * Maximum depth of async call stacks. Setting to <code>0</code> will effectively disable collecting async call stacks (default).
    */
  var maxDepth: Double
}

object SetAsyncCallStackDepthParameterType {
  @scala.inline
  def apply(maxDepth: Double): SetAsyncCallStackDepthParameterType = {
    val __obj = js.Dynamic.literal(maxDepth = maxDepth.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SetAsyncCallStackDepthParameterType]
  }
}

