package typings
package officeDashJsLib.OfficeExtensionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains debug information about the request context. */
trait RequestContextDebugInfo extends js.Object {
  /**
    * The statements to be executed in the host.
    *
    * These statements may not match the code exactly as written, but will be a close approximation.
    */
  var pendingStatements: js.Array[java.lang.String]
}

object RequestContextDebugInfo {
  @scala.inline
  def apply(pendingStatements: js.Array[java.lang.String]): RequestContextDebugInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("pendingStatements")(pendingStatements)
    __obj.asInstanceOf[RequestContextDebugInfo]
  }
}

