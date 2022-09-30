package typings.meteor.anon

import org.scalablytyped.runtime.Instantiable1
import typings.mongodb.mod.Logger
import typings.mongodb.mod.LoggerFunction
import typings.mongodb.mod.LoggerLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofLogger
  extends StObject
     with Instantiable1[/* className */ String, Logger] {
  
  /** Get the current logger function */
  def currentLogger(): LoggerFunction = js.native
  
  /**
    * Filter log messages for a particular class
    *
    * @param type - The type of filter (currently only class)
    * @param values - The filters to apply
    */
  def filter(`type`: String, values: js.Array[String]): Unit = js.native
  
  /** Resets the logger to default settings, error and no filtered classes */
  def reset(): Unit = js.native
  
  /**
    * Set the current logger function
    *
    * @param logger - Custom logging function
    */
  def setCurrentLogger(logger: LoggerFunction): Unit = js.native
  
  /**
    * Set the current log level
    *
    * @param newLevel - Set current log level (debug, warn, info, error)
    */
  def setLevel(newLevel: LoggerLevel): Unit = js.native
}
