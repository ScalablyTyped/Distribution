package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GistsUpdateResponseHistoryItemChangeStatus extends js.Object {
  var additions: Double
  var deletions: Double
  var total: Double
}

object GistsUpdateResponseHistoryItemChangeStatus {
  @scala.inline
  def apply(additions: Double, deletions: Double, total: Double): GistsUpdateResponseHistoryItemChangeStatus = {
    val __obj = js.Dynamic.literal(additions = additions, deletions = deletions, total = total)
  
    __obj.asInstanceOf[GistsUpdateResponseHistoryItemChangeStatus]
  }
}

