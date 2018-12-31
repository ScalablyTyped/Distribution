package typings
package mongodbLib.mongodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mongodb", "Logger")
@js.native
class Logger protected () extends js.Object {
  def this(className: java.lang.String) = this()
  def this(className: java.lang.String, options: LoggerOptions) = this()
  /**
    * Log a message at the debug level
    */
  def debug(message: java.lang.String, state: LoggerState): scala.Unit = js.native
  /**
    * Log a message at the error level
    */
  def error(message: java.lang.String, state: LoggerState): scala.Unit = js.native
  /**
    * Log a message at the info level
    */
  def info(message: java.lang.String, state: LoggerState): scala.Unit = js.native
  /**
    * Is the logger set at debug level
    */
  def isDebug(): scala.Boolean = js.native
  /**
    * Is the logger set at error level
    */
  def isError(): scala.Boolean = js.native
  /**
    * Is the logger set at info level
    */
  def isInfo(): scala.Boolean = js.native
  /**
    * Is the logger set at error level
    */
  def isWarn(): scala.Boolean = js.native
  /**
    * Log a message at the warn level
    */
  def warn(message: java.lang.String, state: LoggerState): scala.Unit = js.native
}

@JSImport("mongodb", "Logger")
@js.native
object Logger extends js.Object {
  /**
    * Get the current logger function
    */
  def currentLogger(): mongodbLib.mongodbMod.log = js.native
  /**
    * Set what classes to log.
    */
  def filter(`type`: java.lang.String, values: js.Array[java.lang.String]): scala.Unit = js.native
  /**
    * Resets the logger to default settings, error and no filtered classes
    */
  def reset(): scala.Unit = js.native
  //Set the current logger function
  def setCurrentLogger(log: mongodbLib.mongodbMod.log): scala.Unit = js.native
  /**
    * Set the current log level
    */
  def setLevel(level: java.lang.String): scala.Unit = js.native
}

