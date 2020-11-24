package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.OrgsConvertMemberToOutsideCollaboratorEndpoint
import typings.octokitTypes.endpointsMod.OrgsConvertMemberToOutsideCollaboratorResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `789` extends js.Object {
  
  var parameters: RequestParameters with (Omit[OrgsConvertMemberToOutsideCollaboratorEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[OrgsConvertMemberToOutsideCollaboratorResponseData] = js.native
}
object `789` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[OrgsConvertMemberToOutsideCollaboratorEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[OrgsConvertMemberToOutsideCollaboratorResponseData]
  ): `789` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`789`]
  }
  
  @scala.inline
  implicit class `789Ops`[Self <: `789`] (val x: Self) extends AnyVal {
    
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
    def setParameters(
      value: RequestParameters with (Omit[OrgsConvertMemberToOutsideCollaboratorEndpoint, baseUrl | headers | mediaType])
    ): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[OrgsConvertMemberToOutsideCollaboratorResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
