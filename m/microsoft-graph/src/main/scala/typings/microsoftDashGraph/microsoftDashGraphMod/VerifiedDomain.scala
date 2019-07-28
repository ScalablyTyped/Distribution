package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VerifiedDomain extends js.Object {
  // For example, 'Email', 'OfficeCommunicationsOnline'.
  var capabilities: js.UndefOr[String] = js.undefined
  // true if this is the default domain associated with the tenant; otherwise, false.
  var isDefault: js.UndefOr[Boolean] = js.undefined
  // true if this is the initial domain associated with the tenant; otherwise, false
  var isInitial: js.UndefOr[Boolean] = js.undefined
  // The domain name; for example, 'contoso.onmicrosoft.com'
  var name: js.UndefOr[String] = js.undefined
  // For example, 'Managed'.
  var `type`: js.UndefOr[String] = js.undefined
}

object VerifiedDomain {
  @scala.inline
  def apply(
    capabilities: String = null,
    isDefault: js.UndefOr[Boolean] = js.undefined,
    isInitial: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    `type`: String = null
  ): VerifiedDomain = {
    val __obj = js.Dynamic.literal()
    if (capabilities != null) __obj.updateDynamic("capabilities")(capabilities)
    if (!js.isUndefined(isDefault)) __obj.updateDynamic("isDefault")(isDefault)
    if (!js.isUndefined(isInitial)) __obj.updateDynamic("isInitial")(isInitial)
    if (name != null) __obj.updateDynamic("name")(name)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[VerifiedDomain]
  }
}

