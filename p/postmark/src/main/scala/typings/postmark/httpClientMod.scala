package typings.postmark

import typings.postmark.clientOptionsMod.ClientOptions.Configuration
import typings.postmark.clientOptionsMod.ClientOptions.HttpMethod
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object httpClientMod {
  
  @JSImport("postmark/dist/client/models/client/HttpClient", "HttpClient")
  @js.native
  /* protected */ abstract class HttpClient () extends StObject {
    /* protected */ def this(configOptions: Configuration) = this()
    
    var client: Any = js.native
    
    var clientOptions: Configuration = js.native
    
    def getBaseHttpRequestURL(): String = js.native
    
    def httpRequest[T](method: HttpMethod, path: String, queryParameters: js.Object, body: js.Object, headers: Any): js.Promise[T] = js.native
    def httpRequest[T](method: HttpMethod, path: String, queryParameters: js.Object, body: Null, headers: Any): js.Promise[T] = js.native
    
    def initHttpClient(): Unit = js.native
    def initHttpClient(configOptions: Configuration): Unit = js.native
  }
  /* static members */
  object HttpClient {
    
    @JSImport("postmark/dist/client/models/client/HttpClient", "HttpClient")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Http Client connection configuration options.
      * You may modify these values and new clients will use them.
      * Any values provided to a Client constructor will override default options.
      */
    @JSImport("postmark/dist/client/models/client/HttpClient", "HttpClient.DefaultOptions")
    @js.native
    def DefaultOptions: Configuration = js.native
    inline def DefaultOptions_=(x: Configuration): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DefaultOptions")(x.asInstanceOf[js.Any])
  }
}
