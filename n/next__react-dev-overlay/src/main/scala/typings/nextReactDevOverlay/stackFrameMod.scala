package typings.nextReactDevOverlay

import typings.stacktraceParser.mod.StackFrame
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stackFrameMod {
  
  @JSImport("@next/react-dev-overlay/lib/internal/helpers/stack-frame", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getFrameSource(frame: StackFrame): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getFrameSource")(frame.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def getOriginalStackFrame(isServerSide: Boolean, source: StackFrame): js.Promise[OriginalStackFrame] = (^.asInstanceOf[js.Dynamic].applyDynamic("getOriginalStackFrame")(isServerSide.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[js.Promise[OriginalStackFrame]]
  
  @scala.inline
  def getOriginalStackFrames(isServerSide: Boolean, frames: js.Array[StackFrame]): js.Promise[js.Array[OriginalStackFrame]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getOriginalStackFrames")(isServerSide.asInstanceOf[js.Any], frames.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[OriginalStackFrame]]]
  
  /* Rewritten from type alias, can be one of: 
    - typings.nextReactDevOverlay.anon.Expanded
    - typings.nextReactDevOverlay.anon.External
    - typings.nextReactDevOverlay.anon.OriginalCodeFrame
  */
  trait OriginalStackFrame extends StObject
  object OriginalStackFrame {
    
    @scala.inline
    def Expanded(originalCodeFrame: Null, originalStackFrame: Null, reason: String, sourceStackFrame: StackFrame): typings.nextReactDevOverlay.anon.Expanded = {
      val __obj = js.Dynamic.literal(error = true, expanded = false, external = false, originalCodeFrame = originalCodeFrame.asInstanceOf[js.Any], originalStackFrame = originalStackFrame.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], sourceStackFrame = sourceStackFrame.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.nextReactDevOverlay.anon.Expanded]
    }
    
    @scala.inline
    def External(expanded: Boolean, originalStackFrame: StackFrame, reason: Null, sourceStackFrame: StackFrame): typings.nextReactDevOverlay.anon.External = {
      val __obj = js.Dynamic.literal(error = false, expanded = expanded.asInstanceOf[js.Any], external = false, originalStackFrame = originalStackFrame.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], sourceStackFrame = sourceStackFrame.asInstanceOf[js.Any], originalCodeFrame = null)
      __obj.asInstanceOf[typings.nextReactDevOverlay.anon.External]
    }
    
    @scala.inline
    def OriginalCodeFrame(originalCodeFrame: Null, originalStackFrame: Null, reason: Null, sourceStackFrame: StackFrame): typings.nextReactDevOverlay.anon.OriginalCodeFrame = {
      val __obj = js.Dynamic.literal(error = false, expanded = false, external = true, originalCodeFrame = originalCodeFrame.asInstanceOf[js.Any], originalStackFrame = originalStackFrame.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], sourceStackFrame = sourceStackFrame.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.nextReactDevOverlay.anon.OriginalCodeFrame]
    }
  }
}
