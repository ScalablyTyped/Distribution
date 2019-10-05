package typings.node.inspectorMod.Runtime

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
  def apply(executionContextId: Int | Double = null): GlobalLexicalScopeNamesParameterType = {
    val __obj = js.Dynamic.literal()
    if (executionContextId != null) __obj.updateDynamic("executionContextId")(executionContextId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlobalLexicalScopeNamesParameterType]
  }
}

