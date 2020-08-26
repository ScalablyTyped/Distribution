package typings.openidClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StrategyOptions[TClient /* <: Client */] extends js.Object {
  var client: TClient = js.native
  /**
    * Authorization Request parameters. The strategy will use these.
    */
  var params: js.UndefOr[AuthorizationParameters] = js.native
  /**
    * Boolean specifying whether the verify function should get the request object as first argument instead.
    * Default: 'false'
    */
  var passReqToCallback: js.UndefOr[Boolean] = js.native
  /**
    * The PKCE method to use. When 'true' it will resolve based on the issuer metadata, when 'false' no PKCE will be
    * used. Default: 'false'
    */
  var sessionKey: js.UndefOr[String] = js.native
  /**
    * The PKCE method to use. When 'true' it will resolve based on the issuer metadata, when 'false' no PKCE will be
    * used. Default: 'false'
    */
  var usePKCE: js.UndefOr[Boolean | String] = js.native
}

object StrategyOptions {
  @scala.inline
  def apply[/* <: typings.openidClient.mod.Client */ TClient](client: TClient): StrategyOptions[TClient] = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any])
    __obj.asInstanceOf[StrategyOptions[TClient]]
  }
  @scala.inline
  implicit class StrategyOptionsOps[Self <: StrategyOptions[_], /* <: typings.openidClient.mod.Client */ TClient] (val x: Self with StrategyOptions[TClient]) extends AnyVal {
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
    def setClient(value: TClient): Self = this.set("client", value.asInstanceOf[js.Any])
    @scala.inline
    def setParams(value: AuthorizationParameters): Self = this.set("params", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParams: Self = this.set("params", js.undefined)
    @scala.inline
    def setPassReqToCallback(value: Boolean): Self = this.set("passReqToCallback", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePassReqToCallback: Self = this.set("passReqToCallback", js.undefined)
    @scala.inline
    def setSessionKey(value: String): Self = this.set("sessionKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSessionKey: Self = this.set("sessionKey", js.undefined)
    @scala.inline
    def setUsePKCE(value: Boolean | String): Self = this.set("usePKCE", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUsePKCE: Self = this.set("usePKCE", js.undefined)
  }
  
}

