package typings.octokitGraphql

import typings.octokitGraphql.distTypesTypesMod.RequestParameters
import typings.octokitTypes.distTypesRequestInterfaceMod.RequestInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGraphqlMod {
  
  @JSImport("@octokit/graphql/dist-types/graphql", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def graphql[ResponseData](request: RequestInterface[js.Object], query: String): js.Promise[ResponseData] = (^.asInstanceOf[js.Dynamic].applyDynamic("graphql")(request.asInstanceOf[js.Any], query.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ResponseData]]
  inline def graphql[ResponseData](request: RequestInterface[js.Object], query: String, options: RequestParameters): js.Promise[ResponseData] = (^.asInstanceOf[js.Dynamic].applyDynamic("graphql")(request.asInstanceOf[js.Any], query.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ResponseData]]
  inline def graphql[ResponseData](request: RequestInterface[js.Object], query: RequestParameters): js.Promise[ResponseData] = (^.asInstanceOf[js.Dynamic].applyDynamic("graphql")(request.asInstanceOf[js.Any], query.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ResponseData]]
  inline def graphql[ResponseData](request: RequestInterface[js.Object], query: RequestParameters, options: RequestParameters): js.Promise[ResponseData] = (^.asInstanceOf[js.Dynamic].applyDynamic("graphql")(request.asInstanceOf[js.Any], query.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ResponseData]]
}
