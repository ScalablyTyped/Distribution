package typings.atOctokitRest

import typings.atOctokitRest.atOctokitRestMod.EmojisGetResponse
import typings.atOctokitRest.atOctokitRestMod.EmptyParams
import typings.atOctokitRest.atOctokitRestMod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Get extends js.Object {
  /**
    * Lists all the emojis available to use on GitHub.
    */
  @JSName("get")
  var get_Original: Anon_EndpointParamsEmojisGetResponse = js.native
  /**
    * Lists all the emojis available to use on GitHub.
    */
  def get(): js.Promise[Response[EmojisGetResponse]] = js.native
  def get(params: EmptyParams): js.Promise[Response[EmojisGetResponse]] = js.native
}

