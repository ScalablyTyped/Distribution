package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.TeamsAddOrUpdateMembershipForUserInOrgEndpoint
import typings.octokitTypes.endpointsMod.TeamsAddOrUpdateMembershipForUserInOrgResponse422Data
import typings.octokitTypes.endpointsMod.TeamsAddOrUpdateMembershipForUserInOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `1038` extends StObject {
  
  var parameters: RequestParameters & (Omit[TeamsAddOrUpdateMembershipForUserInOrgEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[
    TeamsAddOrUpdateMembershipForUserInOrgResponseData | TeamsAddOrUpdateMembershipForUserInOrgResponse422Data
  ]
}
object `1038` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters & (Omit[TeamsAddOrUpdateMembershipForUserInOrgEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[
      TeamsAddOrUpdateMembershipForUserInOrgResponseData | TeamsAddOrUpdateMembershipForUserInOrgResponse422Data
    ]
  ): `1038` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1038`]
  }
  
  @scala.inline
  implicit class `1038MutableBuilder`[Self <: `1038`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(
      value: RequestParameters & (Omit[TeamsAddOrUpdateMembershipForUserInOrgEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(
      value: OctokitResponse[
          TeamsAddOrUpdateMembershipForUserInOrgResponseData | TeamsAddOrUpdateMembershipForUserInOrgResponse422Data
        ]
    ): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
