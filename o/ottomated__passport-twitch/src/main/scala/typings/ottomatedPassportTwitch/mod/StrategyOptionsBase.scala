package typings.ottomatedPassportTwitch.mod

import typings.node.httpMod.OutgoingHttpHeaders
import typings.passportOauth2.mod.StateStore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StrategyOptionsBase extends js.Object {
  var authorizationURL: js.UndefOr[String] = js.native
  var callbackURL: js.UndefOr[String] = js.native
  var clientID: String = js.native
  var clientSecret: String = js.native
  var customHeaders: js.UndefOr[OutgoingHttpHeaders] = js.native
  var scope: js.UndefOr[String | js.Array[String]] = js.native
  var scopeSeparator: js.UndefOr[String] = js.native
  var sessionKey: js.UndefOr[String] = js.native
  var state: js.UndefOr[js.Any] = js.native
  var store: js.UndefOr[StateStore] = js.native
  var tokenURL: js.UndefOr[String] = js.native
}

object StrategyOptionsBase {
  @scala.inline
  def apply(clientID: String, clientSecret: String): StrategyOptionsBase = {
    val __obj = js.Dynamic.literal(clientID = clientID.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any])
    __obj.asInstanceOf[StrategyOptionsBase]
  }
  @scala.inline
  implicit class StrategyOptionsBaseOps[Self <: StrategyOptionsBase] (val x: Self) extends AnyVal {
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
    def setClientID(value: String): Self = this.set("clientID", value.asInstanceOf[js.Any])
    @scala.inline
    def setClientSecret(value: String): Self = this.set("clientSecret", value.asInstanceOf[js.Any])
    @scala.inline
    def setAuthorizationURL(value: String): Self = this.set("authorizationURL", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthorizationURL: Self = this.set("authorizationURL", js.undefined)
    @scala.inline
    def setCallbackURL(value: String): Self = this.set("callbackURL", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCallbackURL: Self = this.set("callbackURL", js.undefined)
    @scala.inline
    def setCustomHeaders(value: OutgoingHttpHeaders): Self = this.set("customHeaders", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomHeaders: Self = this.set("customHeaders", js.undefined)
    @scala.inline
    def setScopeVarargs(value: String*): Self = this.set("scope", js.Array(value :_*))
    @scala.inline
    def setScope(value: String | js.Array[String]): Self = this.set("scope", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScope: Self = this.set("scope", js.undefined)
    @scala.inline
    def setScopeSeparator(value: String): Self = this.set("scopeSeparator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScopeSeparator: Self = this.set("scopeSeparator", js.undefined)
    @scala.inline
    def setSessionKey(value: String): Self = this.set("sessionKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSessionKey: Self = this.set("sessionKey", js.undefined)
    @scala.inline
    def setState(value: js.Any): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    @scala.inline
    def setStore(value: StateStore): Self = this.set("store", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStore: Self = this.set("store", js.undefined)
    @scala.inline
    def setTokenURL(value: String): Self = this.set("tokenURL", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTokenURL: Self = this.set("tokenURL", js.undefined)
  }
  
}

