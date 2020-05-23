package typings.nextReactDevOverlay.anon

import typings.nextReactDevOverlay.nextReactDevOverlayBooleans.`false`
import typings.nextReactDevOverlay.nextReactDevOverlayBooleans.`true`
import typings.nextReactDevOverlay.stackFrameMod.OriginalStackFrame
import typings.stacktraceParser.mod.StackFrame
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OriginalCodeFrame extends OriginalStackFrame {
  var error: `false`
  var expanded: `false`
  var external: `true`
  var originalCodeFrame: Null
  var originalStackFrame: Null
  var reason: Null
  var sourceStackFrame: StackFrame
}

object OriginalCodeFrame {
  @scala.inline
  def apply(
    error: `false`,
    expanded: `false`,
    external: `true`,
    originalCodeFrame: Null,
    originalStackFrame: Null,
    reason: Null,
    sourceStackFrame: StackFrame
  ): OriginalCodeFrame = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], expanded = expanded.asInstanceOf[js.Any], external = external.asInstanceOf[js.Any], originalCodeFrame = originalCodeFrame.asInstanceOf[js.Any], originalStackFrame = originalStackFrame.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], sourceStackFrame = sourceStackFrame.asInstanceOf[js.Any])
    __obj.asInstanceOf[OriginalCodeFrame]
  }
}

