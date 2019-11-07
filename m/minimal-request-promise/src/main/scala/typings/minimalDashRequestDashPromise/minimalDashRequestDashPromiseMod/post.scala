package typings.minimalDashRequestDashPromise.minimalDashRequestDashPromiseMod

import typings.node.httpMod.RequestOptions
import typings.std.PromiseConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("minimal-request-promise", "post")
@js.native
object post extends js.Object {
  def apply(url: String, additionalOptions: RequestOptions): js.Promise[MinimalRequestPromiseResponse] = js.native
  def apply(url: String, additionalOptions: RequestOptions, PromiseImplementation: PromiseConstructor): js.Promise[MinimalRequestPromiseResponse] = js.native
}

