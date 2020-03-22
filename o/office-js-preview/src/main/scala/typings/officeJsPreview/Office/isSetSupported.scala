package typings.officeJsPreview.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Office.isSetSupported")
@js.native
object isSetSupported extends js.Object {
  /**
    * Checks if the specified requirement set is supported by the host Office application.
    * @param name - Set name; e.g., "MatrixBindings".
    * @param minVersion - The minimum required version; e.g., "1.4".
    */
  def apply(name: String): Boolean = js.native
  def apply(name: String, minVersion: String): Boolean = js.native
}

