package typings.node.inspectorMod.RuntimeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlobalLexicalScopeNamesParameterType extends js.Object {
  /**
    * Specifies in which execution context to lookup global scope variables.
    */
  var executionContextId: js.UndefOr[ExecutionContextId] = js.undefined
}

object GlobalLexicalScopeNamesParameterType {
  @scala.inline
  def apply(executionContextId: js.UndefOr[ExecutionContextId] = js.undefined): GlobalLexicalScopeNamesParameterType = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(executionContextId)) __obj.updateDynamic("executionContextId")(executionContextId)
    __obj.asInstanceOf[GlobalLexicalScopeNamesParameterType]
  }
}

