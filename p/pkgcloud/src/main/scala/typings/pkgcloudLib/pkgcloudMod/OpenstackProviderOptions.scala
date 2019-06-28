package typings
package pkgcloudLib.pkgcloudMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenstackProviderOptions extends js.Object {
  var authUrl: java.lang.String
  var keystoneAuthVersion: js.UndefOr[java.lang.String] = js.undefined
  var password: java.lang.String
  var provider: pkgcloudLib.pkgcloudLibStrings.openstack
  var region: js.UndefOr[java.lang.String] = js.undefined
  var tenantId: js.UndefOr[java.lang.String] = js.undefined
  var username: java.lang.String
  var version: js.UndefOr[java.lang.String] = js.undefined
}

object OpenstackProviderOptions {
  @scala.inline
  def apply(
    authUrl: java.lang.String,
    password: java.lang.String,
    provider: pkgcloudLib.pkgcloudLibStrings.openstack,
    username: java.lang.String,
    keystoneAuthVersion: java.lang.String = null,
    region: java.lang.String = null,
    tenantId: java.lang.String = null,
    version: java.lang.String = null
  ): OpenstackProviderOptions = {
    val __obj = js.Dynamic.literal(authUrl = authUrl, password = password, provider = provider, username = username)
    if (keystoneAuthVersion != null) __obj.updateDynamic("keystoneAuthVersion")(keystoneAuthVersion)
    if (region != null) __obj.updateDynamic("region")(region)
    if (tenantId != null) __obj.updateDynamic("tenantId")(tenantId)
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[OpenstackProviderOptions]
  }
}

