package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import typings.atOctokitEndpoint.atOctokitEndpointStrings.GET
import typings.atOctokitEndpoint.distDashTypesTypesMod.EndpointRequestOptions
import typings.atOctokitEndpoint.distDashTypesTypesMod.Headers
import typings.atOctokitEndpoint.distDashTypesTypesMod.Url
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivityGetThreadRequestOptions extends js.Object {
  var headers: Headers
  var method: GET
  var request: EndpointRequestOptions
  var url: Url
}

object ActivityGetThreadRequestOptions {
  @scala.inline
  def apply(headers: Headers, method: GET, request: EndpointRequestOptions, url: Url): ActivityGetThreadRequestOptions = {
    val __obj = js.Dynamic.literal(headers = headers, method = method, request = request, url = url)
  
    __obj.asInstanceOf[ActivityGetThreadRequestOptions]
  }
}

