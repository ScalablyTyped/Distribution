package typings.atOctokitRest

import typings.atOctokitRest.atOctokitRestMod.EmptyParams
import typings.atOctokitRest.atOctokitRestMod.LicensesGetForRepoParams
import typings.atOctokitRest.atOctokitRestMod.LicensesGetForRepoResponse
import typings.atOctokitRest.atOctokitRestMod.LicensesGetParams
import typings.atOctokitRest.atOctokitRestMod.LicensesGetResponse
import typings.atOctokitRest.atOctokitRestMod.LicensesListCommonlyUsedResponse
import typings.atOctokitRest.atOctokitRestMod.LicensesListResponse
import typings.atOctokitRest.atOctokitRestMod.RequestOptions
import typings.atOctokitRest.atOctokitRestMod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_GetGetForRepo extends js.Object {
  /**
    * This method returns the contents of the repository's license file, if one is detected.
    *
    * Similar to [the repository contents API](https://developer.github.com/v3/repos/contents/#get-contents), this method also supports [custom media types](https://developer.github.com/v3/repos/contents/#custom-media-types) for retrieving the raw license content or rendered license HTML.
    */
  @JSName("getForRepo")
  var getForRepo_Original: Anon_EndpointParamsLicensesGetForRepoParams = js.native
  @JSName("get")
  var get_Original: Anon_EndpointParamsLicensesGetParams = js.native
  @JSName("listCommonlyUsed")
  var listCommonlyUsed_Original: Anon_EndpointParamsEmptyParamsLicensesListCommonlyUsedResponse = js.native
  @JSName("list")
  var list_Original: Anon_EndpointParamsEmptyParamsLicensesListResponse = js.native
  def get(): js.Promise[Response[LicensesGetResponse]] = js.native
  def get(params: RequestOptions with LicensesGetParams): js.Promise[Response[LicensesGetResponse]] = js.native
  /**
    * This method returns the contents of the repository's license file, if one is detected.
    *
    * Similar to [the repository contents API](https://developer.github.com/v3/repos/contents/#get-contents), this method also supports [custom media types](https://developer.github.com/v3/repos/contents/#custom-media-types) for retrieving the raw license content or rendered license HTML.
    */
  def getForRepo(): js.Promise[Response[LicensesGetForRepoResponse]] = js.native
  def getForRepo(params: RequestOptions with LicensesGetForRepoParams): js.Promise[Response[LicensesGetForRepoResponse]] = js.native
  def list(): js.Promise[Response[LicensesListResponse]] = js.native
  def list(params: RequestOptions with EmptyParams): js.Promise[Response[LicensesListResponse]] = js.native
  def listCommonlyUsed(): js.Promise[Response[LicensesListCommonlyUsedResponse]] = js.native
  def listCommonlyUsed(params: RequestOptions with EmptyParams): js.Promise[Response[LicensesListCommonlyUsedResponse]] = js.native
}

