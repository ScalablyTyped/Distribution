package typings.micro

import org.scalablytyped.runtime.Instantiable1
import typings.node.bufferMod.global.Buffer
import typings.node.bufferMod.global.BufferEncoding
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.RequestListener
import typings.node.httpMod.ServerResponse
import typings.node.nodeColonnetMod.Socket
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("micro", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("micro", "HttpError")
  @js.native
  open class HttpError protected ()
    extends StObject
       with Error {
    def this(message: String) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    
    var originalError: js.UndefOr[js.Error] = js.native
    
    var statusCode: js.UndefOr[Double] = js.native
  }
  
  inline def buffer(req: IncomingMessage): js.Promise[Buffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("buffer")(req.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Buffer]]
  inline def buffer(req: IncomingMessage, param1: BufferInfo): js.Promise[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("buffer")(req.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer]]
  
  inline def createError(code: Double, message: String, original: js.Error): HttpError = (^.asInstanceOf[js.Dynamic].applyDynamic("createError")(code.asInstanceOf[js.Any], message.asInstanceOf[js.Any], original.asInstanceOf[js.Any])).asInstanceOf[HttpError]
  
  inline def json(req: IncomingMessage): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("json")(req.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
  inline def json(req: IncomingMessage, opts: BufferInfo): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("json")(req.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  
  inline def run(req: IncomingMessage, res: ServerResponse[IncomingMessage], fn: RequestHandler): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("run")(req.asInstanceOf[js.Any], res.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def send(res: ServerResponse[IncomingMessage], code: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("send")(res.asInstanceOf[js.Any], code.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def send(res: ServerResponse[IncomingMessage], code: Double, obj: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("send")(res.asInstanceOf[js.Any], code.asInstanceOf[js.Any], obj.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def sendError(req: IncomingMessage, res: ServerResponse[IncomingMessage], errorObj: js.Error): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sendError")(req.asInstanceOf[js.Any], res.asInstanceOf[js.Any], errorObj.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def sendError(req: IncomingMessage, res: ServerResponse[IncomingMessage], errorObj: HttpError): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sendError")(req.asInstanceOf[js.Any], res.asInstanceOf[js.Any], errorObj.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("micro", "serve")
  @js.native
  val serve: Serve_ = js.native
  
  inline def text(req: IncomingMessage): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("text")(req.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def text(req: IncomingMessage, param1: BufferInfo): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("text")(req.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  trait BufferInfo extends StObject {
    
    var encoding: js.UndefOr[BufferEncoding] = js.undefined
    
    var limit: js.UndefOr[String | Double] = js.undefined
  }
  object BufferInfo {
    
    inline def apply(): BufferInfo = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BufferInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BufferInfo] (val x: Self) extends AnyVal {
      
      inline def setEncoding(value: BufferEncoding): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      inline def setLimit(value: String | Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    }
  }
  
  type RequestHandler = js.Function2[/* req */ IncomingMessage, /* res */ ServerResponse[IncomingMessage], Any]
  
  type Serve_ = js.Function1[
    /* fn */ RequestHandler, 
    RequestListener[
      Instantiable1[/* socket */ Socket, IncomingMessage], 
      Instantiable1[
        /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
        ServerResponse[IncomingMessage]
      ]
    ]
  ]
}
