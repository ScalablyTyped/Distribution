package typings.octokitGraphql

import typings.octokitGraphql.typesMod.EndpointOptions
import typings.octokitGraphql.typesMod.GraphQlQueryResponse
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@octokit/graphql/dist-types/error", JSImport.Namespace)
@js.native
object errorMod extends js.Object {
  @js.native
  class GraphqlError[T /* <: GraphQlQueryResponse */] protected () extends Error {
    def this(request: EndpointOptions, response: AnonData) = this()
    /* CompleteClass */
    override var message: String = js.native
    /* CompleteClass */
    override var name: String = js.native
    var request: EndpointOptions = js.native
  }
  
}

