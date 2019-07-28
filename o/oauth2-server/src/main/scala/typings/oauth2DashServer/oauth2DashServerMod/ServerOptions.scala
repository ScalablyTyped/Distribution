package typings.oauth2DashServer.oauth2DashServerMod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerOptions
  extends AuthenticateOptions
     with AuthorizeOptions
     with TokenOptions {
  /**
    * Model object
    */
  var model: AuthorizationCodeModel | ClientCredentialsModel | RefreshTokenModel | PasswordModel | ExtensionModel
}

object ServerOptions {
  @scala.inline
  def apply(
    model: AuthorizationCodeModel | ClientCredentialsModel | RefreshTokenModel | PasswordModel | ExtensionModel,
    accessTokenLifetime: Int | Double = null,
    addAcceptedScopesHeader: js.UndefOr[Boolean] = js.undefined,
    addAuthorizedScopesHeader: js.UndefOr[Boolean] = js.undefined,
    allowBearerTokensInQueryString: js.UndefOr[Boolean] = js.undefined,
    allowEmptyState: js.UndefOr[Boolean] = js.undefined,
    allowExtendedTokenAttributes: js.UndefOr[Boolean] = js.undefined,
    alwaysIssueNewRefreshToken: js.UndefOr[Boolean] = js.undefined,
    authenticateHandler: js.Object = null,
    authorizationCodeLifetime: Int | Double = null,
    extendedGrantTypes: StringDictionary[Instantiable1[/* options */ TokenOptions, AbstractGrantType]] = null,
    refreshTokenLifetime: Int | Double = null,
    requireClientAuthentication: js.Object = null,
    scope: String | js.Array[String] = null
  ): ServerOptions = {
    val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any])
    if (accessTokenLifetime != null) __obj.updateDynamic("accessTokenLifetime")(accessTokenLifetime.asInstanceOf[js.Any])
    if (!js.isUndefined(addAcceptedScopesHeader)) __obj.updateDynamic("addAcceptedScopesHeader")(addAcceptedScopesHeader)
    if (!js.isUndefined(addAuthorizedScopesHeader)) __obj.updateDynamic("addAuthorizedScopesHeader")(addAuthorizedScopesHeader)
    if (!js.isUndefined(allowBearerTokensInQueryString)) __obj.updateDynamic("allowBearerTokensInQueryString")(allowBearerTokensInQueryString)
    if (!js.isUndefined(allowEmptyState)) __obj.updateDynamic("allowEmptyState")(allowEmptyState)
    if (!js.isUndefined(allowExtendedTokenAttributes)) __obj.updateDynamic("allowExtendedTokenAttributes")(allowExtendedTokenAttributes)
    if (!js.isUndefined(alwaysIssueNewRefreshToken)) __obj.updateDynamic("alwaysIssueNewRefreshToken")(alwaysIssueNewRefreshToken)
    if (authenticateHandler != null) __obj.updateDynamic("authenticateHandler")(authenticateHandler)
    if (authorizationCodeLifetime != null) __obj.updateDynamic("authorizationCodeLifetime")(authorizationCodeLifetime.asInstanceOf[js.Any])
    if (extendedGrantTypes != null) __obj.updateDynamic("extendedGrantTypes")(extendedGrantTypes)
    if (refreshTokenLifetime != null) __obj.updateDynamic("refreshTokenLifetime")(refreshTokenLifetime.asInstanceOf[js.Any])
    if (requireClientAuthentication != null) __obj.updateDynamic("requireClientAuthentication")(requireClientAuthentication)
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerOptions]
  }
}

