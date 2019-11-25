package typings.plugapi.plugapiMod.Event

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
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], moderator = moderator.asInstanceOf[js.Any], old = old.asInstanceOf[js.Any], userID = userID.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ModMoveDJ]
  }
}

