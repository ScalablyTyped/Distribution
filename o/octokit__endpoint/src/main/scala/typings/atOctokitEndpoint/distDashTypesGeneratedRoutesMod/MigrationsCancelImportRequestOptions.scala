package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import typings.atOctokitEndpoint.atOctokitEndpointStrings.DELETE
import typings.atOctokitEndpoint.distDashTypesTypesMod.EndpointRequestOptions
import typings.atOctokitEndpoint.distDashTypesTypesMod.Headers
import typings.atOctokitEndpoint.distDashTypesTypesMod.Url
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MigrationsCancelImportRequestOptions extends js.Object {
  var headers: Headers
  var method: DELETE
  var request: EndpointRequestOptions
  var url: Url
}

object MigrationsCancelImportRequestOptions {
  @scala.inline
  def apply(headers: Headers, method: DELETE, request: EndpointRequestOptions, url: Url): MigrationsCancelImportRequestOptions = {
    val __obj = js.Dynamic.literal(headers = headers, method = method, request = request, url = url)
  
    __obj.asInstanceOf[MigrationsCancelImportRequestOptions]
  }
}

