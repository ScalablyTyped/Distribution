package typings
package atOctokitEndpointLib.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposAddProtectedBranchRequiredSignaturesRequestOptions extends js.Object {
  var headers: atOctokitEndpointLib.distDashTypesTypesMod.Headers
  var method: atOctokitEndpointLib.atOctokitEndpointLibStrings.POST
  var request: atOctokitEndpointLib.distDashTypesTypesMod.EndpointRequestOptions
  var url: atOctokitEndpointLib.distDashTypesTypesMod.Url
}

object ReposAddProtectedBranchRequiredSignaturesRequestOptions {
  @scala.inline
  def apply(
    headers: atOctokitEndpointLib.distDashTypesTypesMod.Headers,
    method: atOctokitEndpointLib.atOctokitEndpointLibStrings.POST,
    request: atOctokitEndpointLib.distDashTypesTypesMod.EndpointRequestOptions,
    url: atOctokitEndpointLib.distDashTypesTypesMod.Url
  ): ReposAddProtectedBranchRequiredSignaturesRequestOptions = {
    val __obj = js.Dynamic.literal(headers = headers, method = method, request = request, url = url)
  
    __obj.asInstanceOf[ReposAddProtectedBranchRequiredSignaturesRequestOptions]
  }
}

