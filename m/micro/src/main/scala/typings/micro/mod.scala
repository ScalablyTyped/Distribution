package typings.micro

import typings.micro.anon.Encoding
import typings.micro.anon.ErrorstatusCodenumberorig
import typings.micro.anon.Message
import typings.node.Buffer
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.Server
import typings.node.httpMod.ServerResponse
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("micro", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(fn: RequestHandler): Server = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(fn.asInstanceOf[js.Any]).asInstanceOf[Server]
  
  @scala.inline
  def buffer(req: IncomingMessage): js.Promise[Buffer | String] = ^.asInstanceOf[js.Dynamic].applyDynamic("buffer")(req.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Buffer | String]]
  @scala.inline
  def buffer(req: IncomingMessage, info: Encoding): js.Promise[Buffer | String] = (^.asInstanceOf[js.Dynamic].applyDynamic("buffer")(req.asInstanceOf[js.Any], info.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer | String]]
  
  @scala.inline
  def createError(code: Double, msg: String): ErrorstatusCodenumberorig = (^.asInstanceOf[js.Dynamic].applyDynamic("createError")(code.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[ErrorstatusCodenumberorig]
  @scala.inline
  def createError(code: Double, msg: String, orig: Error): ErrorstatusCodenumberorig = (^.asInstanceOf[js.Dynamic].applyDynamic("createError")(code.asInstanceOf[js.Any], msg.asInstanceOf[js.Any], orig.asInstanceOf[js.Any])).asInstanceOf[ErrorstatusCodenumberorig]
  
  @scala.inline
  def json(req: IncomingMessage): js.Promise[js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("json")(req.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Object]]
  @scala.inline
  def json(req: IncomingMessage, info: Encoding): js.Promise[js.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("json")(req.asInstanceOf[js.Any], info.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Object]]
  
  @scala.inline
  def run(req: IncomingMessage, res: ServerResponse, fn: RequestHandler): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("run")(req.asInstanceOf[js.Any], res.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  @scala.inline
  def send(res: ServerResponse, code: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("send")(res.asInstanceOf[js.Any], code.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def send(res: ServerResponse, code: Double, data: js.Any): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("send")(res.asInstanceOf[js.Any], code.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  @scala.inline
  def sendError(req: IncomingMessage, res: ServerResponse, info: Message): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("sendError")(req.asInstanceOf[js.Any], res.asInstanceOf[js.Any], info.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  @scala.inline
  def text(req: IncomingMessage): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("text")(req.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  @scala.inline
  def text(req: IncomingMessage, info: Encoding): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("text")(req.asInstanceOf[js.Any], info.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  type RequestHandler = js.Function2[/* req */ IncomingMessage, /* res */ ServerResponse, js.Any]
}
