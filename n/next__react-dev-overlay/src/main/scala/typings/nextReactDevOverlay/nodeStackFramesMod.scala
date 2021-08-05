package typings.nextReactDevOverlay

import typings.stacktraceParser.mod.StackFrame
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeStackFramesMod {
  
  @JSImport("@next/react-dev-overlay/lib/internal/helpers/nodeStackFrames", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getFilesystemFrame(frame: StackFrame): StackFrame = ^.asInstanceOf[js.Dynamic].applyDynamic("getFilesystemFrame")(frame.asInstanceOf[js.Any]).asInstanceOf[StackFrame]
  
  inline def getNodeError(error: Error): Error = ^.asInstanceOf[js.Dynamic].applyDynamic("getNodeError")(error.asInstanceOf[js.Any]).asInstanceOf[Error]
  
  inline def isNodeError(error: Error): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNodeError")(error.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
