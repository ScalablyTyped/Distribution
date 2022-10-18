package typings.postmark.distClientModelsMod

import typings.postmark.distClientModelsClientClientOptionsMod.ClientOptions.Configuration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("postmark/dist/client/models", "HttpClient")
@js.native
/* protected */ open class HttpClient ()
  extends typings.postmark.distClientModelsClientHttpClientMod.HttpClient {
  /* protected */ def this(configOptions: Configuration) = this()
}
/* static members */
object HttpClient {
  
  @JSImport("postmark/dist/client/models", "HttpClient")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Http Client connection configuration options.
    * You may modify these values and new clients will use them.
    * Any values provided to a Client constructor will override default options.
    */
  @JSImport("postmark/dist/client/models", "HttpClient.DefaultOptions")
  @js.native
  def DefaultOptions: Configuration = js.native
  inline def DefaultOptions_=(x: Configuration): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DefaultOptions")(x.asInstanceOf[js.Any])
}
