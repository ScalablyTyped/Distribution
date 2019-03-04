package typings
package nodeLib.inspectorMod.RuntimeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EvaluateParameterType extends js.Object {
  /**
    * Whether execution should `await` for resulting value and return once awaited promise is
    * resolved.
    */
  var awaitPromise: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Specifies in which execution context to perform evaluation. If the parameter is omitted the
    * evaluation will be performed in the context of the inspected page.
    */
  var contextId: js.UndefOr[ExecutionContextId] = js.undefined
  /**
    * Expression to evaluate.
    */
  var expression: java.lang.String
  /**
    * Whether preview should be generated for the result.
    * @experimental
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
    * Whether the result is expected to be a JSON object that should be sent by value.
    */
  var returnByValue: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * In silent mode exceptions thrown during evaluation are not reported and do not pause
    * execution. Overrides `setPauseOnException` state.
    */
  var silent: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether to throw an exception if side effect cannot be ruled out during evaluation.
    * @experimental
    */
  var throwOnSideEffect: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Terminate execution after timing out (number of milliseconds).
    * @experimental
    */
  var timeout: js.UndefOr[TimeDelta] = js.undefined
  /**
    * Whether execution should be treated as initiated by user in the UI.
    */
  var userGesture: js.UndefOr[scala.Boolean] = js.undefined
}

object EvaluateParameterType {
  @scala.inline
  def apply(
    expression: java.lang.String,
    awaitPromise: js.UndefOr[scala.Boolean] = js.undefined,
    contextId: js.UndefOr[ExecutionContextId] = js.undefined,
    generatePreview: js.UndefOr[scala.Boolean] = js.undefined,
    includeCommandLineAPI: js.UndefOr[scala.Boolean] = js.undefined,
    objectGroup: java.lang.String = null,
    returnByValue: js.UndefOr[scala.Boolean] = js.undefined,
    silent: js.UndefOr[scala.Boolean] = js.undefined,
    throwOnSideEffect: js.UndefOr[scala.Boolean] = js.undefined,
    timeout: js.UndefOr[TimeDelta] = js.undefined,
    userGesture: js.UndefOr[scala.Boolean] = js.undefined
  ): EvaluateParameterType = {
    val __obj = js.Dynamic.literal(expression = expression)
    if (!js.isUndefined(awaitPromise)) __obj.updateDynamic("awaitPromise")(awaitPromise)
    if (!js.isUndefined(contextId)) __obj.updateDynamic("contextId")(contextId)
    if (!js.isUndefined(generatePreview)) __obj.updateDynamic("generatePreview")(generatePreview)
    if (!js.isUndefined(includeCommandLineAPI)) __obj.updateDynamic("includeCommandLineAPI")(includeCommandLineAPI)
    if (objectGroup != null) __obj.updateDynamic("objectGroup")(objectGroup)
    if (!js.isUndefined(returnByValue)) __obj.updateDynamic("returnByValue")(returnByValue)
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent)
    if (!js.isUndefined(throwOnSideEffect)) __obj.updateDynamic("throwOnSideEffect")(throwOnSideEffect)
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout)
    if (!js.isUndefined(userGesture)) __obj.updateDynamic("userGesture")(userGesture)
    __obj.asInstanceOf[EvaluateParameterType]
  }
}

