package typings.passportGithub2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type OAuth2StrategyOptionsWithoutRequiredURLs = typings.std.Pick[
    typings.passportOauth2.mod.StrategyOptionsBase, 
    typings.std.Exclude[
      typings.passportGithub2.passportGithub2Strings.authorizationURL | typings.passportGithub2.passportGithub2Strings.tokenURL | typings.passportGithub2.passportGithub2Strings.clientID | typings.passportGithub2.passportGithub2Strings.clientSecret | typings.passportGithub2.passportGithub2Strings.callbackURL | typings.passportGithub2.passportGithub2Strings.customHeaders | typings.passportGithub2.passportGithub2Strings.scope | typings.passportGithub2.passportGithub2Strings.scopeSeparator | typings.passportGithub2.passportGithub2Strings.sessionKey | typings.passportGithub2.passportGithub2Strings.store | typings.passportGithub2.passportGithub2Strings.state, 
      typings.passportGithub2.passportGithub2Strings.authorizationURL | typings.passportGithub2.passportGithub2Strings.tokenURL
    ]
  ]
}
