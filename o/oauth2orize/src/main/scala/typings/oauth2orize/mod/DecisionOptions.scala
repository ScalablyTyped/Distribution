package typings.oauth2orize.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DecisionOptions extends js.Object {
  var cancelField: String
  var sessionKey: String
  var userProperty: String
}

object DecisionOptions {
  @scala.inline
  def apply(cancelField: String, sessionKey: String, userProperty: String): DecisionOptions = {
    val __obj = js.Dynamic.literal(cancelField = cancelField.asInstanceOf[js.Any], sessionKey = sessionKey.asInstanceOf[js.Any], userProperty = userProperty.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecisionOptions]
  }
}

