package typings.postmark

import typings.axios.mod.AxiosInstance
import typings.axios.mod.AxiosRequestConfig
import typings.postmark.distClientModelsMod.ClientOptions.Configuration
import typings.postmark.distClientModelsMod.HttpClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distClientHttpClientMod {
  
  @JSImport("postmark/dist/client/HttpClient", "AxiosHttpClient")
  @js.native
  open class AxiosHttpClient () extends HttpClient {
    def this(configOptions: Configuration) = this()
    
    /* private */ var adjustValue: Any = js.native
    
    @JSName("client")
    def client_MAxiosHttpClient[T, R, D](config: AxiosRequestConfig[D]): js.Promise[R] = js.native
    @JSName("client")
    def client_MAxiosHttpClient[T, R, D](url: String): js.Promise[R] = js.native
    @JSName("client")
    def client_MAxiosHttpClient[T, R, D](url: String, config: AxiosRequestConfig[D]): js.Promise[R] = js.native
    @JSName("client")
    var client_Original: AxiosInstance = js.native
    
    /* private */ var errorHandler: Any = js.native
    
    /**
      * Timeout in seconds is adjusted to Axios format.
      *
      * @private
      */
    /* private */ var getRequestTimeoutInMilliseconds: Any = js.native
    
    def initHttpClient(configOptions: Configuration): Unit = js.native
    
    /**
      * Process callback function for HTTP request.
      *
      * @param error - request error that needs to be transformed to proper Postmark error.
      *
      * @return {PostmarkError} - formatted Postmark error
      */
    /* private */ var transformError: Any = js.native
  }
}
