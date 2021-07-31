package typings.octokitGraphql

import typings.octokitTypes.requestInterfaceMod.RequestInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@octokit/graphql", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@octokit/graphql", "graphql")
  @js.native
  val graphql: typings.octokitGraphql.typesMod.graphql = js.native
  
  @scala.inline
  def withCustomRequest(customRequest: RequestInterface[js.Object]): typings.octokitGraphql.typesMod.graphql = ^.asInstanceOf[js.Dynamic].applyDynamic("withCustomRequest")(customRequest.asInstanceOf[js.Any]).asInstanceOf[typings.octokitGraphql.typesMod.graphql]
}
