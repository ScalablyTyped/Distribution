package typings.nodeDashZendesk.nodeDashZendeskMod.Users.Identities

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateModel extends js.Object {
  var primary: js.UndefOr[Boolean] = js.undefined
  var `type`: IdentityType
  var value: String
  var verified: js.UndefOr[Boolean] = js.undefined
}

object CreateModel {
  @scala.inline
  def apply(
    `type`: IdentityType,
    value: String,
    primary: js.UndefOr[Boolean] = js.undefined,
    verified: js.UndefOr[Boolean] = js.undefined
  ): CreateModel = {
    val __obj = js.Dynamic.literal(value = value)
    __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(primary)) __obj.updateDynamic("primary")(primary)
    if (!js.isUndefined(verified)) __obj.updateDynamic("verified")(verified)
    __obj.asInstanceOf[CreateModel]
  }
}

