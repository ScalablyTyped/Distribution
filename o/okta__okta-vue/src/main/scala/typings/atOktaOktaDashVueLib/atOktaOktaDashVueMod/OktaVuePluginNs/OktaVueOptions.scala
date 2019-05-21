package typings
package atOktaOktaDashVueLib.atOktaOktaDashVueMod.OktaVuePluginNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OktaVueOptions extends js.Object {
  var auto_renew: js.UndefOr[scala.Boolean] = js.undefined
  var client_id: java.lang.String
  var issuer: java.lang.String
  var redirect_uri: java.lang.String
  var response_type: js.UndefOr[java.lang.String] = js.undefined
  var scope: js.UndefOr[java.lang.String] = js.undefined
  var storage: js.UndefOr[
    atOktaOktaDashVueLib.atOktaOktaDashVueLibStrings.localStorage | atOktaOktaDashVueLib.atOktaOktaDashVueLibStrings.sessionStorage | atOktaOktaDashVueLib.atOktaOktaDashVueLibStrings.cookie
  ] = js.undefined
}

object OktaVueOptions {
  @scala.inline
  def apply(
    client_id: java.lang.String,
    issuer: java.lang.String,
    redirect_uri: java.lang.String,
    auto_renew: js.UndefOr[scala.Boolean] = js.undefined,
    response_type: java.lang.String = null,
    scope: java.lang.String = null,
    storage: atOktaOktaDashVueLib.atOktaOktaDashVueLibStrings.localStorage | atOktaOktaDashVueLib.atOktaOktaDashVueLibStrings.sessionStorage | atOktaOktaDashVueLib.atOktaOktaDashVueLibStrings.cookie = null
  ): OktaVueOptions = {
    val __obj = js.Dynamic.literal(client_id = client_id, issuer = issuer, redirect_uri = redirect_uri)
    if (!js.isUndefined(auto_renew)) __obj.updateDynamic("auto_renew")(auto_renew)
    if (response_type != null) __obj.updateDynamic("response_type")(response_type)
    if (scope != null) __obj.updateDynamic("scope")(scope)
    if (storage != null) __obj.updateDynamic("storage")(storage.asInstanceOf[js.Any])
    __obj.asInstanceOf[OktaVueOptions]
  }
}

