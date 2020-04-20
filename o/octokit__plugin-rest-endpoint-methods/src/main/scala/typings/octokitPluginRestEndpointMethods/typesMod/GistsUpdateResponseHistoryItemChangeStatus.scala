package typings.octokitPluginRestEndpointMethods.typesMod

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
    val __obj = js.Dynamic.literal(additions = additions.asInstanceOf[js.Any], deletions = deletions.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[GistsUpdateResponseHistoryItemChangeStatus]
  }
}

