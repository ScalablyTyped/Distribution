package typings.paypalDashCordovaDashPlugin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Authorizationid extends js.Object {
  var authorization_id: String
  var create_time: String
  var id: String
  var intent: String
  var state: String
}

object Anon_Authorizationid {
  @scala.inline
  def apply(authorization_id: String, create_time: String, id: String, intent: String, state: String): Anon_Authorizationid = {
    val __obj = js.Dynamic.literal(authorization_id = authorization_id, create_time = create_time, id = id, intent = intent, state = state)
  
    __obj.asInstanceOf[Anon_Authorizationid]
  }
}

