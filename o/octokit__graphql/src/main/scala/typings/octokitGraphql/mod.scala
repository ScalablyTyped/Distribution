package typings.octokitGraphql

import typings.octokitGraphql.distTypesErrorMod.ServerResponseData
import typings.octokitGraphql.distTypesTypesMod.GraphQlEndpointOptions
import typings.octokitTypes.distTypesRequestInterfaceMod.RequestInterface
import typings.octokitTypes.distTypesResponseHeadersMod.ResponseHeaders
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
    extends typings.octokitGraphql.distTypesErrorMod.GraphqlResponseError[ResponseData] {
    def this(
      request: GraphQlEndpointOptions,
      headers: ResponseHeaders,
      response: ServerResponseData[ResponseData]
    ) = this()
  }
  
  @JSImport("@octokit/graphql", "graphql")
  @js.native
  val graphql: typings.octokitGraphql.distTypesTypesMod.graphql = js.native
  
  inline def withCustomRequest(customRequest: RequestInterface[js.Object]): typings.octokitGraphql.distTypesTypesMod.graphql = ^.asInstanceOf[js.Dynamic].applyDynamic("withCustomRequest")(customRequest.asInstanceOf[js.Any]).asInstanceOf[typings.octokitGraphql.distTypesTypesMod.graphql]
}
