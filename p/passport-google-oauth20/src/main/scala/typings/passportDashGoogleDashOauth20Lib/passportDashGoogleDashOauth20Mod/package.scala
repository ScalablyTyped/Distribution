package typings
package passportDashGoogleDashOauth20Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object passportDashGoogleDashOauth20Mod {
  type OAuth2StrategyOptionsWithoutRequiredURLs = stdLib.Pick[
    passportDashOauth2Lib.passportDashOauth2Mod._StrategyOptionsBase, 
    stdLib.Exclude[
      passportDashGoogleDashOauth20Lib.passportDashGoogleDashOauth20LibStrings.authorizationURL | passportDashGoogleDashOauth20Lib.passportDashGoogleDashOauth20LibStrings.tokenURL | passportDashGoogleDashOauth20Lib.passportDashGoogleDashOauth20LibStrings.clientID | passportDashGoogleDashOauth20Lib.passportDashGoogleDashOauth20LibStrings.clientSecret | passportDashGoogleDashOauth20Lib.passportDashGoogleDashOauth20LibStrings.callbackURL | passportDashGoogleDashOauth20Lib.passportDashGoogleDashOauth20LibStrings.customHeaders | passportDashGoogleDashOauth20Lib.passportDashGoogleDashOauth20LibStrings.scope | passportDashGoogleDashOauth20Lib.passportDashGoogleDashOauth20LibStrings.scopeSeparator | passportDashGoogleDashOauth20Lib.passportDashGoogleDashOauth20LibStrings.sessionKey | passportDashGoogleDashOauth20Lib.passportDashGoogleDashOauth20LibStrings.store | passportDashGoogleDashOauth20Lib.passportDashGoogleDashOauth20LibStrings.state, 
      passportDashGoogleDashOauth20Lib.passportDashGoogleDashOauth20LibStrings.authorizationURL | passportDashGoogleDashOauth20Lib.passportDashGoogleDashOauth20LibStrings.tokenURL
    ]
  ]
  type VerifyCallback = js.Function3[
    /* err */ js.UndefOr[java.lang.String | stdLib.Error], 
    /* user */ js.UndefOr[js.Any], 
    /* info */ js.UndefOr[js.Any], 
    scala.Unit
  ]
}
