package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.GET
import typings.octokitTypes.octokitTypesStrings.SlashprojectsSlashColonproject_idSlashcollaboratorsSlashColonusernameSlashpermission
import typings.octokitTypes.requestHeadersMod.RequestHeaders
import typings.octokitTypes.requestRequestOptionsMod.RequestRequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectsReviewUserPermissionLevelRequestOptions extends js.Object {
  var headers: RequestHeaders
  var method: GET
  var request: RequestRequestOptions
  var url: SlashprojectsSlashColonproject_idSlashcollaboratorsSlashColonusernameSlashpermission
}

object ProjectsReviewUserPermissionLevelRequestOptions {
  @scala.inline
  def apply(
    headers: RequestHeaders,
    method: GET,
    request: RequestRequestOptions,
    url: SlashprojectsSlashColonproject_idSlashcollaboratorsSlashColonusernameSlashpermission
  ): ProjectsReviewUserPermissionLevelRequestOptions = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectsReviewUserPermissionLevelRequestOptions]
  }
}

