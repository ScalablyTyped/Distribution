package typings.pinoStdSerializers

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import typings.pinoStdSerializers.anon.Req
import typings.pinoStdSerializers.anon.Res
import typings.std.Error
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("pino-std-serializers", "err")
  @js.native
  def err(err: Error): SerializedError = js.native
  
  @JSImport("pino-std-serializers", "mapHttpRequest")
  @js.native
  def mapHttpRequest(req: IncomingMessage): Req = js.native
  
  @JSImport("pino-std-serializers", "mapHttpResponse")
  @js.native
  def mapHttpResponse(res: ServerResponse): Res = js.native
  
  @JSImport("pino-std-serializers", "req")
  @js.native
  def req(req: IncomingMessage): SerializedRequest = js.native
  
  @JSImport("pino-std-serializers", "res")
  @js.native
  def res(res: ServerResponse): SerializedResponse = js.native
  
  @JSImport("pino-std-serializers", "wrapErrorSerializer")
  @js.native
  def wrapErrorSerializer(customSerializer: CustomErrorSerializer): js.Function1[/* err */ Error, Record[String, _]] = js.native
  
  @JSImport("pino-std-serializers", "wrapRequestSerializer")
  @js.native
  def wrapRequestSerializer(customSerializer: CustomRequestSerializer): js.Function1[/* req */ IncomingMessage, Record[String, _]] = js.native
  
  @JSImport("pino-std-serializers", "wrapResponseSerializer")
  @js.native
  def wrapResponseSerializer(customSerializer: CustomResponseSerializer): js.Function1[/* res */ ServerResponse, Record[String, _]] = js.native
  
  type CustomErrorSerializer = js.Function1[/* err */ SerializedError, Record[String, js.Any]]
  
  type CustomRequestSerializer = js.Function1[/* req */ SerializedRequest, Record[String, js.Any]]
  
  type CustomResponseSerializer = js.Function1[/* res */ SerializedResponse, Record[String, js.Any]]
  
  @js.native
  trait SerializedError
    extends /* key */ NumberDictionary[js.Any]
       with /**
    * Any other extra properties that have been attached to the object will also be present on the serialized object.
    */
  /* key */ StringDictionary[js.Any] {
    
    /**
      * The supplied error message.
      */
    var message: String = js.native
    
    /**
      * Non-enumerable. The original Error object. This will not be included in the logged output.
      * This is available for subsequent serializers to use.
      */
    var raw: Error = js.native
    
    /**
      * The stack when the error was generated.
      */
    var stack: String = js.native
    
    /**
      * The name of the object's constructor.
      */
    var `type`: String = js.native
  }
  object SerializedError {
    
    @scala.inline
    def apply(message: String, raw: Error, stack: String, `type`: String): SerializedError = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], stack = stack.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[SerializedError]
    }
    
    @scala.inline
    implicit class SerializedErrorMutableBuilder[Self <: SerializedError] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRaw(value: Error): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStack(value: String): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SerializedRequest extends StObject {
    
    /**
      * Reference to the `headers` object from the request (as per req.headers in core HTTP).
      */
    var headers: Record[String, String] = js.native
    
    /**
      * Defaults to `undefined`, unless there is an `id` property already attached to the `request` object or
      * to the `request.info` object. Attach a synchronous function to the `request.id` that returns an
      * identifier to have the value filled.
      */
    var id: js.UndefOr[String] = js.native
    
    /**
      * HTTP method.
      */
    var method: String = js.native
    
    /**
      * Non-enumerable, i.e. will not be in the output, original request object. This is available for subsequent
      * serializers to use. In cases where the `request` input already has  a `raw` property this will
      * replace the original `request.raw` property.
      */
    var raw: IncomingMessage = js.native
    
    var remoteAddress: String = js.native
    
    var remotePort: Double = js.native
    
    /**
      * Request pathname (as per req.url in core HTTP).
      */
    var url: String = js.native
  }
  object SerializedRequest {
    
    @scala.inline
    def apply(
      headers: Record[String, String],
      method: String,
      raw: IncomingMessage,
      remoteAddress: String,
      remotePort: Double,
      url: String
    ): SerializedRequest = {
      val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], remoteAddress = remoteAddress.asInstanceOf[js.Any], remotePort = remotePort.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[SerializedRequest]
    }
    
    @scala.inline
    implicit class SerializedRequestMutableBuilder[Self <: SerializedRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeaders(value: Record[String, String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRaw(value: IncomingMessage): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoteAddress(value: String): Self = StObject.set(x, "remoteAddress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemotePort(value: Double): Self = StObject.set(x, "remotePort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SerializedResponse extends StObject {
    
    /**
      * The headers to be sent in the response.
      */
    var headers: Record[String, String] = js.native
    
    /**
      * Non-enumerable, i.e. will not be in the output, original response object. This is available for subsequent serializers to use.
      */
    var raw: ServerResponse = js.native
    
    /**
      * HTTP status code.
      */
    var statusCode: Double = js.native
  }
  object SerializedResponse {
    
    @scala.inline
    def apply(headers: Record[String, String], raw: ServerResponse, statusCode: Double): SerializedResponse = {
      val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[SerializedResponse]
    }
    
    @scala.inline
    implicit class SerializedResponseMutableBuilder[Self <: SerializedResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeaders(value: Record[String, String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRaw(value: ServerResponse): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    }
  }
}
