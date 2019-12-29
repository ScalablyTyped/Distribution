package typings.node.NodeJS

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProcessReport extends js.Object {
  /**
    * Directory where the report is written.
    * working directory of the Node.js process.
    * @default '' indicating that reports are written to the current
    */
  var directory: String = js.native
  /**
    * Filename where the report is written.
    * The default value is the empty string.
    * @default '' the output filename will be comprised of a timestamp,
    * PID, and sequence number.
    */
  var filename: String = js.native
  /**
    * If true, a diagnostic report is generated on fatal errors,
    * such as out of memory errors or failed C++ assertions.
    * @default false
    */
  var reportOnFatalError: Boolean = js.native
  /**
    * If true, a diagnostic report is generated when the process
    * receives the signal specified by process.report.signal.
    * @defaul false
    */
  var reportOnSignal: Boolean = js.native
  /**
    * If true, a diagnostic report is generated on uncaught exception.
    * @default false
    */
  var reportOnUncaughtException: Boolean = js.native
  /**
    * The signal used to trigger the creation of a diagnostic report.
    * @default 'SIGUSR2'
    */
  var signal: Signals = js.native
  /**
    * Returns a JSON-formatted diagnostic report for the running process.
    * The report's JavaScript stack trace is taken from err, if present.
    */
  def getReport(): String = js.native
  def getReport(err: Error): String = js.native
  /**
    * Writes a diagnostic report to a file. If filename is not provided, the default filename
    * includes the date, time, PID, and a sequence number.
    * The report's JavaScript stack trace is taken from err, if present.
    *
    * @param fileName Name of the file where the report is written.
    * This should be a relative path, that will be appended to the directory specified in
    * `process.report.directory`, or the current working directory of the Node.js process,
    * if unspecified.
    * @param error A custom error used for reporting the JavaScript stack.
    * @return Filename of the generated report.
    */
  def writeReport(): String = js.native
  def writeReport(error: Error): String = js.native
  def writeReport(fileName: String): String = js.native
  def writeReport(fileName: String, err: Error): String = js.native
}

