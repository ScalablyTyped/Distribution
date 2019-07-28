package typings.oauth2DashServer.oauth2DashServerMod

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
    accessTokenLifetime: Int | Double = null,
    allowExtendedTokenAttributes: js.UndefOr[Boolean] = js.undefined,
    alwaysIssueNewRefreshToken: js.UndefOr[Boolean] = js.undefined,
    extendedGrantTypes: StringDictionary[Instantiable1[/* options */ TokenOptions, AbstractGrantType]] = null,
    refreshTokenLifetime: Int | Double = null,
    requireClientAuthentication: js.Object = null
  ): TokenOptions = {
    val __obj = js.Dynamic.literal()
    if (accessTokenLifetime != null) __obj.updateDynamic("accessTokenLifetime")(accessTokenLifetime.asInstanceOf[js.Any])
    if (!js.isUndefined(allowExtendedTokenAttributes)) __obj.updateDynamic("allowExtendedTokenAttributes")(allowExtendedTokenAttributes)
    if (!js.isUndefined(alwaysIssueNewRefreshToken)) __obj.updateDynamic("alwaysIssueNewRefreshToken")(alwaysIssueNewRefreshToken)
    if (extendedGrantTypes != null) __obj.updateDynamic("extendedGrantTypes")(extendedGrantTypes)
    if (refreshTokenLifetime != null) __obj.updateDynamic("refreshTokenLifetime")(refreshTokenLifetime.asInstanceOf[js.Any])
    if (requireClientAuthentication != null) __obj.updateDynamic("requireClientAuthentication")(requireClientAuthentication)
    __obj.asInstanceOf[TokenOptions]
  }
}

