package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.CodesOfConductGetAllCodesOfConductEndpoint
import typings.octokitTypes.endpointsMod.CodesOfConductGetAllCodesOfConductRequestOptions
import typings.octokitTypes.endpointsMod.CodesOfConductGetAllCodesOfConductResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersCodesOfConductGetAllCodesOfConductEndpoint extends js.Object {
  var parameters: CodesOfConductGetAllCodesOfConductEndpoint
  var request: CodesOfConductGetAllCodesOfConductRequestOptions
  var response: OctokitResponse[CodesOfConductGetAllCodesOfConductResponseData]
}

object ParametersCodesOfConductGetAllCodesOfConductEndpoint {
  @scala.inline
  def apply(
    parameters: CodesOfConductGetAllCodesOfConductEndpoint,
    request: CodesOfConductGetAllCodesOfConductRequestOptions,
    response: OctokitResponse[CodesOfConductGetAllCodesOfConductResponseData]
  ): ParametersCodesOfConductGetAllCodesOfConductEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersCodesOfConductGetAllCodesOfConductEndpoint]
  }
}

