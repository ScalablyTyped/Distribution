package typings.octokitRest

import typings.octokitRest.mod.EmptyParams
import typings.octokitRest.mod.LicensesGetForRepoParams
import typings.octokitRest.mod.LicensesGetForRepoResponse
import typings.octokitRest.mod.LicensesGetParams
import typings.octokitRest.mod.LicensesGetResponse
import typings.octokitRest.mod.LicensesListCommonlyUsedResponse
import typings.octokitRest.mod.LicensesListResponse
import typings.octokitRest.mod.RequestOptions
import typings.octokitRest.mod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonGetGetForRepo extends js.Object {
  /**
    * This method returns the contents of the repository's license file, if one is detected.
    *
    * Similar to [the repository contents API](https://developer.github.com/v3/repos/contents/#get-contents), this method also supports [custom media types](https://developer.github.com/v3/repos/contents/#custom-media-types) for retrieving the raw license content or rendered license HTML.
    */
  @JSName("getForRepo")
  var getForRepo_Original: AnonEndpointParamsLicensesGetForRepoParams = js.native
  @JSName("get")
  var get_Original: AnonEndpointParamsLicensesGetParams = js.native
  @JSName("listCommonlyUsed")
  var listCommonlyUsed_Original: AnonEndpointParamsEmptyParamsLicensesListCommonlyUsedResponse = js.native
  /**
    * @deprecated octokit.licenses.list() has been renamed to octokit.licenses.listCommonlyUsed() (2019-03-05)
    */
  @JSName("list")
  var list_Original: AnonEndpointParamsEmptyParamsLicensesListResponse = js.native
  def get(): js.Promise[Response[LicensesGetResponse]] = js.native
  def get(params: RequestOptions with LicensesGetParams): js.Promise[Response[LicensesGetResponse]] = js.native
  /**
    * This method returns the contents of the repository's license file, if one is detected.
    *
    * Similar to [the repository contents API](https://developer.github.com/v3/repos/contents/#get-contents), this method also supports [custom media types](https://developer.github.com/v3/repos/contents/#custom-media-types) for retrieving the raw license content or rendered license HTML.
    */
  def getForRepo(): js.Promise[Response[LicensesGetForRepoResponse]] = js.native
  def getForRepo(params: RequestOptions with LicensesGetForRepoParams): js.Promise[Response[LicensesGetForRepoResponse]] = js.native
  /**
    * @deprecated octokit.licenses.list() has been renamed to octokit.licenses.listCommonlyUsed() (2019-03-05)
    */
  def list(): js.Promise[Response[LicensesListResponse]] = js.native
  def list(params: RequestOptions with EmptyParams): js.Promise[Response[LicensesListResponse]] = js.native
  def listCommonlyUsed(): js.Promise[Response[LicensesListCommonlyUsedResponse]] = js.native
  def listCommonlyUsed(params: RequestOptions with EmptyParams): js.Promise[Response[LicensesListCommonlyUsedResponse]] = js.native
}

