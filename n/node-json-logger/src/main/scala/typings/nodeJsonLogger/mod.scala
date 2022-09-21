package typings.nodeJsonLogger

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Shortcut
import typings.nodeJsonLogger.anon.Level
import typings.nodeJsonLogger.anon.LevelMessage
import typings.nodeJsonLogger.anon.LevelMessageTimestamp
import typings.nodeJsonLogger.anon.Message
import typings.nodeJsonLogger.anon.MessageTimestamp
import typings.nodeJsonLogger.anon.PartiallevelTLevelnonelog
import typings.nodeJsonLogger.anon.Timestamp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("node-json-logger", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with TLogger {
    def this(options: PartiallevelTLevelnonelog) = this()
    
    /* CompleteClass */
    override def debug(args: Any*): LevelMessage = js.native
    /* CompleteClass */
    @JSName("debug")
    var debug_Original: js.Function1[/* repeated */ Any, LevelMessage] = js.native
    
    /* CompleteClass */
    override def error(args: Any*): MessageTimestamp = js.native
    /* CompleteClass */
    @JSName("error")
    var error_Original: js.Function1[/* repeated */ Any, MessageTimestamp] = js.native
    
    /* CompleteClass */
    override def fatal(args: Any*): Timestamp = js.native
    /* CompleteClass */
    @JSName("fatal")
    var fatal_Original: js.Function1[/* repeated */ Any, Timestamp] = js.native
    
    /* CompleteClass */
    override def info(args: Any*): Level = js.native
    /* CompleteClass */
    @JSName("info")
    var info_Original: js.Function1[/* repeated */ Any, Level] = js.native
    
    /* CompleteClass */
    override def trace(args: Any*): LevelMessageTimestamp = js.native
    /* CompleteClass */
    @JSName("trace")
    var trace_Original: js.Function1[/* repeated */ Any, LevelMessageTimestamp] = js.native
    
    /* CompleteClass */
    override def warn(args: Any*): Message = js.native
    /* CompleteClass */
    @JSName("warn")
    var warn_Original: js.Function1[/* repeated */ Any, Message] = js.native
  }
  @JSImport("node-json-logger", JSImport.Namespace)
  @js.native
  val ^ : js.Object & Logger = js.native
  
  type Logger = Instantiable1[/* options */ js.UndefOr[PartiallevelTLevelnonelog], TLogger]
  
  /* Rewritten from type alias, can be one of: 
    - typings.nodeJsonLogger.nodeJsonLoggerStrings.trace
    - typings.nodeJsonLogger.nodeJsonLoggerStrings.debug
    - typings.nodeJsonLogger.nodeJsonLoggerStrings.info
    - typings.nodeJsonLogger.nodeJsonLoggerStrings.warn
    - typings.nodeJsonLogger.nodeJsonLoggerStrings.error
    - typings.nodeJsonLogger.nodeJsonLoggerStrings.fatal
  */
  trait TLevel extends StObject
  object TLevel {
    
    inline def debug: typings.nodeJsonLogger.nodeJsonLoggerStrings.debug = "debug".asInstanceOf[typings.nodeJsonLogger.nodeJsonLoggerStrings.debug]
    
    inline def error: typings.nodeJsonLogger.nodeJsonLoggerStrings.error = "error".asInstanceOf[typings.nodeJsonLogger.nodeJsonLoggerStrings.error]
    
    inline def fatal: typings.nodeJsonLogger.nodeJsonLoggerStrings.fatal = "fatal".asInstanceOf[typings.nodeJsonLogger.nodeJsonLoggerStrings.fatal]
    
    inline def info: typings.nodeJsonLogger.nodeJsonLoggerStrings.info = "info".asInstanceOf[typings.nodeJsonLogger.nodeJsonLoggerStrings.info]
    
    inline def trace: typings.nodeJsonLogger.nodeJsonLoggerStrings.trace = "trace".asInstanceOf[typings.nodeJsonLogger.nodeJsonLoggerStrings.trace]
    
    inline def warn: typings.nodeJsonLogger.nodeJsonLoggerStrings.warn = "warn".asInstanceOf[typings.nodeJsonLogger.nodeJsonLoggerStrings.warn]
  }
  
  /* Inlined {[ level in node-json-logger.node-json-logger.TLevel ]: (args : ...any): {  timestamp :string,   level :level,   message :string}} */
  trait TLogger extends StObject {
    
    def debug(args: Any*): LevelMessage
    @JSName("debug")
    var debug_Original: js.Function1[/* repeated */ Any, LevelMessage]
    
    def error(args: Any*): MessageTimestamp
    @JSName("error")
    var error_Original: js.Function1[/* repeated */ Any, MessageTimestamp]
    
    def fatal(args: Any*): Timestamp
    @JSName("fatal")
    var fatal_Original: js.Function1[/* repeated */ Any, Timestamp]
    
    def info(args: Any*): Level
    @JSName("info")
    var info_Original: js.Function1[/* repeated */ Any, Level]
    
    def trace(args: Any*): LevelMessageTimestamp
    @JSName("trace")
    var trace_Original: js.Function1[/* repeated */ Any, LevelMessageTimestamp]
    
    def warn(args: Any*): Message
    @JSName("warn")
    var warn_Original: js.Function1[/* repeated */ Any, Message]
  }
  object TLogger {
    
    inline def apply(
      debug: /* repeated */ Any => LevelMessage,
      error: /* repeated */ Any => MessageTimestamp,
      fatal: /* repeated */ Any => Timestamp,
      info: /* repeated */ Any => Level,
      trace: /* repeated */ Any => LevelMessageTimestamp,
      warn: /* repeated */ Any => Message
    ): TLogger = {
      val __obj = js.Dynamic.literal(debug = js.Any.fromFunction1(debug), error = js.Any.fromFunction1(error), fatal = js.Any.fromFunction1(fatal), info = js.Any.fromFunction1(info), trace = js.Any.fromFunction1(trace), warn = js.Any.fromFunction1(warn))
      __obj.asInstanceOf[TLogger]
    }
    
    extension [Self <: TLogger](x: Self) {
      
      inline def setDebug(value: /* repeated */ Any => LevelMessage): Self = StObject.set(x, "debug", js.Any.fromFunction1(value))
      
      inline def setError(value: /* repeated */ Any => MessageTimestamp): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
      
      inline def setFatal(value: /* repeated */ Any => Timestamp): Self = StObject.set(x, "fatal", js.Any.fromFunction1(value))
      
      inline def setInfo(value: /* repeated */ Any => Level): Self = StObject.set(x, "info", js.Any.fromFunction1(value))
      
      inline def setTrace(value: /* repeated */ Any => LevelMessageTimestamp): Self = StObject.set(x, "trace", js.Any.fromFunction1(value))
      
      inline def setWarn(value: /* repeated */ Any => Message): Self = StObject.set(x, "warn", js.Any.fromFunction1(value))
    }
  }
  
  type _To = js.Object & Logger
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: js.Object & Logger = ^
}
