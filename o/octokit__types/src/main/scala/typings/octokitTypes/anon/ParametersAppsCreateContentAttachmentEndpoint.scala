package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.AppsCreateContentAttachmentEndpoint
import typings.octokitTypes.endpointsMod.AppsCreateContentAttachmentRequestOptions
import typings.octokitTypes.endpointsMod.AppsCreateContentAttachmentResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersAppsCreateContentAttachmentEndpoint extends js.Object {
  var parameters: AppsCreateContentAttachmentEndpoint
  var request: AppsCreateContentAttachmentRequestOptions
  var response: OctokitResponse[AppsCreateContentAttachmentResponseData]
}

object ParametersAppsCreateContentAttachmentEndpoint {
  @scala.inline
  def apply(
    parameters: AppsCreateContentAttachmentEndpoint,
    request: AppsCreateContentAttachmentRequestOptions,
    response: OctokitResponse[AppsCreateContentAttachmentResponseData]
  ): ParametersAppsCreateContentAttachmentEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersAppsCreateContentAttachmentEndpoint]
  }
}

