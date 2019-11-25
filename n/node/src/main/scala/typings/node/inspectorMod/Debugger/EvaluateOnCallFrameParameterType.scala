package typings.node.inspectorMod.Debugger

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
  var generatePreview: js.UndefOr[Boolean] = js.undefined
  /**
    * Specifies whether command line API should be available to the evaluated expression, defaults to false.
    */
  var includeCommandLineAPI: js.UndefOr[Boolean] = js.undefined
  /**
    * String object group name to put result into (allows rapid releasing resulting object handles using <code>releaseObjectGroup</code>).
    */
  var objectGroup: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Whether the result is expected to be a JSON object that should be sent by value.
    */
  var returnByValue: js.UndefOr[Boolean] = js.undefined
  /**
    * In silent mode exceptions thrown during evaluation are not reported and do not pause execution. Overrides <code>setPauseOnException</code> state.
    */
  var silent: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether to throw an exception if side effect cannot be ruled out during evaluation.
    */
  var throwOnSideEffect: js.UndefOr[Boolean] = js.undefined
}

object EvaluateOnCallFrameParameterType {
  @scala.inline
  def apply(
    callFrameId: CallFrameId,
    expression: java.lang.String,
    generatePreview: js.UndefOr[Boolean] = js.undefined,
    includeCommandLineAPI: js.UndefOr[Boolean] = js.undefined,
    objectGroup: java.lang.String = null,
    returnByValue: js.UndefOr[Boolean] = js.undefined,
    silent: js.UndefOr[Boolean] = js.undefined,
    throwOnSideEffect: js.UndefOr[Boolean] = js.undefined
  ): EvaluateOnCallFrameParameterType = {
    val __obj = js.Dynamic.literal(callFrameId = callFrameId.asInstanceOf[js.Any], expression = expression.asInstanceOf[js.Any])
    if (!js.isUndefined(generatePreview)) __obj.updateDynamic("generatePreview")(generatePreview.asInstanceOf[js.Any])
    if (!js.isUndefined(includeCommandLineAPI)) __obj.updateDynamic("includeCommandLineAPI")(includeCommandLineAPI.asInstanceOf[js.Any])
    if (objectGroup != null) __obj.updateDynamic("objectGroup")(objectGroup.asInstanceOf[js.Any])
    if (!js.isUndefined(returnByValue)) __obj.updateDynamic("returnByValue")(returnByValue.asInstanceOf[js.Any])
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent.asInstanceOf[js.Any])
    if (!js.isUndefined(throwOnSideEffect)) __obj.updateDynamic("throwOnSideEffect")(throwOnSideEffect.asInstanceOf[js.Any])
    __obj.asInstanceOf[EvaluateOnCallFrameParameterType]
  }
}

