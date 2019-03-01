package typings
package passportDashCognitoLib.passportDashCognitoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CognitoStrategyOptions extends js.Object {
  var clientId: java.lang.String
  var region: java.lang.String
  var userPoolId: java.lang.String
}

object CognitoStrategyOptions {
  @scala.inline
  def apply(clientId: java.lang.String, region: java.lang.String, userPoolId: java.lang.String): CognitoStrategyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("clientId")(clientId)
    __obj.updateDynamic("region")(region)
    __obj.updateDynamic("userPoolId")(userPoolId)
    __obj.asInstanceOf[CognitoStrategyOptions]
  }
}

