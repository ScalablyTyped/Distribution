package typings
package nodeLib.inspectorMod.RuntimeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ConsoleAPICalledEventDataType extends js.Object {
  /**
               * Call arguments.
               */
  var args: js.Array[RemoteObject]
  /**
               * Console context descriptor for calls on non-default console context (not console.*):
               * 'anonymous#unique-logger-id' for call on unnamed context, 'name#unique-logger-id' for call
               * on named context.
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

