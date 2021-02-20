package typings.nextReactDevOverlay

import typings.nextReactDevOverlay.busMod.UnhandledError
import typings.nextReactDevOverlay.busMod.UnhandledRejection
import typings.nextReactDevOverlay.nextReactDevOverlayBooleans.`true`
import typings.nextReactDevOverlay.stackFrameMod.OriginalStackFrame
import typings.react.mod.FC
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object errorsMod {
  
  @JSImport("@next/react-dev-overlay/lib/internal/container/Errors", "Errors")
  @js.native
  val Errors: FC[ErrorsProps] = js.native
  
  @JSImport("@next/react-dev-overlay/lib/internal/container/Errors", "styles")
  @js.native
  val styles: String = js.native
  
  @js.native
  trait ErrorsProps extends StObject {
    
    var errors: js.Array[SupportedErrorEvent] = js.native
  }
  object ErrorsProps {
    
    @scala.inline
    def apply(errors: js.Array[SupportedErrorEvent]): ErrorsProps = {
      val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any])
      __obj.asInstanceOf[ErrorsProps]
    }
    
    @scala.inline
    implicit class ErrorsPropsMutableBuilder[Self <: ErrorsProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setErrors(value: js.Array[SupportedErrorEvent]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorsVarargs(value: SupportedErrorEvent*): Self = StObject.set(x, "errors", js.Array(value :_*))
    }
  }
  
  @js.native
  trait ReadyRuntimeError extends StObject {
    
    var error: Error = js.native
    
    var frames: js.Array[OriginalStackFrame] = js.native
    
    var id: Double = js.native
    
    var runtime: `true` = js.native
  }
  object ReadyRuntimeError {
    
    @scala.inline
    def apply(error: Error, frames: js.Array[OriginalStackFrame], id: Double, runtime: `true`): ReadyRuntimeError = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], frames = frames.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], runtime = runtime.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReadyRuntimeError]
    }
    
    @scala.inline
    implicit class ReadyRuntimeErrorMutableBuilder[Self <: ReadyRuntimeError] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setError(value: Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFrames(value: js.Array[OriginalStackFrame]): Self = StObject.set(x, "frames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFramesVarargs(value: OriginalStackFrame*): Self = StObject.set(x, "frames", js.Array(value :_*))
      
      @scala.inline
      def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRuntime(value: `true`): Self = StObject.set(x, "runtime", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SupportedErrorEvent extends StObject {
    
    var event: UnhandledError | UnhandledRejection = js.native
    
    var id: Double = js.native
  }
  object SupportedErrorEvent {
    
    @scala.inline
    def apply(event: UnhandledError | UnhandledRejection, id: Double): SupportedErrorEvent = {
      val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[SupportedErrorEvent]
    }
    
    @scala.inline
    implicit class SupportedErrorEventMutableBuilder[Self <: SupportedErrorEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEvent(value: UnhandledError | UnhandledRejection): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
}
