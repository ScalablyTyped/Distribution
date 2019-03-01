package typings
package paypalDashCordovaDashPluginLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Authorizationid extends js.Object {
  var authorization_id: java.lang.String
  var create_time: java.lang.String
  var id: java.lang.String
  var intent: java.lang.String
  var state: java.lang.String
}

object Anon_Authorizationid {
  @scala.inline
  def apply(
    authorization_id: java.lang.String,
    create_time: java.lang.String,
    id: java.lang.String,
    intent: java.lang.String,
    state: java.lang.String
  ): Anon_Authorizationid = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("authorization_id")(authorization_id)
    __obj.updateDynamic("create_time")(create_time)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("intent")(intent)
    __obj.updateDynamic("state")(state)
    __obj.asInstanceOf[Anon_Authorizationid]
  }
}

