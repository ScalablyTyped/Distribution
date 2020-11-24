package typings.nextReactDevOverlay

import typings.stacktraceParser.mod.StackFrame
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@next/react-dev-overlay/lib/internal/helpers/nodeStackFrames", JSImport.Namespace)
@js.native
object nodeStackFramesMod extends js.Object {
  
  def getFilesystemFrame(frame: StackFrame): StackFrame = js.native
  
  def getNodeError(error: Error): Error = js.native
  
  def isNodeError(error: Error): Boolean = js.native
}
