package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.AppsDeleteTokenEndpoint
import typings.octokitTypes.endpointsMod.AppsDeleteTokenRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestResponse extends js.Object {
  var parameters: AppsDeleteTokenEndpoint
  var request: AppsDeleteTokenRequestOptions
  var response: OctokitResponse[_]
}

object RequestResponse {
  @scala.inline
  def apply(
    parameters: AppsDeleteTokenEndpoint,
    request: AppsDeleteTokenRequestOptions,
    response: OctokitResponse[_]
  ): RequestResponse = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestResponse]
  }
}

