package typings.plugapi.plugapiMod.Event

import typings.plugapi.plugapiMod.FollowJoinData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FollowJoin extends js.Object {
  var data: FollowJoinData
  var `type`: String
}

object FollowJoin {
  @scala.inline
  def apply(data: FollowJoinData, `type`: String): FollowJoin = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FollowJoin]
  }
}

