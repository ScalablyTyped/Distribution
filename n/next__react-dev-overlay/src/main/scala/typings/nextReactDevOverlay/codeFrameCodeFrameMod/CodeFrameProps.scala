package typings.nextReactDevOverlay.codeFrameCodeFrameMod

import typings.stacktraceParser.mod.StackFrame
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CodeFrameProps extends js.Object {
  
  var codeFrame: String = js.native
  
  var stackFrame: StackFrame = js.native
}
object CodeFrameProps {
  
  @scala.inline
  def apply(codeFrame: String, stackFrame: StackFrame): CodeFrameProps = {
    val __obj = js.Dynamic.literal(codeFrame = codeFrame.asInstanceOf[js.Any], stackFrame = stackFrame.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeFrameProps]
  }
  
  @scala.inline
  implicit class CodeFramePropsOps[Self <: CodeFrameProps] (val x: Self) extends AnyVal {
    
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
    def setCodeFrame(value: String): Self = this.set("codeFrame", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackFrame(value: StackFrame): Self = this.set("stackFrame", value.asInstanceOf[js.Any])
  }
}
