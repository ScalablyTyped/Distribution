package typings
package pinoLib.pinoMod.PNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseLogger
  extends nodeLib.eventsMod.namespaced {
  /**
    * Holds the current log format version (as output in the v property of each log record).
    */
  val LOG_VERSION: scala.Double = js.native
  /**
    * Define additional logging levels.
    */
  var customLevels: org.scalablytyped.runtime.StringDictionary[scala.Double] = js.native
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
  var level: LevelWithSilent | java.lang.String = js.native
  /**
    * Returns the integer value for the logger instance's logging level.
    */
  var levelVal: scala.Double = js.native
  var levels: LevelMapping = js.native
  /**
    * Exposes the current version of Pino.
    */
  val pino: java.lang.String = js.native
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
  var useLevelLabels: scala.Boolean = js.native
  /**
    * Use only defined `customLevels` and omit Pino's levels.
    */
  var useOnlyCustomLevels: scala.Boolean = js.native
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
  /**
    * Defines a new level on the logger instance. Returns `true` on success and `false` if there was a conflict (level name or number already exists).
    * When using this method, the current level of the logger instance does not change. You must adjust the level with the `level` property after
    * adding your custom level.
    *
    * @param name: defines the method name of the new level
    * @param lvl: value for the level, e.g. `35` is between `info` and `warn`
    * @returns whether level was correctly created or not
    */
  def addLevel(name: java.lang.String, lvl: scala.Double): scala.Boolean = js.native
  @JSName("addListener")
  def `addListener_level-change`(event: pinoLib.pinoLibStrings.`level-change`, listener: LevelChangeEventListener): this.type = js.native
  /**
    * Creates a child logger, setting all key-value pairs in `bindings` as properties in the log lines. All serializers will be applied to the given pair.
    * Child loggers use the same output stream as the parent and inherit the current log level of the parent at the time they are spawned.
    * From v2.x.x the log level of a child is mutable (whereas in v1.x.x it was immutable), and can be set independently of the parent.
    * If a `level` property is present in the object passed to `child` it will override the child logger level.
    *
    * @param bindings: an object of key-value pairs to include in log lines as properties.
    * @returns a child logger instance.
    */
  def child(bindings: pinoLib.Anon_KeyLevel): Logger = js.native
  /**
    * Log at `'debug'` level the given msg. If the first argument is an object, all its properties will be included in the JSON line.
    * If more args follows `msg`, these will be used to format `msg` using `util.format`.
    *
    * @param obj: object to be serialized
    * @param msg: the log message to write
    * @param ...args: format string values when `msg` is a format string
    */
  def debug(msg: java.lang.String, args: js.Any*): scala.Unit = js.native
  /**
    * Log at `'debug'` level the given msg. If the first argument is an object, all its properties will be included in the JSON line.
    * If more args follows `msg`, these will be used to format `msg` using `util.format`.
    *
    * @param obj: object to be serialized
    * @param msg: the log message to write
    * @param ...args: format string values when `msg` is a format string
    */
  def debug(obj: js.Object): scala.Unit = js.native
  def debug(obj: js.Object, msg: java.lang.String, args: js.Any*): scala.Unit = js.native
  /**
    * Log at `'error'` level the given msg. If the first argument is an object, all its properties will be included in the JSON line.
    * If more args follows `msg`, these will be used to format `msg` using `util.format`.
    *
    * @param obj: object to be serialized
    * @param msg: the log message to write
    * @param ...args: format string values when `msg` is a format string
    */
  def error(msg: java.lang.String, args: js.Any*): scala.Unit = js.native
  /**
    * Log at `'error'` level the given msg. If the first argument is an object, all its properties will be included in the JSON line.
    * If more args follows `msg`, these will be used to format `msg` using `util.format`.
    *
    * @param obj: object to be serialized
    * @param msg: the log message to write
    * @param ...args: format string values when `msg` is a format string
    */
  def error(obj: js.Object): scala.Unit = js.native
  def error(obj: js.Object, msg: java.lang.String, args: js.Any*): scala.Unit = js.native
  /**
    * Log at `'fatal'` level the given msg. If the first argument is an object, all its properties will be included in the JSON line.
    * If more args follows `msg`, these will be used to format `msg` using `util.format`.
    *
    * @param obj: object to be serialized
    * @param msg: the log message to write
    * @param ...args: format string values when `msg` is a format string
    */
  def fatal(msg: java.lang.String, args: js.Any*): scala.Unit = js.native
  /**
    * Log at `'fatal'` level the given msg. If the first argument is an object, all its properties will be included in the JSON line.
    * If more args follows `msg`, these will be used to format `msg` using `util.format`.
    *
    * @param obj: object to be serialized
    * @param msg: the log message to write
    * @param ...args: format string values when `msg` is a format string
    */
  def fatal(obj: js.Object): scala.Unit = js.native
  def fatal(obj: js.Object, msg: java.lang.String, args: js.Any*): scala.Unit = js.native
  /**
    * Flushes the content of the buffer in extreme mode. It has no effect if extreme mode is not enabled.
    */
  def flush(): scala.Unit = js.native
  /**
    * Log at `'info'` level the given msg. If the first argument is an object, all its properties will be included in the JSON line.
    * If more args follows `msg`, these will be used to format `msg` using `util.format`.
    *
    * @param obj: object to be serialized
    * @param msg: the log message to write
    * @param ...args: format string values when `msg` is a format string
    */
  def info(msg: java.lang.String, args: js.Any*): scala.Unit = js.native
  /**
    * Log at `'info'` level the given msg. If the first argument is an object, all its properties will be included in the JSON line.
    * If more args follows `msg`, these will be used to format `msg` using `util.format`.
    *
    * @param obj: object to be serialized
    * @param msg: the log message to write
    * @param ...args: format string values when `msg` is a format string
    */
  def info(obj: js.Object): scala.Unit = js.native
  def info(obj: js.Object, msg: java.lang.String, args: js.Any*): scala.Unit = js.native
  def isLevelEnabled(level: java.lang.String): scala.Boolean = js.native
  /**
    * A utility method for determining if a given log level will write to the destination.
    */
  def isLevelEnabled(level: LevelWithSilent): scala.Boolean = js.native
  /**
    * Registers a listener function that is triggered when the level is changed.
    * Note: When browserified, this functionality will only be available if the `events` module has been required elsewhere
    * (e.g. if you're using streams in the browser). This allows for a trade-off between bundle size and functionality.
    *
    * @param event: only ever fires the `'level-change'` event
    * @param listener: The listener is passed four arguments: `levelLabel`, `levelValue`, `previousLevelLabel`, `previousLevelValue`.
    */
  @JSName("on")
  def `on_level-change`(event: pinoLib.pinoLibStrings.`level-change`, listener: LevelChangeEventListener): this.type = js.native
  @JSName("once")
  def `once_level-change`(event: pinoLib.pinoLibStrings.`level-change`, listener: LevelChangeEventListener): this.type = js.native
  @JSName("prependListener")
  def `prependListener_level-change`(event: pinoLib.pinoLibStrings.`level-change`, listener: LevelChangeEventListener): this.type = js.native
  @JSName("prependOnceListener")
  def `prependOnceListener_level-change`(event: pinoLib.pinoLibStrings.`level-change`, listener: LevelChangeEventListener): this.type = js.native
  @JSName("removeListener")
  def `removeListener_level-change`(event: pinoLib.pinoLibStrings.`level-change`, listener: LevelChangeEventListener): this.type = js.native
  /**
    * Log at `'trace'` level the given msg. If the first argument is an object, all its properties will be included in the JSON line.
    * If more args follows `msg`, these will be used to format `msg` using `util.format`.
    *
    * @param obj: object to be serialized
    * @param msg: the log message to write
    * @param ...args: format string values when `msg` is a format string
    */
  def trace(msg: java.lang.String, args: js.Any*): scala.Unit = js.native
  /**
    * Log at `'trace'` level the given msg. If the first argument is an object, all its properties will be included in the JSON line.
    * If more args follows `msg`, these will be used to format `msg` using `util.format`.
    *
    * @param obj: object to be serialized
    * @param msg: the log message to write
    * @param ...args: format string values when `msg` is a format string
    */
  def trace(obj: js.Object): scala.Unit = js.native
  def trace(obj: js.Object, msg: java.lang.String, args: js.Any*): scala.Unit = js.native
  /**
    * Log at `'warn'` level the given msg. If the first argument is an object, all its properties will be included in the JSON line.
    * If more args follows `msg`, these will be used to format `msg` using `util.format`.
    *
    * @param obj: object to be serialized
    * @param msg: the log message to write
    * @param ...args: format string values when `msg` is a format string
    */
  def warn(msg: java.lang.String, args: js.Any*): scala.Unit = js.native
  /**
    * Log at `'warn'` level the given msg. If the first argument is an object, all its properties will be included in the JSON line.
    * If more args follows `msg`, these will be used to format `msg` using `util.format`.
    *
    * @param obj: object to be serialized
    * @param msg: the log message to write
    * @param ...args: format string values when `msg` is a format string
    */
  def warn(obj: js.Object): scala.Unit = js.native
  def warn(obj: js.Object, msg: java.lang.String, args: js.Any*): scala.Unit = js.native
}

