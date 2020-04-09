package typings.octokitPluginRestEndpointMethods

import typings.octokitPluginRestEndpointMethods.typesMod.CodesOfConductGetConductCodeParams
import typings.octokitPluginRestEndpointMethods.typesMod.CodesOfConductGetForRepoParams
import typings.octokitPluginRestEndpointMethods.typesMod.EmptyParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonGetAllCodesOfConduct extends js.Object {
  @JSName("getAllCodesOfConduct")
  var getAllCodesOfConduct_Original: Anon25 = js.native
  @JSName("getConductCode")
  var getConductCode_Original: Anon108 = js.native
  /**
    * This method returns the contents of the repository's code of conduct file, if one is detected.
    */
  @JSName("getForRepo")
  var getForRepo_Original: Anon109 = js.native
  /**
    * @deprecated octokit.codesOfConduct.listConductCodes() has been renamed to octokit.codesOfConduct.getAllCodesOfConduct() (2020-03-04)
    */
  @JSName("listConductCodes")
  var listConductCodes_Original: Anon25 = js.native
  def getAllCodesOfConduct(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<UsersListBlockedResponse> */ _
  ] = js.native
  def getAllCodesOfConduct(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with EmptyParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<UsersListBlockedResponse> */ _
  ] = js.native
  def getConductCode(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<CodesOfConductGetConductCodeResponse> */ _
  ] = js.native
  def getConductCode(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with CodesOfConductGetConductCodeParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<CodesOfConductGetConductCodeResponse> */ _
  ] = js.native
  /**
    * This method returns the contents of the repository's code of conduct file, if one is detected.
    */
  def getForRepo(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<CodesOfConductGetForRepoResponse> */ _
  ] = js.native
  def getForRepo(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with CodesOfConductGetForRepoParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<CodesOfConductGetForRepoResponse> */ _
  ] = js.native
  /**
    * @deprecated octokit.codesOfConduct.listConductCodes() has been renamed to octokit.codesOfConduct.getAllCodesOfConduct() (2020-03-04)
    */
  def listConductCodes(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<UsersListBlockedResponse> */ _
  ] = js.native
  def listConductCodes(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with EmptyParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<UsersListBlockedResponse> */ _
  ] = js.native
}

