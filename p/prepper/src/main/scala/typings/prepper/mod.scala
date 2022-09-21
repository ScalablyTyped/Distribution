package typings.prepper

import typings.node.eventsMod.EventEmitter
import typings.node.eventsMod.EventEmitterOptions
import typings.prepper.anon.Exclude
import typings.prepper.anon.Invert
import typings.prepper.anon.Level
import typings.prepper.anon.Size
import typings.prepper.mod.handlers.Handler
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("prepper", "Logger")
  @js.native
  open class Logger () extends EventEmitter {
    def this(options: LoggerOptions) = this()
    
    def child(options: LoggerOptions): Logger = js.native
    
    def debug(context: Any): Unit = js.native
    def debug(message_or_error: String): Unit = js.native
    def debug(message_or_error: String, context: Any): Unit = js.native
    def debug(message_or_error: js.Error): Unit = js.native
    def debug(message_or_error: js.Error, context: Any): Unit = js.native
    def debug(message: String, error: js.Error): Unit = js.native
    def debug(message: String, error: js.Error, context: Any): Unit = js.native
    @JSName("debug")
    var debug_Original: LogFn = js.native
    
    def error(context: Any): Unit = js.native
    def error(message_or_error: String): Unit = js.native
    def error(message_or_error: String, context: Any): Unit = js.native
    def error(message_or_error: js.Error): Unit = js.native
    def error(message_or_error: js.Error, context: Any): Unit = js.native
    def error(message: String, error: js.Error): Unit = js.native
    def error(message: String, error: js.Error, context: Any): Unit = js.native
    @JSName("error")
    var error_Original: LogFn = js.native
    
    def fatal(context: Any): Unit = js.native
    def fatal(message_or_error: String): Unit = js.native
    def fatal(message_or_error: String, context: Any): Unit = js.native
    def fatal(message_or_error: js.Error): Unit = js.native
    def fatal(message_or_error: js.Error, context: Any): Unit = js.native
    def fatal(message: String, error: js.Error): Unit = js.native
    def fatal(message: String, error: js.Error, context: Any): Unit = js.native
    @JSName("fatal")
    var fatal_Original: LogFn = js.native
    
    def info(context: Any): Unit = js.native
    def info(message_or_error: String): Unit = js.native
    def info(message_or_error: String, context: Any): Unit = js.native
    def info(message_or_error: js.Error): Unit = js.native
    def info(message_or_error: js.Error, context: Any): Unit = js.native
    def info(message: String, error: js.Error): Unit = js.native
    def info(message: String, error: js.Error, context: Any): Unit = js.native
    @JSName("info")
    var info_Original: LogFn = js.native
    
    def log(context: Any): Unit = js.native
    def log(message_or_error: String): Unit = js.native
    def log(message_or_error: String, context: Any): Unit = js.native
    def log(message_or_error: js.Error): Unit = js.native
    def log(message_or_error: js.Error, context: Any): Unit = js.native
    def log(message: String, error: js.Error): Unit = js.native
    def log(message: String, error: js.Error, context: Any): Unit = js.native
    @JSName("log")
    var log_Original: LogFn = js.native
    
    def trace(context: Any): Unit = js.native
    def trace(message_or_error: String): Unit = js.native
    def trace(message_or_error: String, context: Any): Unit = js.native
    def trace(message_or_error: js.Error): Unit = js.native
    def trace(message_or_error: js.Error, context: Any): Unit = js.native
    def trace(message: String, error: js.Error): Unit = js.native
    def trace(message: String, error: js.Error, context: Any): Unit = js.native
    @JSName("trace")
    var trace_Original: LogFn = js.native
    
    def warn(context: Any): Unit = js.native
    def warn(message_or_error: String): Unit = js.native
    def warn(message_or_error: String, context: Any): Unit = js.native
    def warn(message_or_error: js.Error): Unit = js.native
    def warn(message_or_error: js.Error, context: Any): Unit = js.native
    def warn(message: String, error: js.Error): Unit = js.native
    def warn(message: String, error: js.Error, context: Any): Unit = js.native
    @JSName("warn")
    var warn_Original: LogFn = js.native
  }
  
  object handlers {
    
    @JSImport("prepper", "handlers.Env")
    @js.native
    open class Env () extends Handler {
      def this(options: EventEmitterOptions) = this()
    }
    
    @JSImport("prepper", "handlers.Flatten")
    @js.native
    open class Flatten () extends Handler {
      def this(options: EventEmitterOptions) = this()
    }
    
    @JSImport("prepper", "handlers.KeyFilter")
    @js.native
    open class KeyFilter protected () extends Handler {
      def this(other: Exclude) = this()
    }
    
    @JSImport("prepper", "handlers.Merge")
    @js.native
    open class Merge protected () extends Handler {
      def this(other: Record[String, Any]) = this()
      def this(other: Record[String, Any], options: Invert) = this()
    }
    
    @JSImport("prepper", "handlers.Noop")
    @js.native
    open class Noop () extends Handler {
      def this(options: EventEmitterOptions) = this()
    }
    
    @JSImport("prepper", "handlers.Oversized")
    @js.native
    open class Oversized protected () extends Handler {
      def this(options: Size) = this()
    }
    
    @JSImport("prepper", "handlers.Process")
    @js.native
    open class Process () extends Handler {
      def this(options: EventEmitterOptions) = this()
    }
    
    @JSImport("prepper", "handlers.Repo")
    @js.native
    open class Repo () extends Handler {
      def this(options: EventEmitterOptions) = this()
    }
    
    @JSImport("prepper", "handlers.Sequence")
    @js.native
    open class Sequence () extends Handler {
      def this(handlers: js.Array[Handler]) = this()
    }
    
    @JSImport("prepper", "handlers.System")
    @js.native
    open class System () extends Handler {
      def this(options: EventEmitterOptions) = this()
    }
    
    @JSImport("prepper", "handlers.Timestamp")
    @js.native
    open class Timestamp () extends Handler {
      def this(options: EventEmitterOptions) = this()
    }
    
    @JSImport("prepper", "handlers.Tracer")
    @js.native
    open class Tracer () extends Handler {
      def this(options: EventEmitterOptions) = this()
    }
    
    @JSImport("prepper", "handlers.Unflatten")
    @js.native
    open class Unflatten () extends Handler {
      def this(options: EventEmitterOptions) = this()
    }
    
    type Event = Level & (Record[String, Any])
    
    @js.native
    trait Handler extends EventEmitter {
      
      /**
        * handles the event
        * @remarks handle must emit 'message' event, passing on the altered event
        */
      def handle(event: Event): Unit = js.native
    }
    
    type PropertyName = String | Double | js.Symbol
  }
  
  @js.native
  trait LogFn extends StObject {
    
    def apply(context: Any): Unit = js.native
    def apply(message_or_error: String): Unit = js.native
    def apply(message_or_error: String, context: Any): Unit = js.native
    def apply(message_or_error: js.Error): Unit = js.native
    def apply(message_or_error: js.Error, context: Any): Unit = js.native
    def apply(message: String, error: js.Error): Unit = js.native
    def apply(message: String, error: js.Error, context: Any): Unit = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.prepper.prepperStrings.trace
    - typings.prepper.prepperStrings.debug
    - typings.prepper.prepperStrings.info
    - typings.prepper.prepperStrings.warn
    - typings.prepper.prepperStrings.error
    - typings.prepper.prepperStrings.fatal
  */
  trait LogLevel extends StObject
  object LogLevel {
    
    inline def debug: typings.prepper.prepperStrings.debug = "debug".asInstanceOf[typings.prepper.prepperStrings.debug]
    
    inline def error: typings.prepper.prepperStrings.error = "error".asInstanceOf[typings.prepper.prepperStrings.error]
    
    inline def fatal: typings.prepper.prepperStrings.fatal = "fatal".asInstanceOf[typings.prepper.prepperStrings.fatal]
    
    inline def info: typings.prepper.prepperStrings.info = "info".asInstanceOf[typings.prepper.prepperStrings.info]
    
    inline def trace: typings.prepper.prepperStrings.trace = "trace".asInstanceOf[typings.prepper.prepperStrings.trace]
    
    inline def warn: typings.prepper.prepperStrings.warn = "warn".asInstanceOf[typings.prepper.prepperStrings.warn]
  }
  
  trait LoggerOptions extends StObject {
    
    var handlers: js.UndefOr[js.Array[Handler]] = js.undefined
    
    var level: js.UndefOr[LogLevel] = js.undefined
    
    var maxListeners: js.UndefOr[Double] = js.undefined
    
    var message: js.UndefOr[String] = js.undefined
    
    var sequence: js.UndefOr[Handler] = js.undefined
  }
  object LoggerOptions {
    
    inline def apply(): LoggerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LoggerOptions]
    }
    
    extension [Self <: LoggerOptions](x: Self) {
      
      inline def setHandlers(value: js.Array[Handler]): Self = StObject.set(x, "handlers", value.asInstanceOf[js.Any])
      
      inline def setHandlersUndefined: Self = StObject.set(x, "handlers", js.undefined)
      
      inline def setHandlersVarargs(value: Handler*): Self = StObject.set(x, "handlers", js.Array(value*))
      
      inline def setLevel(value: LogLevel): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
      
      inline def setMaxListeners(value: Double): Self = StObject.set(x, "maxListeners", value.asInstanceOf[js.Any])
      
      inline def setMaxListenersUndefined: Self = StObject.set(x, "maxListeners", js.undefined)
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      inline def setSequence(value: Handler): Self = StObject.set(x, "sequence", value.asInstanceOf[js.Any])
      
      inline def setSequenceUndefined: Self = StObject.set(x, "sequence", js.undefined)
    }
  }
}
