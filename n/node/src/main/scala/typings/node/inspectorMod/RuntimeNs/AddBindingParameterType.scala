package typings.node.inspectorMod.RuntimeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddBindingParameterType extends js.Object {
  var executionContextId: js.UndefOr[ExecutionContextId] = js.undefined
  var name: java.lang.String
}

object AddBindingParameterType {
  @scala.inline
  def apply(name: java.lang.String, executionContextId: js.UndefOr[ExecutionContextId] = js.undefined): AddBindingParameterType = {
    val __obj = js.Dynamic.literal(name = name)
    if (!js.isUndefined(executionContextId)) __obj.updateDynamic("executionContextId")(executionContextId)
    __obj.asInstanceOf[AddBindingParameterType]
  }
}

