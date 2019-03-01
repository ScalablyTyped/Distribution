package typings
package nodeLib.inspectorMod.DebuggerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EvaluateOnCallFrameParameterType extends js.Object {
  /**
    * Call frame identifier to evaluate on.
    */
  var callFrameId: CallFrameId
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
    * Specifies whether command line API should be available to the evaluated expression, defaults
    * to false.
    */
  var includeCommandLineAPI: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * String object group name to put result into (allows rapid releasing resulting object handles
    * using `releaseObjectGroup`).
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
    */
  var throwOnSideEffect: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Terminate execution after timing out (number of milliseconds).
    * @experimental
    */
  var timeout: js.UndefOr[nodeLib.inspectorMod.RuntimeNs.TimeDelta] = js.undefined
}

object EvaluateOnCallFrameParameterType {
  @scala.inline
  def apply(
    callFrameId: CallFrameId,
    expression: java.lang.String,
    generatePreview: js.UndefOr[scala.Boolean] = js.undefined,
    includeCommandLineAPI: js.UndefOr[scala.Boolean] = js.undefined,
    objectGroup: java.lang.String = null,
    returnByValue: js.UndefOr[scala.Boolean] = js.undefined,
    silent: js.UndefOr[scala.Boolean] = js.undefined,
    throwOnSideEffect: js.UndefOr[scala.Boolean] = js.undefined,
    timeout: js.UndefOr[nodeLib.inspectorMod.RuntimeNs.TimeDelta] = js.undefined
  ): EvaluateOnCallFrameParameterType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("callFrameId")(callFrameId)
    __obj.updateDynamic("expression")(expression)
    if (!js.isUndefined(generatePreview)) __obj.updateDynamic("generatePreview")(generatePreview)
    if (!js.isUndefined(includeCommandLineAPI)) __obj.updateDynamic("includeCommandLineAPI")(includeCommandLineAPI)
    if (objectGroup != null) __obj.updateDynamic("objectGroup")(objectGroup)
    if (!js.isUndefined(returnByValue)) __obj.updateDynamic("returnByValue")(returnByValue)
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent)
    if (!js.isUndefined(throwOnSideEffect)) __obj.updateDynamic("throwOnSideEffect")(throwOnSideEffect)
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout)
    __obj.asInstanceOf[EvaluateOnCallFrameParameterType]
  }
}

