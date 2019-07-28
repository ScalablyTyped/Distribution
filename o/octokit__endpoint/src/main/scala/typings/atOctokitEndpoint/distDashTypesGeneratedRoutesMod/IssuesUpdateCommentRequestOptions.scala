package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import typings.atOctokitEndpoint.atOctokitEndpointStrings.PATCH
import typings.atOctokitEndpoint.distDashTypesTypesMod.EndpointRequestOptions
import typings.atOctokitEndpoint.distDashTypesTypesMod.Headers
import typings.atOctokitEndpoint.distDashTypesTypesMod.Url
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IssuesUpdateCommentRequestOptions extends js.Object {
  var headers: Headers
  var method: PATCH
  var request: EndpointRequestOptions
  var url: Url
}

object IssuesUpdateCommentRequestOptions {
  @scala.inline
  def apply(headers: Headers, method: PATCH, request: EndpointRequestOptions, url: Url): IssuesUpdateCommentRequestOptions = {
    val __obj = js.Dynamic.literal(headers = headers, method = method, request = request, url = url)
  
    __obj.asInstanceOf[IssuesUpdateCommentRequestOptions]
  }
}

