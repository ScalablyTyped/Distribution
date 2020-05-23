package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ChecksCreateEndpoint
import typings.octokitTypes.endpointsMod.ChecksCreateRequestOptions
import typings.octokitTypes.endpointsMod.ChecksCreateResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersChecksCreateEndpoint extends js.Object {
  var parameters: ChecksCreateEndpoint
  var request: ChecksCreateRequestOptions
  var response: OctokitResponse[ChecksCreateResponseData]
}

object ParametersChecksCreateEndpoint {
  @scala.inline
  def apply(
    parameters: ChecksCreateEndpoint,
    request: ChecksCreateRequestOptions,
    response: OctokitResponse[ChecksCreateResponseData]
  ): ParametersChecksCreateEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersChecksCreateEndpoint]
  }
}

