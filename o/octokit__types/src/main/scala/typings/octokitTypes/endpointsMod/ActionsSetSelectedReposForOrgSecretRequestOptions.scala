package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.PUT
import typings.octokitTypes.octokitTypesStrings.SlashorgsSlashColonorgSlashactionsSlashsecretsSlashColonsecret_nameSlashrepositories
import typings.octokitTypes.requestHeadersMod.RequestHeaders
import typings.octokitTypes.requestRequestOptionsMod.RequestRequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionsSetSelectedReposForOrgSecretRequestOptions extends js.Object {
  var headers: RequestHeaders
  var method: PUT
  var request: RequestRequestOptions
  var url: SlashorgsSlashColonorgSlashactionsSlashsecretsSlashColonsecret_nameSlashrepositories
}

object ActionsSetSelectedReposForOrgSecretRequestOptions {
  @scala.inline
  def apply(
    headers: RequestHeaders,
    method: PUT,
    request: RequestRequestOptions,
    url: SlashorgsSlashColonorgSlashactionsSlashsecretsSlashColonsecret_nameSlashrepositories
  ): ActionsSetSelectedReposForOrgSecretRequestOptions = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionsSetSelectedReposForOrgSecretRequestOptions]
  }
}

