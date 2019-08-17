package typings.passportDashGithub

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object passportDashGithubMod {
  import typings.passportDashGithub.passportDashGithubStrings.authorizationURL
  import typings.passportDashGithub.passportDashGithubStrings.callbackURL
  import typings.passportDashGithub.passportDashGithubStrings.clientID
  import typings.passportDashGithub.passportDashGithubStrings.clientSecret
  import typings.passportDashGithub.passportDashGithubStrings.customHeaders
  import typings.passportDashGithub.passportDashGithubStrings.scope
  import typings.passportDashGithub.passportDashGithubStrings.scopeSeparator
  import typings.passportDashGithub.passportDashGithubStrings.sessionKey
  import typings.passportDashGithub.passportDashGithubStrings.state
  import typings.passportDashGithub.passportDashGithubStrings.store
  import typings.passportDashGithub.passportDashGithubStrings.tokenURL
  import typings.std.Exclude
  import typings.std.Pick

  type OAuth2StrategyOptionsWithoutRequiredURLs = Pick[
    typings.passportDashOauth2.passportDashOauth2Mod._StrategyOptionsBase, 
    Exclude[
      authorizationURL | tokenURL | clientID | clientSecret | callbackURL | customHeaders | scope | scopeSeparator | sessionKey | store | state, 
      authorizationURL | tokenURL
    ]
  ]
  type Strategy = typings.passportDashOauth2.passportDashOauth2Mod.Strategy
  /** @deprecated Types renamed for consistency with 'passport-oauth2'. Use `StrategyOptions` instead. */
  type StrategyOption = StrategyOptions
  /** @deprecated Types renamed for consistency with 'passport-oauth2'. Use `_StrategyOptionsBase` instead. */
  type StrategyOptionBase = _StrategyOptionsBase
  /** @deprecated Types renamed for consistency with 'passport-oauth2'. Use `StrategyOptionsWithRequest` instead. */
  type StrategyOptionWithRequest = StrategyOptionsWithRequest
}
