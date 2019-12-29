package typings.node.inspectorMod.Runtime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CallFunctionOnParameterType extends js.Object {
  /**
    * Call arguments. All call arguments must belong to the same JavaScript world as the target object.
    */
  var arguments: js.UndefOr[js.Array[CallArgument]] = js.undefined
  /**
    * Whether execution should <code>await</code> for resulting value and return once awaited promise is resolved.
    */
  var awaitPromise: js.UndefOr[Boolean] = js.undefined
  /**
    * Specifies execution context which global object will be used to call function on. Either executionContextId or objectId should be specified.
    */
  var executionContextId: js.UndefOr[ExecutionContextId] = js.undefined
  /**
    * Declaration of the function to call.
    */
  var functionDeclaration: String
  /**
    * Whether preview should be generated for the result.
    * @experimental
    */
  var generatePreview: js.UndefOr[Boolean] = js.undefined
  /**
    * Symbolic group name that can be used to release multiple objects. If objectGroup is not specified and objectId is, objectGroup will be inherited from object.
    */
  var objectGroup: js.UndefOr[String] = js.undefined
  /**
    * Identifier of the object to call function on. Either objectId or executionContextId should be specified.
    */
  var objectId: js.UndefOr[RemoteObjectId] = js.undefined
  /**
    * Whether the result is expected to be a JSON object which should be sent by value.
    */
  var returnByValue: js.UndefOr[Boolean] = js.undefined
  /**
    * In silent mode exceptions thrown during evaluation are not reported and do not pause execution. Overrides <code>setPauseOnException</code> state.
    */
  var silent: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether execution should be treated as initiated by user in the UI.
    */
  var userGesture: js.UndefOr[Boolean] = js.undefined
}

object CallFunctionOnParameterType {
  @scala.inline
  def apply(
    functionDeclaration: String,
    arguments: js.Array[CallArgument] = null,
    awaitPromise: js.UndefOr[Boolean] = js.undefined,
    executionContextId: Int | Double = null,
    generatePreview: js.UndefOr[Boolean] = js.undefined,
    objectGroup: String = null,
    objectId: RemoteObjectId = null,
    returnByValue: js.UndefOr[Boolean] = js.undefined,
    silent: js.UndefOr[Boolean] = js.undefined,
    userGesture: js.UndefOr[Boolean] = js.undefined
  ): CallFunctionOnParameterType = {
    val __obj = js.Dynamic.literal(functionDeclaration = functionDeclaration.asInstanceOf[js.Any])
    if (arguments != null) __obj.updateDynamic("arguments")(arguments.asInstanceOf[js.Any])
    if (!js.isUndefined(awaitPromise)) __obj.updateDynamic("awaitPromise")(awaitPromise.asInstanceOf[js.Any])
    if (executionContextId != null) __obj.updateDynamic("executionContextId")(executionContextId.asInstanceOf[js.Any])
    if (!js.isUndefined(generatePreview)) __obj.updateDynamic("generatePreview")(generatePreview.asInstanceOf[js.Any])
    if (objectGroup != null) __obj.updateDynamic("objectGroup")(objectGroup.asInstanceOf[js.Any])
    if (objectId != null) __obj.updateDynamic("objectId")(objectId.asInstanceOf[js.Any])
    if (!js.isUndefined(returnByValue)) __obj.updateDynamic("returnByValue")(returnByValue.asInstanceOf[js.Any])
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent.asInstanceOf[js.Any])
    if (!js.isUndefined(userGesture)) __obj.updateDynamic("userGesture")(userGesture.asInstanceOf[js.Any])
    __obj.asInstanceOf[CallFunctionOnParameterType]
  }
}

