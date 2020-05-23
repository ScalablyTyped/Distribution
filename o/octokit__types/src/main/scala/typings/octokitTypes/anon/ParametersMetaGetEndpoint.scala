package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.MetaGetEndpoint
import typings.octokitTypes.endpointsMod.MetaGetRequestOptions
import typings.octokitTypes.endpointsMod.MetaGetResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersMetaGetEndpoint extends js.Object {
  var parameters: MetaGetEndpoint
  var request: MetaGetRequestOptions
  var response: OctokitResponse[MetaGetResponseData]
}

object ParametersMetaGetEndpoint {
  @scala.inline
  def apply(
    parameters: MetaGetEndpoint,
    request: MetaGetRequestOptions,
    response: OctokitResponse[MetaGetResponseData]
  ): ParametersMetaGetEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersMetaGetEndpoint]
  }
}

