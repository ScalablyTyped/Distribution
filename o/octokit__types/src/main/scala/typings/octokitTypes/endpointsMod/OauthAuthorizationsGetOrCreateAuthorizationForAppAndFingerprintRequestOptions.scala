package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.PUT
import typings.octokitTypes.octokitTypesStrings.SlashauthorizationsSlashclientsSlashColonclient_idSlashColonfingerprint
import typings.octokitTypes.requestHeadersMod.RequestHeaders
import typings.octokitTypes.requestRequestOptionsMod.RequestRequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OauthAuthorizationsGetOrCreateAuthorizationForAppAndFingerprintRequestOptions extends js.Object {
  var headers: RequestHeaders
  var method: PUT
  var request: RequestRequestOptions
  var url: SlashauthorizationsSlashclientsSlashColonclient_idSlashColonfingerprint
}

object OauthAuthorizationsGetOrCreateAuthorizationForAppAndFingerprintRequestOptions {
  @scala.inline
  def apply(
    headers: RequestHeaders,
    method: PUT,
    request: RequestRequestOptions,
    url: SlashauthorizationsSlashclientsSlashColonclient_idSlashColonfingerprint
  ): OauthAuthorizationsGetOrCreateAuthorizationForAppAndFingerprintRequestOptions = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[OauthAuthorizationsGetOrCreateAuthorizationForAppAndFingerprintRequestOptions]
  }
}

