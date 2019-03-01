package typings
package passportDashAzureDashAdLib.oidcDashStrategyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IProfile extends js.Object {
  var _json: js.UndefOr[js.Any] = js.undefined
  var _raw: js.UndefOr[java.lang.String] = js.undefined
  var displayName: js.UndefOr[java.lang.String] = js.undefined
  var emails: js.UndefOr[js.Any] = js.undefined
  var name: js.UndefOr[passportDashAzureDashAdLib.Anon_FamilyName] = js.undefined
  var oid: js.UndefOr[java.lang.String] = js.undefined
  var sub: js.UndefOr[java.lang.String] = js.undefined
  var upn: js.UndefOr[java.lang.String] = js.undefined
}

object IProfile {
  @scala.inline
  def apply(
    _json: js.Any = null,
    _raw: java.lang.String = null,
    displayName: java.lang.String = null,
    emails: js.Any = null,
    name: passportDashAzureDashAdLib.Anon_FamilyName = null,
    oid: java.lang.String = null,
    sub: java.lang.String = null,
    upn: java.lang.String = null
  ): IProfile = {
    val __obj = js.Dynamic.literal()
    if (_json != null) __obj.updateDynamic("_json")(_json)
    if (_raw != null) __obj.updateDynamic("_raw")(_raw)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (emails != null) __obj.updateDynamic("emails")(emails)
    if (name != null) __obj.updateDynamic("name")(name)
    if (oid != null) __obj.updateDynamic("oid")(oid)
    if (sub != null) __obj.updateDynamic("sub")(sub)
    if (upn != null) __obj.updateDynamic("upn")(upn)
    __obj.asInstanceOf[IProfile]
  }
}

