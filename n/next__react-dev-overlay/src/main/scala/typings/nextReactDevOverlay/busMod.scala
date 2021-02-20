package typings.nextReactDevOverlay

import typings.stacktraceParser.mod.StackFrame
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object busMod {
  
  @JSImport("@next/react-dev-overlay/lib/internal/bus", "TYPE_BUILD_ERROR")
  @js.native
  val TYPE_BUILD_ERROR: /* "build-error" */ String = js.native
  
  @JSImport("@next/react-dev-overlay/lib/internal/bus", "TYPE_BUILD_OK")
  @js.native
  val TYPE_BUILD_OK: /* "build-ok" */ String = js.native
  
  @JSImport("@next/react-dev-overlay/lib/internal/bus", "TYPE_REFFRESH")
  @js.native
  val TYPE_REFFRESH: /* "fast-refresh" */ String = js.native
  
  @JSImport("@next/react-dev-overlay/lib/internal/bus", "TYPE_UNHANDLED_ERROR")
  @js.native
  val TYPE_UNHANDLED_ERROR: /* "unhandled-error" */ String = js.native
  
  @JSImport("@next/react-dev-overlay/lib/internal/bus", "TYPE_UNHANDLED_REJECTION")
  @js.native
  val TYPE_UNHANDLED_REJECTION: /* "unhandled-rejection" */ String = js.native
  
  @JSImport("@next/react-dev-overlay/lib/internal/bus", "emit")
  @js.native
  def emit(ev: BusEvent): Unit = js.native
  
  @JSImport("@next/react-dev-overlay/lib/internal/bus", "off")
  @js.native
  def off(fn: BusEventHandler): Boolean = js.native
  
  @JSImport("@next/react-dev-overlay/lib/internal/bus", "on")
  @js.native
  def on(fn: BusEventHandler): Boolean = js.native
  
  @js.native
  trait BuildError extends BusEvent {
    
    var message: String = js.native
    
    var `type`: /* "build-error" */ String = js.native
  }
  object BuildError {
    
    @scala.inline
    def apply(message: String, `type`: /* "build-error" */ String): BuildError = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[BuildError]
    }
    
    @scala.inline
    implicit class BuildErrorMutableBuilder[Self <: BuildError] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: /* "build-error" */ String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait BuildOk extends BusEvent {
    
    var `type`: /* "build-ok" */ String = js.native
  }
  object BuildOk {
    
    @scala.inline
    def apply(`type`: /* "build-ok" */ String): BuildOk = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[BuildOk]
    }
    
    @scala.inline
    implicit class BuildOkMutableBuilder[Self <: BuildOk] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: /* "build-ok" */ String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.nextReactDevOverlay.busMod.BuildOk
    - typings.nextReactDevOverlay.busMod.BuildError
    - typings.nextReactDevOverlay.busMod.FastRefresh
    - typings.nextReactDevOverlay.busMod.UnhandledError
    - typings.nextReactDevOverlay.busMod.UnhandledRejection
  */
  trait BusEvent extends StObject
  object BusEvent {
    
    @scala.inline
    def BuildError(message: String, `type`: /* "build-error" */ String): typings.nextReactDevOverlay.busMod.BuildError = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.nextReactDevOverlay.busMod.BuildError]
    }
    
    @scala.inline
    def BuildOk(`type`: /* "build-ok" */ String): typings.nextReactDevOverlay.busMod.BuildOk = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.nextReactDevOverlay.busMod.BuildOk]
    }
    
    @scala.inline
    def FastRefresh(`type`: /* "fast-refresh" */ String): typings.nextReactDevOverlay.busMod.FastRefresh = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.nextReactDevOverlay.busMod.FastRefresh]
    }
    
    @scala.inline
    def UnhandledError(frames: js.Array[StackFrame], reason: Error, `type`: /* "unhandled-error" */ String): typings.nextReactDevOverlay.busMod.UnhandledError = {
      val __obj = js.Dynamic.literal(frames = frames.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.nextReactDevOverlay.busMod.UnhandledError]
    }
    
    @scala.inline
    def UnhandledRejection(frames: js.Array[StackFrame], reason: Error, `type`: /* "unhandled-rejection" */ String): typings.nextReactDevOverlay.busMod.UnhandledRejection = {
      val __obj = js.Dynamic.literal(frames = frames.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.nextReactDevOverlay.busMod.UnhandledRejection]
    }
  }
  
  type BusEventHandler = js.Function1[/* ev */ BusEvent, Unit]
  
  @js.native
  trait FastRefresh extends BusEvent {
    
    var `type`: /* "fast-refresh" */ String = js.native
  }
  object FastRefresh {
    
    @scala.inline
    def apply(`type`: /* "fast-refresh" */ String): FastRefresh = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[FastRefresh]
    }
    
    @scala.inline
    implicit class FastRefreshMutableBuilder[Self <: FastRefresh] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: /* "fast-refresh" */ String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait UnhandledError extends BusEvent {
    
    var frames: js.Array[StackFrame] = js.native
    
    var reason: Error = js.native
    
    var `type`: /* "unhandled-error" */ String = js.native
  }
  object UnhandledError {
    
    @scala.inline
    def apply(frames: js.Array[StackFrame], reason: Error, `type`: /* "unhandled-error" */ String): UnhandledError = {
      val __obj = js.Dynamic.literal(frames = frames.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[UnhandledError]
    }
    
    @scala.inline
    implicit class UnhandledErrorMutableBuilder[Self <: UnhandledError] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFrames(value: js.Array[StackFrame]): Self = StObject.set(x, "frames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFramesVarargs(value: StackFrame*): Self = StObject.set(x, "frames", js.Array(value :_*))
      
      @scala.inline
      def setReason(value: Error): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: /* "unhandled-error" */ String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait UnhandledRejection extends BusEvent {
    
    var frames: js.Array[StackFrame] = js.native
    
    var reason: Error = js.native
    
    var `type`: /* "unhandled-rejection" */ String = js.native
  }
  object UnhandledRejection {
    
    @scala.inline
    def apply(frames: js.Array[StackFrame], reason: Error, `type`: /* "unhandled-rejection" */ String): UnhandledRejection = {
      val __obj = js.Dynamic.literal(frames = frames.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[UnhandledRejection]
    }
    
    @scala.inline
    implicit class UnhandledRejectionMutableBuilder[Self <: UnhandledRejection] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFrames(value: js.Array[StackFrame]): Self = StObject.set(x, "frames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFramesVarargs(value: StackFrame*): Self = StObject.set(x, "frames", js.Array(value :_*))
      
      @scala.inline
      def setReason(value: Error): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: /* "unhandled-rejection" */ String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
