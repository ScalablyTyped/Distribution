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

