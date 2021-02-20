package typings.octokitGraphql

import org.scalablytyped.runtime.StringDictionary
import typings.octokitGraphql.anon.Extensions
import typings.octokitGraphql.octokitGraphqlStrings.body
import typings.octokitGraphql.octokitGraphqlStrings.headers
import typings.octokitGraphql.octokitGraphqlStrings.method
import typings.octokitGraphql.octokitGraphqlStrings.request
import typings.octokitGraphql.octokitGraphqlStrings.url
import typings.octokitTypes.anon.Format
import typings.octokitTypes.anon.Method
import typings.octokitTypes.anon.UrlString
import typings.octokitTypes.endpointInterfaceMod.EndpointInterface
import typings.octokitTypes.requestHeadersMod.RequestHeaders
import typings.octokitTypes.requestMethodMod.RequestMethod
import typings.octokitTypes.requestOptionsMod.RequestOptions
import typings.octokitTypes.requestRequestOptionsMod.RequestRequestOptions
import typings.octokitTypes.routeMod.Route
import typings.octokitTypes.urlMod.Url
import typings.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  /* Inlined @octokit/types.@octokit/types.EndpointOptions & {  variables :{[key: string] : unknown} | undefined} */
  @js.native
  trait GraphQlEndpointOptions
    extends /**
    * Any additional parameter will be passed as follows
    * 1. URL parameter if `':parameter'` or `{parameter}` is part of `url`
    * 2. Query parameter if `method` is `'GET'` or `'HEAD'`
    * 3. Request body if `parameter` is `'data'`
    * 4. JSON in the request body in the form of `body[parameter]` unless `parameter` key is `'data'`
    */
  /* parameter */ StringDictionary[js.Any] {
    
    /**
      * Base URL to be used when a relative URL is passed, such as `/orgs/:org`.
      * If `baseUrl` is `https://enterprise.acme-inc.com/api/v3`, then the request
      * will be sent to `https://enterprise.acme-inc.com/api/v3/orgs/:org`.
      */
    var baseUrl: js.UndefOr[Url] = js.native
    
    /**
      * HTTP headers. Use lowercase keys.
      */
    var headers: js.UndefOr[RequestHeaders] = js.native
    
    /**
      * Media type options, see {@link https://developer.github.com/v3/media/|GitHub Developer Guide}
      */
    var mediaType: js.UndefOr[Format] = js.native
    
    var method: RequestMethod = js.native
    
    /**
      * Pass custom meta information for the request. The `request` object will be returned as is.
      */
    var request: js.UndefOr[RequestRequestOptions] = js.native
    
    var url: Url = js.native
    
    var variables: js.UndefOr[StringDictionary[js.Any]] = js.native
  }
  object GraphQlEndpointOptions {
    
    @scala.inline
    def apply(method: RequestMethod, url: Url): GraphQlEndpointOptions = {
      val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[GraphQlEndpointOptions]
    }
    
    @scala.inline
    implicit class GraphQlEndpointOptionsMutableBuilder[Self <: GraphQlEndpointOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBaseUrl(value: Url): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaseUrlUndefined: Self = StObject.set(x, "baseUrl", js.undefined)
      
      @scala.inline
      def setHeaders(value: RequestHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setMediaType(value: Format): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMediaTypeUndefined: Self = StObject.set(x, "mediaType", js.undefined)
      
      @scala.inline
      def setMethod(value: RequestMethod): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequest(value: RequestRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
      
      @scala.inline
      def setUrl(value: Url): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVariables(value: StringDictionary[js.Any]): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVariablesUndefined: Self = StObject.set(x, "variables", js.undefined)
    }
  }
  
  @js.native
  trait GraphQlQueryResponse[ResponseData] extends StObject {
    
    var data: ResponseData = js.native
    
    var errors: js.UndefOr[js.Array[Extensions]] = js.native
  }
  object GraphQlQueryResponse {
    
    @scala.inline
    def apply[ResponseData](data: ResponseData): GraphQlQueryResponse[ResponseData] = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[GraphQlQueryResponse[ResponseData]]
    }
    
    @scala.inline
    implicit class GraphQlQueryResponseMutableBuilder[Self <: GraphQlQueryResponse[_], ResponseData] (val x: Self with GraphQlQueryResponse[ResponseData]) extends AnyVal {
      
      @scala.inline
      def setData(value: ResponseData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrors(value: js.Array[Extensions]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
      
      @scala.inline
      def setErrorsVarargs(value: Extensions*): Self = StObject.set(x, "errors", js.Array(value :_*))
    }
  }
  
  type GraphQlQueryResponseData = StringDictionary[js.Any]
  
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
      * Octokit endpoint API, see {@link https://github.com/octokit/endpoint.js|@octokit/endpoint}
      */
    def endpoint[R /* <: Route */, P /* <: typings.octokitTypes.requestParametersMod.RequestParameters */](route: R): (RequestOptions | (/* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints[R]['request'] */ js.Any)) with (Pick[
        P, 
        /* keyof @octokit/types.@octokit/types/dist-types/RequestOptions.RequestOptions */ method | url | headers | body | request
      ]) = js.native
    /**
      * Octokit endpoint API, see {@link https://github.com/octokit/endpoint.js|@octokit/endpoint}
      */
    def endpoint[R /* <: Route */, P /* <: typings.octokitTypes.requestParametersMod.RequestParameters */](route: R, parameters: P): (RequestOptions | (/* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints[R]['request'] */ js.Any)) with (Pick[
        P, 
        /* keyof @octokit/types.@octokit/types/dist-types/RequestOptions.RequestOptions */ method | url | headers | body | request
      ]) = js.native
    /**
      * Transforms a GitHub REST API endpoint into generic request options
      *
      * @param {string} route Request method + URL. Example: `'GET /orgs/:org'`
      * @param {object} [parameters] URL, query or body parameters, as well as `headers`, `mediaType.{format|previews}`, `request`, or `baseUrl`.
      */
    /**
      * Octokit endpoint API, see {@link https://github.com/octokit/endpoint.js|@octokit/endpoint}
      */
    def endpoint[R /* <: Route */, P /* <: typings.octokitTypes.requestParametersMod.RequestParameters */](route: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 670 */ js.Any): (RequestOptions | (/* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints[R]['request'] */ js.Any)) with (Pick[
        P, 
        /* keyof @octokit/types.@octokit/types/dist-types/RequestOptions.RequestOptions */ method | url | headers | body | request
      ]) = js.native
    /**
      * Octokit endpoint API, see {@link https://github.com/octokit/endpoint.js|@octokit/endpoint}
      */
    def endpoint[R /* <: Route */, P /* <: typings.octokitTypes.requestParametersMod.RequestParameters */](
      route: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 670 */ js.Any,
      parameters: P
    ): (RequestOptions | (/* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints[R]['request'] */ js.Any)) with (Pick[
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
    def endpoint_url[O /* <: typings.octokitTypes.requestParametersMod.RequestParameters */](options: O with Method with (UrlString | typings.octokitTypes.anon.Url)): RequestOptions with (Pick[
        js.Object with O, 
        /* keyof @octokit/types.@octokit/types/dist-types/RequestOptions.RequestOptions */ method | url | headers | body | request
      ]) = js.native
  }
}
