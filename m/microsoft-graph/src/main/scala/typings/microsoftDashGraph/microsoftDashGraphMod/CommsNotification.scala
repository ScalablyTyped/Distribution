package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommsNotification extends js.Object {
  var changeType: js.UndefOr[ChangeType] = js.undefined
  var resourceUrl: js.UndefOr[String] = js.undefined
}

object CommsNotification {
  @scala.inline
  def apply(changeType: ChangeType = null, resourceUrl: String = null): CommsNotification = {
    val __obj = js.Dynamic.literal()
    if (changeType != null) __obj.updateDynamic("changeType")(changeType)
    if (resourceUrl != null) __obj.updateDynamic("resourceUrl")(resourceUrl)
    __obj.asInstanceOf[CommsNotification]
  }
}

