package typings
package nodeLib.inspectorMod.RuntimeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BindingCalledEventDataType extends js.Object {
  /**
    * Identifier of the context where the call was made.
    */
  var executionContextId: ExecutionContextId
  var name: java.lang.String
  var payload: java.lang.String
}

object BindingCalledEventDataType {
  @scala.inline
  def apply(executionContextId: ExecutionContextId, name: java.lang.String, payload: java.lang.String): BindingCalledEventDataType = {
    val __obj = js.Dynamic.literal(executionContextId = executionContextId, name = name, payload = payload)
  
    __obj.asInstanceOf[BindingCalledEventDataType]
  }
}

