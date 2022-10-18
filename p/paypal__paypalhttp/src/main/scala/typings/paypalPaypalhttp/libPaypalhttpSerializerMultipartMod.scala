package typings.paypalPaypalhttp

import typings.node.bufferMod.global.Buffer
import typings.paypalPaypalhttp.libPaypalhttpHttpClientMod.HttpHeaders
import typings.paypalPaypalhttp.libPaypalhttpHttpClientMod.HttpRequest
import typings.paypalPaypalhttp.libPaypalhttpSerializerSerializerMod.Serializer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPaypalhttpSerializerMultipartMod {
  
  @JSImport("@paypal/paypalhttp/lib/paypalhttp/serializer/multipart", "FormPart")
  @js.native
  open class FormPart protected () extends StObject {
    def this(value: Any, headers: HttpHeaders) = this()
    
    val headers: HttpHeaders = js.native
    
    val value: Any = js.native
  }
  
  @JSImport("@paypal/paypalhttp/lib/paypalhttp/serializer/multipart", "Multipart")
  @js.native
  open class Multipart () extends Serializer {
    
    def decode(): js.Error = js.native
    
    def encode(request: HttpRequest[js.Object]): Buffer = js.native
    
    def formatHeaders(headers: HttpHeaders): HttpHeaders = js.native
  }
  /* static members */
  object Multipart {
    
    @JSImport("@paypal/paypalhttp/lib/paypalhttp/serializer/multipart", "Multipart")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@paypal/paypalhttp/lib/paypalhttp/serializer/multipart", "Multipart._CRLF")
    @js.native
    def _CRLF: String = js.native
    inline def _CRLF_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_CRLF")(x.asInstanceOf[js.Any])
  }
}
