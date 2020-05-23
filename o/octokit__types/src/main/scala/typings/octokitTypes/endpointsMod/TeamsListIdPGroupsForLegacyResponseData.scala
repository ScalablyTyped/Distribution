package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Groupdescription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamsListIdPGroupsForLegacyResponseData extends js.Object {
  var groups: js.Array[Groupdescription]
}

object TeamsListIdPGroupsForLegacyResponseData {
  @scala.inline
  def apply(groups: js.Array[Groupdescription]): TeamsListIdPGroupsForLegacyResponseData = {
    val __obj = js.Dynamic.literal(groups = groups.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamsListIdPGroupsForLegacyResponseData]
  }
}

