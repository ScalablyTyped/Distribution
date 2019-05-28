package typings
package mongooseLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofClassLogger
  extends org.scalablytyped.runtime.Instantiable1[/* className */ java.lang.String, mongodbLib.mongodbMod.Logger] {
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

