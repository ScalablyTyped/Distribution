package typings.node.inspectorMod.Runtime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExecutionContextDestroyedEventDataType extends js.Object {
  /**
    * Id of the destroyed context
    */
  var executionContextId: ExecutionContextId
}

object ExecutionContextDestroyedEventDataType {
  @scala.inline
  def apply(executionContextId: ExecutionContextId): ExecutionContextDestroyedEventDataType = {
    val __obj = js.Dynamic.literal(executionContextId = executionContextId)
  
    __obj.asInstanceOf[ExecutionContextDestroyedEventDataType]
  }
}

