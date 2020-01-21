package typings.paypalCordovaPlugin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAuthorizationid extends js.Object {
  var authorization_id: String
  var create_time: String
  var id: String
  var intent: String
  var state: String
}

object AnonAuthorizationid {
  @scala.inline
  def apply(authorization_id: String, create_time: String, id: String, intent: String, state: String): AnonAuthorizationid = {
    val __obj = js.Dynamic.literal(authorization_id = authorization_id.asInstanceOf[js.Any], create_time = create_time.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], intent = intent.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAuthorizationid]
  }
}

