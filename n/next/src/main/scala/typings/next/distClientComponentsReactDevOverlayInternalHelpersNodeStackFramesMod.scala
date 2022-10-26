package typings.next

import typings.next.nextStrings.`edge-server`
import typings.next.nextStrings.server
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distClientComponentsReactDevOverlayInternalHelpersNodeStackFramesMod {
  
  @JSImport("next/dist/client/components/react-dev-overlay/internal/helpers/nodeStackFrames", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def decorateServerError(error: js.Error, `type`: ErrorType): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("decorateServerError")(error.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getErrorSource(error: js.Error): server | `edge-server` | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getErrorSource")(error.asInstanceOf[js.Any]).asInstanceOf[server | `edge-server` | Null]
  
  inline def getFilesystemFrame(
    frame: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StackFrame */ Any
  ): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getFilesystemFrame")(frame.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def getServerError(error: js.Error, `type`: ErrorType): js.Error = (^.asInstanceOf[js.Dynamic].applyDynamic("getServerError")(error.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[js.Error]
  
  /* Rewritten from type alias, can be one of: 
    - typings.next.nextStrings.`edge-server`
    - typings.next.nextStrings.server
  */
  trait ErrorType extends StObject
  object ErrorType {
    
    inline def `edge-server`: typings.next.nextStrings.`edge-server` = "edge-server".asInstanceOf[typings.next.nextStrings.`edge-server`]
    
    inline def server: typings.next.nextStrings.server = "server".asInstanceOf[typings.next.nextStrings.server]
  }
}
