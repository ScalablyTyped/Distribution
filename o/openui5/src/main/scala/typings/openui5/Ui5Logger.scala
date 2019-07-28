package typings.openui5

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Ui5Logger extends js.Object {
  //Allows to add a new LogListener that will be notified for new log entries.
  def addLogListener(oListener: js.Any): Unit = js.native
  //Creates a new debug-level entry in the log with the given message, details and calling component.
  def debug(sMessage: String): Unit = js.native
  def debug(sMessage: String, sDetails: String): Unit = js.native
  def debug(sMessage: String, sDetails: String, sComponent: String): Unit = js.native
  //Creates a new error-level entry in the log with the given message, details and calling component.
  def error(sMessage: String): Unit = js.native
  def error(sMessage: String, sDetails: String): Unit = js.native
  def error(sMessage: String, sDetails: String, sComponent: String): Unit = js.native
  //Creates a new fatal-level entry in the log with the given message, details and calling component.
  def fatal(sMessage: String): Unit = js.native
  def fatal(sMessage: String, sDetails: String): Unit = js.native
  def fatal(sMessage: String, sDetails: String, sComponent: String): Unit = js.native
  //Returns the log level currently effective for the given component.
  def getLevel(): Unit = js.native
  def getLevel(sComponent: String): Unit = js.native
  //Returns the logged entries recorded so far as an array.
  def getLogEntries(): Unit = js.native
  //Returns a jQuery.sap.log.Logger for the given component.
  def getLogger(sComponent: String): Unit = js.native
  def getLogger(sComponent: String, iDefaultLogLevel: js.Any): Unit = js.native
  //Creates a new info-level entry in the log with the given message, details and calling component.
  def info(sMessage: String): Unit = js.native
  def info(sMessage: String, sDetails: String): Unit = js.native
  def info(sMessage: String, sDetails: String, sComponent: String): Unit = js.native
  //Checks whether logging is enabled for the given log level, depending on the currently effective log level for the given component.
  def isLoggable(): Unit = js.native
  def isLoggable(iLevel: js.Any): Unit = js.native
  def isLoggable(iLevel: js.Any, sComponent: String): Unit = js.native
  //Allows to remove a registered LogListener.
  def removeLogListener(oListener: js.Any): Unit = js.native
  //Defines the maximum jQuery.sap.log.Level of log entries that will be recorded.
  def setLevel(iLogLevel: js.Any): Unit = js.native
  def setLevel(iLogLevel: js.Any, sComponent: String): Unit = js.native
  //Creates a new trace-level entry in the log with the given message, details and calling component.
  def trace(sMessage: String): Unit = js.native
  def trace(sMessage: String, sDetails: String): Unit = js.native
  def trace(sMessage: String, sDetails: String, sComponent: String): Unit = js.native
  //Creates a new warning-level entry in the log with the given message, details and calling component.
  def warning(sMessage: String): Unit = js.native
  def warning(sMessage: String, sDetails: String): Unit = js.native
  def warning(sMessage: String, sDetails: String, sComponent: String): Unit = js.native
}

