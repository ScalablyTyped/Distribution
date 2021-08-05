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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("pino-std-serializers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def err(err: Error): SerializedError = ^.asInstanceOf[js.Dynamic].applyDynamic("err")(err.asInstanceOf[js.Any]).asInstanceOf[SerializedError]
  
  inline def mapHttpRequest(req: IncomingMessage): Req = ^.asInstanceOf[js.Dynamic].applyDynamic("mapHttpRequest")(req.asInstanceOf[js.Any]).asInstanceOf[Req]
  
  inline def mapHttpResponse(res: ServerResponse): Res = ^.asInstanceOf[js.Dynamic].applyDynamic("mapHttpResponse")(res.asInstanceOf[js.Any]).asInstanceOf[Res]
  
  inline def req(req: IncomingMessage): SerializedRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("req")(req.asInstanceOf[js.Any]).asInstanceOf[SerializedRequest]
  
  inline def res(res: ServerResponse): SerializedResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("res")(res.asInstanceOf[js.Any]).asInstanceOf[SerializedResponse]
  
  inline def wrapErrorSerializer(customSerializer: CustomErrorSerializer): js.Function1[/* err */ Error, Record[String, js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("wrapErrorSerializer")(customSerializer.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* err */ Error, Record[String, js.Any]]]
  
  inline def wrapRequestSerializer(customSerializer: CustomRequestSerializer): js.Function1[/* req */ IncomingMessage, Record[String, js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("wrapRequestSerializer")(customSerializer.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* req */ IncomingMessage, Record[String, js.Any]]]
  
  inline def wrapResponseSerializer(customSerializer: CustomResponseSerializer): js.Function1[/* res */ ServerResponse, Record[String, js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("wrapResponseSerializer")(customSerializer.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* res */ ServerResponse, Record[String, js.Any]]]
  
  type CustomErrorSerializer = js.Function1[/* err */ SerializedError, Record[String, js.Any]]
  
  type CustomRequestSerializer = js.Function1[/* req */ SerializedRequest, Record[String, js.Any]]
  
  type CustomResponseSerializer = js.Function1[/* res */ SerializedResponse, Record[String, js.Any]]
  
  trait SerializedError
    extends StObject
       with /* key */ NumberDictionary[js.Any]
       with /**
    * Any other extra properties that have been attached to the object will also be present on the serialized object.
    */
  /* key */ StringDictionary[js.Any] {
    
    /**
      * The supplied error message.
      */
    var message: String
    
    /**
      * Non-enumerable. The original Error object. This will not be included in the logged output.
      * This is available for subsequent serializers to use.
      */
    var raw: Error
    
    /**
      * The stack when the error was generated.
      */
    var stack: String
    
    /**
      * The name of the object's constructor.
      */
    var `type`: String
  }
  object SerializedError {
    
    inline def apply(message: String, raw: Error, stack: String, `type`: String): SerializedError = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], stack = stack.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[SerializedError]
    }
    
    extension [Self <: SerializedError](x: Self) {
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setRaw(value: Error): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      inline def setStack(value: String): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait SerializedRequest extends StObject {
    
    /**
      * Reference to the `headers` object from the request (as per req.headers in core HTTP).
      */
    var headers: Record[String, String]
    
    /**
      * Defaults to `undefined`, unless there is an `id` property already attached to the `request` object or
      * to the `request.info` object. Attach a synchronous function to the `request.id` that returns an
      * identifier to have the value filled.
      */
    var id: js.UndefOr[String] = js.undefined
    
    /**
      * HTTP method.
      */
    var method: String
    
    /**
      * Non-enumerable, i.e. will not be in the output, original request object. This is available for subsequent
      * serializers to use. In cases where the `request` input already has  a `raw` property this will
      * replace the original `request.raw` property.
      */
    var raw: IncomingMessage
    
    var remoteAddress: String
    
    var remotePort: Double
    
    /**
      * Request pathname (as per req.url in core HTTP).
      */
    var url: String
  }
  object SerializedRequest {
    
    inline def apply(
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
    
    extension [Self <: SerializedRequest](x: Self) {
      
      inline def setHeaders(value: Record[String, String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setRaw(value: IncomingMessage): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      inline def setRemoteAddress(value: String): Self = StObject.set(x, "remoteAddress", value.asInstanceOf[js.Any])
      
      inline def setRemotePort(value: Double): Self = StObject.set(x, "remotePort", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait SerializedResponse extends StObject {
    
    /**
      * The headers to be sent in the response.
      */
    var headers: Record[String, String]
    
    /**
      * Non-enumerable, i.e. will not be in the output, original response object. This is available for subsequent serializers to use.
      */
    var raw: ServerResponse
    
    /**
      * HTTP status code.
      */
    var statusCode: Double
  }
  object SerializedResponse {
    
    inline def apply(headers: Record[String, String], raw: ServerResponse, statusCode: Double): SerializedResponse = {
      val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[SerializedResponse]
    }
    
    extension [Self <: SerializedResponse](x: Self) {
      
      inline def setHeaders(value: Record[String, String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setRaw(value: ServerResponse): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    }
  }
}
