package typings
package nodeLib.inspectorMod.DebuggerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait SetScriptSourceReturnType extends js.Object {
  /**
               * Async stack trace, if any.
               */
  var asyncStackTrace: js.UndefOr[nodeLib.inspectorMod.RuntimeNs.StackTrace] = js.undefined
  /**
               * Async stack trace, if any.
               * @experimental
               */
  var asyncStackTraceId: js.UndefOr[nodeLib.inspectorMod.RuntimeNs.StackTraceId] = js.undefined
  /**
               * New stack trace in case editing has happened while VM was stopped.
               */
  var callFrames: js.UndefOr[js.Array[CallFrame]] = js.undefined
  /**
               * Exception details if any.
               */
  var exceptionDetails: js.UndefOr[nodeLib.inspectorMod.RuntimeNs.ExceptionDetails] = js.undefined
  /**
               * Whether current call stack  was modified after applying the changes.
               */
  var stackChanged: js.UndefOr[scala.Boolean] = js.undefined
}

