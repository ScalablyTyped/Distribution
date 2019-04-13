package typings
package atOctokitRestLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_GetConductCode extends js.Object {
  @JSName("getConductCode")
  var getConductCode_Original: Anon_EndpointParamsCodesOfConductGetConductCodeParams = js.native
  /**
    * This method returns the contents of the repository's code of conduct file, if one is detected.
    */
  @JSName("getForRepo")
  var getForRepo_Original: Anon_EndpointParamsCodesOfConductGetForRepoParams = js.native
  @JSName("listConductCodes")
  var listConductCodes_Original: Anon_EndpointParamsCodesOfConductListConductCodesResponse = js.native
  def getConductCode(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.CodesOfConductGetConductCodeResponse]
  ] = js.native
  def getConductCode(params: atOctokitRestLib.atOctokitRestMod.CodesOfConductGetConductCodeParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.CodesOfConductGetConductCodeResponse]
  ] = js.native
  /**
    * This method returns the contents of the repository's code of conduct file, if one is detected.
    */
  def getForRepo(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.CodesOfConductGetForRepoResponse]
  ] = js.native
  def getForRepo(params: atOctokitRestLib.atOctokitRestMod.CodesOfConductGetForRepoParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.CodesOfConductGetForRepoResponse]
  ] = js.native
  def listConductCodes(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.CodesOfConductListConductCodesResponse]
  ] = js.native
  def listConductCodes(params: atOctokitRestLib.atOctokitRestMod.EmptyParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.CodesOfConductListConductCodesResponse]
  ] = js.native
}

