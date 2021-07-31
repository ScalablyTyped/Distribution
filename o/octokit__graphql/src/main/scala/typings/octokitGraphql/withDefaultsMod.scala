package typings.octokitGraphql

import typings.octokitGraphql.typesMod.RequestParameters
import typings.octokitGraphql.typesMod.graphql
import typings.octokitTypes.requestInterfaceMod.RequestInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object withDefaultsMod {
  
  @JSImport("@octokit/graphql/dist-types/with-defaults", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def withDefaults(request: RequestInterface[js.Object], newDefaults: RequestParameters): graphql = (^.asInstanceOf[js.Dynamic].applyDynamic("withDefaults")(request.asInstanceOf[js.Any], newDefaults.asInstanceOf[js.Any])).asInstanceOf[graphql]
}
