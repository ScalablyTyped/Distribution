package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceAction extends js.Object {
  // Allowed Actions
  var allowedResourceActions: js.UndefOr[js.Array[String]] = js.undefined
  // Not Allowed Actions
  var notAllowedResourceActions: js.UndefOr[js.Array[String]] = js.undefined
}

object ResourceAction {
  @scala.inline
  def apply(
    allowedResourceActions: js.Array[String] = null,
    notAllowedResourceActions: js.Array[String] = null
  ): ResourceAction = {
    val __obj = js.Dynamic.literal()
    if (allowedResourceActions != null) __obj.updateDynamic("allowedResourceActions")(allowedResourceActions)
    if (notAllowedResourceActions != null) __obj.updateDynamic("notAllowedResourceActions")(notAllowedResourceActions)
    __obj.asInstanceOf[ResourceAction]
  }
}

