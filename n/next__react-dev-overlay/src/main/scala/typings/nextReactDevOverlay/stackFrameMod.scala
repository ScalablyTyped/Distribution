package typings.nextReactDevOverlay

import typings.stacktraceParser.mod.StackFrame
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@next/react-dev-overlay/lib/internal/helpers/stack-frame", JSImport.Namespace)
@js.native
object stackFrameMod extends js.Object {
  /* Rewritten from type alias, can be one of: 
    - typings.nextReactDevOverlay.anon.Expanded
    - typings.nextReactDevOverlay.anon.External
    - typings.nextReactDevOverlay.anon.OriginalCodeFrame
  */
  trait OriginalStackFrame extends js.Object
  
  def getFrameSource(frame: StackFrame): String = js.native
  def getOriginalStackFrame(isServerSide: Boolean, source: StackFrame): js.Promise[OriginalStackFrame] = js.native
  def getOriginalStackFrames(isServerSide: Boolean, frames: js.Array[StackFrame]): js.Promise[js.Array[OriginalStackFrame]] = js.native
}

