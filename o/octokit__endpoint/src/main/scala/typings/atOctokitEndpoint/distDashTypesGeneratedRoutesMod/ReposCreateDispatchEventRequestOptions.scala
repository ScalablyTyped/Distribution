package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import typings.atOctokitEndpoint.atOctokitEndpointStrings.POST
import typings.atOctokitEndpoint.distDashTypesTypesMod.EndpointRequestOptions
import typings.atOctokitEndpoint.distDashTypesTypesMod.Headers
import typings.atOctokitEndpoint.distDashTypesTypesMod.Url
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposCreateDispatchEventRequestOptions extends js.Object {
  var headers: Headers
  var method: POST
  var request: EndpointRequestOptions
  var url: Url
}

object ReposCreateDispatchEventRequestOptions {
  @scala.inline
  def apply(headers: Headers, method: POST, request: EndpointRequestOptions, url: Url): ReposCreateDispatchEventRequestOptions = {
    val __obj = js.Dynamic.literal(headers = headers, method = method, request = request, url = url)
  
    __obj.asInstanceOf[ReposCreateDispatchEventRequestOptions]
  }
}

