package typings.mongodb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mongodb", "Logger")
@js.native
class Logger protected () extends js.Object {
  def this(className: String) = this()
  def this(className: String, options: LoggerOptions) = this()
  /**
    * Log a message at the debug level
    */
  def debug(message: String, state: LoggerState): Unit = js.native
  /**
    * Log a message at the error level
    */
  def error(message: String, state: LoggerState): Unit = js.native
  /**
    * Log a message at the info level
    */
  def info(message: String, state: LoggerState): Unit = js.native
  /**
    * Is the logger set at debug level
    */
  def isDebug(): Boolean = js.native
  /**
    * Is the logger set at error level
    */
  def isError(): Boolean = js.native
  /**
    * Is the logger set at info level
    */
  def isInfo(): Boolean = js.native
  /**
    * Is the logger set at error level
    */
  def isWarn(): Boolean = js.native
  /**
    * Log a message at the warn level
    */
  def warn(message: String, state: LoggerState): Unit = js.native
}

/* static members */
@JSImport("mongodb", "Logger")
@js.native
object Logger extends js.Object {
  /**
    * Get the current logger function
    */
  def currentLogger(): log = js.native
  /**
    * Set what classes to log.
    */
  def filter(`type`: String, values: js.Array[String]): Unit = js.native
  /**
    * Resets the logger to default settings, error and no filtered classes
    */
  def reset(): Unit = js.native
  //Set the current logger function
  def setCurrentLogger(log: log): Unit = js.native
  /**
    * Set the current log level
    */
  def setLevel(level: String): Unit = js.native
}

