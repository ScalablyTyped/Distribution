package typings
package oauth2orizeLib.oauth2orizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DecisionOptions extends js.Object {
  var cancelField: java.lang.String
  var sessionKey: java.lang.String
  var userProperty: java.lang.String
}

object DecisionOptions {
  @scala.inline
  def apply(cancelField: java.lang.String, sessionKey: java.lang.String, userProperty: java.lang.String): DecisionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cancelField")(cancelField)
    __obj.updateDynamic("sessionKey")(sessionKey)
    __obj.updateDynamic("userProperty")(userProperty)
    __obj.asInstanceOf[DecisionOptions]
  }
}

