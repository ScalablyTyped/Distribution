package typings
package nodeLib.inspectorMod.RuntimeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CallFunctionOnParameterType extends js.Object {
  /**
    * Call arguments. All call arguments must belong to the same JavaScript world as the target
    * object.
    */
  var arguments: js.UndefOr[js.Array[CallArgument]] = js.undefined
  /**
    * Whether execution should `await` for resulting value and return once awaited promise is
    * resolved.
    */
  var awaitPromise: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Specifies execution context which global object will be used to call function on. Either
    * executionContextId or objectId should be specified.
    */
  var executionContextId: js.UndefOr[ExecutionContextId] = js.undefined
  /**
    * Declaration of the function to call.
    */
  var functionDeclaration: java.lang.String
  /**
    * Whether preview should be generated for the result.
    * @experimental
    */
  var generatePreview: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Symbolic group name that can be used to release multiple objects. If objectGroup is not
    * specified and objectId is, objectGroup will be inherited from object.
    */
  var objectGroup: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Identifier of the object to call function on. Either objectId or executionContextId should
    * be specified.
    */
  var objectId: js.UndefOr[RemoteObjectId] = js.undefined
  /**
    * Whether the result is expected to be a JSON object which should be sent by value.
    */
  var returnByValue: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * In silent mode exceptions thrown during evaluation are not reported and do not pause
    * execution. Overrides `setPauseOnException` state.
    */
  var silent: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether execution should be treated as initiated by user in the UI.
    */
  var userGesture: js.UndefOr[scala.Boolean] = js.undefined
}

