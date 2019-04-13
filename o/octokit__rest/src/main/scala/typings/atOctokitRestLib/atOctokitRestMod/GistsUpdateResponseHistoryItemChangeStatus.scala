package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GistsUpdateResponseHistoryItemChangeStatus extends js.Object {
  var additions: scala.Double
  var deletions: scala.Double
  var total: scala.Double
}

object GistsUpdateResponseHistoryItemChangeStatus {
  @scala.inline
  def apply(additions: scala.Double, deletions: scala.Double, total: scala.Double): GistsUpdateResponseHistoryItemChangeStatus = {
    val __obj = js.Dynamic.literal(additions = additions, deletions = deletions, total = total)
  
    __obj.asInstanceOf[GistsUpdateResponseHistoryItemChangeStatus]
  }
}

