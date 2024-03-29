package typings.nextReactDevOverlay

import typings.nextReactDevOverlay.busMod.UnhandledError
import typings.nextReactDevOverlay.busMod.UnhandledRejection
import typings.nextReactDevOverlay.nextReactDevOverlayBooleans.`true`
import typings.nextReactDevOverlay.stackFrameMod.OriginalStackFrame
import typings.react.mod.FC
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object errorsMod {
  
  @JSImport("@next/react-dev-overlay/lib/internal/container/Errors", "Errors")
  @js.native
  val Errors: FC[ErrorsProps] = js.native
  
  @JSImport("@next/react-dev-overlay/lib/internal/container/Errors", "styles")
  @js.native
  val styles: String = js.native
  
  trait ErrorsProps extends StObject {
    
    var errors: js.Array[SupportedErrorEvent]
  }
  object ErrorsProps {
    
    inline def apply(errors: js.Array[SupportedErrorEvent]): ErrorsProps = {
      val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any])
      __obj.asInstanceOf[ErrorsProps]
    }
    
    extension [Self <: ErrorsProps](x: Self) {
      
      inline def setErrors(value: js.Array[SupportedErrorEvent]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      inline def setErrorsVarargs(value: SupportedErrorEvent*): Self = StObject.set(x, "errors", js.Array(value :_*))
    }
  }
  
  trait ReadyRuntimeError extends StObject {
    
    var error: Error
    
    var frames: js.Array[OriginalStackFrame]
    
    var id: Double
    
    var runtime: `true`
  }
  object ReadyRuntimeError {
    
    inline def apply(error: Error, frames: js.Array[OriginalStackFrame], id: Double): ReadyRuntimeError = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], frames = frames.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], runtime = true)
      __obj.asInstanceOf[ReadyRuntimeError]
    }
    
    extension [Self <: ReadyRuntimeError](x: Self) {
      
      inline def setError(value: Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setFrames(value: js.Array[OriginalStackFrame]): Self = StObject.set(x, "frames", value.asInstanceOf[js.Any])
      
      inline def setFramesVarargs(value: OriginalStackFrame*): Self = StObject.set(x, "frames", js.Array(value :_*))
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setRuntime(value: `true`): Self = StObject.set(x, "runtime", value.asInstanceOf[js.Any])
    }
  }
  
  trait SupportedErrorEvent extends StObject {
    
    var event: UnhandledError | UnhandledRejection
    
    var id: Double
  }
  object SupportedErrorEvent {
    
    inline def apply(event: UnhandledError | UnhandledRejection, id: Double): SupportedErrorEvent = {
      val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[SupportedErrorEvent]
    }
    
    extension [Self <: SupportedErrorEvent](x: Self) {
      
      inline def setEvent(value: UnhandledError | UnhandledRejection): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
}
