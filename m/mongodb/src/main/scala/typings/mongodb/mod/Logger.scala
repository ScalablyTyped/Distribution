package typings.mongodb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mongodb", "Logger")
@js.native
class Logger protected () extends StObject {
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
object Logger {
  
  @JSImport("mongodb", "Logger")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Get the current logger function
    */
  @scala.inline
  def currentLogger(): log = ^.asInstanceOf[js.Dynamic].applyDynamic("currentLogger")().asInstanceOf[log]
  
  /**
    * Set what classes to log.
    */
  @scala.inline
  def filter(`type`: String, values: js.Array[String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(`type`.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Resets the logger to default settings, error and no filtered classes
    */
  @scala.inline
  def reset(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("reset")().asInstanceOf[Unit]
  
  //Set the current logger function
  @scala.inline
  def setCurrentLogger(log: log): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setCurrentLogger")(log.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Set the current log level
    */
  @scala.inline
  def setLevel(level: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setLevel")(level.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
