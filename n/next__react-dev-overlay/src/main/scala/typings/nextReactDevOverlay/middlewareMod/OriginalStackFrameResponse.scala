package typings.nextReactDevOverlay.middlewareMod

import typings.stacktraceParser.mod.StackFrame
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OriginalStackFrameResponse extends js.Object {
  var originalCodeFrame: String | Null
  var originalStackFrame: StackFrame
}

object OriginalStackFrameResponse {
  @scala.inline
  def apply(originalStackFrame: StackFrame, originalCodeFrame: String = null): OriginalStackFrameResponse = {
    val __obj = js.Dynamic.literal(originalStackFrame = originalStackFrame.asInstanceOf[js.Any], originalCodeFrame = originalCodeFrame.asInstanceOf[js.Any])
    __obj.asInstanceOf[OriginalStackFrameResponse]
  }
}

