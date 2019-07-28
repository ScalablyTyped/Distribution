package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdentityProvider extends Entity {
  var clientId: js.UndefOr[String] = js.undefined
  var clientSecret: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object IdentityProvider {
  @scala.inline
  def apply(
    clientId: String = null,
    clientSecret: String = null,
    id: String = null,
    name: String = null,
    `type`: String = null
  ): IdentityProvider = {
    val __obj = js.Dynamic.literal()
    if (clientId != null) __obj.updateDynamic("clientId")(clientId)
    if (clientSecret != null) __obj.updateDynamic("clientSecret")(clientSecret)
    if (id != null) __obj.updateDynamic("id")(id)
    if (name != null) __obj.updateDynamic("name")(name)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[IdentityProvider]
  }
}

