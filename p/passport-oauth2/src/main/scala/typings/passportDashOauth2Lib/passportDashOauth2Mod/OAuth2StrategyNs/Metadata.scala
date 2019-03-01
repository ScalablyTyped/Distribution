package typings
package passportDashOauth2Lib.passportDashOauth2Mod.OAuth2StrategyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Metadata extends js.Object {
  var authorizationURL: java.lang.String
  var clientID: java.lang.String
  var tokenURL: java.lang.String
}

object Metadata {
  @scala.inline
  def apply(authorizationURL: java.lang.String, clientID: java.lang.String, tokenURL: java.lang.String): Metadata = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("authorizationURL")(authorizationURL)
    __obj.updateDynamic("clientID")(clientID)
    __obj.updateDynamic("tokenURL")(tokenURL)
    __obj.asInstanceOf[Metadata]
  }
}

