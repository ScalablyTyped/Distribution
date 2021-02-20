package typings.nextReactDevOverlay

import typings.stacktraceParser.mod.StackFrame
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeStackFramesMod {
  
  @JSImport("@next/react-dev-overlay/lib/internal/helpers/nodeStackFrames", "getFilesystemFrame")
  @js.native
  def getFilesystemFrame(frame: StackFrame): StackFrame = js.native
  
  @JSImport("@next/react-dev-overlay/lib/internal/helpers/nodeStackFrames", "getNodeError")
  @js.native
  def getNodeError(error: Error): Error = js.native
  
  @JSImport("@next/react-dev-overlay/lib/internal/helpers/nodeStackFrames", "isNodeError")
  @js.native
  def isNodeError(error: Error): Boolean = js.native
}
