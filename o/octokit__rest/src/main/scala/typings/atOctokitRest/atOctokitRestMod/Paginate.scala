package typings.atOctokitRest.atOctokitRestMod

import typings.std.AsyncIterableIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Paginate extends js.Object {
  def apply(EndpointOptions: EndpointOptions): js.Promise[js.Array[_]] = js.native
  def apply(
    EndpointOptions: EndpointOptions,
    callback: js.Function2[/* response */ AnyResponse, /* done */ js.Function0[Unit], _]
  ): js.Promise[js.Array[_]] = js.native
  def apply(Route: String): js.Promise[js.Array[_]] = js.native
  def apply(Route: String, EndpointOptions: EndpointOptions): js.Promise[js.Array[_]] = js.native
  def apply(
    Route: String,
    EndpointOptions: EndpointOptions,
    callback: js.Function2[/* response */ AnyResponse, /* done */ js.Function0[Unit], _]
  ): js.Promise[js.Array[_]] = js.native
  def iterator(EndpointOptions: EndpointOptions): AsyncIterableIterator[AnyResponse] = js.native
}

