package typings.passportGithub

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type OAuth2StrategyOptionsWithoutRequiredURLs = typings.std.Pick[
    typings.passportOauth2.mod.StrategyOptionsBase, 
    typings.std.Exclude[
      typings.passportGithub.passportGithubStrings.authorizationURL | typings.passportGithub.passportGithubStrings.tokenURL | typings.passportGithub.passportGithubStrings.clientID | typings.passportGithub.passportGithubStrings.clientSecret | typings.passportGithub.passportGithubStrings.callbackURL | typings.passportGithub.passportGithubStrings.customHeaders | typings.passportGithub.passportGithubStrings.scope | typings.passportGithub.passportGithubStrings.scopeSeparator | typings.passportGithub.passportGithubStrings.sessionKey | typings.passportGithub.passportGithubStrings.store | typings.passportGithub.passportGithubStrings.state, 
      typings.passportGithub.passportGithubStrings.authorizationURL | typings.passportGithub.passportGithubStrings.tokenURL
    ]
  ]
  type Strategy = typings.passportOauth2.mod.Strategy
  /** @deprecated Types renamed for consistency with 'passport-oauth2'. Use `StrategyOptions` instead. */
  type StrategyOption = typings.passportGithub.mod.StrategyOptions
  /** @deprecated Types renamed for consistency with 'passport-oauth2'. Use `_StrategyOptionsBase` instead. */
  type StrategyOptionBase = typings.passportGithub.mod.StrategyOptionsBase
  /** @deprecated Types renamed for consistency with 'passport-oauth2'. Use `StrategyOptionsWithRequest` instead. */
  type StrategyOptionWithRequest = typings.passportGithub.mod.StrategyOptionsWithRequest
}
