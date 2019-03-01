package typings
package plugapiLib.plugapiMod.PlugAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FollowJoinData extends js.Object {
  var id: java.lang.String
  var r: scala.Double
  var un: java.lang.String
}

object FollowJoinData {
  @scala.inline
  def apply(id: java.lang.String, r: scala.Double, un: java.lang.String): FollowJoinData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("r")(r)
    __obj.updateDynamic("un")(un)
    __obj.asInstanceOf[FollowJoinData]
  }
}

