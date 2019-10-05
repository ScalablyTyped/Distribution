package typings.node.inspectorMod.Runtime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConsoleAPICalledEventDataType extends js.Object {
  /**
    * Call arguments.
    */
  var args: js.Array[RemoteObject]
  /**
    * Console context descriptor for calls on non-default console context (not console.*): 'anonymous#unique-logger-id' for call on unnamed context, 'name#unique-logger-id' for call on named context.
    * @experimental
    */
  var context: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Identifier of the context where the call was made.
    */
  var executionContextId: ExecutionContextId
  /**
    * Stack trace captured when the call was made.
    */
  var stackTrace: js.UndefOr[StackTrace] = js.undefined
  /**
    * Call timestamp.
    */
  var timestamp: Timestamp
  /**
    * Type of the call.
    */
  var `type`: java.lang.String
}

object ConsoleAPICalledEventDataType {
  @scala.inline
  def apply(
    args: js.Array[RemoteObject],
    executionContextId: ExecutionContextId,
    timestamp: Timestamp,
    `type`: java.lang.String,
    context: java.lang.String = null,
    stackTrace: StackTrace = null
  ): ConsoleAPICalledEventDataType = {
    val __obj = js.Dynamic.literal(args = args, executionContextId = executionContextId, timestamp = timestamp)
    __obj.updateDynamic("type")(`type`)
    if (context != null) __obj.updateDynamic("context")(context)
    if (stackTrace != null) __obj.updateDynamic("stackTrace")(stackTrace)
    __obj.asInstanceOf[ConsoleAPICalledEventDataType]
  }
}

