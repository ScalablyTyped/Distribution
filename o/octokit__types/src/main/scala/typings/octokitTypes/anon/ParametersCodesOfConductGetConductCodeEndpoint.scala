package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.CodesOfConductGetConductCodeEndpoint
import typings.octokitTypes.endpointsMod.CodesOfConductGetConductCodeRequestOptions
import typings.octokitTypes.endpointsMod.CodesOfConductGetConductCodeResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersCodesOfConductGetConductCodeEndpoint extends js.Object {
  var parameters: CodesOfConductGetConductCodeEndpoint
  var request: CodesOfConductGetConductCodeRequestOptions
  var response: OctokitResponse[CodesOfConductGetConductCodeResponseData]
}

object ParametersCodesOfConductGetConductCodeEndpoint {
  @scala.inline
  def apply(
    parameters: CodesOfConductGetConductCodeEndpoint,
    request: CodesOfConductGetConductCodeRequestOptions,
    response: OctokitResponse[CodesOfConductGetConductCodeResponseData]
  ): ParametersCodesOfConductGetConductCodeEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersCodesOfConductGetConductCodeEndpoint]
  }
}

