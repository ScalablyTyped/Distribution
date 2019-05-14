package typings
package atOctokitEndpointLib.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrgsUnblockUser_RequestOptions extends js.Object {
  var headers: atOctokitEndpointLib.distDashTypesTypesMod.Headers
  var method: atOctokitEndpointLib.atOctokitEndpointLibStrings.DELETE
  var request: atOctokitEndpointLib.distDashTypesTypesMod.EndpointRequestOptions
  var url: atOctokitEndpointLib.distDashTypesTypesMod.Url
}

object OrgsUnblockUser_RequestOptions {
  @scala.inline
  def apply(
    headers: atOctokitEndpointLib.distDashTypesTypesMod.Headers,
    method: atOctokitEndpointLib.atOctokitEndpointLibStrings.DELETE,
    request: atOctokitEndpointLib.distDashTypesTypesMod.EndpointRequestOptions,
    url: atOctokitEndpointLib.distDashTypesTypesMod.Url
  ): OrgsUnblockUser_RequestOptions = {
    val __obj = js.Dynamic.literal(headers = headers, method = method, request = request, url = url)
  
    __obj.asInstanceOf[OrgsUnblockUser_RequestOptions]
  }
}

