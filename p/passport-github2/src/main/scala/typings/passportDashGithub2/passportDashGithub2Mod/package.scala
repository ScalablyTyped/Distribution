package typings.passportDashGithub2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object passportDashGithub2Mod {
  import typings.passportDashGithub2.passportDashGithub2Strings.authorizationURL
  import typings.passportDashGithub2.passportDashGithub2Strings.callbackURL
  import typings.passportDashGithub2.passportDashGithub2Strings.clientID
  import typings.passportDashGithub2.passportDashGithub2Strings.clientSecret
  import typings.passportDashGithub2.passportDashGithub2Strings.customHeaders
  import typings.passportDashGithub2.passportDashGithub2Strings.scope
  import typings.passportDashGithub2.passportDashGithub2Strings.scopeSeparator
  import typings.passportDashGithub2.passportDashGithub2Strings.sessionKey
  import typings.passportDashGithub2.passportDashGithub2Strings.state
  import typings.passportDashGithub2.passportDashGithub2Strings.store
  import typings.passportDashGithub2.passportDashGithub2Strings.tokenURL
  import typings.std.Exclude
  import typings.std.Pick

  type OAuth2StrategyOptionsWithoutRequiredURLs = Pick[
    typings.passportDashOauth2.passportDashOauth2Mod._StrategyOptionsBase, 
    Exclude[
      authorizationURL | tokenURL | clientID | clientSecret | callbackURL | customHeaders | scope | scopeSeparator | sessionKey | store | state, 
      authorizationURL | tokenURL
    ]
  ]
}
