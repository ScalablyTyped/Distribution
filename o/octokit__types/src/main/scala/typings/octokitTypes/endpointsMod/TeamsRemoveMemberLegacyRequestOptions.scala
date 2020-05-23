package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.DELETE
import typings.octokitTypes.octokitTypesStrings.SlashteamsSlashColonteam_idSlashmembersSlashColonusername
import typings.octokitTypes.requestHeadersMod.RequestHeaders
import typings.octokitTypes.requestRequestOptionsMod.RequestRequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamsRemoveMemberLegacyRequestOptions extends js.Object {
  var headers: RequestHeaders
  var method: DELETE
  var request: RequestRequestOptions
  var url: SlashteamsSlashColonteam_idSlashmembersSlashColonusername
}

object TeamsRemoveMemberLegacyRequestOptions {
  @scala.inline
  def apply(
    headers: RequestHeaders,
    method: DELETE,
    request: RequestRequestOptions,
    url: SlashteamsSlashColonteam_idSlashmembersSlashColonusername
  ): TeamsRemoveMemberLegacyRequestOptions = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamsRemoveMemberLegacyRequestOptions]
  }
}

