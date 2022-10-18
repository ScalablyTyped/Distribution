package typings.paypalPaypalhttp

import org.scalablytyped.runtime.Instantiable0
import typings.node.httpMod.IncomingHttpHeaders
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import typings.paypalPaypalhttp.anon.TypeofMultipart
import typings.paypalPaypalhttp.libPaypalhttpEncoderMod.Encoder
import typings.paypalPaypalhttp.libPaypalhttpEnvironmentMod.Environment
import typings.paypalPaypalhttp.libPaypalhttpSerializerFormEncodedMod.FormEncoded
import typings.paypalPaypalhttp.libPaypalhttpSerializerJsonMod.Json
import typings.paypalPaypalhttp.libPaypalhttpSerializerTextMod.Text
import typings.paypalPaypalhttp.paypalPaypalhttpStrings.CONNECT
import typings.paypalPaypalhttp.paypalPaypalhttpStrings.DELETE
import typings.paypalPaypalhttp.paypalPaypalhttpStrings.GET
import typings.paypalPaypalhttp.paypalPaypalhttpStrings.HEAD
import typings.paypalPaypalhttp.paypalPaypalhttpStrings.OPTIONS
import typings.paypalPaypalhttp.paypalPaypalhttpStrings.PATCH
import typings.paypalPaypalhttp.paypalPaypalhttpStrings.POST
import typings.paypalPaypalhttp.paypalPaypalhttpStrings.PUT
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPaypalhttpHttpClientMod {
  
  @JSImport("@paypal/paypalhttp/lib/paypalhttp/http_client", "HttpClient")
  @js.native
  open class HttpClient protected () extends StObject {
    def this(environment: Environment) = this()
    
    def addInjector(injector: HttpInjector): Unit = js.native
    
    val encoder: Encoder[
        js.Tuple4[Instantiable0[Json], Instantiable0[Text], TypeofMultipart, Instantiable0[FormEncoded]]
      ] = js.native
    
    val environment: Environment = js.native
    
    def execute(req: HttpRequest[js.Object]): js.Promise[HttpResponse[Any]] = js.native
    
    def formatHeaders(headers: HttpHeaders): HttpHeaders = js.native
    
    def getTimeout(): Double = js.native
    
    def getUserAgent(): String = js.native
    
    def mapHeader(rawHeaders: HttpHeaders, formattedHeaders: HttpHeaders): HttpHeaders = js.native
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - org.scalablytyped.runtime.StObject because Already inherited
  - org.scalablytyped.runtime.StringDictionary because Already inherited */ trait HttpHeaders
    extends StObject
       with IncomingHttpHeaders
  object HttpHeaders {
    
    inline def apply(): HttpHeaders = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HttpHeaders]
    }
  }
  
  type HttpInjector = js.Function1[/* request */ HttpRequest[js.Object], Unit]
  
  trait HttpRequest[T] extends StObject {
    
    var body: T
    
    var headers: HttpHeaders
    
    var path: String
    
    var verb: CONNECT | DELETE | GET | HEAD | OPTIONS | PATCH | POST | PUT
  }
  object HttpRequest {
    
    inline def apply[T](
      body: T,
      headers: HttpHeaders,
      path: String,
      verb: CONNECT | DELETE | GET | HEAD | OPTIONS | PATCH | POST | PUT
    ): HttpRequest[T] = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], verb = verb.asInstanceOf[js.Any])
      __obj.asInstanceOf[HttpRequest[T]]
    }
    
    extension [Self <: HttpRequest[?], T](x: Self & HttpRequest[T]) {
      
      inline def setBody(value: T): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setHeaders(value: HttpHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setVerb(value: CONNECT | DELETE | GET | HEAD | OPTIONS | PATCH | POST | PUT): Self = StObject.set(x, "verb", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait HttpResponse[R] extends ServerResponse[IncomingMessage] {
    
    var headers: HttpHeaders = js.native
    
    var message: js.UndefOr[String] = js.native
    
    var result: js.UndefOr[R] = js.native
  }
}
