package typings.next

import typings.next.nextStrings.`edge-server`
import typings.next.nextStrings.server
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distClientComponentsReactDevOverlayInternalHelpersStackFrameMod {
  
  @JSImport("next/dist/client/components/react-dev-overlay/internal/helpers/stack-frame", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getFrameSource(
    frame: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StackFrame */ Any
  ): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getFrameSource")(frame.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getOriginalStackFrame(
    source: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StackFrame */ Any,
    `type`: server | `edge-server`,
    errorMessage: String
  ): js.Promise[OriginalStackFrame] = (^.asInstanceOf[js.Dynamic].applyDynamic("getOriginalStackFrame")(source.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], errorMessage.asInstanceOf[js.Any])).asInstanceOf[js.Promise[OriginalStackFrame]]
  inline def getOriginalStackFrame(
    source: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StackFrame */ Any,
    `type`: Null,
    errorMessage: String
  ): js.Promise[OriginalStackFrame] = (^.asInstanceOf[js.Dynamic].applyDynamic("getOriginalStackFrame")(source.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], errorMessage.asInstanceOf[js.Any])).asInstanceOf[js.Promise[OriginalStackFrame]]
  
  inline def getOriginalStackFrames(
    frames: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StackFrame */ Any
    ],
    `type`: server | `edge-server`,
    errorMessage: String
  ): js.Promise[js.Array[OriginalStackFrame]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getOriginalStackFrames")(frames.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], errorMessage.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[OriginalStackFrame]]]
  inline def getOriginalStackFrames(
    frames: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StackFrame */ Any
    ],
    `type`: Null,
    errorMessage: String
  ): js.Promise[js.Array[OriginalStackFrame]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getOriginalStackFrames")(frames.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], errorMessage.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[OriginalStackFrame]]]
  
  /* Rewritten from type alias, can be one of: 
    - typings.next.anon.Expanded
    - typings.next.anon.External
    - typings.next.anon.OriginalCodeFrame
  */
  trait OriginalStackFrame extends StObject
  object OriginalStackFrame {
    
    inline def Expanded(
      originalCodeFrame: Null,
      originalStackFrame: Null,
      reason: String,
      sourceStackFrame: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StackFrame */ Any
    ): typings.next.anon.Expanded = {
      val __obj = js.Dynamic.literal(error = true, expanded = false, external = false, originalCodeFrame = originalCodeFrame.asInstanceOf[js.Any], originalStackFrame = originalStackFrame.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], sourceStackFrame = sourceStackFrame.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.next.anon.Expanded]
    }
    
    inline def External(
      expanded: Boolean,
      originalStackFrame: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StackFrame */ Any,
      reason: Null,
      sourceStackFrame: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StackFrame */ Any
    ): typings.next.anon.External = {
      val __obj = js.Dynamic.literal(error = false, expanded = expanded.asInstanceOf[js.Any], external = false, originalStackFrame = originalStackFrame.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], sourceStackFrame = sourceStackFrame.asInstanceOf[js.Any], originalCodeFrame = null)
      __obj.asInstanceOf[typings.next.anon.External]
    }
    
    inline def OriginalCodeFrame(
      originalCodeFrame: Null,
      originalStackFrame: Null,
      reason: Null,
      sourceStackFrame: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StackFrame */ Any
    ): typings.next.anon.OriginalCodeFrame = {
      val __obj = js.Dynamic.literal(error = false, expanded = false, external = true, originalCodeFrame = originalCodeFrame.asInstanceOf[js.Any], originalStackFrame = originalStackFrame.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], sourceStackFrame = sourceStackFrame.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.next.anon.OriginalCodeFrame]
    }
  }
}
