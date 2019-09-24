package typings.atOctokitRest

import typings.atOctokitRest.atOctokitRestMod.AnyResponse
import typings.atOctokitRest.atOctokitRestMod.EmptyParams
import typings.atOctokitRest.atOctokitRestMod.RequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Get extends js.Object {
  /**
    * Lists all the emojis available to use on GitHub.
    */
  @JSName("get")
  var get_Original: Anon_EndpointParamsAnyResponseEmptyParams = js.native
  /**
    * Lists all the emojis available to use on GitHub.
    */
  def get(): js.Promise[AnyResponse] = js.native
  def get(params: RequestOptions with EmptyParams): js.Promise[AnyResponse] = js.native
}

