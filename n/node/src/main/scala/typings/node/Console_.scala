package typings.node

import typings.node.NodeJS.ConsoleConstructor
import typings.node.NodeJS.InspectOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Console_ extends js.Object {
  var Console: ConsoleConstructor = js.native
  /**
    * A simple assertion test that verifies whether `value` is truthy.
    * If it is not, an `AssertionError` is thrown.
    * If provided, the error `message` is formatted using `util.format()` and used as the error message.
    */
  def assert(value: js.Any): Unit = js.native
  def assert(value: js.Any, message: java.lang.String, optionalParams: js.Any*): Unit = js.native
  /**
    * When `stdout` is a TTY, calling `console.clear()` will attempt to clear the TTY.
    * When `stdout` is not a TTY, this method does nothing.
    */
  def clear(): Unit = js.native
  /**
    * Maintains an internal counter specific to `label` and outputs to `stdout` the number of times `console.count()` has been called with the given `label`.
    */
  def count(): Unit = js.native
  def count(label: java.lang.String): Unit = js.native
  /**
    * Resets the internal counter specific to `label`.
    */
  def countReset(): Unit = js.native
  def countReset(label: java.lang.String): Unit = js.native
  /**
    * The `console.debug()` function is an alias for {@link console.log()}.
    */
  def debug(): Unit = js.native
  def debug(message: js.Any, optionalParams: js.Any*): Unit = js.native
  /**
    * Uses {@link util.inspect()} on `obj` and prints the resulting string to `stdout`.
    * This function bypasses any custom `inspect()` function defined on `obj`.
    */
  def dir(obj: js.Any): Unit = js.native
  def dir(obj: js.Any, options: InspectOptions): Unit = js.native
  /**
    * This method calls {@link console.log()} passing it the arguments received. Please note that this method does not produce any XML formatting
    */
  def dirxml(data: js.Any*): Unit = js.native
  /**
    * Prints to `stderr` with newline.
    */
  def error(): Unit = js.native
  def error(message: js.Any, optionalParams: js.Any*): Unit = js.native
  /**
    * Increases indentation of subsequent lines by two spaces.
    * If one or more `label`s are provided, those are printed first without the additional indentation.
    */
  def group(label: js.Any*): Unit = js.native
  /**
    * The `console.groupCollapsed()` function is an alias for {@link console.group()}.
    */
  def groupCollapsed(label: js.Any*): Unit = js.native
  /**
    * Decreases indentation of subsequent lines by two spaces.
    */
  def groupEnd(): Unit = js.native
  /**
    * The {@link console.info()} function is an alias for {@link console.log()}.
    */
  def info(): Unit = js.native
  def info(message: js.Any, optionalParams: js.Any*): Unit = js.native
  /**
    * Prints to `stdout` with newline.
    */
  def log(): Unit = js.native
  def log(message: js.Any, optionalParams: js.Any*): Unit = js.native
  // --- Inspector mode only ---
  /**
    * This method does not display anything unless used in the inspector.
    *  Starts a JavaScript CPU profile with an optional label.
    */
  def profile(): Unit = js.native
  def profile(label: java.lang.String): Unit = js.native
  /**
    * This method does not display anything unless used in the inspector.
    *  Stops the current JavaScript CPU profiling session if one has been started and prints the report to the Profiles panel of the inspector.
    */
  def profileEnd(): Unit = js.native
  def profileEnd(label: java.lang.String): Unit = js.native
  /**
    * This method does not display anything unless used in the inspector.
    *  Prints to `stdout` the array `array` formatted as a table.
    */
  def table(tabularData: js.Any): Unit = js.native
  def table(tabularData: js.Any, properties: js.Array[java.lang.String]): Unit = js.native
  /**
    * Starts a timer that can be used to compute the duration of an operation. Timers are identified by a unique `label`.
    */
  def time(): Unit = js.native
  def time(label: java.lang.String): Unit = js.native
  /**
    * Stops a timer that was previously started by calling {@link console.time()} and prints the result to `stdout`.
    */
  def timeEnd(): Unit = js.native
  def timeEnd(label: java.lang.String): Unit = js.native
  /**
    * For a timer that was previously started by calling {@link console.time()}, prints the elapsed time and other `data` arguments to `stdout`.
    */
  def timeLog(): Unit = js.native
  def timeLog(label: java.lang.String, data: js.Any*): Unit = js.native
  /**
    * This method does not display anything unless used in the inspector.
    *  Adds an event with the label `label` to the Timeline panel of the inspector.
    */
  def timeStamp(): Unit = js.native
  def timeStamp(label: java.lang.String): Unit = js.native
  /**
    * Prints to `stderr` the string 'Trace :', followed by the {@link util.format()} formatted message and stack trace to the current position in the code.
    */
  def trace(): Unit = js.native
  def trace(message: js.Any, optionalParams: js.Any*): Unit = js.native
  /**
    * The {@link console.warn()} function is an alias for {@link console.error()}.
    */
  def warn(): Unit = js.native
  def warn(message: js.Any, optionalParams: js.Any*): Unit = js.native
}

