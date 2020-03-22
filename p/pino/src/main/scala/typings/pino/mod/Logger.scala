package typings.pino.mod

import org.scalablytyped.runtime.StringDictionary
import typings.node.eventsMod.EventEmitterOptions
import typings.pino.pinoStrings.`level-change`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined pino.pino.BaseLogger & {[key: string] : pino.pino.LogFn} */
@js.native
trait Logger extends /* key */ StringDictionary[LogFn] {
  /**
    * Holds the current log format version (as output in the v property of each log record).
    */
  val LOG_VERSION: Double = js.native
  /**
    * Define additional logging levels.
    */
  var customLevels: StringDictionary[Double] = js.native
  /**
    * Log at `'debug'` level the given msg. If the first argument is an object, all its properties will be included in the JSON line.
    * If more args follows `msg`, these will be used to format `msg` using `util.format`.
    *
    * @param obj: object to be serialized
    * @param msg: the log message to write
    * @param ...args: format string values when `msg` is a format string
    */
  @JSName("debug")
  var debug_Original: LogFn = js.native
  /**
    * Log at `'error'` level the given msg. If the first argument is an object, all its properties will be included in the JSON line.
    * If more args follows `msg`, these will be used to format `msg` using `util.format`.
    *
    * @param obj: object to be serialized
    * @param msg: the log message to write
    * @param ...args: format string values when `msg` is a format string
    */
  @JSName("error")
  var error_Original: LogFn = js.native
  /**
    * Log at `'fatal'` level the given msg. If the first argument is an object, all its properties will be included in the JSON line.
    * If more args follows `msg`, these will be used to format `msg` using `util.format`.
    *
    * @param obj: object to be serialized
    * @param msg: the log message to write
    * @param ...args: format string values when `msg` is a format string
    */
  @JSName("fatal")
  var fatal_Original: LogFn = js.native
  /**
    * Log at `'info'` level the given msg. If the first argument is an object, all its properties will be included in the JSON line.
    * If more args follows `msg`, these will be used to format `msg` using `util.format`.
    *
    * @param obj: object to be serialized
    * @param msg: the log message to write
    * @param ...args: format string values when `msg` is a format string
    */
  @JSName("info")
  var info_Original: LogFn = js.native
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
  var level: LevelWithSilent | String = js.native
  /**
    * Returns the integer value for the logger instance's logging level.
    */
  var levelVal: Double = js.native
  var levels: LevelMapping = js.native
  /**
    * Exposes the current version of Pino.
    */
  val pino: String = js.native
  /**
    * Log at `'trace'` level the given msg. If the first argument is an object, all its properties will be included in the JSON line.
    * If more args follows `msg`, these will be used to format `msg` using `util.format`.
    *
    * @param obj: object to be serialized
    * @param msg: the log message to write
    * @param ...args: format string values when `msg` is a format string
    */
  @JSName("trace")
  var trace_Original: LogFn = js.native
  /**
    * Outputs the level as a string instead of integer.
    */
  var useLevelLabels: Boolean = js.native
  /**
    * Use only defined `customLevels` and omit Pino's levels.
    */
  var useOnlyCustomLevels: Boolean = js.native
  /**
    * Log at `'warn'` level the given msg. If the first argument is an object, all its properties will be included in the JSON line.
    * If more args follows `msg`, these will be used to format `msg` using `util.format`.
    *
    * @param obj: object to be serialized
    * @param msg: the log message to write
    * @param ...args: format string values when `msg` is a format string
    */
  @JSName("warn")
  var warn_Original: LogFn = js.native
  def addListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  def addListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_levelchange(event: `level-change`, listener: LevelChangeEventListener): this.type = js.native
  /**
    * Returns an object containing all the current bindings, cloned from the ones passed in via logger.child().
    */
  def bindings(): Bindings = js.native
  /**
    * Creates a child logger, setting all key-value pairs in `bindings` as properties in the log lines. All serializers will be applied to the given pair.
    * Child loggers use the same output stream as the parent and inherit the current log level of the parent at the time they are spawned.
    * From v2.x.x the log level of a child is mutable (whereas in v1.x.x it was immutable), and can be set independently of the parent.
    * If a `level` property is present in the object passed to `child` it will override the child logger level.
    *
    * @param bindings: an object of key-value pairs to include in log lines as properties.
    * @returns a child logger instance.
    */
  def child(bindings: Bindings): Logger = js.native
  /**
    * Log at `'debug'` level the given msg. If the first argument is an object, all its properties will be included in the JSON line.
    * If more args follows `msg`, these will be used to format `msg` using `util.format`.
    *
    * @param obj: object to be serialized
    * @param msg: the log message to write
    * @param ...args: format string values when `msg` is a format string
    */
  def debug(msg: String, args: js.Any*): Unit = js.native
  /**
    * Log at `'debug'` level the given msg. If the first argument is an object, all its properties will be included in the JSON line.
    * If more args follows `msg`, these will be used to format `msg` using `util.format`.
    *
    * @param obj: object to be serialized
    * @param msg: the log message to write
    * @param ...args: format string values when `msg` is a format string
    */
  def debug(obj: js.Object): Unit = js.native
  def debug(obj: js.Object, msg: String, args: js.Any*): Unit = js.native
  def emit(event: String, args: js.Any*): Boolean = js.native
  def emit(event: js.Symbol, args: js.Any*): Boolean = js.native
  /**
    * Log at `'error'` level the given msg. If the first argument is an object, all its properties will be included in the JSON line.
    * If more args follows `msg`, these will be used to format `msg` using `util.format`.
    *
    * @param obj: object to be serialized
    * @param msg: the log message to write
    * @param ...args: format string values when `msg` is a format string
    */
  def error(msg: String, args: js.Any*): Unit = js.native
  /**
    * Log at `'error'` level the given msg. If the first argument is an object, all its properties will be included in the JSON line.
    * If more args follows `msg`, these will be used to format `msg` using `util.format`.
    *
    * @param obj: object to be serialized
    * @param msg: the log message to write
    * @param ...args: format string values when `msg` is a format string
    */
  def error(obj: js.Object): Unit = js.native
  def error(obj: js.Object, msg: String, args: js.Any*): Unit = js.native
  def eventNames(): js.Array[String | js.Symbol] = js.native
  /**
    * Log at `'fatal'` level the given msg. If the first argument is an object, all its properties will be included in the JSON line.
    * If more args follows `msg`, these will be used to format `msg` using `util.format`.
    *
    * @param obj: object to be serialized
    * @param msg: the log message to write
    * @param ...args: format string values when `msg` is a format string
    */
  def fatal(msg: String, args: js.Any*): Unit = js.native
  /**
    * Log at `'fatal'` level the given msg. If the first argument is an object, all its properties will be included in the JSON line.
    * If more args follows `msg`, these will be used to format `msg` using `util.format`.
    *
    * @param obj: object to be serialized
    * @param msg: the log message to write
    * @param ...args: format string values when `msg` is a format string
    */
  def fatal(obj: js.Object): Unit = js.native
  def fatal(obj: js.Object, msg: String, args: js.Any*): Unit = js.native
  /**
    * Flushes the content of the buffer in extreme mode. It has no effect if extreme mode is not enabled.
    */
  def flush(): Unit = js.native
  def getMaxListeners(): Double = js.native
  /**
    * Log at `'info'` level the given msg. If the first argument is an object, all its properties will be included in the JSON line.
    * If more args follows `msg`, these will be used to format `msg` using `util.format`.
    *
    * @param obj: object to be serialized
    * @param msg: the log message to write
    * @param ...args: format string values when `msg` is a format string
    */
  def info(msg: String, args: js.Any*): Unit = js.native
  /**
    * Log at `'info'` level the given msg. If the first argument is an object, all its properties will be included in the JSON line.
    * If more args follows `msg`, these will be used to format `msg` using `util.format`.
    *
    * @param obj: object to be serialized
    * @param msg: the log message to write
    * @param ...args: format string values when `msg` is a format string
    */
  def info(obj: js.Object): Unit = js.native
  def info(obj: js.Object, msg: String, args: js.Any*): Unit = js.native
  def isLevelEnabled(level: String): Boolean = js.native
  /**
    * A utility method for determining if a given log level will write to the destination.
    */
  def isLevelEnabled(level: LevelWithSilent): Boolean = js.native
  def listenerCount(`type`: String): Double = js.native
  def listenerCount(`type`: js.Symbol): Double = js.native
  def listeners(event: String): js.Array[js.Function] = js.native
  def listeners(event: js.Symbol): js.Array[js.Function] = js.native
  def off(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  def off(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  def on(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  def on(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  /**
    * Registers a listener function that is triggered when the level is changed.
    * Note: When browserified, this functionality will only be available if the `events` module has been required elsewhere
    * (e.g. if you're using streams in the browser). This allows for a trade-off between bundle size and functionality.
    *
    * @param event: only ever fires the `'level-change'` event
    * @param listener: The listener is passed four arguments: `levelLabel`, `levelValue`, `previousLevelLabel`, `previousLevelValue`.
    */
  @JSName("on")
  def on_levelchange(event: `level-change`, listener: LevelChangeEventListener): this.type = js.native
  def once(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  def once(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  @JSName("once")
  def once_levelchange(event: `level-change`, listener: LevelChangeEventListener): this.type = js.native
  // Added in Node 6...
  def prependListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  def prependListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_levelchange(event: `level-change`, listener: LevelChangeEventListener): this.type = js.native
  def prependOnceListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  def prependOnceListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_levelchange(event: `level-change`, listener: LevelChangeEventListener): this.type = js.native
  def rawListeners(event: String): js.Array[js.Function] = js.native
  def rawListeners(event: js.Symbol): js.Array[js.Function] = js.native
  def removeAllListeners(): this.type = js.native
  def removeAllListeners(event: String): this.type = js.native
  def removeAllListeners(event: js.Symbol): this.type = js.native
  def removeListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  def removeListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_levelchange(event: `level-change`, listener: LevelChangeEventListener): this.type = js.native
  def setMaxListeners(n: Double): this.type = js.native
  /**
    * Log at `'trace'` level the given msg. If the first argument is an object, all its properties will be included in the JSON line.
    * If more args follows `msg`, these will be used to format `msg` using `util.format`.
    *
    * @param obj: object to be serialized
    * @param msg: the log message to write
    * @param ...args: format string values when `msg` is a format string
    */
  def trace(msg: String, args: js.Any*): Unit = js.native
  /**
    * Log at `'trace'` level the given msg. If the first argument is an object, all its properties will be included in the JSON line.
    * If more args follows `msg`, these will be used to format `msg` using `util.format`.
    *
    * @param obj: object to be serialized
    * @param msg: the log message to write
    * @param ...args: format string values when `msg` is a format string
    */
  def trace(obj: js.Object): Unit = js.native
  def trace(obj: js.Object, msg: String, args: js.Any*): Unit = js.native
  /**
    * Log at `'warn'` level the given msg. If the first argument is an object, all its properties will be included in the JSON line.
    * If more args follows `msg`, these will be used to format `msg` using `util.format`.
    *
    * @param obj: object to be serialized
    * @param msg: the log message to write
    * @param ...args: format string values when `msg` is a format string
    */
  def warn(msg: String, args: js.Any*): Unit = js.native
  /**
    * Log at `'warn'` level the given msg. If the first argument is an object, all its properties will be included in the JSON line.
    * If more args follows `msg`, these will be used to format `msg` using `util.format`.
    *
    * @param obj: object to be serialized
    * @param msg: the log message to write
    * @param ...args: format string values when `msg` is a format string
    */
  def warn(obj: js.Object): Unit = js.native
  def warn(obj: js.Object, msg: String, args: js.Any*): Unit = js.native
}

