package typings.octokitPluginRestEndpointMethods.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GistsGetResponseHistoryItemChangeStatus extends js.Object {
  var additions: Double
  var deletions: Double
  var total: Double
}

object GistsGetResponseHistoryItemChangeStatus {
  @scala.inline
  def apply(additions: Double, deletions: Double, total: Double): GistsGetResponseHistoryItemChangeStatus = {
    val __obj = js.Dynamic.literal(additions = additions.asInstanceOf[js.Any], deletions = deletions.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GistsGetResponseHistoryItemChangeStatus]
  }
}

