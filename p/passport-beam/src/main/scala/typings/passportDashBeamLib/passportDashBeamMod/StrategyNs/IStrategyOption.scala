package typings
package passportDashBeamLib.passportDashBeamMod.StrategyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStrategyOption extends js.Object {
  var callbackURL: java.lang.String
  var clientID: java.lang.String
  var clientSecret: java.lang.String
}

object IStrategyOption {
  @scala.inline
  def apply(callbackURL: java.lang.String, clientID: java.lang.String, clientSecret: java.lang.String): IStrategyOption = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("callbackURL")(callbackURL)
    __obj.updateDynamic("clientID")(clientID)
    __obj.updateDynamic("clientSecret")(clientSecret)
    __obj.asInstanceOf[IStrategyOption]
  }
}

