package typings
package passportDashOauth2Lib.passportDashOauth2Mod.OAuth2StrategyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _StrategyOptionsBase extends js.Object {
  var authorizationURL: java.lang.String
  var callbackURL: js.UndefOr[java.lang.String] = js.undefined
  var clientID: java.lang.String
  var clientSecret: java.lang.String
  var customHeaders: js.UndefOr[nodeLib.httpMod.OutgoingHttpHeaders] = js.undefined
  var scope: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var scopeSeparator: js.UndefOr[java.lang.String] = js.undefined
  var sessionKey: js.UndefOr[java.lang.String] = js.undefined
  var state: js.UndefOr[js.Any] = js.undefined
  var store: js.UndefOr[StateStore] = js.undefined
  var tokenURL: java.lang.String
}

