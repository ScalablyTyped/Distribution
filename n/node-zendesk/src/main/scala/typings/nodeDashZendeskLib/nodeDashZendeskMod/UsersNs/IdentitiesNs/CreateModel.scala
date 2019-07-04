package typings
package nodeDashZendeskLib.nodeDashZendeskMod.UsersNs.IdentitiesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateModel extends js.Object {
  var primary: js.UndefOr[scala.Boolean] = js.undefined
  var `type`: IdentityType
  var value: java.lang.String
  var verified: js.UndefOr[scala.Boolean] = js.undefined
}

object CreateModel {
  @scala.inline
  def apply(
    `type`: IdentityType,
    value: java.lang.String,
    primary: js.UndefOr[scala.Boolean] = js.undefined,
    verified: js.UndefOr[scala.Boolean] = js.undefined
  ): CreateModel = {
    val __obj = js.Dynamic.literal(value = value)
    __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(primary)) __obj.updateDynamic("primary")(primary)
    if (!js.isUndefined(verified)) __obj.updateDynamic("verified")(verified)
    __obj.asInstanceOf[CreateModel]
  }
}

