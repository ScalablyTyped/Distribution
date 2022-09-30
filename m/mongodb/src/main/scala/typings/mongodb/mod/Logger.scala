package typings.mongodb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mongodb", "Logger")
@js.native
open class Logger protected () extends StObject {
  /**
    * Creates a new Logger instance
    *
    * @param className - The Class name associated with the logging instance
    * @param options - Optional logging settings
    */
  def this(className: String) = this()
  def this(className: String, options: LoggerOptions) = this()
  
  var className: String = js.native
  
  /**
    * Log a message at the debug level
    *
    * @param message - The message to log
    * @param object - Additional meta data to log
    */
  def debug(message: String): Unit = js.native
  def debug(message: String, `object`: Any): Unit = js.native
  
  /**
    * Log a message at the error level
    *
    * @param message - The message to log
    * @param object - Additional meta data to log
    */
  def error(message: String): Unit = js.native
  def error(message: String, `object`: Any): Unit = js.native
  
  /**
    * Log a message at the info level
    *
    * @param message - The message to log
    * @param object - Additional meta data to log
    */
  def info(message: String): Unit = js.native
  def info(message: String, `object`: Any): Unit = js.native
  
  /** Is the logger set at debug level */
  def isDebug(): Boolean = js.native
  
  /** Is the logger set at error level */
  def isError(): Boolean = js.native
  
  /** Is the logger set at info level */
  def isInfo(): Boolean = js.native
  
  /** Is the logger set at error level */
  def isWarn(): Boolean = js.native
  
  /**
    * Log a message at the warn level
    *
    * @param message - The message to log
    * @param object - Additional meta data to log
    */
  def warn(message: String): Unit = js.native
  def warn(message: String, `object`: Any): Unit = js.native
}
/* static members */
object Logger {
  
  @JSImport("mongodb", "Logger")
  @js.native
  val ^ : js.Any = js.native
  
  /** Get the current logger function */
  inline def currentLogger(): LoggerFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("currentLogger")().asInstanceOf[LoggerFunction]
  
  /**
    * Filter log messages for a particular class
    *
    * @param type - The type of filter (currently only class)
    * @param values - The filters to apply
    */
  inline def filter(`type`: String, values: js.Array[String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(`type`.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** Resets the logger to default settings, error and no filtered classes */
  inline def reset(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("reset")().asInstanceOf[Unit]
  
  /**
    * Set the current logger function
    *
    * @param logger - Custom logging function
    */
  inline def setCurrentLogger(logger: LoggerFunction): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setCurrentLogger")(logger.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Set the current log level
    *
    * @param newLevel - Set current log level (debug, warn, info, error)
    */
  inline def setLevel(newLevel: LoggerLevel): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setLevel")(newLevel.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
