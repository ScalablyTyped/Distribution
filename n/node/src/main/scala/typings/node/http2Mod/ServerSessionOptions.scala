package typings.node.http2Mod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable4
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import typings.node.netMod.Socket
import typings.node.streamMod.ReadableOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServerSessionOptions extends SessionOptions {
  
  var Http1IncomingMessage: js.UndefOr[Instantiable1[/* socket */ Socket, IncomingMessage]] = js.native
  
  var Http1ServerResponse: js.UndefOr[Instantiable1[/* req */ IncomingMessage, ServerResponse]] = js.native
  
  var Http2ServerRequest: js.UndefOr[
    Instantiable4[
      /* stream */ ServerHttp2Stream, 
      /* headers */ IncomingHttpHeaders, 
      /* options */ ReadableOptions, 
      /* rawHeaders */ js.Array[String], 
      typings.node.http2Mod.Http2ServerRequest
    ]
  ] = js.native
  
  var Http2ServerResponse: js.UndefOr[
    Instantiable1[/* stream */ ServerHttp2Stream, typings.node.http2Mod.Http2ServerResponse]
  ] = js.native
}
object ServerSessionOptions {
  
  @scala.inline
  def apply(): ServerSessionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServerSessionOptions]
  }
  
  @scala.inline
  implicit class ServerSessionOptionsMutableBuilder[Self <: ServerSessionOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHttp1IncomingMessage(value: Instantiable1[/* socket */ Socket, IncomingMessage]): Self = StObject.set(x, "Http1IncomingMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttp1IncomingMessageUndefined: Self = StObject.set(x, "Http1IncomingMessage", js.undefined)
    
    @scala.inline
    def setHttp1ServerResponse(value: Instantiable1[/* req */ IncomingMessage, ServerResponse]): Self = StObject.set(x, "Http1ServerResponse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttp1ServerResponseUndefined: Self = StObject.set(x, "Http1ServerResponse", js.undefined)
    
    @scala.inline
    def setHttp2ServerRequest(
      value: Instantiable4[
          /* stream */ ServerHttp2Stream, 
          /* headers */ IncomingHttpHeaders, 
          /* options */ ReadableOptions, 
          /* rawHeaders */ js.Array[String], 
          Http2ServerRequest
        ]
    ): Self = StObject.set(x, "Http2ServerRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttp2ServerRequestUndefined: Self = StObject.set(x, "Http2ServerRequest", js.undefined)
    
    @scala.inline
    def setHttp2ServerResponse(value: Instantiable1[/* stream */ ServerHttp2Stream, Http2ServerResponse]): Self = StObject.set(x, "Http2ServerResponse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttp2ServerResponseUndefined: Self = StObject.set(x, "Http2ServerResponse", js.undefined)
  }
}
