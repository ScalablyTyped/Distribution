package typings.atOktaOktaDashVue.atOktaOktaDashVueMod.OktaVuePlugin

import typings.atOktaOktaDashVue.atOktaOktaDashVueStrings.cookie
import typings.atOktaOktaDashVue.atOktaOktaDashVueStrings.localStorage
import typings.atOktaOktaDashVue.atOktaOktaDashVueStrings.sessionStorage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OktaVueOptions extends js.Object {
  var auto_renew: js.UndefOr[Boolean] = js.undefined
  var client_id: String
  var issuer: String
  var redirect_uri: String
  var response_type: js.UndefOr[String] = js.undefined
  var scope: js.UndefOr[String] = js.undefined
  var storage: js.UndefOr[localStorage | sessionStorage | cookie] = js.undefined
}

object OktaVueOptions {
  @scala.inline
  def apply(
    client_id: String,
    issuer: String,
    redirect_uri: String,
    auto_renew: js.UndefOr[Boolean] = js.undefined,
    response_type: String = null,
    scope: String = null,
    storage: localStorage | sessionStorage | cookie = null
  ): OktaVueOptions = {
    val __obj = js.Dynamic.literal(client_id = client_id.asInstanceOf[js.Any], issuer = issuer.asInstanceOf[js.Any], redirect_uri = redirect_uri.asInstanceOf[js.Any])
    if (!js.isUndefined(auto_renew)) __obj.updateDynamic("auto_renew")(auto_renew.asInstanceOf[js.Any])
    if (response_type != null) __obj.updateDynamic("response_type")(response_type.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    if (storage != null) __obj.updateDynamic("storage")(storage.asInstanceOf[js.Any])
    __obj.asInstanceOf[OktaVueOptions]
  }
}

