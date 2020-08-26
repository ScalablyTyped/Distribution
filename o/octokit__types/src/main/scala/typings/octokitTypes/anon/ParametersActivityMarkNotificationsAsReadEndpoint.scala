package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActivityMarkNotificationsAsReadEndpoint
import typings.octokitTypes.endpointsMod.ActivityMarkNotificationsAsReadRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersActivityMarkNotificationsAsReadEndpoint extends js.Object {
  var parameters: ActivityMarkNotificationsAsReadEndpoint = js.native
  var request: ActivityMarkNotificationsAsReadRequestOptions = js.native
  var response: OctokitResponse[_] = js.native
}

object ParametersActivityMarkNotificationsAsReadEndpoint {
  @scala.inline
  def apply(
    parameters: ActivityMarkNotificationsAsReadEndpoint,
    request: ActivityMarkNotificationsAsReadRequestOptions,
    response: OctokitResponse[_]
  ): ParametersActivityMarkNotificationsAsReadEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActivityMarkNotificationsAsReadEndpoint]
  }
  @scala.inline
  implicit class ParametersActivityMarkNotificationsAsReadEndpointOps[Self <: ParametersActivityMarkNotificationsAsReadEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: ActivityMarkNotificationsAsReadEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: ActivityMarkNotificationsAsReadRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

