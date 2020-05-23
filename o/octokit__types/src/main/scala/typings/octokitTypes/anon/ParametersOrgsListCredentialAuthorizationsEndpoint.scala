package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.OrgsListCredentialAuthorizationsEndpoint
import typings.octokitTypes.endpointsMod.OrgsListCredentialAuthorizationsRequestOptions
import typings.octokitTypes.endpointsMod.OrgsListCredentialAuthorizationsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersOrgsListCredentialAuthorizationsEndpoint extends js.Object {
  var parameters: OrgsListCredentialAuthorizationsEndpoint
  var request: OrgsListCredentialAuthorizationsRequestOptions
  var response: OctokitResponse[OrgsListCredentialAuthorizationsResponseData]
}

object ParametersOrgsListCredentialAuthorizationsEndpoint {
  @scala.inline
  def apply(
    parameters: OrgsListCredentialAuthorizationsEndpoint,
    request: OrgsListCredentialAuthorizationsRequestOptions,
    response: OctokitResponse[OrgsListCredentialAuthorizationsResponseData]
  ): ParametersOrgsListCredentialAuthorizationsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersOrgsListCredentialAuthorizationsEndpoint]
  }
}

