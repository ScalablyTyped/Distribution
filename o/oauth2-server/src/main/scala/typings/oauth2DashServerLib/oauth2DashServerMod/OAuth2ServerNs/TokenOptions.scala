package typings
package oauth2DashServerLib.oauth2DashServerMod.OAuth2ServerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait TokenOptions extends js.Object {
  /**
           * Lifetime of generated access tokens in seconds (default = 1 hour)
           */
  var accessTokenLifetime: js.UndefOr[scala.Double] = js.undefined
  /**
           * Allow extended attributes to be set on the returned token
           */
  var allowExtendedTokenAttributes: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Always revoke the used refresh token and issue a new one for the refresh_token grant.
           */
  var alwaysIssueNewRefreshToken: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Additional supported grant types.
           */
  var extendedGrantTypes: js.UndefOr[
    ScalablyTyped.runtime.StringDictionary[
      ScalablyTyped.runtime.Instantiable1[/* options */ TokenOptions, AbstractGrantType]
    ]
  ] = js.undefined
  /**
           * Lifetime of generated refresh tokens in seconds (default = 2 weeks)
           */
  var refreshTokenLifetime: js.UndefOr[scala.Double] = js.undefined
  /**
           * Require a client secret. Defaults to true for all grant types.
           */
  var requireClientAuthentication: js.UndefOr[js.Object] = js.undefined
}

