package typings.passportDashKakao.passportDashKakaoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrategyOption extends js.Object {
  var callbackURL: String
  var clientID: String
  var clientSecret: String
  var customHeaders: js.UndefOr[String] = js.undefined
  var scopeSeparator: js.UndefOr[String] = js.undefined
}

object StrategyOption {
  @scala.inline
  def apply(
    callbackURL: String,
    clientID: String,
    clientSecret: String,
    customHeaders: String = null,
    scopeSeparator: String = null
  ): StrategyOption = {
    val __obj = js.Dynamic.literal(callbackURL = callbackURL, clientID = clientID, clientSecret = clientSecret)
    if (customHeaders != null) __obj.updateDynamic("customHeaders")(customHeaders)
    if (scopeSeparator != null) __obj.updateDynamic("scopeSeparator")(scopeSeparator)
    __obj.asInstanceOf[StrategyOption]
  }
}

