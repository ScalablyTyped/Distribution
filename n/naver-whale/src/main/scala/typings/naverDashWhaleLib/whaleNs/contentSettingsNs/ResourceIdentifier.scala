package typings
package naverDashWhaleLib.whaleNs.contentSettingsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceIdentifier extends js.Object {
  /** Optional. A human readable description of the resource.  */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /** The resource identifier for the given content type. */
  var id: java.lang.String
}

object ResourceIdentifier {
  @scala.inline
  def apply(id: java.lang.String, description: java.lang.String = null): ResourceIdentifier = {
    val __obj = js.Dynamic.literal(id = id)
    if (description != null) __obj.updateDynamic("description")(description)
    __obj.asInstanceOf[ResourceIdentifier]
  }
}

