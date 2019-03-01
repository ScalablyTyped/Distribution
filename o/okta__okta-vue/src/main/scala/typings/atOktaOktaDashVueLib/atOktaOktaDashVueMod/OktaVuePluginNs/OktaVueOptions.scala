package typings
package atOktaOktaDashVueLib.atOktaOktaDashVueMod.OktaVuePluginNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OktaVueOptions extends js.Object {
  var client_id: java.lang.String
  var issuer: java.lang.String
  var redirect_uri: java.lang.String
  var response_type: js.UndefOr[java.lang.String] = js.undefined
  var scope: js.UndefOr[java.lang.String] = js.undefined
}

object OktaVueOptions {
  @scala.inline
  def apply(
    client_id: java.lang.String,
    issuer: java.lang.String,
    redirect_uri: java.lang.String,
    response_type: java.lang.String = null,
    scope: java.lang.String = null
  ): OktaVueOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("client_id")(client_id)
    __obj.updateDynamic("issuer")(issuer)
    __obj.updateDynamic("redirect_uri")(redirect_uri)
    if (response_type != null) __obj.updateDynamic("response_type")(response_type)
    if (scope != null) __obj.updateDynamic("scope")(scope)
    __obj.asInstanceOf[OktaVueOptions]
  }
}

