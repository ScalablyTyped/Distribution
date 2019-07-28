package typings.officeDashJs.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides information about what Requirement Sets are supported in current environment.
  */
@js.native
trait RequirementSetSupport extends js.Object {
  /**
    * Check if the specified requirement set is supported by the host Office application.
    * @param name - Set name; e.g., "MatrixBindings".
    * @param minVersion - The minimum required version; e.g., "1.4". Note: String type is recommended data type for this parameter. The use of number type is deprecated and will not be compatible with recent requirement sets.
    */
  def isSetSupported(name: String): Boolean = js.native
  def isSetSupported(name: String, minVersion: String): Boolean = js.native
  def isSetSupported(name: String, minVersion: Double): Boolean = js.native
}

