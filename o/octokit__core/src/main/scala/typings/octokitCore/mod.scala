package typings.octokitCore

import org.scalablytyped.runtime.StringDictionary
import typings.beforeAfterHook.mod.HookCollection
import typings.beforeAfterHook.mod.HookMethod
import typings.octokitCore.anon.Dictkey
import typings.octokitCore.anon.Instantiable
import typings.octokitCore.anon.InstantiablePlugins
import typings.octokitCore.anon.Plugins
import typings.octokitCore.typesMod.Constructor
import typings.octokitCore.typesMod.OctokitOptions
import typings.octokitCore.typesMod.OctokitPlugin
import typings.octokitCore.typesMod.ReturnTypeOf
import typings.octokitCore.typesMod.UnionToIntersection
import typings.octokitGraphql.typesMod.GraphQlResponse
import typings.octokitGraphql.typesMod.Query
import typings.octokitGraphql.typesMod.RequestParameters
import typings.octokitGraphql.typesMod.graphql
import typings.octokitTypes.anon.Method
import typings.octokitTypes.anon.Url
import typings.octokitTypes.anon.UrlString
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestInterfaceMod.RequestInterface
import typings.octokitTypes.routeMod.Route
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@octokit/core", "Octokit")
  @js.native
  class Octokit ()
    extends StObject
       with /* key */ StringDictionary[js.Any] {
    def this(options: OctokitOptions) = this()
    
    def auth(args: js.Any*): js.Promise[js.Any] = js.native
    
    /**
      * Sends a GraphQL query request based on endpoint options
      * The GraphQL query must be specified in `options`.
      *
      * @param {object} endpoint Must set `method` and `url`. Plus URL, query or body parameters, as well as `headers`, `mediaType.{format|previews}`, `request`, or `baseUrl`.
      */
    def graphql[ResponseData](options: RequestParameters): GraphQlResponse[ResponseData] = js.native
    /**
      * Sends a GraphQL query request based on endpoint options
      *
      * @param {string} query GraphQL query. Example: `'query { viewer { login } }'`.
      * @param {object} [parameters] URL, query or body parameters, as well as `headers`, `mediaType.{format|previews}`, `request`, or `baseUrl`.
      */
    def graphql[ResponseData](query: Query): GraphQlResponse[ResponseData] = js.native
    def graphql[ResponseData](query: Query, parameters: RequestParameters): GraphQlResponse[ResponseData] = js.native
    @JSName("graphql")
    var graphql_Original: graphql = js.native
    
    /**
      * Invoke before and after hooks
      */
    def hook(name: String, hookMethod: HookMethod[js.Any, js.Any]): js.Promise[js.Any] = js.native
    def hook(name: String, hookMethod: HookMethod[js.Any, js.Any], options: js.Any): js.Promise[js.Any] = js.native
    def hook(name: js.Array[String], hookMethod: HookMethod[js.Any, js.Any]): js.Promise[js.Any] = js.native
    def hook(name: js.Array[String], hookMethod: HookMethod[js.Any, js.Any], options: js.Any): js.Promise[js.Any] = js.native
    @JSName("hook")
    var hook_Original: HookCollection = js.native
    
    var log: Dictkey = js.native
    
    def request[R /* <: Route */](route: R): js.Promise[
        (/* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints[R]['response'] */ js.Any) | OctokitResponse[js.Any]
      ] = js.native
    def request[R /* <: Route */](
      route: R,
      options: typings.octokitTypes.requestParametersMod.RequestParameters | ((/* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints[R]['parameters'] */ js.Any) & typings.octokitTypes.requestParametersMod.RequestParameters)
    ): js.Promise[
        (/* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints[R]['response'] */ js.Any) | OctokitResponse[js.Any]
      ] = js.native
    /**
      * Sends a request based on endpoint options
      *
      * @param {string} route Request method + URL. Example: `'GET /orgs/:org'`
      * @param {object} [parameters] URL, query or body parameters, as well as `headers`, `mediaType.{format|previews}`, `request`, or `baseUrl`.
      */
    def request[R /* <: Route */](route: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 670 */ js.Any): js.Promise[
        (/* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints[R]['response'] */ js.Any) | OctokitResponse[js.Any]
      ] = js.native
    def request[R /* <: Route */](
      route: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 670 */ js.Any,
      options: typings.octokitTypes.requestParametersMod.RequestParameters | ((/* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints[R]['parameters'] */ js.Any) & typings.octokitTypes.requestParametersMod.RequestParameters)
    ): js.Promise[
        (/* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints[R]['response'] */ js.Any) | OctokitResponse[js.Any]
      ] = js.native
    @JSName("request")
    var request_Original: RequestInterface[js.Object] = js.native
    /**
      * Sends a request based on endpoint options
      *
      * @param {object} endpoint Must set `method` and `url`. Plus URL, query or body parameters, as well as `headers`, `mediaType.{format|previews}`, `request`, or `baseUrl`.
      */
    @JSName("request")
    def request_url[T, O /* <: typings.octokitTypes.requestParametersMod.RequestParameters */](options: O & Method & (UrlString | Url)): js.Promise[OctokitResponse[T]] = js.native
  }
  /* static members */
  object Octokit {
    
    @JSImport("@octokit/core", "Octokit")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@octokit/core", "Octokit.VERSION")
    @js.native
    def VERSION: String = js.native
    inline def VERSION_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VERSION")(x.asInstanceOf[js.Any])
    
    inline def defaults[S /* <: Constructor[js.Any] */](defaults: js.Function): Instantiable & S = ^.asInstanceOf[js.Dynamic].applyDynamic("defaults")(defaults.asInstanceOf[js.Any]).asInstanceOf[Instantiable & S]
    inline def defaults[S /* <: Constructor[js.Any] */](defaults: OctokitOptions): Instantiable & S = ^.asInstanceOf[js.Dynamic].applyDynamic("defaults")(defaults.asInstanceOf[js.Any]).asInstanceOf[Instantiable & S]
    
    /**
      * Attach a plugin (or many) to your Octokit instance.
      *
      * @example
      * const API = Octokit.plugin(plugin1, plugin2, plugin3, ...)
      */
    inline def plugin[S /* <: Constructor[js.Any] & Plugins */, T /* <: js.Array[OctokitPlugin] */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param newPlugins because its type T is not an array type */ newPlugins: T
    ): InstantiablePlugins & S & Constructor[UnionToIntersection[ReturnTypeOf[T]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("plugin")(newPlugins.asInstanceOf[js.Any]).asInstanceOf[InstantiablePlugins & S & Constructor[UnionToIntersection[ReturnTypeOf[T]]]]
    
    @JSImport("@octokit/core", "Octokit.plugins")
    @js.native
    def plugins: js.Array[OctokitPlugin] = js.native
    inline def plugins_=(x: js.Array[OctokitPlugin]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("plugins")(x.asInstanceOf[js.Any])
  }
}
