package typings.node.inspectorMod.RuntimeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompileScriptParameterType extends js.Object {
  /**
    * Specifies in which execution context to perform script run. If the parameter is omitted the evaluation will be performed in the context of the inspected page.
    */
  var executionContextId: js.UndefOr[ExecutionContextId] = js.undefined
  /**
    * Expression to compile.
    */
  var expression: java.lang.String
  /**
    * Specifies whether the compiled script should be persisted.
    */
  var persistScript: Boolean
  /**
    * Source url to be set for the script.
    */
  var sourceURL: java.lang.String
}

object CompileScriptParameterType {
  @scala.inline
  def apply(
    expression: java.lang.String,
    persistScript: Boolean,
    sourceURL: java.lang.String,
    executionContextId: js.UndefOr[ExecutionContextId] = js.undefined
  ): CompileScriptParameterType = {
    val __obj = js.Dynamic.literal(expression = expression, persistScript = persistScript, sourceURL = sourceURL)
    if (!js.isUndefined(executionContextId)) __obj.updateDynamic("executionContextId")(executionContextId)
    __obj.asInstanceOf[CompileScriptParameterType]
  }
}

