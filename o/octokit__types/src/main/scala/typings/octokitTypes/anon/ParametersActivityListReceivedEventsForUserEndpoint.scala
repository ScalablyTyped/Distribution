package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActivityListReceivedEventsForUserEndpoint
import typings.octokitTypes.endpointsMod.ActivityListReceivedEventsForUserRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersActivityListReceivedEventsForUserEndpoint extends js.Object {
  var parameters: ActivityListReceivedEventsForUserEndpoint = js.native
  var request: ActivityListReceivedEventsForUserRequestOptions = js.native
  var response: OctokitResponse[_] = js.native
}

object ParametersActivityListReceivedEventsForUserEndpoint {
  @scala.inline
  def apply(
    parameters: ActivityListReceivedEventsForUserEndpoint,
    request: ActivityListReceivedEventsForUserRequestOptions,
    response: OctokitResponse[_]
  ): ParametersActivityListReceivedEventsForUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActivityListReceivedEventsForUserEndpoint]
  }
  @scala.inline
  implicit class ParametersActivityListReceivedEventsForUserEndpointOps[Self <: ParametersActivityListReceivedEventsForUserEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: ActivityListReceivedEventsForUserEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: ActivityListReceivedEventsForUserRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

