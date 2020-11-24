package typings.octokitGraphql

import typings.octokitGraphql.typesMod.RequestParameters
import typings.octokitTypes.requestInterfaceMod.RequestInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@octokit/graphql/dist-types/graphql", JSImport.Namespace)
@js.native
object graphqlMod extends js.Object {
  
  def graphql[ResponseData](request: RequestInterface[js.Object], query: String): js.Promise[ResponseData] = js.native
  def graphql[ResponseData](request: RequestInterface[js.Object], query: String, options: RequestParameters): js.Promise[ResponseData] = js.native
  def graphql[ResponseData](request: RequestInterface[js.Object], query: RequestParameters): js.Promise[ResponseData] = js.native
  def graphql[ResponseData](request: RequestInterface[js.Object], query: RequestParameters, options: RequestParameters): js.Promise[ResponseData] = js.native
}
