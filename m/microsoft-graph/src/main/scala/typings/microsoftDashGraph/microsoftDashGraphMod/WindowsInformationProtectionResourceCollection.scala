package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WindowsInformationProtectionResourceCollection extends js.Object {
  // Display name
  var displayName: js.UndefOr[String] = js.undefined
  // Collection of resources
  var resources: js.UndefOr[js.Array[String]] = js.undefined
}

object WindowsInformationProtectionResourceCollection {
  @scala.inline
  def apply(displayName: String = null, resources: js.Array[String] = null): WindowsInformationProtectionResourceCollection = {
    val __obj = js.Dynamic.literal()
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (resources != null) __obj.updateDynamic("resources")(resources.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowsInformationProtectionResourceCollection]
  }
}

