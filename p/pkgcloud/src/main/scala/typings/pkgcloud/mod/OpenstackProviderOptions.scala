package typings.pkgcloud.mod

import typings.pkgcloud.pkgcloudStrings.openstack
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenstackProviderOptions extends js.Object {
  var authUrl: String
  var keystoneAuthVersion: js.UndefOr[String] = js.undefined
  var password: String
  var provider: openstack
  var region: js.UndefOr[String] = js.undefined
  var tenantId: js.UndefOr[String] = js.undefined
  var username: String
  var version: js.UndefOr[String] = js.undefined
}

object OpenstackProviderOptions {
  @scala.inline
  def apply(
    authUrl: String,
    password: String,
    provider: openstack,
    username: String,
    keystoneAuthVersion: String = null,
    region: String = null,
    tenantId: String = null,
    version: String = null
  ): OpenstackProviderOptions = {
    val __obj = js.Dynamic.literal(authUrl = authUrl.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    if (keystoneAuthVersion != null) __obj.updateDynamic("keystoneAuthVersion")(keystoneAuthVersion.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region.asInstanceOf[js.Any])
    if (tenantId != null) __obj.updateDynamic("tenantId")(tenantId.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenstackProviderOptions]
  }
}

