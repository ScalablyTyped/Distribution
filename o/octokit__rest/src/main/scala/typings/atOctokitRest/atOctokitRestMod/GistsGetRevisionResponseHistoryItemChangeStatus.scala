package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GistsGetRevisionResponseHistoryItemChangeStatus extends js.Object {
  var additions: Double
  var deletions: Double
  var total: Double
}

object GistsGetRevisionResponseHistoryItemChangeStatus {
  @scala.inline
  def apply(additions: Double, deletions: Double, total: Double): GistsGetRevisionResponseHistoryItemChangeStatus = {
    val __obj = js.Dynamic.literal(additions = additions, deletions = deletions, total = total)
  
    __obj.asInstanceOf[GistsGetRevisionResponseHistoryItemChangeStatus]
  }
}

