package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDirectionFilterLabels extends js.Object {
  var direction: AnonEnum
  var filter: AnonEnum
  var labels: AnonType
  var org: AnonRequired
  var page: AnonType
  var per_page: AnonType
  var since: AnonType
  var sort: AnonEnum
  var state: AnonEnum
}

object AnonDirectionFilterLabels {
  @scala.inline
  def apply(
    direction: AnonEnum,
    filter: AnonEnum,
    labels: AnonType,
    org: AnonRequired,
    page: AnonType,
    per_page: AnonType,
    since: AnonType,
    sort: AnonEnum,
    state: AnonEnum
  ): AnonDirectionFilterLabels = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], filter = filter.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any], org = org.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], per_page = per_page.asInstanceOf[js.Any], since = since.asInstanceOf[js.Any], sort = sort.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDirectionFilterLabels]
  }
}

