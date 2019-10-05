package typings.passportDashBeam.passportDashBeamMod.Strategy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStrategyOption extends js.Object {
  var callbackURL: String
  var clientID: String
  var clientSecret: String
}

object IStrategyOption {
  @scala.inline
  def apply(callbackURL: String, clientID: String, clientSecret: String): IStrategyOption = {
    val __obj = js.Dynamic.literal(callbackURL = callbackURL, clientID = clientID, clientSecret = clientSecret)
  
    __obj.asInstanceOf[IStrategyOption]
  }
}

