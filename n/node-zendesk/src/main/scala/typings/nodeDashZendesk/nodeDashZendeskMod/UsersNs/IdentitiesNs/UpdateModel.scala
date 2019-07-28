package typings.nodeDashZendesk.nodeDashZendeskMod.UsersNs.IdentitiesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateModel extends js.Object {
  var value: js.UndefOr[String] = js.undefined
  var verified: js.UndefOr[Boolean] = js.undefined
}

object UpdateModel {
  @scala.inline
  def apply(value: String = null, verified: js.UndefOr[Boolean] = js.undefined): UpdateModel = {
    val __obj = js.Dynamic.literal()
    if (value != null) __obj.updateDynamic("value")(value)
    if (!js.isUndefined(verified)) __obj.updateDynamic("verified")(verified)
    __obj.asInstanceOf[UpdateModel]
  }
}

