package typings.octokitPluginRestEndpointMethods

import typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.EmptyParams
import typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.LicensesGetForRepoParams
import typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.LicensesGetParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonGetGetForRepoList extends js.Object {
  /**
    * This method returns the contents of the repository's license file, if one is detected.
    *
    * Similar to [the repository contents API](https://developer.github.com/v3/repos/contents/#get-contents), this method also supports [custom media types](https://developer.github.com/v3/repos/contents/#custom-media-types) for retrieving the raw license content or rendered license HTML.
    */
  @JSName("getForRepo")
  var getForRepo_Original: AnonEndpointParamsAnyLicensesGetForRepoParams = js.native
  @JSName("get")
  var get_Original: AnonEndpointParamsAnyLicensesGetParams = js.native
  @JSName("listCommonlyUsed")
  var listCommonlyUsed_Original: AnonEndpointParamsAny = js.native
  /**
    * @deprecated octokit.licenses.list() has been renamed to octokit.licenses.listCommonlyUsed() (2019-03-05)
    */
  @JSName("list")
  var list_Original: AnonEndpointParamsAny = js.native
  def get(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<LicensesGetResponse> */ _
  ] = js.native
  def get(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with LicensesGetParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<LicensesGetResponse> */ _
  ] = js.native
  /**
    * This method returns the contents of the repository's license file, if one is detected.
    *
    * Similar to [the repository contents API](https://developer.github.com/v3/repos/contents/#get-contents), this method also supports [custom media types](https://developer.github.com/v3/repos/contents/#custom-media-types) for retrieving the raw license content or rendered license HTML.
    */
  def getForRepo(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<LicensesGetForRepoResponse> */ _
  ] = js.native
  def getForRepo(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with LicensesGetForRepoParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<LicensesGetForRepoResponse> */ _
  ] = js.native
  /**
    * @deprecated octokit.licenses.list() has been renamed to octokit.licenses.listCommonlyUsed() (2019-03-05)
    */
  def list(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<UsersListBlockedResponse> */ _
  ] = js.native
  def list(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with EmptyParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<UsersListBlockedResponse> */ _
  ] = js.native
  def listCommonlyUsed(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<UsersListBlockedResponse> */ _
  ] = js.native
  def listCommonlyUsed(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with EmptyParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<UsersListBlockedResponse> */ _
  ] = js.native
}

