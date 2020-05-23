package typings.nextReactDevOverlay.anon

import typings.nextReactDevOverlay.nextReactDevOverlayBooleans.`false`
import typings.nextReactDevOverlay.stackFrameMod.OriginalStackFrame
import typings.stacktraceParser.mod.StackFrame
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait External extends OriginalStackFrame {
  var error: `false`
  var expanded: Boolean
  var external: `false`
  var originalCodeFrame: String | Null
  var originalStackFrame: StackFrame
  var reason: Null
  var sourceStackFrame: StackFrame
}

object External {
  @scala.inline
  def apply(
    error: `false`,
    expanded: Boolean,
    external: `false`,
    originalStackFrame: StackFrame,
    reason: Null,
    sourceStackFrame: StackFrame,
    originalCodeFrame: String = null
  ): External = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], expanded = expanded.asInstanceOf[js.Any], external = external.asInstanceOf[js.Any], originalStackFrame = originalStackFrame.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], sourceStackFrame = sourceStackFrame.asInstanceOf[js.Any], originalCodeFrame = originalCodeFrame.asInstanceOf[js.Any])
    __obj.asInstanceOf[External]
  }
}

