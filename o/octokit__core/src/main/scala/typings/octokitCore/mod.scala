package typings.octokitCore

import org.scalablytyped.runtime.StringDictionary
import typings.beforeAfterHook.mod.HookCollection
import typings.beforeAfterHook.mod.HookMethod
import typings.octokitCore.typesMod.Constructor
import typings.octokitCore.typesMod.OctokitOptions
import typings.octokitCore.typesMod.OctokitPlugin
import typings.octokitCore.typesMod.ReturnTypeOf
import typings.octokitCore.typesMod.UnionToIntersection
import typings.octokitGraphql.typesMod.GraphQlResponse
import typings.octokitGraphql.typesMod.Query
import typings.octokitGraphql.typesMod.graphql
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@octokit/core", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class Octokit ()
    extends /* key */ StringDictionary[js.Any] {
    def this(options: OctokitOptions) = this()
    @JSName("graphql")
    var graphql_Original: graphql = js.native
    @JSName("hook")
    var hook_Original: HookCollection = js.native
    var log: AnonDictkey = js.native
    var request: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_types.RequestInterface */ js.Any = js.native
    def auth(args: js.Any*): js.Promise[_] = js.native
    /**
      * Sends a GraphQL query request based on endpoint options
      * The GraphQL query must be specified in `options`.
      *
      * @param {object} endpoint Must set `method` and `url`. Plus URL, query or body parameters, as well as `headers`, `mediaType.{format|previews}`, `request`, or `baseUrl`.
      */
    def graphql(
      options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitTypes.RequestParameters */ js.Any
    ): GraphQlResponse = js.native
    /**
      * Sends a GraphQL query request based on endpoint options
      *
      * @param {string} query GraphQL query. Example: `'query { viewer { login } }'`.
      * @param {object} [parameters] URL, query or body parameters, as well as `headers`, `mediaType.{format|previews}`, `request`, or `baseUrl`.
      */
    def graphql(query: Query): GraphQlResponse = js.native
    def graphql(
      query: Query,
      parameters: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitTypes.RequestParameters */ js.Any
    ): GraphQlResponse = js.native
    /**
      * Invoke before and after hooks
      */
    def hook(name: String, hookMethod: HookMethod[_, _]): js.Promise[_] = js.native
    def hook(name: String, hookMethod: HookMethod[_, _], options: js.Any): js.Promise[_] = js.native
    def hook(name: js.Array[String], hookMethod: HookMethod[_, _]): js.Promise[_] = js.native
    def hook(name: js.Array[String], hookMethod: HookMethod[_, _], options: js.Any): js.Promise[_] = js.native
  }
  
  /* static members */
  @js.native
  object Octokit extends js.Object {
    var VERSION: String = js.native
    var plugins: js.Array[OctokitPlugin] = js.native
    def defaults[S /* <: Constructor[_] */](defaults: OctokitOptions): AnonInstantiable with S = js.native
    /**
      * Attach a plugin (or many) to your Octokit instance.
      *
      * @example
      * const API = Octokit.plugin(plugin1, plugin2, plugin3, ...)
      */
    def plugin[S /* <: Constructor[_] with AnonPlugins */, T1 /* <: OctokitPlugin | js.Array[OctokitPlugin] */, T2 /* <: js.Array[OctokitPlugin] */](
      p1: T1,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param p2 because its type T2 is not an array type */ p2: T2
    ): AnonInstantiablePlugins with S with (Constructor[UnionToIntersection[ReturnTypeOf[T1] with ReturnTypeOf[T2]]]) = js.native
  }
  
}

