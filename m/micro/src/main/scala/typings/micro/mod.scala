package typings.micro

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typings.micro.anon.Encoding
import typings.micro.anon.ErrorstatusCodenumberorig
import typings.micro.anon.Message
import typings.node.bufferMod.global.Buffer
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.Server
import typings.node.httpMod.ServerResponse
import typings.node.nodeNetMod.Socket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("micro", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(fn: RequestHandler): Server[
    Instantiable1[/* socket */ Socket, IncomingMessage], 
    Instantiable1[
      /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
      ServerResponse[IncomingMessage]
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(fn.asInstanceOf[js.Any]).asInstanceOf[Server[
    Instantiable1[/* socket */ Socket, IncomingMessage], 
    Instantiable1[
      /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
      ServerResponse[IncomingMessage]
    ]
  ]]
  
  inline def buffer(req: IncomingMessage): js.Promise[Buffer | String] = ^.asInstanceOf[js.Dynamic].applyDynamic("buffer")(req.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Buffer | String]]
  inline def buffer(req: IncomingMessage, info: Encoding): js.Promise[Buffer | String] = (^.asInstanceOf[js.Dynamic].applyDynamic("buffer")(req.asInstanceOf[js.Any], info.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer | String]]
  
  inline def createError(code: Double, msg: String): ErrorstatusCodenumberorig = (^.asInstanceOf[js.Dynamic].applyDynamic("createError")(code.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[ErrorstatusCodenumberorig]
  inline def createError(code: Double, msg: String, orig: js.Error): ErrorstatusCodenumberorig = (^.asInstanceOf[js.Dynamic].applyDynamic("createError")(code.asInstanceOf[js.Any], msg.asInstanceOf[js.Any], orig.asInstanceOf[js.Any])).asInstanceOf[ErrorstatusCodenumberorig]
  
  inline def json(req: IncomingMessage): js.Promise[StringDictionary[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("json")(req.asInstanceOf[js.Any]).asInstanceOf[js.Promise[StringDictionary[Any]]]
  inline def json(req: IncomingMessage, info: Encoding): js.Promise[StringDictionary[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("json")(req.asInstanceOf[js.Any], info.asInstanceOf[js.Any])).asInstanceOf[js.Promise[StringDictionary[Any]]]
  
  inline def run(req: IncomingMessage, res: ServerResponse[IncomingMessage], fn: RequestHandler): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("run")(req.asInstanceOf[js.Any], res.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def send(res: ServerResponse[IncomingMessage], code: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("send")(res.asInstanceOf[js.Any], code.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def send(res: ServerResponse[IncomingMessage], code: Double, data: Any): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("send")(res.asInstanceOf[js.Any], code.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def sendError(req: IncomingMessage, res: ServerResponse[IncomingMessage], info: Message): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("sendError")(req.asInstanceOf[js.Any], res.asInstanceOf[js.Any], info.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def text(req: IncomingMessage): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("text")(req.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def text(req: IncomingMessage, info: Encoding): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("text")(req.asInstanceOf[js.Any], info.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  type RequestHandler = js.Function2[/* req */ IncomingMessage, /* res */ ServerResponse[IncomingMessage], Any]
}
