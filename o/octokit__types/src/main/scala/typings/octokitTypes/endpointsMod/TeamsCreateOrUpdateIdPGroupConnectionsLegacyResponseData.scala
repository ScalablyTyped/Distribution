package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Groupdescription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamsCreateOrUpdateIdPGroupConnectionsLegacyResponseData extends js.Object {
  var groups: js.Array[Groupdescription]
}

object TeamsCreateOrUpdateIdPGroupConnectionsLegacyResponseData {
  @scala.inline
  def apply(groups: js.Array[Groupdescription]): TeamsCreateOrUpdateIdPGroupConnectionsLegacyResponseData = {
    val __obj = js.Dynamic.literal(groups = groups.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamsCreateOrUpdateIdPGroupConnectionsLegacyResponseData]
  }
}

