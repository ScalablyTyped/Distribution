package typings
package openui5Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Ui5Logger extends js.Object {
  //Allows to add a new LogListener that will be notified for new log entries.
  def addLogListener(oListener: js.Any): scala.Unit = js.native
  //Creates a new debug-level entry in the log with the given message, details and calling component.
  def debug(sMessage: java.lang.String): scala.Unit = js.native
  //Creates a new debug-level entry in the log with the given message, details and calling component.
  def debug(sMessage: java.lang.String, sDetails: java.lang.String): scala.Unit = js.native
  //Creates a new debug-level entry in the log with the given message, details and calling component.
  def debug(sMessage: java.lang.String, sDetails: java.lang.String, sComponent: java.lang.String): scala.Unit = js.native
  //Creates a new error-level entry in the log with the given message, details and calling component.
  def error(sMessage: java.lang.String): scala.Unit = js.native
  //Creates a new error-level entry in the log with the given message, details and calling component.
  def error(sMessage: java.lang.String, sDetails: java.lang.String): scala.Unit = js.native
  //Creates a new error-level entry in the log with the given message, details and calling component.
  def error(sMessage: java.lang.String, sDetails: java.lang.String, sComponent: java.lang.String): scala.Unit = js.native
  //Creates a new fatal-level entry in the log with the given message, details and calling component.
  def fatal(sMessage: java.lang.String): scala.Unit = js.native
  //Creates a new fatal-level entry in the log with the given message, details and calling component.
  def fatal(sMessage: java.lang.String, sDetails: java.lang.String): scala.Unit = js.native
  //Creates a new fatal-level entry in the log with the given message, details and calling component.
  def fatal(sMessage: java.lang.String, sDetails: java.lang.String, sComponent: java.lang.String): scala.Unit = js.native
  //Returns the log level currently effective for the given component.
  def getLevel(): scala.Unit = js.native
  //Returns the log level currently effective for the given component.
  def getLevel(sComponent: java.lang.String): scala.Unit = js.native
  //Returns the logged entries recorded so far as an array.
  def getLogEntries(): scala.Unit = js.native
  //Returns a jQuery.sap.log.Logger for the given component.
  def getLogger(sComponent: java.lang.String): scala.Unit = js.native
  //Returns a jQuery.sap.log.Logger for the given component.
  def getLogger(sComponent: java.lang.String, iDefaultLogLevel: js.Any): scala.Unit = js.native
  //Creates a new info-level entry in the log with the given message, details and calling component.
  def info(sMessage: java.lang.String): scala.Unit = js.native
  //Creates a new info-level entry in the log with the given message, details and calling component.
  def info(sMessage: java.lang.String, sDetails: java.lang.String): scala.Unit = js.native
  //Creates a new info-level entry in the log with the given message, details and calling component.
  def info(sMessage: java.lang.String, sDetails: java.lang.String, sComponent: java.lang.String): scala.Unit = js.native
  //Checks whether logging is enabled for the given log level, depending on the currently effective log level for the given component.
  def isLoggable(): scala.Unit = js.native
  //Checks whether logging is enabled for the given log level, depending on the currently effective log level for the given component.
  def isLoggable(iLevel: js.Any): scala.Unit = js.native
  //Checks whether logging is enabled for the given log level, depending on the currently effective log level for the given component.
  def isLoggable(iLevel: js.Any, sComponent: java.lang.String): scala.Unit = js.native
  //Allows to remove a registered LogListener.
  def removeLogListener(oListener: js.Any): scala.Unit = js.native
  //Defines the maximum jQuery.sap.log.Level of log entries that will be recorded.
  def setLevel(iLogLevel: js.Any): scala.Unit = js.native
  //Defines the maximum jQuery.sap.log.Level of log entries that will be recorded.
  def setLevel(iLogLevel: js.Any, sComponent: java.lang.String): scala.Unit = js.native
  //Creates a new trace-level entry in the log with the given message, details and calling component.
  def trace(sMessage: java.lang.String): scala.Unit = js.native
  //Creates a new trace-level entry in the log with the given message, details and calling component.
  def trace(sMessage: java.lang.String, sDetails: java.lang.String): scala.Unit = js.native
  //Creates a new trace-level entry in the log with the given message, details and calling component.
  def trace(sMessage: java.lang.String, sDetails: java.lang.String, sComponent: java.lang.String): scala.Unit = js.native
  //Creates a new warning-level entry in the log with the given message, details and calling component.
  def warning(sMessage: java.lang.String): scala.Unit = js.native
  //Creates a new warning-level entry in the log with the given message, details and calling component.
  def warning(sMessage: java.lang.String, sDetails: java.lang.String): scala.Unit = js.native
  //Creates a new warning-level entry in the log with the given message, details and calling component.
  def warning(sMessage: java.lang.String, sDetails: java.lang.String, sComponent: java.lang.String): scala.Unit = js.native
}

