package typings.oauth2orize.oauth2orizeMod

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
    val __obj = js.Dynamic.literal(cancelField = cancelField, sessionKey = sessionKey, userProperty = userProperty)
  
    __obj.asInstanceOf[DecisionOptions]
  }
}

