package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.ChecksListForSuiteEndpoint
import typings.octokitTypes.endpointsMod.ChecksListForSuiteResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersChecksListForSuiteEndpoint extends js.Object {
  var parameters: ChecksListForSuiteEndpoint = js.native
  var response: OctokitResponse[ChecksListForSuiteResponseData] with `9` = js.native
}

object ParametersChecksListForSuiteEndpoint {
  @scala.inline
  def apply(
    parameters: ChecksListForSuiteEndpoint,
    response: OctokitResponse[ChecksListForSuiteResponseData] with `9`
  ): ParametersChecksListForSuiteEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersChecksListForSuiteEndpoint]
  }
  @scala.inline
  implicit class ParametersChecksListForSuiteEndpointOps[Self <: ParametersChecksListForSuiteEndpoint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setParameters(value: ChecksListForSuiteEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[ChecksListForSuiteResponseData] with `9`): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

