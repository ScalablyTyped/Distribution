package typings
package nodeLib.inspectorMod.RuntimeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RunScriptParameterType extends js.Object {
  /**
    * Whether execution should `await` for resulting value and return once awaited promise is
    * resolved.
    */
  var awaitPromise: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Specifies in which execution context to perform script run. If the parameter is omitted the
    * evaluation will be performed in the context of the inspected page.
    */
  var executionContextId: js.UndefOr[ExecutionContextId] = js.undefined
  /**
    * Whether preview should be generated for the result.
    */
  var generatePreview: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Determines whether Command Line API should be available during the evaluation.
    */
  var includeCommandLineAPI: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Symbolic group name that can be used to release multiple objects.
    */
  var objectGroup: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Whether the result is expected to be a JSON object which should be sent by value.
    */
  var returnByValue: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Id of the script to run.
    */
  var scriptId: ScriptId
  /**
    * In silent mode exceptions thrown during evaluation are not reported and do not pause
    * execution. Overrides `setPauseOnException` state.
    */
  var silent: js.UndefOr[scala.Boolean] = js.undefined
}

object RunScriptParameterType {
  @scala.inline
  def apply(
    scriptId: ScriptId,
    awaitPromise: js.UndefOr[scala.Boolean] = js.undefined,
    executionContextId: js.UndefOr[ExecutionContextId] = js.undefined,
    generatePreview: js.UndefOr[scala.Boolean] = js.undefined,
    includeCommandLineAPI: js.UndefOr[scala.Boolean] = js.undefined,
    objectGroup: java.lang.String = null,
    returnByValue: js.UndefOr[scala.Boolean] = js.undefined,
    silent: js.UndefOr[scala.Boolean] = js.undefined
  ): RunScriptParameterType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("scriptId")(scriptId)
    if (!js.isUndefined(awaitPromise)) __obj.updateDynamic("awaitPromise")(awaitPromise)
    if (!js.isUndefined(executionContextId)) __obj.updateDynamic("executionContextId")(executionContextId)
    if (!js.isUndefined(generatePreview)) __obj.updateDynamic("generatePreview")(generatePreview)
    if (!js.isUndefined(includeCommandLineAPI)) __obj.updateDynamic("includeCommandLineAPI")(includeCommandLineAPI)
    if (objectGroup != null) __obj.updateDynamic("objectGroup")(objectGroup)
    if (!js.isUndefined(returnByValue)) __obj.updateDynamic("returnByValue")(returnByValue)
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent)
    __obj.asInstanceOf[RunScriptParameterType]
  }
}

