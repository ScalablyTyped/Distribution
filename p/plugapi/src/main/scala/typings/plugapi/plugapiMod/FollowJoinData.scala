package typings.plugapi.plugapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FollowJoinData extends js.Object {
  var id: String
  var r: Double
  var un: String
}

object FollowJoinData {
  @scala.inline
  def apply(id: String, r: Double, un: String): FollowJoinData = {
    val __obj = js.Dynamic.literal(id = id, r = r, un = un)
  
    __obj.asInstanceOf[FollowJoinData]
  }
}

