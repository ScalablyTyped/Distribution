package typings.pino.mod.pino

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//// Exported types and interfaces
trait BaseLogger extends StObject {
  
  /**
    * Log at `'debug'` level the given msg. If the first argument is an object, all its properties will be included in the JSON line.
    * If more args follows `msg`, these will be used to format `msg` using `util.format`.
    *
    * @typeParam T: the interface of the object being serialized. Default is object.
    * @param obj: object to be serialized
    * @param msg: the log message to write
    * @param ...args: format string values when `msg` is a format string
    */
  def debug(msg: String, args: Any*): Unit
  /**
    * Log at `'debug'` level the given msg. If the first argument is an object, all its properties will be included in the JSON line.
    * If more args follows `msg`, these will be used to format `msg` using `util.format`.
    *
    * @typeParam T: the interface of the object being serialized. Default is object.
    * @param obj: object to be serialized
    * @param msg: the log message to write
    * @param ...args: format string values when `msg` is a format string
    */
  def debug(obj: Any, msg: String, args: Any*): Unit
  def debug(obj: Any, msg: Unit, args: Any*): Unit
  /**
    * Log at `'debug'` level the given msg. If the first argument is an object, all its properties will be included in the JSON line.
    * If more args follows `msg`, these will be used to format `msg` using `util.format`.
    *
    * @typeParam T: the interface of the object being serialized. Default is object.
    * @param obj: object to be serialized
    * @param msg: the log message to write
    * @param ...args: format string values when `msg` is a format string
    */
  @JSName("debug")
  var debug_Original: LogFn
  // TODO: why is this different from `obj: object` or `obj: any`?
  /* tslint:disable:no-unnecessary-generics */
  /**
    * Log at `'debug'` level the given msg. If the first argument is an object, all its properties will be included in the JSON line.
    * If more args follows `msg`, these will be used to format `msg` using `util.format`.
    *
    * @typeParam T: the interface of the object being serialized. Default is object.
    * @param obj: object to be serialized
    * @param msg: the log message to write
    * @param ...args: format string values when `msg` is a format string
    */
  @JSName("debug")
  def debug_T[T /* <: js.Object */](obj: T, msg: String, args: Any*): Unit
  @JSName("debug")
  def debug_T[T /* <: js.Object */](obj: T, msg: Unit, args: Any*): Unit
  
  /**
    * Log at `'error'` level the given msg. If the first argument is an object, all its properties will be included in the JSON line.
    * If more args follows `msg`, these will be used to format `msg` using `util.format`.
    *
    * @typeParam T: the interface of the object being serialized. Default is object.
    * @param obj: object to be serialized
    * @param msg: the log message to write
    * @param ...args: format string values when `msg` is a format string
    */
  def error(msg: String, args: Any*): Unit
  /**
    * Log at `'error'` level the given msg. If the first argument is an object, all its properties will be included in the JSON line.
    * If more args follows `msg`, these will be used to format `msg` using `util.format`.
    *
    * @typeParam T: the interface of the object being serialized. Default is object.
    * @param obj: object to be serialized
    * @param msg: the log message to write
    * @param ...args: format string values when `msg` is a format string
    */
  def error(obj: Any, msg: String, args: Any*): Unit
  def error(obj: Any, msg: Unit, args: Any*): Unit
  /**
    * Log at `'error'` level the given msg. If the first argument is an object, all its properties will be included in the JSON line.
    * If more args follows `msg`, these will be used to format `msg` using `util.format`.
    *
    * @typeParam T: the interface of the object being serialized. Default is object.
    * @param obj: object to be serialized
    * @param msg: the log message to write
    * @param ...args: format string values when `msg` is a format string
    */
  @JSName("error")
  var error_Original: LogFn
  // TODO: why is this different from `obj: object` or `obj: any`?
  /* tslint:disable:no-unnecessary-generics */
  /**
    * Log at `'error'` level the given msg. If the first argument is an object, all its properties will be included in the JSON line.
    * If more args follows `msg`, these will be used to format `msg` using `util.format`.
    *
    * @typeParam T: the interface of the object being serialized. Default is object.
    * @param obj: object to be serialized
    * @param msg: the log message to write
    * @param ...args: format string values when `msg` is a format string
    */
  @JSName("error")
  def error_T[T /* <: js.Object */](obj: T, msg: String, args: Any*): Unit
  @JSName("error")
  def error_T[T /* <: js.Object */](obj: T, msg: Unit, args: Any*): Unit
  
  /**
    * Log at `'fatal'` level the given msg. If the first argument is an object, all its properties will be included in the JSON line.
    * If more args follows `msg`, these will be used to format `msg` using `util.format`.
    *
    * @typeParam T: the interface of the object being serialized. Default is object.
    * @param obj: object to be serialized
    * @param msg: the log message to write
    * @param ...args: format string values when `msg` is a format string
    */
  def fatal(msg: String, args: Any*): Unit
  /**
    * Log at `'fatal'` level the given msg. If the first argument is an object, all its properties will be included in the JSON line.
    * If more args follows `msg`, these will be used to format `msg` using `util.format`.
    *
    * @typeParam T: the interface of the object being serialized. Default is object.
    * @param obj: object to be serialized
    * @param msg: the log message to write
    * @param ...args: format string values when `msg` is a format string
    */
  def fatal(obj: Any, msg: String, args: Any*): Unit
  def fatal(obj: Any, msg: Unit, args: Any*): Unit
  /**
    * Log at `'fatal'` level the given msg. If the first argument is an object, all its properties will be included in the JSON line.
    * If more args follows `msg`, these will be used to format `msg` using `util.format`.
    *
    * @typeParam T: the interface of the object being serialized. Default is object.
    * @param obj: object to be serialized
    * @param msg: the log message to write
    * @param ...args: format string values when `msg` is a format string
    */
  @JSName("fatal")
  var fatal_Original: LogFn
  // TODO: why is this different from `obj: object` or `obj: any`?
  /* tslint:disable:no-unnecessary-generics */
  /**
    * Log at `'fatal'` level the given msg. If the first argument is an object, all its properties will be included in the JSON line.
    * If more args follows `msg`, these will be used to format `msg` using `util.format`.
    *
    * @typeParam T: the interface of the object being serialized. Default is object.
    * @param obj: object to be serialized
    * @param msg: the log message to write
    * @param ...args: format string values when `msg` is a format string
    */
  @JSName("fatal")
  def fatal_T[T /* <: js.Object */](obj: T, msg: String, args: Any*): Unit
  @JSName("fatal")
  def fatal_T[T /* <: js.Object */](obj: T, msg: Unit, args: Any*): Unit
  
  /**
    * Log at `'info'` level the given msg. If the first argument is an object, all its properties will be included in the JSON line.
    * If more args follows `msg`, these will be used to format `msg` using `util.format`.
    *
    * @typeParam T: the interface of the object being serialized. Default is object.
    * @param obj: object to be serialized
    * @param msg: the log message to write
    * @param ...args: format string values when `msg` is a format string
    */
  def info(msg: String, args: Any*): Unit
  /**
    * Log at `'info'` level the given msg. If the first argument is an object, all its properties will be included in the JSON line.
    * If more args follows `msg`, these will be used to format `msg` using `util.format`.
    *
    * @typeParam T: the interface of the object being serialized. Default is object.
    * @param obj: object to be serialized
    * @param msg: the log message to write
    * @param ...args: format string values when `msg` is a format string
    */
  def info(obj: Any, msg: String, args: Any*): Unit
  def info(obj: Any, msg: Unit, args: Any*): Unit
  /**
    * Log at `'info'` level the given msg. If the first argument is an object, all its properties will be included in the JSON line.
    * If more args follows `msg`, these will be used to format `msg` using `util.format`.
    *
    * @typeParam T: the interface of the object being serialized. Default is object.
    * @param obj: object to be serialized
    * @param msg: the log message to write
    * @param ...args: format string values when `msg` is a format string
    */
  @JSName("info")
  var info_Original: LogFn
  // TODO: why is this different from `obj: object` or `obj: any`?
  /* tslint:disable:no-unnecessary-generics */
  /**
    * Log at `'info'` level the given msg. If the first argument is an object, all its properties will be included in the JSON line.
    * If more args follows `msg`, these will be used to format `msg` using `util.format`.
    *
    * @typeParam T: the interface of the object being serialized. Default is object.
    * @param obj: object to be serialized
    * @param msg: the log message to write
    * @param ...args: format string values when `msg` is a format string
    */
  @JSName("info")
  def info_T[T /* <: js.Object */](obj: T, msg: String, args: Any*): Unit
  @JSName("info")
  def info_T[T /* <: js.Object */](obj: T, msg: Unit, args: Any*): Unit
  
  /**
    * Set this property to the desired logging level. In order of priority, available levels are:
    *
    * - 'fatal'
    * - 'error'
    * - 'warn'
    * - 'info'
    * - 'debug'
    * - 'trace'
    *
    * The logging level is a __minimum__ level. For instance if `logger.level` is `'info'` then all `'fatal'`, `'error'`, `'warn'`,
    * and `'info'` logs will be enabled.
    *
    * You can pass `'silent'` to disable logging.
    */
  var level: LevelWithSilent | String
  
  /**
    * Noop function.
    */
  def silent(msg: String, args: Any*): Unit
  /**
    * Noop function.
    */
  def silent(obj: Any, msg: String, args: Any*): Unit
  def silent(obj: Any, msg: Unit, args: Any*): Unit
  /**
    * Noop function.
    */
  @JSName("silent")
  var silent_Original: LogFn
  // TODO: why is this different from `obj: object` or `obj: any`?
  /* tslint:disable:no-unnecessary-generics */
  /**
    * Noop function.
    */
  @JSName("silent")
  def silent_T[T /* <: js.Object */](obj: T, msg: String, args: Any*): Unit
  @JSName("silent")
  def silent_T[T /* <: js.Object */](obj: T, msg: Unit, args: Any*): Unit
  
  /**
    * Log at `'trace'` level the given msg. If the first argument is an object, all its properties will be included in the JSON line.
    * If more args follows `msg`, these will be used to format `msg` using `util.format`.
    *
    * @typeParam T: the interface of the object being serialized. Default is object.
    * @param obj: object to be serialized
    * @param msg: the log message to write
    * @param ...args: format string values when `msg` is a format string
    */
  def trace(msg: String, args: Any*): Unit
  /**
    * Log at `'trace'` level the given msg. If the first argument is an object, all its properties will be included in the JSON line.
    * If more args follows `msg`, these will be used to format `msg` using `util.format`.
    *
    * @typeParam T: the interface of the object being serialized. Default is object.
    * @param obj: object to be serialized
    * @param msg: the log message to write
    * @param ...args: format string values when `msg` is a format string
    */
  def trace(obj: Any, msg: String, args: Any*): Unit
  def trace(obj: Any, msg: Unit, args: Any*): Unit
  /**
    * Log at `'trace'` level the given msg. If the first argument is an object, all its properties will be included in the JSON line.
    * If more args follows `msg`, these will be used to format `msg` using `util.format`.
    *
    * @typeParam T: the interface of the object being serialized. Default is object.
    * @param obj: object to be serialized
    * @param msg: the log message to write
    * @param ...args: format string values when `msg` is a format string
    */
  @JSName("trace")
  var trace_Original: LogFn
  // TODO: why is this different from `obj: object` or `obj: any`?
  /* tslint:disable:no-unnecessary-generics */
  /**
    * Log at `'trace'` level the given msg. If the first argument is an object, all its properties will be included in the JSON line.
    * If more args follows `msg`, these will be used to format `msg` using `util.format`.
    *
    * @typeParam T: the interface of the object being serialized. Default is object.
    * @param obj: object to be serialized
    * @param msg: the log message to write
    * @param ...args: format string values when `msg` is a format string
    */
  @JSName("trace")
  def trace_T[T /* <: js.Object */](obj: T, msg: String, args: Any*): Unit
  @JSName("trace")
  def trace_T[T /* <: js.Object */](obj: T, msg: Unit, args: Any*): Unit
  
  /**
    * Log at `'warn'` level the given msg. If the first argument is an object, all its properties will be included in the JSON line.
    * If more args follows `msg`, these will be used to format `msg` using `util.format`.
    *
    * @typeParam T: the interface of the object being serialized. Default is object.
    * @param obj: object to be serialized
    * @param msg: the log message to write
    * @param ...args: format string values when `msg` is a format string
    */
  def warn(msg: String, args: Any*): Unit
  /**
    * Log at `'warn'` level the given msg. If the first argument is an object, all its properties will be included in the JSON line.
    * If more args follows `msg`, these will be used to format `msg` using `util.format`.
    *
    * @typeParam T: the interface of the object being serialized. Default is object.
    * @param obj: object to be serialized
    * @param msg: the log message to write
    * @param ...args: format string values when `msg` is a format string
    */
  def warn(obj: Any, msg: String, args: Any*): Unit
  def warn(obj: Any, msg: Unit, args: Any*): Unit
  /**
    * Log at `'warn'` level the given msg. If the first argument is an object, all its properties will be included in the JSON line.
    * If more args follows `msg`, these will be used to format `msg` using `util.format`.
    *
    * @typeParam T: the interface of the object being serialized. Default is object.
    * @param obj: object to be serialized
    * @param msg: the log message to write
    * @param ...args: format string values when `msg` is a format string
    */
  @JSName("warn")
  var warn_Original: LogFn
  // TODO: why is this different from `obj: object` or `obj: any`?
  /* tslint:disable:no-unnecessary-generics */
  /**
    * Log at `'warn'` level the given msg. If the first argument is an object, all its properties will be included in the JSON line.
    * If more args follows `msg`, these will be used to format `msg` using `util.format`.
    *
    * @typeParam T: the interface of the object being serialized. Default is object.
    * @param obj: object to be serialized
    * @param msg: the log message to write
    * @param ...args: format string values when `msg` is a format string
    */
  @JSName("warn")
  def warn_T[T /* <: js.Object */](obj: T, msg: String, args: Any*): Unit
  @JSName("warn")
  def warn_T[T /* <: js.Object */](obj: T, msg: Unit, args: Any*): Unit
}
object BaseLogger {
  
  inline def apply(
    debug: LogFn,
    error: LogFn,
    fatal: LogFn,
    info: LogFn,
    level: LevelWithSilent | String,
    silent: LogFn,
    trace: LogFn,
    warn: LogFn
  ): BaseLogger = {
    val __obj = js.Dynamic.literal(debug = debug.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], fatal = fatal.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any], trace = trace.asInstanceOf[js.Any], warn = warn.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseLogger]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BaseLogger] (val x: Self) extends AnyVal {
    
    inline def setDebug(value: LogFn): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
    
    inline def setError(value: LogFn): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setFatal(value: LogFn): Self = StObject.set(x, "fatal", value.asInstanceOf[js.Any])
    
    inline def setInfo(value: LogFn): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
    
    inline def setLevel(value: LevelWithSilent | String): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setSilent(value: LogFn): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
    
    inline def setTrace(value: LogFn): Self = StObject.set(x, "trace", value.asInstanceOf[js.Any])
    
    inline def setWarn(value: LogFn): Self = StObject.set(x, "warn", value.asInstanceOf[js.Any])
  }
}
