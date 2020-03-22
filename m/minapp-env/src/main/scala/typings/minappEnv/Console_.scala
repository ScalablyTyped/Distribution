package typings.minappEnv

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Console_ extends js.Object {
  def assert(): Unit = js.native
  def assert(test: scala.Boolean): Unit = js.native
  def assert(test: scala.Boolean, message: java.lang.String, optionalParams: js.Any*): Unit = js.native
  def clear(): Unit = js.native
  def count(): Unit = js.native
  def count(countTitle: java.lang.String): Unit = js.native
  def debug(): Unit = js.native
  def debug(message: js.Any, optionalParams: js.Any*): Unit = js.native
  def dir(): Unit = js.native
  def dir(value: js.Any, optionalParams: js.Any*): Unit = js.native
  def dirxml(value: js.Any): Unit = js.native
  def error(): Unit = js.native
  def error(message: js.Any, optionalParams: js.Any*): Unit = js.native
  def exception(): Unit = js.native
  def exception(message: java.lang.String, optionalParams: js.Any*): Unit = js.native
  def group(): Unit = js.native
  def group(groupTitle: java.lang.String, optionalParams: js.Any*): Unit = js.native
  def groupCollapsed(): Unit = js.native
  def groupCollapsed(groupTitle: java.lang.String, optionalParams: js.Any*): Unit = js.native
  def groupEnd(): Unit = js.native
  def info(): Unit = js.native
  def info(message: js.Any, optionalParams: js.Any*): Unit = js.native
  def log(): Unit = js.native
  def log(message: js.Any, optionalParams: js.Any*): Unit = js.native
  def profile(): Unit = js.native
  def profile(reportName: java.lang.String): Unit = js.native
  def profileEnd(): Unit = js.native
  def table(data: js.Any*): Unit = js.native
  def time(): Unit = js.native
  def time(timerName: java.lang.String): Unit = js.native
  def timeEnd(): Unit = js.native
  def timeEnd(timerName: java.lang.String): Unit = js.native
  def trace(): Unit = js.native
  def trace(message: js.Any, optionalParams: js.Any*): Unit = js.native
  def warn(): Unit = js.native
  def warn(message: js.Any, optionalParams: js.Any*): Unit = js.native
}

@JSGlobal("Console")
@js.native
object Console_ extends Instantiable0[Console_]

