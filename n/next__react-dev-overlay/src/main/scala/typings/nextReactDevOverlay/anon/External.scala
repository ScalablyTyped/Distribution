package typings.nextReactDevOverlay.anon

import typings.nextReactDevOverlay.nextReactDevOverlayBooleans.`false`
import typings.nextReactDevOverlay.stackFrameMod.OriginalStackFrame
import typings.stacktraceParser.mod.StackFrame
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait External extends OriginalStackFrame {
  var error: `false` = js.native
  var expanded: Boolean = js.native
  var external: `false` = js.native
  var originalCodeFrame: String | Null = js.native
  var originalStackFrame: StackFrame = js.native
  var reason: Null = js.native
  var sourceStackFrame: StackFrame = js.native
}

object External {
  @scala.inline
  def apply(
    error: `false`,
    expanded: Boolean,
    external: `false`,
    originalStackFrame: StackFrame,
    reason: Null,
    sourceStackFrame: StackFrame
  ): External = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], expanded = expanded.asInstanceOf[js.Any], external = external.asInstanceOf[js.Any], originalStackFrame = originalStackFrame.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], sourceStackFrame = sourceStackFrame.asInstanceOf[js.Any])
    __obj.asInstanceOf[External]
  }
  @scala.inline
  implicit class ExternalOps[Self <: External] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setError(value: `false`): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def setExpanded(value: Boolean): Self = this.set("expanded", value.asInstanceOf[js.Any])
    @scala.inline
    def setExternal(value: `false`): Self = this.set("external", value.asInstanceOf[js.Any])
    @scala.inline
    def setOriginalStackFrame(value: StackFrame): Self = this.set("originalStackFrame", value.asInstanceOf[js.Any])
    @scala.inline
    def setReason(value: Null): Self = this.set("reason", value.asInstanceOf[js.Any])
    @scala.inline
    def setSourceStackFrame(value: StackFrame): Self = this.set("sourceStackFrame", value.asInstanceOf[js.Any])
    @scala.inline
    def setOriginalCodeFrame(value: String): Self = this.set("originalCodeFrame", value.asInstanceOf[js.Any])
    @scala.inline
    def setOriginalCodeFrameNull: Self = this.set("originalCodeFrame", null)
  }
  
}

