package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.DELETE
import typings.octokitTypes.octokitTypesStrings.SlashuserSlashinstallationsSlashColoninstallation_idSlashrepositoriesSlashColonrepository_id
import typings.octokitTypes.requestHeadersMod.RequestHeaders
import typings.octokitTypes.requestRequestOptionsMod.RequestRequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppsRemoveRepoFromInstallationRequestOptions extends js.Object {
  var headers: RequestHeaders
  var method: DELETE
  var request: RequestRequestOptions
  var url: SlashuserSlashinstallationsSlashColoninstallation_idSlashrepositoriesSlashColonrepository_id
}

object AppsRemoveRepoFromInstallationRequestOptions {
  @scala.inline
  def apply(
    headers: RequestHeaders,
    method: DELETE,
    request: RequestRequestOptions,
    url: SlashuserSlashinstallationsSlashColoninstallation_idSlashrepositoriesSlashColonrepository_id
  ): AppsRemoveRepoFromInstallationRequestOptions = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppsRemoveRepoFromInstallationRequestOptions]
  }
}

