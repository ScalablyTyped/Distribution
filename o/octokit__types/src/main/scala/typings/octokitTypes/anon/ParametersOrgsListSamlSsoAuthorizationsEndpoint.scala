package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.OrgsListSamlSsoAuthorizationsEndpoint
import typings.octokitTypes.endpointsMod.OrgsListSamlSsoAuthorizationsRequestOptions
import typings.octokitTypes.endpointsMod.OrgsListSamlSsoAuthorizationsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersOrgsListSamlSsoAuthorizationsEndpoint extends js.Object {
  var parameters: OrgsListSamlSsoAuthorizationsEndpoint
  var request: OrgsListSamlSsoAuthorizationsRequestOptions
  var response: OctokitResponse[OrgsListSamlSsoAuthorizationsResponseData]
}

object ParametersOrgsListSamlSsoAuthorizationsEndpoint {
  @scala.inline
  def apply(
    parameters: OrgsListSamlSsoAuthorizationsEndpoint,
    request: OrgsListSamlSsoAuthorizationsRequestOptions,
    response: OctokitResponse[OrgsListSamlSsoAuthorizationsResponseData]
  ): ParametersOrgsListSamlSsoAuthorizationsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersOrgsListSamlSsoAuthorizationsEndpoint]
  }
}

