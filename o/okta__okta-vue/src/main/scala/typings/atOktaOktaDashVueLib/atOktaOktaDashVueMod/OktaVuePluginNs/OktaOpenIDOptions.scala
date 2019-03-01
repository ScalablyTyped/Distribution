package typings
package atOktaOktaDashVueLib.atOktaOktaDashVueMod.OktaVuePluginNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OktaOpenIDOptions extends js.Object {
  var nonce: js.UndefOr[java.lang.String] = js.undefined
  var responseMode: js.UndefOr[java.lang.String] = js.undefined
  var responseType: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var scopes: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var sessionToken: js.UndefOr[java.lang.String] = js.undefined
  var state: js.UndefOr[java.lang.String] = js.undefined
}

object OktaOpenIDOptions {
  @scala.inline
  def apply(
    nonce: java.lang.String = null,
    responseMode: java.lang.String = null,
    responseType: java.lang.String | js.Array[java.lang.String] = null,
    scopes: js.Array[java.lang.String] = null,
    sessionToken: java.lang.String = null,
    state: java.lang.String = null
  ): OktaOpenIDOptions = {
    val __obj = js.Dynamic.literal()
    if (nonce != null) __obj.updateDynamic("nonce")(nonce)
    if (responseMode != null) __obj.updateDynamic("responseMode")(responseMode)
    if (responseType != null) __obj.updateDynamic("responseType")(responseType.asInstanceOf[js.Any])
    if (scopes != null) __obj.updateDynamic("scopes")(scopes)
    if (sessionToken != null) __obj.updateDynamic("sessionToken")(sessionToken)
    if (state != null) __obj.updateDynamic("state")(state)
    __obj.asInstanceOf[OktaOpenIDOptions]
  }
}

