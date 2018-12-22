package typings
package nodeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// This needs to be global to avoid TS2403 in case lib.dom.d.ts is present in the same build
@js.native
trait Console extends js.Object {
  var Console: nodeLib.NodeJSNs.ConsoleConstructor = js.native
  /**
       * A simple assertion test that verifies whether `value` is truthy.
       * If it is not, an `AssertionError` is thrown.
       * If provided, the error `message` is formatted using `util.format()` and used as the error message.
       */
  def assert(value: js.Any): scala.Unit = js.native
  /**
       * A simple assertion test that verifies whether `value` is truthy.
       * If it is not, an `AssertionError` is thrown.
       * If provided, the error `message` is formatted using `util.format()` and used as the error message.
       */
  def assert(value: js.Any, message: java.lang.String, optionalParams: js.Any*): scala.Unit = js.native
  /**
       * When `stdout` is a TTY, calling `console.clear()` will attempt to clear the TTY.
       * When `stdout` is not a TTY, this method does nothing.
       */
  def clear(): scala.Unit = js.native
  /**
       * Maintains an internal counter specific to `label` and outputs to `stdout` the number of times `console.count()` has been called with the given `label`.
       */
  def count(): scala.Unit = js.native
  /**
       * Maintains an internal counter specific to `label` and outputs to `stdout` the number of times `console.count()` has been called with the given `label`.
       */
  def count(label: java.lang.String): scala.Unit = js.native
  /**
       * Resets the internal counter specific to `label`.
       */
  def countReset(): scala.Unit = js.native
  /**
       * Resets the internal counter specific to `label`.
       */
  def countReset(label: java.lang.String): scala.Unit = js.native
  /**
       * The `console.debug()` function is an alias for {@link console.log()}.
       */
  def debug(): scala.Unit = js.native
  /**
       * The `console.debug()` function is an alias for {@link console.log()}.
       */
  def debug(message: js.Any, optionalParams: js.Any*): scala.Unit = js.native
  /**
       * Uses {@link util.inspect()} on `obj` and prints the resulting string to `stdout`.
       * This function bypasses any custom `inspect()` function defined on `obj`.
       */
  def dir(obj: js.Any): scala.Unit = js.native
  /**
       * Uses {@link util.inspect()} on `obj` and prints the resulting string to `stdout`.
       * This function bypasses any custom `inspect()` function defined on `obj`.
       */
  def dir(obj: js.Any, options: nodeLib.NodeJSNs.InspectOptions): scala.Unit = js.native
  /**
       * This method calls {@link console.log()} passing it the arguments received. Please note that this method does not produce any XML formatting
       */
  def dirxml(data: js.Any*): scala.Unit = js.native
  /**
       * Prints to `stderr` with newline.
       */
  def error(): scala.Unit = js.native
  /**
       * Prints to `stderr` with newline.
       */
  def error(message: js.Any, optionalParams: js.Any*): scala.Unit = js.native
  /**
       * Increases indentation of subsequent lines by two spaces.
       * If one or more `label`s are provided, those are printed first without the additional indentation.
       */
  def group(label: js.Any*): scala.Unit = js.native
  /**
       * The `console.groupCollapsed()` function is an alias for {@link console.group()}.
       */
  def groupCollapsed(): scala.Unit = js.native
  /**
       * Decreases indentation of subsequent lines by two spaces.
       */
  def groupEnd(): scala.Unit = js.native
  /**
       * The {@link console.info()} function is an alias for {@link console.log()}.
       */
  def info(): scala.Unit = js.native
  /**
       * The {@link console.info()} function is an alias for {@link console.log()}.
       */
  def info(message: js.Any, optionalParams: js.Any*): scala.Unit = js.native
  /**
       * Prints to `stdout` with newline.
       */
  def log(): scala.Unit = js.native
  /**
       * Prints to `stdout` with newline.
       */
  def log(message: js.Any, optionalParams: js.Any*): scala.Unit = js.native
  // --- Inspector mode only ---
  /**
       * This method does not display anything unless used in the inspector.
       *  The console.markTimeline() method is the deprecated form of console.timeStamp().
       *
       * @deprecated Use console.timeStamp() instead.
       */
  def markTimeline(): scala.Unit = js.native
  // --- Inspector mode only ---
  /**
       * This method does not display anything unless used in the inspector.
       *  The console.markTimeline() method is the deprecated form of console.timeStamp().
       *
       * @deprecated Use console.timeStamp() instead.
       */
  def markTimeline(label: java.lang.String): scala.Unit = js.native
  /**
       * This method does not display anything unless used in the inspector.
       *  Starts a JavaScript CPU profile with an optional label.
       */
  def profile(): scala.Unit = js.native
  /**
       * This method does not display anything unless used in the inspector.
       *  Starts a JavaScript CPU profile with an optional label.
       */
  def profile(label: java.lang.String): scala.Unit = js.native
  /**
       * This method does not display anything unless used in the inspector.
       *  Stops the current JavaScript CPU profiling session if one has been started and prints the report to the Profiles panel of the inspector.
       */
  def profileEnd(): scala.Unit = js.native
  /**
       * This method does not display anything unless used in the inspector.
       *  Stops the current JavaScript CPU profiling session if one has been started and prints the report to the Profiles panel of the inspector.
       */
  def profileEnd(label: java.lang.String): scala.Unit = js.native
  /**
       * This method does not display anything unless used in the inspector.
       *  Prints to `stdout` the array `array` formatted as a table.
       */
  def table(tabularData: js.Any): scala.Unit = js.native
  /**
       * This method does not display anything unless used in the inspector.
       *  Prints to `stdout` the array `array` formatted as a table.
       */
  def table(tabularData: js.Any, properties: js.Array[java.lang.String]): scala.Unit = js.native
  /**
       * Starts a timer that can be used to compute the duration of an operation. Timers are identified by a unique `label`.
       */
  def time(): scala.Unit = js.native
  /**
       * Starts a timer that can be used to compute the duration of an operation. Timers are identified by a unique `label`.
       */
  def time(label: java.lang.String): scala.Unit = js.native
  /**
       * Stops a timer that was previously started by calling {@link console.time()} and prints the result to `stdout`.
       */
  def timeEnd(): scala.Unit = js.native
  /**
       * Stops a timer that was previously started by calling {@link console.time()} and prints the result to `stdout`.
       */
  def timeEnd(label: java.lang.String): scala.Unit = js.native
  /**
       * For a timer that was previously started by calling {@link console.time()}, prints the elapsed time and other `data` arguments to `stdout`.
       */
  def timeLog(): scala.Unit = js.native
  /**
       * For a timer that was previously started by calling {@link console.time()}, prints the elapsed time and other `data` arguments to `stdout`.
       */
  def timeLog(label: java.lang.String, data: js.Any*): scala.Unit = js.native
  /**
       * This method does not display anything unless used in the inspector.
       *  Adds an event with the label `label` to the Timeline panel of the inspector.
       */
  def timeStamp(): scala.Unit = js.native
  /**
       * This method does not display anything unless used in the inspector.
       *  Adds an event with the label `label` to the Timeline panel of the inspector.
       */
  def timeStamp(label: java.lang.String): scala.Unit = js.native
  /**
       * This method does not display anything unless used in the inspector.
       *  The console.timeline() method is the deprecated form of console.time().
       *
       * @deprecated Use console.time() instead.
       */
  def timeline(): scala.Unit = js.native
  /**
       * This method does not display anything unless used in the inspector.
       *  The console.timeline() method is the deprecated form of console.time().
       *
       * @deprecated Use console.time() instead.
       */
  def timeline(label: java.lang.String): scala.Unit = js.native
  /**
       * This method does not display anything unless used in the inspector.
       *  The console.timelineEnd() method is the deprecated form of console.timeEnd().
       *
       * @deprecated Use console.timeEnd() instead.
       */
  def timelineEnd(): scala.Unit = js.native
  /**
       * This method does not display anything unless used in the inspector.
       *  The console.timelineEnd() method is the deprecated form of console.timeEnd().
       *
       * @deprecated Use console.timeEnd() instead.
       */
  def timelineEnd(label: java.lang.String): scala.Unit = js.native
  /**
       * Prints to `stderr` the string 'Trace :', followed by the {@link util.format()} formatted message and stack trace to the current position in the code.
       */
  def trace(): scala.Unit = js.native
  /**
       * Prints to `stderr` the string 'Trace :', followed by the {@link util.format()} formatted message and stack trace to the current position in the code.
       */
  def trace(message: js.Any, optionalParams: js.Any*): scala.Unit = js.native
  /**
       * The {@link console.warn()} function is an alias for {@link console.error()}.
       */
  def warn(): scala.Unit = js.native
  /**
       * The {@link console.warn()} function is an alias for {@link console.error()}.
       */
  def warn(message: js.Any, optionalParams: js.Any*): scala.Unit = js.native
}

