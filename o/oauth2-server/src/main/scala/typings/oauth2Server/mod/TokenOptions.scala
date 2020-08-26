package typings.oauth2Server.mod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TokenOptions extends js.Object {
  /**
    * Lifetime of generated access tokens in seconds (default = 1 hour)
    */
  var accessTokenLifetime: js.UndefOr[Double] = js.native
  /**
    * Allow extended attributes to be set on the returned token
    */
  var allowExtendedTokenAttributes: js.UndefOr[Boolean] = js.native
  /**
    * Always revoke the used refresh token and issue a new one for the refresh_token grant.
    */
  var alwaysIssueNewRefreshToken: js.UndefOr[Boolean] = js.native
  /**
    * Additional supported grant types.
    */
  var extendedGrantTypes: js.UndefOr[StringDictionary[Instantiable1[/* options */ TokenOptions, AbstractGrantType]]] = js.native
  /**
    * Lifetime of generated refresh tokens in seconds (default = 2 weeks)
    */
  var refreshTokenLifetime: js.UndefOr[Double] = js.native
  /**
    * Require a client secret. Defaults to true for all grant types.
    */
  var requireClientAuthentication: js.UndefOr[js.Object] = js.native
}

object TokenOptions {
  @scala.inline
  def apply(): TokenOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TokenOptions]
  }
  @scala.inline
  implicit class TokenOptionsOps[Self <: TokenOptions] (val x: Self) extends AnyVal {
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
    def setAccessTokenLifetime(value: Double): Self = this.set("accessTokenLifetime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessTokenLifetime: Self = this.set("accessTokenLifetime", js.undefined)
    @scala.inline
    def setAllowExtendedTokenAttributes(value: Boolean): Self = this.set("allowExtendedTokenAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowExtendedTokenAttributes: Self = this.set("allowExtendedTokenAttributes", js.undefined)
    @scala.inline
    def setAlwaysIssueNewRefreshToken(value: Boolean): Self = this.set("alwaysIssueNewRefreshToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlwaysIssueNewRefreshToken: Self = this.set("alwaysIssueNewRefreshToken", js.undefined)
    @scala.inline
    def setExtendedGrantTypes(value: StringDictionary[Instantiable1[/* options */ TokenOptions, AbstractGrantType]]): Self = this.set("extendedGrantTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtendedGrantTypes: Self = this.set("extendedGrantTypes", js.undefined)
    @scala.inline
    def setRefreshTokenLifetime(value: Double): Self = this.set("refreshTokenLifetime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRefreshTokenLifetime: Self = this.set("refreshTokenLifetime", js.undefined)
    @scala.inline
    def setRequireClientAuthentication(value: js.Object): Self = this.set("requireClientAuthentication", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequireClientAuthentication: Self = this.set("requireClientAuthentication", js.undefined)
  }
  
}

