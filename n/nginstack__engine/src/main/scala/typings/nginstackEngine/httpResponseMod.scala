package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object httpResponseMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/http/Response", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with Response
  @JSImport("@nginstack/engine/lib/http/Response", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  trait Response extends StObject {
    
    var cacheControl: String = js.native
    
    var contentDescription: String = js.native
    
    var contentDisposition: String = js.native
    
    var contentEncoding: String = js.native
    
    var contentType: String = js.native
    
    var expires: js.Date = js.native
    
    def getAllHeaders(): Any = js.native
    
    def redirect(uri: String): Unit = js.native
    def redirect(uri: String, opt_permanently: Boolean): Unit = js.native
    
    def send(): Unit = js.native
    
    def setCookie(name: String, value: String): Unit = js.native
    
    def setHeader(name: Any, value: Any): Unit = js.native
    
    var statusCode: Double = js.native
    
    def stop(): Unit = js.native
    
    def stopAndRedirect(uri: String): Unit = js.native
    def stopAndRedirect(uri: String, opt_permanently: Boolean): Unit = js.native
    
    var transferEncoding: String = js.native
    
    def write(content: String): Unit = js.native
    
    def writeln(content: String): Unit = js.native
  }
}
