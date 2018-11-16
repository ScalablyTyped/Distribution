package typings
package nodeDashStaticLib.nodeDashStaticMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-static", "Server")
@js.native
class Server protected () extends js.Object {
  def this(root: java.lang.String) = this()
  def this(root: java.lang.String, options: Options) = this()
  var cache: scala.Double | scala.Boolean = js.native
  var defaultHeaders: Headers = js.native
  var options: Options = js.native
  var root: java.lang.String = js.native
  var serverInfo: java.lang.String = js.native
  def finish(
    status: scala.Double,
    headers: Headers,
    req: nodeLib.httpMod.IncomingMessage,
    res: nodeLib.httpMod.ServerResponse,
    promise: nodeLib.eventsMod.EventEmitter,
    callback: Callback
  ): scala.Unit = js.native
  def gzipOk(req: nodeLib.httpMod.IncomingMessage, contentType: java.lang.String): scala.Boolean = js.native
  def parseByteRange(req: nodeLib.httpMod.IncomingMessage, stat: nodeLib.fsMod.Stats): ByteRange = js.native
  def resolve(pathname: java.lang.String): java.lang.String = js.native
  def respond(
    pathname: java.lang.String,
    status: scala.Double,
    _headers: Headers,
    files: js.Array[java.lang.String],
    stat: nodeLib.fsMod.Stats,
    req: nodeLib.httpMod.IncomingMessage,
    res: nodeLib.httpMod.ServerResponse,
    finish: Finish
  ): scala.Unit = js.native
  def respondGzip(
    pathname: java.lang.String,
    status: scala.Double,
    contentType: java.lang.String,
    _headers: Headers,
    files: js.Array[java.lang.String],
    stat: nodeLib.fsMod.Stats,
    req: nodeLib.httpMod.IncomingMessage,
    res: nodeLib.httpMod.ServerResponse,
    finish: Finish
  ): scala.Unit = js.native
  // tslint:disable-next-line max-line-length
  def respondNoGzip(
    pathname: java.lang.String,
    status: scala.Double,
    contentType: java.lang.String,
    _headers: Headers,
    files: js.Array[java.lang.String],
    stat: nodeLib.fsMod.Stats,
    req: nodeLib.httpMod.IncomingMessage,
    res: nodeLib.httpMod.ServerResponse,
    finish: Finish
  ): scala.Unit = js.native
  def serve(req: nodeLib.httpMod.IncomingMessage, res: nodeLib.httpMod.ServerResponse): nodeLib.eventsMod.EventEmitter = js.native
  def serve(req: nodeLib.httpMod.IncomingMessage, res: nodeLib.httpMod.ServerResponse, callback: Callback): nodeLib.eventsMod.EventEmitter = js.native
  def serveDir(
    pathname: java.lang.String,
    req: nodeLib.httpMod.IncomingMessage,
    res: nodeLib.httpMod.ServerResponse,
    finish: Finish
  ): scala.Unit = js.native
  def serveFile(
    pathname: java.lang.String,
    status: scala.Double,
    headers: Headers,
    req: nodeLib.httpMod.IncomingMessage,
    res: nodeLib.httpMod.ServerResponse
  ): nodeLib.eventsMod.EventEmitter = js.native
  def servePath(
    pathname: java.lang.String,
    status: scala.Double,
    headers: Headers,
    req: nodeLib.httpMod.IncomingMessage,
    res: nodeLib.httpMod.ServerResponse,
    finish: Finish
  ): nodeLib.eventsMod.EventEmitter = js.native
  def stream(
    pathname: java.lang.String,
    files: js.Array[java.lang.String],
    length: scala.Double,
    startByte: scala.Double,
    res: nodeLib.httpMod.ServerResponse,
    callback: Callback
  ): scala.Unit = js.native
}

