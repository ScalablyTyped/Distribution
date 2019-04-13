package typings
package plugapiLib.plugapiMod.UserNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Extended extends Default {
  var curatorPoints: scala.Double
  var djPoints: scala.Double
  var fans: scala.Double
  var id: java.lang.String
  var listenerPoints: scala.Double
  var status: scala.Double
}

object Extended {
  @scala.inline
  def apply(
    avatarID: java.lang.String,
    curatorPoints: scala.Double,
    djPoints: scala.Double,
    fans: scala.Double,
    id: java.lang.String,
    language: java.lang.String,
    listenerPoints: scala.Double,
    status: scala.Double,
    username: java.lang.String
  ): Extended = {
    val __obj = js.Dynamic.literal(avatarID = avatarID, curatorPoints = curatorPoints, djPoints = djPoints, fans = fans, id = id, language = language, listenerPoints = listenerPoints, status = status, username = username)
  
    __obj.asInstanceOf[Extended]
  }
}

