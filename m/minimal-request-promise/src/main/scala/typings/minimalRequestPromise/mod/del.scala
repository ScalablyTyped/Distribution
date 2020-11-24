package typings.minimalRequestPromise.mod

import typings.node.httpMod.RequestOptions
import typings.std.PromiseConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("minimal-request-promise", "del")
@js.native
object del extends js.Object {
  
  def apply(url: String): js.Promise[MinimalRequestPromiseResponse] = js.native
  def apply(
    url: String,
    additionalOptions: js.UndefOr[scala.Nothing],
    PromiseImplementation: PromiseConstructor
  ): js.Promise[MinimalRequestPromiseResponse] = js.native
  def apply(url: String, additionalOptions: RequestOptions): js.Promise[MinimalRequestPromiseResponse] = js.native
  def apply(url: String, additionalOptions: RequestOptions, PromiseImplementation: PromiseConstructor): js.Promise[MinimalRequestPromiseResponse] = js.native
}
