package typings.octokitGraphql

import typings.octokitGraphql.typesMod.RequestParameters
import typings.octokitTypes.requestInterfaceMod.RequestInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object graphqlMod {
  
  @JSImport("@octokit/graphql/dist-types/graphql", "graphql")
  @js.native
  def graphql[ResponseData](request: RequestInterface[js.Object], query: String): js.Promise[ResponseData] = js.native
  @JSImport("@octokit/graphql/dist-types/graphql", "graphql")
  @js.native
  def graphql[ResponseData](request: RequestInterface[js.Object], query: String, options: RequestParameters): js.Promise[ResponseData] = js.native
  @JSImport("@octokit/graphql/dist-types/graphql", "graphql")
  @js.native
  def graphql[ResponseData](request: RequestInterface[js.Object], query: RequestParameters): js.Promise[ResponseData] = js.native
  @JSImport("@octokit/graphql/dist-types/graphql", "graphql")
  @js.native
  def graphql[ResponseData](request: RequestInterface[js.Object], query: RequestParameters, options: RequestParameters): js.Promise[ResponseData] = js.native
}
