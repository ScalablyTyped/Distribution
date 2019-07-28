package typings.plugapi.plugapiMod.EventNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModMoveDJ extends js.Object {
  var index: Double
  var moderator: String
  var old: Double
  var userID: String
}

object ModMoveDJ {
  @scala.inline
  def apply(index: Double, moderator: String, old: Double, userID: String): ModMoveDJ = {
    val __obj = js.Dynamic.literal(index = index, moderator = moderator, old = old, userID = userID)
  
    __obj.asInstanceOf[ModMoveDJ]
  }
}

