package typings.mongoose

import org.scalablytyped.runtime.Instantiable1
import typings.mongodb.mod.Logger
import typings.mongodb.mod.log
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofLogger extends Instantiable1[/* className */ String, Logger] {
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

