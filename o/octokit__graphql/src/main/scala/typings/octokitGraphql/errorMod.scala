package typings.octokitGraphql

import typings.octokitGraphql.anon.Data
import typings.octokitGraphql.typesMod.GraphQlEndpointOptions
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object errorMod {
  
  @JSImport("@octokit/graphql/dist-types/error", "GraphqlError")
  @js.native
  class GraphqlError[ResponseData] protected ()
    extends StObject
       with Error {
    def this(request: GraphQlEndpointOptions, response: Data[ResponseData]) = this()
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
    
    var request: GraphQlEndpointOptions = js.native
  }
}
