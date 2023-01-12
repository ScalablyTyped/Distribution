package typings.node.http2Mod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable4
import typings.node.nodeColonhttpMod.IncomingMessage
import typings.node.nodeColonhttpMod.ServerResponse
import typings.node.nodeColonnetMod.Socket
import typings.node.streamMod.ReadableOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServerSessionOptions
  extends StObject
     with SessionOptions {
  
  var Http1IncomingMessage: js.UndefOr[Instantiable1[/* socket */ Socket, IncomingMessage]] = js.undefined
  
  var Http1ServerResponse: js.UndefOr[
    Instantiable1[
      /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
      ServerResponse[typings.node.httpMod.IncomingMessage]
    ]
  ] = js.undefined
  
  var Http2ServerRequest: js.UndefOr[
    Instantiable4[
      /* stream */ ServerHttp2Stream, 
      /* headers */ IncomingHttpHeaders, 
      /* options */ ReadableOptions, 
      /* rawHeaders */ js.Array[String], 
      typings.node.http2Mod.Http2ServerRequest
    ]
  ] = js.undefined
  
  var Http2ServerResponse: js.UndefOr[
    Instantiable1[/* stream */ ServerHttp2Stream, typings.node.http2Mod.Http2ServerResponse]
  ] = js.undefined
}
object ServerSessionOptions {
  
  inline def apply(): ServerSessionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServerSessionOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ServerSessionOptions] (val x: Self) extends AnyVal {
    
    inline def setHttp1IncomingMessage(value: Instantiable1[/* socket */ Socket, IncomingMessage]): Self = StObject.set(x, "Http1IncomingMessage", value.asInstanceOf[js.Any])
    
    inline def setHttp1IncomingMessageUndefined: Self = StObject.set(x, "Http1IncomingMessage", js.undefined)
    
    inline def setHttp1ServerResponse(
      value: Instantiable1[
          /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
          ServerResponse[typings.node.httpMod.IncomingMessage]
        ]
    ): Self = StObject.set(x, "Http1ServerResponse", value.asInstanceOf[js.Any])
    
    inline def setHttp1ServerResponseUndefined: Self = StObject.set(x, "Http1ServerResponse", js.undefined)
    
    inline def setHttp2ServerRequest(
      value: Instantiable4[
          /* stream */ ServerHttp2Stream, 
          /* headers */ IncomingHttpHeaders, 
          /* options */ ReadableOptions, 
          /* rawHeaders */ js.Array[String], 
          Http2ServerRequest
        ]
    ): Self = StObject.set(x, "Http2ServerRequest", value.asInstanceOf[js.Any])
    
    inline def setHttp2ServerRequestUndefined: Self = StObject.set(x, "Http2ServerRequest", js.undefined)
    
    inline def setHttp2ServerResponse(value: Instantiable1[/* stream */ ServerHttp2Stream, Http2ServerResponse]): Self = StObject.set(x, "Http2ServerResponse", value.asInstanceOf[js.Any])
    
    inline def setHttp2ServerResponseUndefined: Self = StObject.set(x, "Http2ServerResponse", js.undefined)
  }
}
