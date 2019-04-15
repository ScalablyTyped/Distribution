package typings
package atOctokitRestLib

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
  def get(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.EmojisGetResponse]
  ] = js.native
  def get(params: atOctokitRestLib.atOctokitRestMod.EmptyParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.EmojisGetResponse]
  ] = js.native
}

