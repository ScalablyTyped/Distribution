package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.OrgsConvertMemberToOutsideCollaboratorEndpoint
import typings.octokitTypes.endpointsMod.OrgsConvertMemberToOutsideCollaboratorRequestOptions
import typings.octokitTypes.endpointsMod.OrgsConvertMemberToOutsideCollaboratorResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersOrgsConvertMemberToOutsideCollaboratorEndpoint extends js.Object {
  var parameters: OrgsConvertMemberToOutsideCollaboratorEndpoint
  var request: OrgsConvertMemberToOutsideCollaboratorRequestOptions
  var response: OctokitResponse[OrgsConvertMemberToOutsideCollaboratorResponseData]
}

object ParametersOrgsConvertMemberToOutsideCollaboratorEndpoint {
  @scala.inline
  def apply(
    parameters: OrgsConvertMemberToOutsideCollaboratorEndpoint,
    request: OrgsConvertMemberToOutsideCollaboratorRequestOptions,
    response: OctokitResponse[OrgsConvertMemberToOutsideCollaboratorResponseData]
  ): ParametersOrgsConvertMemberToOutsideCollaboratorEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersOrgsConvertMemberToOutsideCollaboratorEndpoint]
  }
}

