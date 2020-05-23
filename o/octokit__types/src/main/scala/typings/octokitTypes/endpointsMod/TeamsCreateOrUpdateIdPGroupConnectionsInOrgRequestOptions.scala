package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.PATCH
import typings.octokitTypes.octokitTypesStrings.`SlashorgsSlashColonorgSlashteamsSlashColonteam_slugSlashteam-syncSlashgroup-mappings`
import typings.octokitTypes.requestHeadersMod.RequestHeaders
import typings.octokitTypes.requestRequestOptionsMod.RequestRequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamsCreateOrUpdateIdPGroupConnectionsInOrgRequestOptions extends js.Object {
  var headers: RequestHeaders
  var method: PATCH
  var request: RequestRequestOptions
  var url: `SlashorgsSlashColonorgSlashteamsSlashColonteam_slugSlashteam-syncSlashgroup-mappings`
}

object TeamsCreateOrUpdateIdPGroupConnectionsInOrgRequestOptions {
  @scala.inline
  def apply(
    headers: RequestHeaders,
    method: PATCH,
    request: RequestRequestOptions,
    url: `SlashorgsSlashColonorgSlashteamsSlashColonteam_slugSlashteam-syncSlashgroup-mappings`
  ): TeamsCreateOrUpdateIdPGroupConnectionsInOrgRequestOptions = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamsCreateOrUpdateIdPGroupConnectionsInOrgRequestOptions]
  }
}

