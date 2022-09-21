package typings.postmark

import typings.postmark.callbackMod.Callback
import typings.postmark.clientOptionsMod.ClientOptions.HttpMethod
import typings.postmark.errorHandlerMod.ErrorHandler
import typings.postmark.modelsMod.ClientOptions.Configuration
import typings.postmark.modelsMod.FilteringParameters
import typings.postmark.modelsMod.HttpClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object baseClientMod {
  
  @JSImport("postmark/dist/client/BaseClient", JSImport.Default)
  @js.native
  abstract class default protected ()
    extends StObject
       with BaseClient {
    /* protected */ def this(token: String, authHeader: String) = this()
    /* protected */ def this(token: String, authHeader: String, configOptions: Configuration) = this()
  }
  
  @js.native
  trait BaseClient extends StObject {
    
    /* private */ val authHeader: Any = js.native
    
    var clientVersion: String = js.native
    
    /* protected */ var errorHandler: ErrorHandler = js.native
    
    def getClientOptions(): Configuration = js.native
    
    /**
      * JSON object with default headers sent by HTTP request.
      */
    /* private */ var getComposedHttpRequestHeaders: Any = js.native
    
    var httpClient: HttpClient = js.native
    
    /**
      * Process callback function for HTTP request.
      *
      * @param httpRequest - HTTP request for which callback will be executed
      * @param callback - callback function to be executed.
      */
    /* private */ var processCallbackRequest: Any = js.native
    
    /**
      * Process HTTP request.
      *
      * @param method - Which type of http request will be executed.
      * @param path - API URL endpoint.
      * @param queryParameters - Querystring parameters used for http request.
      * @param body - Data sent with http request.
      *
      * @returns A promise that will complete when the API responds (or an error occurs).
      */
    /* private */ var processHttpRequest: Any = js.native
    
    /**
      * Process request for Postmark ClientOptions.
      *
      * @param method - see processHttpRequest for details
      * @param path - see processHttpRequest for details
      * @param queryParameters - see processHttpRequest for details
      * @param body - see processHttpRequest for details
      * @param callback - callback function to be executed.
      *
      * @returns A promise that will complete when the API responds (or an error occurs).
      */
    /* private */ var processRequest: Any = js.native
    
    /**
      * Process http request with sending body - data.
      *
      * @see processRequest for more details.
      */
    /* protected */ def processRequestWithBody[T](method: HttpMethod, path: String): js.Promise[T] = js.native
    /* protected */ def processRequestWithBody[T](method: HttpMethod, path: String, body: js.Object): js.Promise[T] = js.native
    /* protected */ def processRequestWithBody[T](method: HttpMethod, path: String, body: js.Object, callback: Callback[T]): js.Promise[T] = js.native
    /* protected */ def processRequestWithBody[T](method: HttpMethod, path: String, body: Null, callback: Callback[T]): js.Promise[T] = js.native
    
    /**
      * Process http request without sending body - data.
      *
      * @see processRequest for more details.
      */
    /* protected */ def processRequestWithoutBody[T](method: HttpMethod, path: String): js.Promise[T] = js.native
    /* protected */ def processRequestWithoutBody[T](method: HttpMethod, path: String, queryParameters: js.Object): js.Promise[T] = js.native
    /* protected */ def processRequestWithoutBody[T](method: HttpMethod, path: String, queryParameters: js.Object, callback: Callback[T]): js.Promise[T] = js.native
    /* protected */ def processRequestWithoutBody[T](method: HttpMethod, path: String, queryParameters: Unit, callback: Callback[T]): js.Promise[T] = js.native
    
    def setClientOptions(configOptions: Configuration): Unit = js.native
    
    /**
      * Set default values for count and offset when doing filtering with API requests if they are not specified by filter.
      */
    /* protected */ def setDefaultPaginationValues(filter: FilteringParameters): Unit = js.native
    
    /* private */ val token: Any = js.native
    
    /**
      * Token can't be empty.
      *
      * @param {string} token - HTTP request token
      */
    /* private */ var verifyToken: Any = js.native
  }
}
