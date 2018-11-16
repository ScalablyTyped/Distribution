package typings
package microLib.microMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("micro", JSImport.Namespace)
@js.native
object microModMembers extends js.Object {
  def buffer(req: nodeLib.httpMod.IncomingMessage): stdLib.Promise[nodeLib.Buffer | java.lang.String] = js.native
  def buffer(req: nodeLib.httpMod.IncomingMessage, info: microLib.Anon_Limit): stdLib.Promise[nodeLib.Buffer | java.lang.String] = js.native
  def createError(code: scala.Double, msg: java.lang.String): nodeLib.Error with microLib.Anon_OriginalError = js.native
  def createError(code: scala.Double, msg: java.lang.String, orig: nodeLib.Error): nodeLib.Error with microLib.Anon_OriginalError = js.native
  def default(fn: RequestHandler): nodeLib.httpMod.Server = js.native
  def json(req: nodeLib.httpMod.IncomingMessage): stdLib.Promise[js.Object] = js.native
  def json(req: nodeLib.httpMod.IncomingMessage, info: microLib.Anon_Limit): stdLib.Promise[js.Object] = js.native
  def run(req: nodeLib.httpMod.IncomingMessage, res: nodeLib.httpMod.ServerResponse, fn: RequestHandler): stdLib.Promise[scala.Unit] = js.native
  def send(res: nodeLib.httpMod.ServerResponse, code: scala.Double): stdLib.Promise[scala.Unit] = js.native
  def send(res: nodeLib.httpMod.ServerResponse, code: scala.Double, data: js.Any): stdLib.Promise[scala.Unit] = js.native
  def sendError(
    req: nodeLib.httpMod.IncomingMessage,
    res: nodeLib.httpMod.ServerResponse,
    info: microLib.Anon_Stack
  ): stdLib.Promise[scala.Unit] = js.native
  def text(req: nodeLib.httpMod.IncomingMessage): stdLib.Promise[java.lang.String] = js.native
  def text(req: nodeLib.httpMod.IncomingMessage, info: microLib.Anon_Limit): stdLib.Promise[java.lang.String] = js.native
}

