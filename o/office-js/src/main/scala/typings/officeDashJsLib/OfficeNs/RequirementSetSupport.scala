package typings
package officeDashJsLib.OfficeNs

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
    * @param minVersion - The minimum required version; e.g., "1.4".
    */
  def isSetSupported(name: java.lang.String): scala.Boolean = js.native
  def isSetSupported(name: java.lang.String, minVersion: scala.Double): scala.Boolean = js.native
}

