package typings.oktaOktaVue.mod.OktaVuePlugin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OktaOpenIDOptions extends js.Object {
  var nonce: js.UndefOr[String] = js.undefined
  var responseMode: js.UndefOr[String] = js.undefined
  var responseType: js.UndefOr[String | js.Array[String]] = js.undefined
  var scopes: js.UndefOr[js.Array[String]] = js.undefined
  var sessionToken: js.UndefOr[String] = js.undefined
  var state: js.UndefOr[String] = js.undefined
}

object OktaOpenIDOptions {
  @scala.inline
  def apply(
    nonce: String = null,
    responseMode: String = null,
    responseType: String | js.Array[String] = null,
    scopes: js.Array[String] = null,
    sessionToken: String = null,
    state: String = null
  ): OktaOpenIDOptions = {
    val __obj = js.Dynamic.literal()
    if (nonce != null) __obj.updateDynamic("nonce")(nonce.asInstanceOf[js.Any])
    if (responseMode != null) __obj.updateDynamic("responseMode")(responseMode.asInstanceOf[js.Any])
    if (responseType != null) __obj.updateDynamic("responseType")(responseType.asInstanceOf[js.Any])
    if (scopes != null) __obj.updateDynamic("scopes")(scopes.asInstanceOf[js.Any])
    if (sessionToken != null) __obj.updateDynamic("sessionToken")(sessionToken.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[OktaOpenIDOptions]
  }
}

