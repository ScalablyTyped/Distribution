package typings.oktaOktaVue.mod.OktaVuePlugin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OktaOpenIDOptions extends js.Object {
  var nonce: js.UndefOr[String] = js.native
  var responseMode: js.UndefOr[String] = js.native
  var responseType: js.UndefOr[String | js.Array[String]] = js.native
  var scopes: js.UndefOr[js.Array[String]] = js.native
  var sessionToken: js.UndefOr[String] = js.native
  var state: js.UndefOr[String] = js.native
}

object OktaOpenIDOptions {
  @scala.inline
  def apply(): OktaOpenIDOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OktaOpenIDOptions]
  }
  @scala.inline
  implicit class OktaOpenIDOptionsOps[Self <: OktaOpenIDOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setNonce(value: String): Self = this.set("nonce", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNonce: Self = this.set("nonce", js.undefined)
    @scala.inline
    def setResponseMode(value: String): Self = this.set("responseMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponseMode: Self = this.set("responseMode", js.undefined)
    @scala.inline
    def setResponseTypeVarargs(value: String*): Self = this.set("responseType", js.Array(value :_*))
    @scala.inline
    def setResponseType(value: String | js.Array[String]): Self = this.set("responseType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponseType: Self = this.set("responseType", js.undefined)
    @scala.inline
    def setScopesVarargs(value: String*): Self = this.set("scopes", js.Array(value :_*))
    @scala.inline
    def setScopes(value: js.Array[String]): Self = this.set("scopes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScopes: Self = this.set("scopes", js.undefined)
    @scala.inline
    def setSessionToken(value: String): Self = this.set("sessionToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSessionToken: Self = this.set("sessionToken", js.undefined)
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
  }
  
}

