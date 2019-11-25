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
    if (!js.isUndefined(addAcceptedScopesHeader)) __obj.updateDynamic("addAcceptedScopesHeader")(addAcceptedScopesHeader.asInstanceOf[js.Any])
    if (!js.isUndefined(addAuthorizedScopesHeader)) __obj.updateDynamic("addAuthorizedScopesHeader")(addAuthorizedScopesHeader.asInstanceOf[js.Any])
    if (!js.isUndefined(allowBearerTokensInQueryString)) __obj.updateDynamic("allowBearerTokensInQueryString")(allowBearerTokensInQueryString.asInstanceOf[js.Any])
    if (!js.isUndefined(allowEmptyState)) __obj.updateDynamic("allowEmptyState")(allowEmptyState.asInstanceOf[js.Any])
    if (!js.isUndefined(allowExtendedTokenAttributes)) __obj.updateDynamic("allowExtendedTokenAttributes")(allowExtendedTokenAttributes.asInstanceOf[js.Any])
    if (!js.isUndefined(alwaysIssueNewRefreshToken)) __obj.updateDynamic("alwaysIssueNewRefreshToken")(alwaysIssueNewRefreshToken.asInstanceOf[js.Any])
    if (authenticateHandler != null) __obj.updateDynamic("authenticateHandler")(authenticateHandler.asInstanceOf[js.Any])
    if (authorizationCodeLifetime != null) __obj.updateDynamic("authorizationCodeLifetime")(authorizationCodeLifetime.asInstanceOf[js.Any])
    if (extendedGrantTypes != null) __obj.updateDynamic("extendedGrantTypes")(extendedGrantTypes.asInstanceOf[js.Any])
    if (refreshTokenLifetime != null) __obj.updateDynamic("refreshTokenLifetime")(refreshTokenLifetime.asInstanceOf[js.Any])
    if (requireClientAuthentication != null) __obj.updateDynamic("requireClientAuthentication")(requireClientAuthentication.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerOptions]
  }
}

