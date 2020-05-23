package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.PATCH
import typings.octokitTypes.octokitTypesStrings.SlashgistsSlashColongist_idSlashcommentsSlashColoncomment_id
import typings.octokitTypes.requestHeadersMod.RequestHeaders
import typings.octokitTypes.requestRequestOptionsMod.RequestRequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GistsUpdateCommentRequestOptions extends js.Object {
  var headers: RequestHeaders
  var method: PATCH
  var request: RequestRequestOptions
  var url: SlashgistsSlashColongist_idSlashcommentsSlashColoncomment_id
}

object GistsUpdateCommentRequestOptions {
  @scala.inline
  def apply(
    headers: RequestHeaders,
    method: PATCH,
    request: RequestRequestOptions,
    url: SlashgistsSlashColongist_idSlashcommentsSlashColoncomment_id
  ): GistsUpdateCommentRequestOptions = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[GistsUpdateCommentRequestOptions]
  }
}

