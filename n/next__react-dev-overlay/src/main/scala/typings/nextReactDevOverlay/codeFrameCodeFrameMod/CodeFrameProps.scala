package typings.nextReactDevOverlay.codeFrameCodeFrameMod

import typings.stacktraceParser.mod.StackFrame
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CodeFrameProps extends js.Object {
  var codeFrame: String
  var stackFrame: StackFrame
}

object CodeFrameProps {
  @scala.inline
  def apply(codeFrame: String, stackFrame: StackFrame): CodeFrameProps = {
    val __obj = js.Dynamic.literal(codeFrame = codeFrame.asInstanceOf[js.Any], stackFrame = stackFrame.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeFrameProps]
  }
}

