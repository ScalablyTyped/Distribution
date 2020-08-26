package typings.nextReactDevOverlay.middlewareMod

import typings.stacktraceParser.mod.StackFrame
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OriginalStackFrameResponse extends js.Object {
  var originalCodeFrame: String | Null = js.native
  var originalStackFrame: StackFrame = js.native
}

object OriginalStackFrameResponse {
  @scala.inline
  def apply(originalStackFrame: StackFrame): OriginalStackFrameResponse = {
    val __obj = js.Dynamic.literal(originalStackFrame = originalStackFrame.asInstanceOf[js.Any])
    __obj.asInstanceOf[OriginalStackFrameResponse]
  }
  @scala.inline
  implicit class OriginalStackFrameResponseOps[Self <: OriginalStackFrameResponse] (val x: Self) extends AnyVal {
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
    def setOriginalStackFrame(value: StackFrame): Self = this.set("originalStackFrame", value.asInstanceOf[js.Any])
    @scala.inline
    def setOriginalCodeFrame(value: String): Self = this.set("originalCodeFrame", value.asInstanceOf[js.Any])
    @scala.inline
    def setOriginalCodeFrameNull: Self = this.set("originalCodeFrame", null)
  }
  
}

