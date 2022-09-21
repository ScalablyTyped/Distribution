package typings.octokitGraphql

import typings.octokitGraphql.errorMod.ServerResponseData
import typings.octokitGraphql.typesMod.GraphQlEndpointOptions
import typings.octokitTypes.requestInterfaceMod.RequestInterface
import typings.octokitTypes.responseHeadersMod.ResponseHeaders
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@octokit/graphql", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@octokit/graphql", "GraphqlResponseError")
  @js.native
  open class GraphqlResponseError[ResponseData] protected ()
    extends typings.octokitGraphql.errorMod.GraphqlResponseError[ResponseData] {
    def this(
      request: GraphQlEndpointOptions,
      headers: ResponseHeaders,
      response: ServerResponseData[ResponseData]
    ) = this()
  }
  
  @JSImport("@octokit/graphql", "graphql")
  @js.native
  val graphql: typings.octokitGraphql.typesMod.graphql = js.native
  
  inline def withCustomRequest(customRequest: RequestInterface[js.Object]): typings.octokitGraphql.typesMod.graphql = ^.asInstanceOf[js.Dynamic].applyDynamic("withCustomRequest")(customRequest.asInstanceOf[js.Any]).asInstanceOf[typings.octokitGraphql.typesMod.graphql]
}
