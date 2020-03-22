package typings.octokitGraphql

import typings.octokitGraphql.typesMod.GraphQlQueryResponseData
import typings.octokitGraphql.typesMod.RequestParameters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@octokit/graphql/dist-types/graphql", JSImport.Namespace)
@js.native
object graphqlMod extends js.Object {
  def graphql(
    request: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_types.RequestInterface */ js.Any,
    query: String
  ): js.Promise[GraphQlQueryResponseData] = js.native
  def graphql(
    request: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_types.RequestInterface */ js.Any,
    query: String,
    options: RequestParameters
  ): js.Promise[GraphQlQueryResponseData] = js.native
  def graphql(
    request: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_types.RequestInterface */ js.Any,
    query: RequestParameters
  ): js.Promise[GraphQlQueryResponseData] = js.native
  def graphql(
    request: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_types.RequestInterface */ js.Any,
    query: RequestParameters,
    options: RequestParameters
  ): js.Promise[GraphQlQueryResponseData] = js.native
}

