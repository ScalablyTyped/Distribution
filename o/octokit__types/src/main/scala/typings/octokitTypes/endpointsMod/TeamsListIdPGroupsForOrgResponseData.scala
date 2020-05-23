package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Groupdescription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamsListIdPGroupsForOrgResponseData extends js.Object {
  var groups: js.Array[Groupdescription]
}

object TeamsListIdPGroupsForOrgResponseData {
  @scala.inline
  def apply(groups: js.Array[Groupdescription]): TeamsListIdPGroupsForOrgResponseData = {
    val __obj = js.Dynamic.literal(groups = groups.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamsListIdPGroupsForOrgResponseData]
  }
}

