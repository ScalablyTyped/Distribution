package typings.openidDashClient.openidDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrategyOptions[TClient /* <: Client */] extends js.Object {
  var client: TClient
  /**
    * Authorization Request parameters. The strategy will use these.
    */
  var params: js.UndefOr[AuthorizationParameters] = js.undefined
  /**
    * Boolean specifying whether the verify function should get the request object as first argument instead.
    * Default: 'false'
    */
  var passReqToCallback: js.UndefOr[Boolean] = js.undefined
  /**
    * The PKCE method to use. When 'true' it will resolve based on the issuer metadata, when 'false' no PKCE will be
    * used. Default: 'false'
    */
  var sessionKey: js.UndefOr[String] = js.undefined
  /**
    * The PKCE method to use. When 'true' it will resolve based on the issuer metadata, when 'false' no PKCE will be
    * used. Default: 'false'
    */
  var usePKCE: js.UndefOr[Boolean | String] = js.undefined
}

object StrategyOptions {
  @scala.inline
  def apply[TClient /* <: Client */](
    client: TClient,
    params: AuthorizationParameters = null,
    passReqToCallback: js.UndefOr[Boolean] = js.undefined,
    sessionKey: String = null,
    usePKCE: Boolean | String = null
  ): StrategyOptions[TClient] = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    if (!js.isUndefined(passReqToCallback)) __obj.updateDynamic("passReqToCallback")(passReqToCallback.asInstanceOf[js.Any])
    if (sessionKey != null) __obj.updateDynamic("sessionKey")(sessionKey.asInstanceOf[js.Any])
    if (usePKCE != null) __obj.updateDynamic("usePKCE")(usePKCE.asInstanceOf[js.Any])
    __obj.asInstanceOf[StrategyOptions[TClient]]
  }
}

