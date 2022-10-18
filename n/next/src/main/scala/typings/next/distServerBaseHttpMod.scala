package typings.next

import typings.next.distServerApiUtilsMod.NextApiRequestCookies
import typings.next.distServerConfigSharedMod.I18NConfig
import typings.node.httpMod.IncomingHttpHeaders
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distServerBaseHttpMod {
  
  /* note: abstract class */ @JSImport("next/dist/server/base-http", "BaseNextRequest")
  @js.native
  open class BaseNextRequest[Body] protected () extends StObject {
    def this(method: String, url: String, body: Body) = this()
    
    /* protected */ var _cookies: js.UndefOr[NextApiRequestCookies] = js.native
    
    var body: Body = js.native
    
    def cookies: js.Object = js.native
    
    var headers: IncomingHttpHeaders = js.native
    
    var method: String = js.native
    
    def parseBody(limit: String): js.Promise[Any] = js.native
    def parseBody(limit: Double): js.Promise[Any] = js.native
    
    var url: String = js.native
  }
  
  /* note: abstract class */ @JSImport("next/dist/server/base-http", "BaseNextResponse")
  @js.native
  open class BaseNextResponse[Destination] protected () extends StObject {
    def this(destination: Destination) = this()
    
    /**
      * Appends value for the given header name
      */
    def appendHeader(name: String, value: String): this.type = js.native
    
    def body(value: String): this.type = js.native
    
    var destination: Destination = js.native
    
    /**
      * Get vaues for a header concatenated using `,` or undefined if no value is present
      */
    def getHeader(name: String): js.UndefOr[String] = js.native
    
    /**
      * Get all vaues for a header as an array or undefined if no value is present
      */
    def getHeaderValues(name: String): js.UndefOr[js.Array[String]] = js.native
    
    def hasHeader(name: String): Boolean = js.native
    
    def redirect(destination: String, statusCode: Double): this.type = js.native
    
    def send(): Unit = js.native
    
    def sent: Boolean = js.native
    
    /**
      * Sets a value for the header overwriting existing values
      */
    def setHeader(name: String, value: String): this.type = js.native
    def setHeader(name: String, value: js.Array[String]): this.type = js.native
    
    var statusCode: js.UndefOr[Double] = js.native
    
    var statusMessage: js.UndefOr[String] = js.native
  }
  
  trait BaseNextRequestConfig extends StObject {
    
    var basePath: js.UndefOr[String] = js.undefined
    
    var i18n: js.UndefOr[I18NConfig] = js.undefined
    
    var trailingSlash: js.UndefOr[Boolean] = js.undefined
  }
  object BaseNextRequestConfig {
    
    inline def apply(): BaseNextRequestConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BaseNextRequestConfig]
    }
    
    extension [Self <: BaseNextRequestConfig](x: Self) {
      
      inline def setBasePath(value: String): Self = StObject.set(x, "basePath", value.asInstanceOf[js.Any])
      
      inline def setBasePathUndefined: Self = StObject.set(x, "basePath", js.undefined)
      
      inline def setI18n(value: I18NConfig): Self = StObject.set(x, "i18n", value.asInstanceOf[js.Any])
      
      inline def setI18nUndefined: Self = StObject.set(x, "i18n", js.undefined)
      
      inline def setTrailingSlash(value: Boolean): Self = StObject.set(x, "trailingSlash", value.asInstanceOf[js.Any])
      
      inline def setTrailingSlashUndefined: Self = StObject.set(x, "trailingSlash", js.undefined)
    }
  }
}
