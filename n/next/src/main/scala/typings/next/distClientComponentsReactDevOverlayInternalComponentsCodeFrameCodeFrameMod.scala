package typings.next

import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distClientComponentsReactDevOverlayInternalComponentsCodeFrameCodeFrameMod {
  
  @JSImport("next/dist/client/components/react-dev-overlay/internal/components/CodeFrame/CodeFrame", "CodeFrame")
  @js.native
  val CodeFrame: FC[CodeFrameProps] = js.native
  
  trait CodeFrameProps extends StObject {
    
    var codeFrame: String
    
    var stackFrame: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StackFrame */ Any
  }
  object CodeFrameProps {
    
    inline def apply(
      codeFrame: String,
      stackFrame: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StackFrame */ Any
    ): CodeFrameProps = {
      val __obj = js.Dynamic.literal(codeFrame = codeFrame.asInstanceOf[js.Any], stackFrame = stackFrame.asInstanceOf[js.Any])
      __obj.asInstanceOf[CodeFrameProps]
    }
    
    extension [Self <: CodeFrameProps](x: Self) {
      
      inline def setCodeFrame(value: String): Self = StObject.set(x, "codeFrame", value.asInstanceOf[js.Any])
      
      inline def setStackFrame(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StackFrame */ Any
      ): Self = StObject.set(x, "stackFrame", value.asInstanceOf[js.Any])
    }
  }
}
