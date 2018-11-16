package typings
package nodeLib.inspectorMod.RuntimeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         * If `debuggerId` is set stack trace comes from another debugger and can be resolved there. This
         * allows to track cross-debugger calls. See `Runtime.StackTrace` and `Debugger.paused` for usages.
         * @experimental
         */

trait StackTraceId extends js.Object {
  var debuggerId: js.UndefOr[UniqueDebuggerId] = js.undefined
  var id: java.lang.String
}

