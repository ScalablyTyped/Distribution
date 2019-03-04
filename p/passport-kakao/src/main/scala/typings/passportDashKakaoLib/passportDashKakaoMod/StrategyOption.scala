package typings
package passportDashKakaoLib.passportDashKakaoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrategyOption extends js.Object {
  var callbackURL: java.lang.String
  var clientID: java.lang.String
  var clientSecret: java.lang.String
  var customHeaders: js.UndefOr[java.lang.String] = js.undefined
  var scopeSeparator: js.UndefOr[java.lang.String] = js.undefined
}

object StrategyOption {
  @scala.inline
  def apply(
    callbackURL: java.lang.String,
    clientID: java.lang.String,
    clientSecret: java.lang.String,
    customHeaders: java.lang.String = null,
    scopeSeparator: java.lang.String = null
  ): StrategyOption = {
    val __obj = js.Dynamic.literal(callbackURL = callbackURL, clientID = clientID, clientSecret = clientSecret)
    if (customHeaders != null) __obj.updateDynamic("customHeaders")(customHeaders)
    if (scopeSeparator != null) __obj.updateDynamic("scopeSeparator")(scopeSeparator)
    __obj.asInstanceOf[StrategyOption]
  }
}

