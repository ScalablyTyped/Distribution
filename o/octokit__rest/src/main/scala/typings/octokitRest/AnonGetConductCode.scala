package typings.octokitRest

import typings.octokitRest.mod.CodesOfConductGetConductCodeParams
import typings.octokitRest.mod.CodesOfConductGetConductCodeResponse
import typings.octokitRest.mod.CodesOfConductGetForRepoParams
import typings.octokitRest.mod.CodesOfConductGetForRepoResponse
import typings.octokitRest.mod.CodesOfConductListConductCodesResponse
import typings.octokitRest.mod.EmptyParams
import typings.octokitRest.mod.RequestOptions
import typings.octokitRest.mod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonGetConductCode extends js.Object {
  @JSName("getConductCode")
  var getConductCode_Original: AnonEndpointParamsCodesOfConductGetConductCodeParams = js.native
  /**
    * This method returns the contents of the repository's code of conduct file, if one is detected.
    */
  @JSName("getForRepo")
  var getForRepo_Original: AnonEndpointParamsCodesOfConductGetForRepoParams = js.native
  @JSName("listConductCodes")
  var listConductCodes_Original: AnonEndpointParamsCodesOfConductListConductCodesResponse = js.native
  def getConductCode(): js.Promise[Response[CodesOfConductGetConductCodeResponse]] = js.native
  def getConductCode(params: RequestOptions with CodesOfConductGetConductCodeParams): js.Promise[Response[CodesOfConductGetConductCodeResponse]] = js.native
  /**
    * This method returns the contents of the repository's code of conduct file, if one is detected.
    */
  def getForRepo(): js.Promise[Response[CodesOfConductGetForRepoResponse]] = js.native
  def getForRepo(params: RequestOptions with CodesOfConductGetForRepoParams): js.Promise[Response[CodesOfConductGetForRepoResponse]] = js.native
  def listConductCodes(): js.Promise[Response[CodesOfConductListConductCodesResponse]] = js.native
  def listConductCodes(params: RequestOptions with EmptyParams): js.Promise[Response[CodesOfConductListConductCodesResponse]] = js.native
}

