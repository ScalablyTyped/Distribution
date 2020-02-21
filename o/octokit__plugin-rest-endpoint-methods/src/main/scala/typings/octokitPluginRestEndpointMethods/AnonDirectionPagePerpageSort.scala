package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDirectionPagePerpageSort extends js.Object {
  var direction: AnonEnum
  var page: AnonType
  var per_page: AnonType
  var sort: AnonEnum
  var `type`: AnonEnum
  var username: AnonRequired
}

object AnonDirectionPagePerpageSort {
  @scala.inline
  def apply(
    direction: AnonEnum,
    page: AnonType,
    per_page: AnonType,
    sort: AnonEnum,
    `type`: AnonEnum,
    username: AnonRequired
  ): AnonDirectionPagePerpageSort = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], per_page = per_page.asInstanceOf[js.Any], sort = sort.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDirectionPagePerpageSort]
  }
}

