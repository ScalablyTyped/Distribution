package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReactionsDeleteLegacyEndpoint
import typings.octokitTypes.endpointsMod.ReactionsDeleteLegacyRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReactionsDeleteLegacyEndpoint extends js.Object {
  var parameters: ReactionsDeleteLegacyEndpoint
  var request: ReactionsDeleteLegacyRequestOptions
  var response: OctokitResponse[_]
}

object ParametersReactionsDeleteLegacyEndpoint {
  @scala.inline
  def apply(
    parameters: ReactionsDeleteLegacyEndpoint,
    request: ReactionsDeleteLegacyRequestOptions,
    response: OctokitResponse[_]
  ): ParametersReactionsDeleteLegacyEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReactionsDeleteLegacyEndpoint]
  }
}

