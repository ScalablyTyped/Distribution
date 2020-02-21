package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonArchivedstate extends js.Object {
  var archived_state: AnonEnum
  var column_id: AnonRequired
  var page: AnonType
  var per_page: AnonType
}

object AnonArchivedstate {
  @scala.inline
  def apply(archived_state: AnonEnum, column_id: AnonRequired, page: AnonType, per_page: AnonType): AnonArchivedstate = {
    val __obj = js.Dynamic.literal(archived_state = archived_state.asInstanceOf[js.Any], column_id = column_id.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], per_page = per_page.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonArchivedstate]
  }
}

