package typings.passportDashCognito.passportDashCognitoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CognitoStrategyOptions extends js.Object {
  var clientId: String
  var region: String
  var userPoolId: String
}

object CognitoStrategyOptions {
  @scala.inline
  def apply(clientId: String, region: String, userPoolId: String): CognitoStrategyOptions = {
    val __obj = js.Dynamic.literal(clientId = clientId.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], userPoolId = userPoolId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CognitoStrategyOptions]
  }
}

