package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import typings.atOctokitEndpoint.atOctokitEndpointStrings.PATCH
import typings.atOctokitEndpoint.distDashTypesTypesMod.EndpointRequestOptions
import typings.atOctokitEndpoint.distDashTypesTypesMod.Headers
import typings.atOctokitEndpoint.distDashTypesTypesMod.Url
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamsUpdateRequestOptions extends js.Object {
  var headers: Headers
  var method: PATCH
  var request: EndpointRequestOptions
  var url: Url
}

object TeamsUpdateRequestOptions {
  @scala.inline
  def apply(headers: Headers, method: PATCH, request: EndpointRequestOptions, url: Url): TeamsUpdateRequestOptions = {
    val __obj = js.Dynamic.literal(headers = headers, method = method, request = request, url = url)
  
    __obj.asInstanceOf[TeamsUpdateRequestOptions]
  }
}

