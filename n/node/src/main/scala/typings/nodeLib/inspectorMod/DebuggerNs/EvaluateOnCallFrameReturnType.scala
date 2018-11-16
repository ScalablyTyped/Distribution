package typings
package nodeLib.inspectorMod.DebuggerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait EvaluateOnCallFrameReturnType extends js.Object {
  /**
               * Exception details.
               */
  var exceptionDetails: js.UndefOr[nodeLib.inspectorMod.RuntimeNs.ExceptionDetails] = js.undefined
  /**
               * Object wrapper for the evaluation result.
               */
  var result: nodeLib.inspectorMod.RuntimeNs.RemoteObject
}

