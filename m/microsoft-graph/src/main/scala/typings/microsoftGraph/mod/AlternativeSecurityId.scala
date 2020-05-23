package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AlternativeSecurityId extends js.Object {
  // For internal use only
  var identityProvider: js.UndefOr[String] = js.undefined
  // For internal use only
  var key: js.UndefOr[Double] = js.undefined
  // For internal use only
  var `type`: js.UndefOr[Double] = js.undefined
}

object AlternativeSecurityId {
  @scala.inline
  def apply(
    identityProvider: String = null,
    key: js.UndefOr[Double] = js.undefined,
    `type`: js.UndefOr[Double] = js.undefined
  ): AlternativeSecurityId = {
    val __obj = js.Dynamic.literal()
    if (identityProvider != null) __obj.updateDynamic("identityProvider")(identityProvider.asInstanceOf[js.Any])
    if (!js.isUndefined(key)) __obj.updateDynamic("key")(key.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`type`)) __obj.updateDynamic("type")(`type`.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlternativeSecurityId]
  }
}

