package typings
package nodeLib.inspectorMod.RuntimeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         * Call frames for assertions or error messages.
         */

trait StackTrace extends js.Object {
  /**
               * JavaScript function name.
               */
  var callFrames: js.Array[CallFrame]
  /**
               * String label of this stack trace. For async traces this may be a name of the function that
               * initiated the async call.
               */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Asynchronous JavaScript stack trace that preceded this stack, if available.
               */
  var parent: js.UndefOr[StackTrace] = js.undefined
  /**
               * Asynchronous JavaScript stack trace that preceded this stack, if available.
               * @experimental
               */
  var parentId: js.UndefOr[StackTraceId] = js.undefined
}

