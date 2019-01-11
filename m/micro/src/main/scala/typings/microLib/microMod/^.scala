package typings
package microLib.microMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("micro", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def buffer(req: nodeLib.httpMod.IncomingMessage): js.Promise[nodeLib.Buffer | java.lang.String] = js.native
  def buffer(req: nodeLib.httpMod.IncomingMessage, info: microLib.Anon_Encoding): js.Promise[nodeLib.Buffer | java.lang.String] = js.native
  def createError(code: scala.Double, msg: java.lang.String): nodeLib.Error with microLib.Anon_OriginalError = js.native
  def createError(code: scala.Double, msg: java.lang.String, orig: nodeLib.Error): nodeLib.Error with microLib.Anon_OriginalError = js.native
  def default(fn: microLib.microMod.RequestHandler): nodeLib.httpMod.Server = js.native
  def json(req: nodeLib.httpMod.IncomingMessage): js.Promise[js.Object] = js.native
  def json(req: nodeLib.httpMod.IncomingMessage, info: microLib.Anon_Encoding): js.Promise[js.Object] = js.native
  def run(
    req: nodeLib.httpMod.IncomingMessage,
    res: nodeLib.httpMod.ServerResponse,
    fn: microLib.microMod.RequestHandler
  ): js.Promise[scala.Unit] = js.native
  def send(res: nodeLib.httpMod.ServerResponse, code: scala.Double): js.Promise[scala.Unit] = js.native
  def send(res: nodeLib.httpMod.ServerResponse, code: scala.Double, data: js.Any): js.Promise[scala.Unit] = js.native
  def sendError(
    req: nodeLib.httpMod.IncomingMessage,
    res: nodeLib.httpMod.ServerResponse,
    info: microLib.Anon_Message
  ): js.Promise[scala.Unit] = js.native
  def text(req: nodeLib.httpMod.IncomingMessage): js.Promise[java.lang.String] = js.native
  def text(req: nodeLib.httpMod.IncomingMessage, info: microLib.Anon_Encoding): js.Promise[java.lang.String] = js.native
}

