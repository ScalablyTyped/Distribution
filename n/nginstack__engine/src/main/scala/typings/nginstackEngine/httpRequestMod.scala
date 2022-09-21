package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object httpRequestMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/http/Request", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with Request
  @JSImport("@nginstack/engine/lib/http/Request", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  trait Request extends StObject {
    
    var acceptLanguage: String = js.native
    
    var body: typings.nginstackEngine.requestBodyMod.^ = js.native
    
    var content: String = js.native
    
    var contentLength: Double = js.native
    
    var contentType: String = js.native
    
    var cookieCount: Double = js.native
    
    def getCookie(indexOrName: String): Unit = js.native
    def getCookie(indexOrName: Double): Unit = js.native
    
    def getCookieName(index: Any): Unit = js.native
    
    def getHeader(name: Any): String = js.native
    
    def getHeaders(): Any = js.native
    
    def getParameter(indexOrName: String): String = js.native
    def getParameter(indexOrName: Double): String = js.native
    
    def getParameterName(index: String): Unit = js.native
    def getParameterName(index: Double): Unit = js.native
    
    var host: String = js.native
    
    var httpMessage: String = js.native
    
    def isHttps(): Boolean = js.native
    def isHttps(trustProxy: Boolean): Boolean = js.native
    
    var localAddress: String = js.native
    
    var localHost: String = js.native
    
    var localPort: Double = js.native
    
    var method: String = js.native
    
    var methodType: String = js.native
    
    def param(name: String, opt_default: Any): String = js.native
    
    var parameterCount: Double = js.native
    
    var params: Any = js.native
    
    var path: String = js.native
    
    def read(size: Double): String = js.native
    
    var readTimeout: Double = js.native
    
    var referer: String = js.native
    
    var remoteAddress: String = js.native
    
    var remoteHost: String = js.native
    
    var remotePort: Double = js.native
    
    var userAgent: String = js.native
    
    var xml: Any = js.native
  }
}
