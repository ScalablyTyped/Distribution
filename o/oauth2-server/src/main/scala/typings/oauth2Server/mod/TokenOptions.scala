package typings.oauth2Server.mod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TokenOptions extends js.Object {
  /**
    * Lifetime of generated access tokens in seconds (default = 1 hour)
    */
  var accessTokenLifetime: js.UndefOr[Double] = js.undefined
  /**
    * Allow extended attributes to be set on the returned token
    */
  var allowExtendedTokenAttributes: js.UndefOr[Boolean] = js.undefined
  /**
    * Always revoke the used refresh token and issue a new one for the refresh_token grant.
    */
  var alwaysIssueNewRefreshToken: js.UndefOr[Boolean] = js.undefined
  /**
    * Additional supported grant types.
    */
  var extendedGrantTypes: js.UndefOr[StringDictionary[Instantiable1[/* options */ TokenOptions, AbstractGrantType]]] = js.undefined
  /**
    * Lifetime of generated refresh tokens in seconds (default = 2 weeks)
    */
  var refreshTokenLifetime: js.UndefOr[Double] = js.undefined
  /**
    * Require a client secret. Defaults to true for all grant types.
    */
  var requireClientAuthentication: js.UndefOr[js.Object] = js.undefined
}

object TokenOptions {
  @scala.inline
  def apply(
    accessTokenLifetime: js.UndefOr[Double] = js.undefined,
    allowExtendedTokenAttributes: js.UndefOr[Boolean] = js.undefined,
    alwaysIssueNewRefreshToken: js.UndefOr[Boolean] = js.undefined,
    extendedGrantTypes: StringDictionary[Instantiable1[/* options */ TokenOptions, AbstractGrantType]] = null,
    refreshTokenLifetime: js.UndefOr[Double] = js.undefined,
    requireClientAuthentication: js.Object = null
  ): TokenOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(accessTokenLifetime)) __obj.updateDynamic("accessTokenLifetime")(accessTokenLifetime.get.asInstanceOf[js.Any])
    if (!js.isUndefined(allowExtendedTokenAttributes)) __obj.updateDynamic("allowExtendedTokenAttributes")(allowExtendedTokenAttributes.get.asInstanceOf[js.Any])
    if (!js.isUndefined(alwaysIssueNewRefreshToken)) __obj.updateDynamic("alwaysIssueNewRefreshToken")(alwaysIssueNewRefreshToken.get.asInstanceOf[js.Any])
    if (extendedGrantTypes != null) __obj.updateDynamic("extendedGrantTypes")(extendedGrantTypes.asInstanceOf[js.Any])
    if (!js.isUndefined(refreshTokenLifetime)) __obj.updateDynamic("refreshTokenLifetime")(refreshTokenLifetime.get.asInstanceOf[js.Any])
    if (requireClientAuthentication != null) __obj.updateDynamic("requireClientAuthentication")(requireClientAuthentication.asInstanceOf[js.Any])
    __obj.asInstanceOf[TokenOptions]
  }
}

