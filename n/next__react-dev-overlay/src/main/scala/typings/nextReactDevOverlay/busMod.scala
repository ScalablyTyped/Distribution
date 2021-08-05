package typings.nextReactDevOverlay

import typings.stacktraceParser.mod.StackFrame
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object busMod {
  
  @JSImport("@next/react-dev-overlay/lib/internal/bus", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
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
  
  inline def emit(ev: BusEvent): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("emit")(ev.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def off(fn: BusEventHandler): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("off")(fn.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def on(fn: BusEventHandler): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("on")(fn.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  trait BuildError
    extends StObject
       with BusEvent {
    
    var message: String
    
    var `type`: /* "build-error" */ String
  }
  object BuildError {
    
    inline def apply(message: String, `type`: /* "build-error" */ String): BuildError = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[BuildError]
    }
    
    extension [Self <: BuildError](x: Self) {
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setType(value: /* "build-error" */ String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait BuildOk
    extends StObject
       with BusEvent {
    
    var `type`: /* "build-ok" */ String
  }
  object BuildOk {
    
    inline def apply(`type`: /* "build-ok" */ String): BuildOk = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[BuildOk]
    }
    
    extension [Self <: BuildOk](x: Self) {
      
      inline def setType(value: /* "build-ok" */ String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
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
    
    inline def BuildError(message: String, `type`: /* "build-error" */ String): typings.nextReactDevOverlay.busMod.BuildError = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.nextReactDevOverlay.busMod.BuildError]
    }
    
    inline def BuildOk(`type`: /* "build-ok" */ String): typings.nextReactDevOverlay.busMod.BuildOk = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.nextReactDevOverlay.busMod.BuildOk]
    }
    
    inline def FastRefresh(`type`: /* "fast-refresh" */ String): typings.nextReactDevOverlay.busMod.FastRefresh = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.nextReactDevOverlay.busMod.FastRefresh]
    }
    
    inline def UnhandledError(frames: js.Array[StackFrame], reason: Error, `type`: /* "unhandled-error" */ String): typings.nextReactDevOverlay.busMod.UnhandledError = {
      val __obj = js.Dynamic.literal(frames = frames.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.nextReactDevOverlay.busMod.UnhandledError]
    }
    
    inline def UnhandledRejection(frames: js.Array[StackFrame], reason: Error, `type`: /* "unhandled-rejection" */ String): typings.nextReactDevOverlay.busMod.UnhandledRejection = {
      val __obj = js.Dynamic.literal(frames = frames.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.nextReactDevOverlay.busMod.UnhandledRejection]
    }
  }
  
  type BusEventHandler = js.Function1[/* ev */ BusEvent, Unit]
  
  trait FastRefresh
    extends StObject
       with BusEvent {
    
    var `type`: /* "fast-refresh" */ String
  }
  object FastRefresh {
    
    inline def apply(`type`: /* "fast-refresh" */ String): FastRefresh = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[FastRefresh]
    }
    
    extension [Self <: FastRefresh](x: Self) {
      
      inline def setType(value: /* "fast-refresh" */ String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait UnhandledError
    extends StObject
       with BusEvent {
    
    var frames: js.Array[StackFrame]
    
    var reason: Error
    
    var `type`: /* "unhandled-error" */ String
  }
  object UnhandledError {
    
    inline def apply(frames: js.Array[StackFrame], reason: Error, `type`: /* "unhandled-error" */ String): UnhandledError = {
      val __obj = js.Dynamic.literal(frames = frames.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[UnhandledError]
    }
    
    extension [Self <: UnhandledError](x: Self) {
      
      inline def setFrames(value: js.Array[StackFrame]): Self = StObject.set(x, "frames", value.asInstanceOf[js.Any])
      
      inline def setFramesVarargs(value: StackFrame*): Self = StObject.set(x, "frames", js.Array(value :_*))
      
      inline def setReason(value: Error): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
      
      inline def setType(value: /* "unhandled-error" */ String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait UnhandledRejection
    extends StObject
       with BusEvent {
    
    var frames: js.Array[StackFrame]
    
    var reason: Error
    
    var `type`: /* "unhandled-rejection" */ String
  }
  object UnhandledRejection {
    
    inline def apply(frames: js.Array[StackFrame], reason: Error, `type`: /* "unhandled-rejection" */ String): UnhandledRejection = {
      val __obj = js.Dynamic.literal(frames = frames.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[UnhandledRejection]
    }
    
    extension [Self <: UnhandledRejection](x: Self) {
      
      inline def setFrames(value: js.Array[StackFrame]): Self = StObject.set(x, "frames", value.asInstanceOf[js.Any])
      
      inline def setFramesVarargs(value: StackFrame*): Self = StObject.set(x, "frames", js.Array(value :_*))
      
      inline def setReason(value: Error): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
      
      inline def setType(value: /* "unhandled-rejection" */ String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
