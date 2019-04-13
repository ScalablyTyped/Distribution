package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposGetParticipationStatsResponse extends js.Object {
  var all: js.Array[scala.Double]
  var owner: js.Array[scala.Double]
}

object ReposGetParticipationStatsResponse {
  @scala.inline
  def apply(all: js.Array[scala.Double], owner: js.Array[scala.Double]): ReposGetParticipationStatsResponse = {
    val __obj = js.Dynamic.literal(all = all, owner = owner)
  
    __obj.asInstanceOf[ReposGetParticipationStatsResponse]
  }
}

