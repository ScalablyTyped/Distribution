package typings
package atOctokitRestLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_GetGetForRepo extends js.Object {
  /**
    * This method returns the contents of the repository's license file, if one is detected.,* ,* Similar to [the repository contents API](https://developer.github.com/v3/repos/contents/#get-contents), this method also supports [custom media types](https://developer.github.com/v3/repos/contents/#custom-media-types) for retrieving the raw license content or rendered license HTML.
    */
  @JSName("getForRepo")
  var getForRepo_Original: Anon_EndpointParamsLicensesGetForRepoParams = js.native
  @JSName("get")
  var get_Original: Anon_EndpointParamsLicensesGetParams = js.native
  @JSName("listCommonlyUsed")
  var listCommonlyUsed_Original: Anon_EndpointParamsEmptyParamsLicensesListCommonlyUsedResponse = js.native
  @JSName("list")
  var list_Original: Anon_EndpointParamsEmptyParamsLicensesListResponse = js.native
  def get(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.LicensesGetResponse]
  ] = js.native
  def get(params: atOctokitRestLib.atOctokitRestMod.LicensesGetParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.LicensesGetResponse]
  ] = js.native
  /**
    * This method returns the contents of the repository's license file, if one is detected.,* ,* Similar to [the repository contents API](https://developer.github.com/v3/repos/contents/#get-contents), this method also supports [custom media types](https://developer.github.com/v3/repos/contents/#custom-media-types) for retrieving the raw license content or rendered license HTML.
    */
  def getForRepo(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.LicensesGetForRepoResponse]
  ] = js.native
  def getForRepo(params: atOctokitRestLib.atOctokitRestMod.LicensesGetForRepoParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.LicensesGetForRepoResponse]
  ] = js.native
  def list(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.LicensesListResponse]
  ] = js.native
  def list(params: atOctokitRestLib.atOctokitRestMod.EmptyParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.LicensesListResponse]
  ] = js.native
  def listCommonlyUsed(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.LicensesListCommonlyUsedResponse]
  ] = js.native
  def listCommonlyUsed(params: atOctokitRestLib.atOctokitRestMod.EmptyParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.LicensesListCommonlyUsedResponse]
  ] = js.native
}

