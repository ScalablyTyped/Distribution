package typings.atOctokitRest

import typings.atOctokitRest.atOctokitRestMod.EmptyParams
import typings.atOctokitRest.atOctokitRestMod.MetaGetResponse
import typings.atOctokitRest.atOctokitRestMod.RequestOptions
import typings.atOctokitRest.atOctokitRestMod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_GetAnonEndpointParamsEmptyParamsMetaGetResponse extends js.Object {
  /**
    * This endpoint provides a list of GitHub's IP addresses. For more information, see "[About GitHub's IP addresses](https://help.github.com/articles/about-github-s-ip-addresses/)."
    */
  @JSName("get")
  var get_Original: Anon_EndpointParamsEmptyParamsMetaGetResponse = js.native
  /**
    * This endpoint provides a list of GitHub's IP addresses. For more information, see "[About GitHub's IP addresses](https://help.github.com/articles/about-github-s-ip-addresses/)."
    */
  def get(): js.Promise[Response[MetaGetResponse]] = js.native
  def get(params: RequestOptions with EmptyParams): js.Promise[Response[MetaGetResponse]] = js.native
}

