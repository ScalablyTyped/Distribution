package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.POST
import typings.octokitTypes.octokitTypesStrings.SlashreposSlashColonownerSlashColonrepoSlashreleasesSlashColonrelease_idSlashassetsLeftcurlybracketQuestionmarknameCommalabelRightcurlybracket
import typings.octokitTypes.requestHeadersMod.RequestHeaders
import typings.octokitTypes.requestRequestOptionsMod.RequestRequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposUploadReleaseAssetRequestOptions extends js.Object {
  var headers: RequestHeaders
  var method: POST
  var request: RequestRequestOptions
  var url: SlashreposSlashColonownerSlashColonrepoSlashreleasesSlashColonrelease_idSlashassetsLeftcurlybracketQuestionmarknameCommalabelRightcurlybracket
}

object ReposUploadReleaseAssetRequestOptions {
  @scala.inline
  def apply(
    headers: RequestHeaders,
    method: POST,
    request: RequestRequestOptions,
    url: SlashreposSlashColonownerSlashColonrepoSlashreleasesSlashColonrelease_idSlashassetsLeftcurlybracketQuestionmarknameCommalabelRightcurlybracket
  ): ReposUploadReleaseAssetRequestOptions = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposUploadReleaseAssetRequestOptions]
  }
}

