package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Request extends js.Object {
  @JSName("endpoint")
  var endpoint_Original: Endpoint = js.native
  def apply(EndpointOptions: EndpointOptions): js.Promise[AnyResponse] = js.native
  def apply(Route: java.lang.String): js.Promise[AnyResponse] = js.native
  def apply(Route: java.lang.String, EndpointOptions: EndpointOptions): js.Promise[AnyResponse] = js.native
  def endpoint(EndpointOptions: EndpointOptions): RequestOptions = js.native
  def endpoint(Route: java.lang.String): RequestOptions = js.native
  def endpoint(Route: java.lang.String, EndpointOptions: EndpointOptions): RequestOptions = js.native
}

