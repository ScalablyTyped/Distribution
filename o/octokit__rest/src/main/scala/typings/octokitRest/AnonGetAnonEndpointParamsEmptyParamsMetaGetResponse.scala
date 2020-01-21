package typings.octokitRest

import typings.octokitRest.mod.EmptyParams
import typings.octokitRest.mod.MetaGetResponse
import typings.octokitRest.mod.RequestOptions
import typings.octokitRest.mod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonGetAnonEndpointParamsEmptyParamsMetaGetResponse extends js.Object {
  /**
    * This endpoint provides a list of GitHub's IP addresses. For more information, see "[About GitHub's IP addresses](https://help.github.com/articles/about-github-s-ip-addresses/)."
    */
  @JSName("get")
  var get_Original: AnonEndpointParamsEmptyParamsMetaGetResponse = js.native
  /**
    * This endpoint provides a list of GitHub's IP addresses. For more information, see "[About GitHub's IP addresses](https://help.github.com/articles/about-github-s-ip-addresses/)."
    */
  def get(): js.Promise[Response[MetaGetResponse]] = js.native
  def get(params: RequestOptions with EmptyParams): js.Promise[Response[MetaGetResponse]] = js.native
}

