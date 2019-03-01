package typings
package passportDashDiscordLib.passportDashDiscordMod.StrategyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrategyOption extends js.Object {
  var callbackURL: java.lang.String
  var clientID: java.lang.String
  var clientSecret: java.lang.String
  var scope: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object StrategyOption {
  @scala.inline
  def apply(
    callbackURL: java.lang.String,
    clientID: java.lang.String,
    clientSecret: java.lang.String,
    scope: js.Array[java.lang.String] = null
  ): StrategyOption = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("callbackURL")(callbackURL)
    __obj.updateDynamic("clientID")(clientID)
    __obj.updateDynamic("clientSecret")(clientSecret)
    if (scope != null) __obj.updateDynamic("scope")(scope)
    __obj.asInstanceOf[StrategyOption]
  }
}

