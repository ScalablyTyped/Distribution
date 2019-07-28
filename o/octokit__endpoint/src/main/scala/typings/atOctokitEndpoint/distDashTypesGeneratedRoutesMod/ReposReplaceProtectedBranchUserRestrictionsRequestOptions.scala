package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import typings.atOctokitEndpoint.atOctokitEndpointStrings.PUT
import typings.atOctokitEndpoint.distDashTypesTypesMod.EndpointRequestOptions
import typings.atOctokitEndpoint.distDashTypesTypesMod.Headers
import typings.atOctokitEndpoint.distDashTypesTypesMod.Url
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposReplaceProtectedBranchUserRestrictionsRequestOptions extends js.Object {
  var headers: Headers
  var method: PUT
  var request: EndpointRequestOptions
  var url: Url
}

object ReposReplaceProtectedBranchUserRestrictionsRequestOptions {
  @scala.inline
  def apply(headers: Headers, method: PUT, request: EndpointRequestOptions, url: Url): ReposReplaceProtectedBranchUserRestrictionsRequestOptions = {
    val __obj = js.Dynamic.literal(headers = headers, method = method, request = request, url = url)
  
    __obj.asInstanceOf[ReposReplaceProtectedBranchUserRestrictionsRequestOptions]
  }
}

