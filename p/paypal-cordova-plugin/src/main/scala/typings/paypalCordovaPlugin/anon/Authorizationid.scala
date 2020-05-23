package typings.paypalCordovaPlugin.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Authorizationid extends js.Object {
  var authorization_id: String
  var create_time: String
  var id: String
  var intent: String
  var state: String
}

object Authorizationid {
  @scala.inline
  def apply(authorization_id: String, create_time: String, id: String, intent: String, state: String): Authorizationid = {
    val __obj = js.Dynamic.literal(authorization_id = authorization_id.asInstanceOf[js.Any], create_time = create_time.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], intent = intent.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[Authorizationid]
  }
}

