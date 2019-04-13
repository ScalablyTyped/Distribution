package typings
package plugapiLib.plugapiMod

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
    val __obj = js.Dynamic.literal(id = id, r = r, un = un)
  
    __obj.asInstanceOf[FollowJoinData]
  }
}

