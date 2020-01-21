package typings.officeRuntime.OfficeRuntime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface that contains functions for checking API requirement-set support.
  */
@js.native
trait ApiInformation_ extends js.Object {
  /**
    * Check if the specified requirement set is supported by the host Office application.
    * @param name - Set name; e.g., "MatrixBindings".
    * @param minVersion - The minimum required version; e.g., "1.4".
    */
  def isSetSupported(name: String): Boolean = js.native
  def isSetSupported(name: String, minVersion: String): Boolean = js.native
}

