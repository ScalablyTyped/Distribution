package typings.octokitGraphql.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait graphql extends js.Object {
  /**
    * Octokit endpoint API, see {@link https://github.com/octokit/endpoint.js|@octokit/endpoint}
    */
  var endpoint: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitTypes.EndpointInterface */ js.Any = js.native
  /**
    * Sends a GraphQL query request based on endpoint options
    * The GraphQL query must be specified in `options`.
    *
    * @param {object} endpoint Must set `method` and `url`. Plus URL, query or body parameters, as well as `headers`, `mediaType.{format|previews}`, `request`, or `baseUrl`.
    */
  def apply(
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitTypes.RequestParameters */ js.Any
  ): GraphQlResponse = js.native
  /**
    * Sends a GraphQL query request based on endpoint options
    *
    * @param {string} query GraphQL query. Example: `'query { viewer { login } }'`.
    * @param {object} [parameters] URL, query or body parameters, as well as `headers`, `mediaType.{format|previews}`, `request`, or `baseUrl`.
    */
  def apply(query: Query): GraphQlResponse = js.native
  def apply(
    query: Query,
    parameters: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitTypes.RequestParameters */ js.Any
  ): GraphQlResponse = js.native
  /**
    * Returns a new `endpoint` with updated route and parameters
    */
  def defaults(
    newDefaults: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitTypes.RequestParameters */ js.Any
  ): graphql = js.native
}

