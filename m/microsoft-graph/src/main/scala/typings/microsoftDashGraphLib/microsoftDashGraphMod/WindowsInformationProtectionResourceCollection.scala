package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WindowsInformationProtectionResourceCollection extends js.Object {
  /** Display name */
  var displayName: js.UndefOr[java.lang.String] = js.undefined
  /** Collection of resources */
  var resources: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object WindowsInformationProtectionResourceCollection {
  @scala.inline
  def apply(displayName: java.lang.String = null, resources: js.Array[java.lang.String] = null): WindowsInformationProtectionResourceCollection = {
    val __obj = js.Dynamic.literal()
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (resources != null) __obj.updateDynamic("resources")(resources)
    __obj.asInstanceOf[WindowsInformationProtectionResourceCollection]
  }
}

