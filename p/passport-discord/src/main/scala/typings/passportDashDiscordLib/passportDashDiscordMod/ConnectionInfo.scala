package typings
package passportDashDiscordLib.passportDashDiscordMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionInfo extends js.Object {
  var id: java.lang.String
  var name: java.lang.String
  var show_activity: scala.Boolean
  var `type`: java.lang.String
  var verified: scala.Boolean
  var visibility: scala.Double
}

object ConnectionInfo {
  @scala.inline
  def apply(
    id: java.lang.String,
    name: java.lang.String,
    show_activity: scala.Boolean,
    `type`: java.lang.String,
    verified: scala.Boolean,
    visibility: scala.Double
  ): ConnectionInfo = {
    val __obj = js.Dynamic.literal(id = id, name = name, show_activity = show_activity, verified = verified, visibility = visibility)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ConnectionInfo]
  }
}

