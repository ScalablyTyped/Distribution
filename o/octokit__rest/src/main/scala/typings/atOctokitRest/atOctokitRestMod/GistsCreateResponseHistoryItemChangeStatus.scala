package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GistsCreateResponseHistoryItemChangeStatus extends js.Object {
  var additions: Double
  var deletions: Double
  var total: Double
}

object GistsCreateResponseHistoryItemChangeStatus {
  @scala.inline
  def apply(additions: Double, deletions: Double, total: Double): GistsCreateResponseHistoryItemChangeStatus = {
    val __obj = js.Dynamic.literal(additions = additions, deletions = deletions, total = total)
  
    __obj.asInstanceOf[GistsCreateResponseHistoryItemChangeStatus]
  }
}

