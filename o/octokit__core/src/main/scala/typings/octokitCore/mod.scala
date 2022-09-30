package typings.octokitCore

import typings.beforeAfterHook.mod.GetType
import typings.beforeAfterHook.mod.HookCollection
import typings.beforeAfterHook.mod.HookMethod
import typings.octokitCore.anon.Dictkey
import typings.octokitCore.anon.Plugins
import typings.octokitCore.octokitCoreStrings.O
import typings.octokitCore.octokitCoreStrings.Options
import typings.octokitCore.octokitCoreStrings.R
import typings.octokitCore.octokitCoreStrings.Result
import typings.octokitCore.octokitCoreStrings.request
import typings.octokitCore.typesMod.Constructor
import typings.octokitCore.typesMod.Hooks
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
  open class Octokit () extends StObject {
    def this(options: OctokitOptions) = this()
    
    def auth(args: Any*): js.Promise[Any] = js.native
    
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
    def hook[Name /* <: request */](
      name: Name,
      hookMethod: HookMethod[
          GetType[
            /* import warning: importer.ImportType#apply Failed type conversion: @octokit/core.@octokit/core/dist-types/types.Hooks[Name] */ js.Any, 
            Options, 
            O
          ], 
          GetType[
            /* import warning: importer.ImportType#apply Failed type conversion: @octokit/core.@octokit/core/dist-types/types.Hooks[Name] */ js.Any, 
            Result, 
            R
          ]
        ]
    ): js.Promise[
        GetType[
          /* import warning: importer.ImportType#apply Failed type conversion: @octokit/core.@octokit/core/dist-types/types.Hooks[Name] */ js.Any, 
          Result, 
          R
        ]
      ] = js.native
    def hook[Name /* <: request */](
      name: Name,
      hookMethod: HookMethod[
          GetType[
            /* import warning: importer.ImportType#apply Failed type conversion: @octokit/core.@octokit/core/dist-types/types.Hooks[Name] */ js.Any, 
            Options, 
            O
          ], 
          GetType[
            /* import warning: importer.ImportType#apply Failed type conversion: @octokit/core.@octokit/core/dist-types/types.Hooks[Name] */ js.Any, 
            Result, 
            R
          ]
        ],
      options: GetType[
          /* import warning: importer.ImportType#apply Failed type conversion: @octokit/core.@octokit/core/dist-types/types.Hooks[Name] */ js.Any, 
          Options, 
          O
        ]
    ): js.Promise[
        GetType[
          /* import warning: importer.ImportType#apply Failed type conversion: @octokit/core.@octokit/core/dist-types/types.Hooks[Name] */ js.Any, 
          Result, 
          R
        ]
      ] = js.native
    def hook[Name /* <: request */](
      name: js.Array[Name],
      hookMethod: HookMethod[
          GetType[
            /* import warning: importer.ImportType#apply Failed type conversion: @octokit/core.@octokit/core/dist-types/types.Hooks[Name] */ js.Any, 
            Options, 
            O
          ], 
          GetType[
            /* import warning: importer.ImportType#apply Failed type conversion: @octokit/core.@octokit/core/dist-types/types.Hooks[Name] */ js.Any, 
            Result, 
            R
          ]
        ]
    ): js.Promise[
        GetType[
          /* import warning: importer.ImportType#apply Failed type conversion: @octokit/core.@octokit/core/dist-types/types.Hooks[Name] */ js.Any, 
          Result, 
          R
        ]
      ] = js.native
    def hook[Name /* <: request */](
      name: js.Array[Name],
      hookMethod: HookMethod[
          GetType[
            /* import warning: importer.ImportType#apply Failed type conversion: @octokit/core.@octokit/core/dist-types/types.Hooks[Name] */ js.Any, 
            Options, 
            O
          ], 
          GetType[
            /* import warning: importer.ImportType#apply Failed type conversion: @octokit/core.@octokit/core/dist-types/types.Hooks[Name] */ js.Any, 
            Result, 
            R
          ]
        ],
      options: GetType[
          /* import warning: importer.ImportType#apply Failed type conversion: @octokit/core.@octokit/core/dist-types/types.Hooks[Name] */ js.Any, 
          Options, 
          O
        ]
    ): js.Promise[
        GetType[
          /* import warning: importer.ImportType#apply Failed type conversion: @octokit/core.@octokit/core/dist-types/types.Hooks[Name] */ js.Any, 
          Result, 
          R
        ]
      ] = js.native
    @JSName("hook")
    var hook_Original: HookCollection[Hooks, request] = js.native
    
    var log: Dictkey = js.native
    
    /**
      * Sends a request based on endpoint options
      *
      * @param {string} route Request method + URL. Example: `'GET /orgs/{org}'`
      * @param {object} [parameters] URL, query or body parameters, as well as `headers`, `mediaType.{format|previews}`, `request`, or `baseUrl`.
      */
    def request[R /* <: Route */](
      route: (/* import warning: LimitUnionLength.leaveTypeRef Was union type with length 693 */ Any) | R
    ): js.Promise[
        (/* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints[R]['response'] */ js.Any) | (OctokitResponse[Any, Double])
      ] = js.native
    def request[R /* <: Route */](
      route: (/* import warning: LimitUnionLength.leaveTypeRef Was union type with length 693 */ Any) | R,
      options: ((/* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints[R]['parameters'] */ js.Any) & typings.octokitTypes.requestParametersMod.RequestParameters) | typings.octokitTypes.requestParametersMod.RequestParameters
    ): js.Promise[
        (/* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints[R]['response'] */ js.Any) | (OctokitResponse[Any, Double])
      ] = js.native
    @JSName("request")
    var request_Original: RequestInterface[js.Object] = js.native
    /**
      * Sends a request based on endpoint options
      *
      * @param {object} endpoint Must set `method` and `url`. Plus URL, query or body parameters, as well as `headers`, `mediaType.{format|previews}`, `request`, or `baseUrl`.
      */
    @JSName("request")
    def request_url[T, O /* <: typings.octokitTypes.requestParametersMod.RequestParameters */](options: O & Method & (UrlString | Url)): js.Promise[OctokitResponse[T, Double]] = js.native
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
    
    inline def defaults[S /* <: Constructor[Any] */](defaults: js.Function): S = ^.asInstanceOf[js.Dynamic].applyDynamic("defaults")(defaults.asInstanceOf[js.Any]).asInstanceOf[S]
    inline def defaults[S /* <: Constructor[Any] */](defaults: OctokitOptions): S = ^.asInstanceOf[js.Dynamic].applyDynamic("defaults")(defaults.asInstanceOf[js.Any]).asInstanceOf[S]
    
    /**
      * Attach a plugin (or many) to your Octokit instance.
      *
      * @example
      * const API = Octokit.plugin(plugin1, plugin2, plugin3, ...)
      */
    inline def plugin[S /* <: Constructor[Any] & Plugins */, T /* <: js.Array[OctokitPlugin] */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param newPlugins because its type T is not an array type */ newPlugins: T
    ): S & Constructor[UnionToIntersection[ReturnTypeOf[T]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("plugin")(newPlugins.asInstanceOf[js.Any]).asInstanceOf[S & Constructor[UnionToIntersection[ReturnTypeOf[T]]]]
    
    @JSImport("@octokit/core", "Octokit.plugins")
    @js.native
    def plugins: js.Array[OctokitPlugin] = js.native
    inline def plugins_=(x: js.Array[OctokitPlugin]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("plugins")(x.asInstanceOf[js.Any])
  }
}
