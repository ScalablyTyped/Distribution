package typings
package atOctokitEndpointLib.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UsersGetGpgKeyRequestOptions extends js.Object {
  var headers: atOctokitEndpointLib.distDashTypesTypesMod.Headers
  var method: atOctokitEndpointLib.atOctokitEndpointLibStrings.GET
  var request: atOctokitEndpointLib.distDashTypesTypesMod.EndpointRequestOptions
  var url: atOctokitEndpointLib.distDashTypesTypesMod.Url
}

object UsersGetGpgKeyRequestOptions {
  @scala.inline
  def apply(
    headers: atOctokitEndpointLib.distDashTypesTypesMod.Headers,
    method: atOctokitEndpointLib.atOctokitEndpointLibStrings.GET,
    request: atOctokitEndpointLib.distDashTypesTypesMod.EndpointRequestOptions,
    url: atOctokitEndpointLib.distDashTypesTypesMod.Url
  ): UsersGetGpgKeyRequestOptions = {
    val __obj = js.Dynamic.literal(headers = headers, method = method, request = request, url = url)
  
    __obj.asInstanceOf[UsersGetGpgKeyRequestOptions]
  }
}

