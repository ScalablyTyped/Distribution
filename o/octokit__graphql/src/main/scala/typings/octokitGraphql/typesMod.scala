package typings.octokitGraphql

import org.scalablytyped.runtime.StringDictionary
import typings.octokitGraphql.anon.Extensions
import typings.octokitGraphql.octokitGraphqlStrings.body
import typings.octokitGraphql.octokitGraphqlStrings.headers
import typings.octokitGraphql.octokitGraphqlStrings.method
import typings.octokitGraphql.octokitGraphqlStrings.request
import typings.octokitGraphql.octokitGraphqlStrings.url
import typings.octokitTypes.anon.Method
import typings.octokitTypes.anon.UrlString
import typings.octokitTypes.endpointInterfaceMod.EndpointInterface
import typings.octokitTypes.endpointOptionsMod.EndpointOptions
import typings.octokitTypes.requestMethodMod.RequestMethod
import typings.octokitTypes.requestOptionsMod.RequestOptions
import typings.octokitTypes.routeMod.Route
import typings.octokitTypes.urlMod.Url
import typings.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  trait GraphQlEndpointOptions
    extends StObject
       with EndpointOptions {
    
    var variables: js.UndefOr[StringDictionary[Any]] = js.undefined
  }
  object GraphQlEndpointOptions {
    
    inline def apply(method: RequestMethod, url: Url): GraphQlEndpointOptions = {
      val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[GraphQlEndpointOptions]
    }
    
    extension [Self <: GraphQlEndpointOptions](x: Self) {
      
      inline def setVariables(value: StringDictionary[Any]): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
      
      inline def setVariablesUndefined: Self = StObject.set(x, "variables", js.undefined)
    }
  }
  
  trait GraphQlQueryResponse[ResponseData] extends StObject {
    
    var data: ResponseData
    
    var errors: js.UndefOr[js.Array[Extensions]] = js.undefined
  }
  object GraphQlQueryResponse {
    
    inline def apply[ResponseData](data: ResponseData): GraphQlQueryResponse[ResponseData] = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[GraphQlQueryResponse[ResponseData]]
    }
    
    extension [Self <: GraphQlQueryResponse[?], ResponseData](x: Self & GraphQlQueryResponse[ResponseData]) {
      
      inline def setData(value: ResponseData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setErrors(value: js.Array[Extensions]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
      
      inline def setErrorsVarargs(value: Extensions*): Self = StObject.set(x, "errors", js.Array(value*))
    }
  }
  
  type GraphQlQueryResponseData = StringDictionary[Any]
  
  type GraphQlResponse[ResponseData] = js.Promise[ResponseData]
  
  type Query = String
  
  type RequestParameters = typings.octokitTypes.requestParametersMod.RequestParameters
  
  @js.native
  trait graphql extends StObject {
    
    /**
      * Sends a GraphQL query request based on endpoint options
      * The GraphQL query must be specified in `options`.
      *
      * @param {object} endpoint Must set `method` and `url`. Plus URL, query or body parameters, as well as `headers`, `mediaType.{format|previews}`, `request`, or `baseUrl`.
      */
    def apply[ResponseData](options: RequestParameters): GraphQlResponse[ResponseData] = js.native
    /**
      * Sends a GraphQL query request based on endpoint options
      *
      * @param {string} query GraphQL query. Example: `'query { viewer { login } }'`.
      * @param {object} [parameters] URL, query or body parameters, as well as `headers`, `mediaType.{format|previews}`, `request`, or `baseUrl`.
      */
    def apply[ResponseData](query: Query): GraphQlResponse[ResponseData] = js.native
    def apply[ResponseData](query: Query, parameters: RequestParameters): GraphQlResponse[ResponseData] = js.native
    
    /**
      * Returns a new `endpoint` with updated route and parameters
      */
    def defaults(newDefaults: RequestParameters): graphql = js.native
    
    /**
      * Transforms a GitHub REST API endpoint into generic request options
      *
      * @param {string} route Request method + URL. Example: `'GET /orgs/{org}'`
      * @param {object} [parameters] URL, query or body parameters, as well as `headers`, `mediaType.{format|previews}`, `request`, or `baseUrl`.
      */
    /**
      * Octokit endpoint API, see {@link https://github.com/octokit/endpoint.js|@octokit/endpoint}
      */
    def endpoint[R /* <: Route */, P /* <: typings.octokitTypes.requestParametersMod.RequestParameters */](
      route: (/* import warning: LimitUnionLength.leaveTypeRef Was union type with length 890 */ Any) | R
    ): (RequestOptions | (/* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints[R]['request'] */ js.Any)) & (Pick[
        P, 
        /* keyof @octokit/types.@octokit/types/dist-types/RequestOptions.RequestOptions */ method | url | headers | body | request
      ]) = js.native
    /**
      * Octokit endpoint API, see {@link https://github.com/octokit/endpoint.js|@octokit/endpoint}
      */
    def endpoint[R /* <: Route */, P /* <: typings.octokitTypes.requestParametersMod.RequestParameters */](
      route: (/* import warning: LimitUnionLength.leaveTypeRef Was union type with length 890 */ Any) | R,
      parameters: P
    ): (RequestOptions | (/* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints[R]['request'] */ js.Any)) & (Pick[
        P, 
        /* keyof @octokit/types.@octokit/types/dist-types/RequestOptions.RequestOptions */ method | url | headers | body | request
      ]) = js.native
    /**
      * Octokit endpoint API, see {@link https://github.com/octokit/endpoint.js|@octokit/endpoint}
      */
    @JSName("endpoint")
    var endpoint_Original: EndpointInterface[js.Object] = js.native
    /**
      * Transforms a GitHub REST API endpoint into generic request options
      *
      * @param {object} endpoint Must set `url` unless it's set defaults. Plus URL, query or body parameters, as well as `headers`, `mediaType.{format|previews}`, `request`, or `baseUrl`.
      */
    /**
      * Octokit endpoint API, see {@link https://github.com/octokit/endpoint.js|@octokit/endpoint}
      */
    @JSName("endpoint")
    def endpoint_url[O /* <: typings.octokitTypes.requestParametersMod.RequestParameters */](options: O & Method & (UrlString | typings.octokitTypes.anon.Url)): RequestOptions & (Pick[
        js.Object & O, 
        /* keyof @octokit/types.@octokit/types/dist-types/RequestOptions.RequestOptions */ method | url | headers | body | request
      ]) = js.native
  }
}
