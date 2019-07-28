package typings.node.inspectorMod.RuntimeNs

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

object StackTraceId {
  @scala.inline
  def apply(id: java.lang.String, debuggerId: UniqueDebuggerId = null): StackTraceId = {
    val __obj = js.Dynamic.literal(id = id)
    if (debuggerId != null) __obj.updateDynamic("debuggerId")(debuggerId)
    __obj.asInstanceOf[StackTraceId]
  }
}

