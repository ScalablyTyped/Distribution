package typings.octokitGraphql

import typings.octokitGraphql.anon.Data
import typings.octokitGraphql.typesMod.GraphQlEndpointOptions
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@octokit/graphql/dist-types/error", JSImport.Namespace)
@js.native
object errorMod extends js.Object {
  @js.native
  class GraphqlError[ResponseData] protected () extends Error {
    def this(request: GraphQlEndpointOptions, response: Data[ResponseData]) = this()
    var request: GraphQlEndpointOptions = js.native
  }
  
}

