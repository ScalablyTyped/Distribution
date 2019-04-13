package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Paginate extends js.Object {
  def apply(EndpointOptions: EndpointOptions): js.Promise[js.Array[_]] = js.native
  def apply(EndpointOptions: EndpointOptions, callback: js.Function1[/* response */ AnyResponse, _]): js.Promise[js.Array[_]] = js.native
  def apply(Route: java.lang.String): js.Promise[js.Array[_]] = js.native
  def apply(Route: java.lang.String, EndpointOptions: EndpointOptions): js.Promise[js.Array[_]] = js.native
  def apply(
    Route: java.lang.String,
    EndpointOptions: EndpointOptions,
    callback: js.Function1[/* response */ AnyResponse, _]
  ): js.Promise[js.Array[_]] = js.native
  def iterator(EndpointOptions: EndpointOptions): stdLib.AsyncIterableIterator[AnyResponse] = js.native
}

