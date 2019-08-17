package typings.passportDashGoogleDashOauth20

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object passportDashGoogleDashOauth20Mod {
  import typings.passportDashGoogleDashOauth20.passportDashGoogleDashOauth20Strings.authorizationURL
  import typings.passportDashGoogleDashOauth20.passportDashGoogleDashOauth20Strings.callbackURL
  import typings.passportDashGoogleDashOauth20.passportDashGoogleDashOauth20Strings.clientID
  import typings.passportDashGoogleDashOauth20.passportDashGoogleDashOauth20Strings.clientSecret
  import typings.passportDashGoogleDashOauth20.passportDashGoogleDashOauth20Strings.customHeaders
  import typings.passportDashGoogleDashOauth20.passportDashGoogleDashOauth20Strings.scope
  import typings.passportDashGoogleDashOauth20.passportDashGoogleDashOauth20Strings.scopeSeparator
  import typings.passportDashGoogleDashOauth20.passportDashGoogleDashOauth20Strings.sessionKey
  import typings.passportDashGoogleDashOauth20.passportDashGoogleDashOauth20Strings.state
  import typings.passportDashGoogleDashOauth20.passportDashGoogleDashOauth20Strings.store
  import typings.passportDashGoogleDashOauth20.passportDashGoogleDashOauth20Strings.tokenURL
  import typings.std.Error
  import typings.std.Exclude
  import typings.std.Pick

  type OAuth2StrategyOptionsWithoutRequiredURLs = Pick[
    typings.passportDashOauth2.passportDashOauth2Mod._StrategyOptionsBase, 
    Exclude[
      authorizationURL | tokenURL | clientID | clientSecret | callbackURL | customHeaders | scope | scopeSeparator | sessionKey | store | state, 
      authorizationURL | tokenURL
    ]
  ]
  type VerifyCallback = js.Function3[
    /* err */ js.UndefOr[String | Error], 
    /* user */ js.UndefOr[js.Any], 
    /* info */ js.UndefOr[js.Any], 
    Unit
  ]
}
