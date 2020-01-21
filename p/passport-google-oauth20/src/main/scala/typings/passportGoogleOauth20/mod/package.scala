package typings.passportGoogleOauth20

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type OAuth2StrategyOptionsWithoutRequiredURLs = typings.std.Pick[
    typings.passportOauth2.mod.StrategyOptionsBase, 
    typings.std.Exclude[
      typings.passportGoogleOauth20.passportGoogleOauth20Strings.authorizationURL | typings.passportGoogleOauth20.passportGoogleOauth20Strings.tokenURL | typings.passportGoogleOauth20.passportGoogleOauth20Strings.clientID | typings.passportGoogleOauth20.passportGoogleOauth20Strings.clientSecret | typings.passportGoogleOauth20.passportGoogleOauth20Strings.callbackURL | typings.passportGoogleOauth20.passportGoogleOauth20Strings.customHeaders | typings.passportGoogleOauth20.passportGoogleOauth20Strings.scope | typings.passportGoogleOauth20.passportGoogleOauth20Strings.scopeSeparator | typings.passportGoogleOauth20.passportGoogleOauth20Strings.sessionKey | typings.passportGoogleOauth20.passportGoogleOauth20Strings.store | typings.passportGoogleOauth20.passportGoogleOauth20Strings.state, 
      typings.passportGoogleOauth20.passportGoogleOauth20Strings.authorizationURL | typings.passportGoogleOauth20.passportGoogleOauth20Strings.tokenURL
    ]
  ]
  type VerifyCallback = js.Function3[
    /* err */ js.UndefOr[java.lang.String | typings.std.Error], 
    /* user */ js.UndefOr[js.Any], 
    /* info */ js.UndefOr[js.Any], 
    scala.Unit
  ]
}
