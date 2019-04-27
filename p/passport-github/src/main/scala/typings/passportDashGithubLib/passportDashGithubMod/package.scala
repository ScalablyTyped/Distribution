package typings
package passportDashGithubLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object passportDashGithubMod {
  type OAuth2StrategyOptionsWithoutRequiredURLs = stdLib.Pick[
    passportDashOauth2Lib.passportDashOauth2Mod._StrategyOptionsBase, 
    stdLib.Exclude[
      passportDashGithubLib.passportDashGithubLibStrings.authorizationURL | passportDashGithubLib.passportDashGithubLibStrings.tokenURL | passportDashGithubLib.passportDashGithubLibStrings.clientID | passportDashGithubLib.passportDashGithubLibStrings.clientSecret | passportDashGithubLib.passportDashGithubLibStrings.callbackURL | passportDashGithubLib.passportDashGithubLibStrings.customHeaders | passportDashGithubLib.passportDashGithubLibStrings.scope | passportDashGithubLib.passportDashGithubLibStrings.scopeSeparator | passportDashGithubLib.passportDashGithubLibStrings.sessionKey | passportDashGithubLib.passportDashGithubLibStrings.store | passportDashGithubLib.passportDashGithubLibStrings.state, 
      passportDashGithubLib.passportDashGithubLibStrings.authorizationURL | passportDashGithubLib.passportDashGithubLibStrings.tokenURL
    ]
  ]
  type Strategy = passportDashOauth2Lib.passportDashOauth2Mod.Strategy
  /** @deprecated Types renamed for consistency with 'passport-oauth2'. Use `StrategyOptions` instead. */
  type StrategyOption = StrategyOptions
  /** @deprecated Types renamed for consistency with 'passport-oauth2'. Use `_StrategyOptionsBase` instead. */
  type StrategyOptionBase = _StrategyOptionsBase
  /** @deprecated Types renamed for consistency with 'passport-oauth2'. Use `StrategyOptionsWithRequest` instead. */
  type StrategyOptionWithRequest = StrategyOptionsWithRequest
}
