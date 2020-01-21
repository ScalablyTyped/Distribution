package typings.nodeStatic.mod

import typings.node.eventsMod.EventEmitter
import typings.node.fsMod.Stats
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-static", "Server")
@js.native
class Server protected () extends js.Object {
  def this(root: String) = this()
  def this(root: String, options: Options) = this()
  var cache: Double | Boolean = js.native
  var defaultHeaders: Headers = js.native
  var options: Options = js.native
  var root: String = js.native
  var serverInfo: String = js.native
  def finish(
    status: Double,
    headers: Headers,
    req: IncomingMessage,
    res: ServerResponse,
    promise: EventEmitter,
    callback: Callback
  ): Unit = js.native
  def gzipOk(req: IncomingMessage, contentType: String): Boolean = js.native
  def parseByteRange(req: IncomingMessage, stat: Stats): ByteRange = js.native
  def resolve(pathname: String): String = js.native
  def respond(
    pathname: String,
    status: Double,
    _headers: Headers,
    files: js.Array[String],
    stat: Stats,
    req: IncomingMessage,
    res: ServerResponse,
    finish: Finish
  ): Unit = js.native
  def respondGzip(
    pathname: String,
    status: Double,
    contentType: String,
    _headers: Headers,
    files: js.Array[String],
    stat: Stats,
    req: IncomingMessage,
    res: ServerResponse,
    finish: Finish
  ): Unit = js.native
  // tslint:disable-next-line max-line-length
  def respondNoGzip(
    pathname: String,
    status: Double,
    contentType: String,
    _headers: Headers,
    files: js.Array[String],
    stat: Stats,
    req: IncomingMessage,
    res: ServerResponse,
    finish: Finish
  ): Unit = js.native
  def serve(req: IncomingMessage, res: ServerResponse): EventEmitter = js.native
  def serve(req: IncomingMessage, res: ServerResponse, callback: Callback): EventEmitter = js.native
  def serveDir(pathname: String, req: IncomingMessage, res: ServerResponse, finish: Finish): Unit = js.native
  def serveFile(pathname: String, status: Double, headers: Headers, req: IncomingMessage, res: ServerResponse): EventEmitter = js.native
  def servePath(
    pathname: String,
    status: Double,
    headers: Headers,
    req: IncomingMessage,
    res: ServerResponse,
    finish: Finish
  ): EventEmitter = js.native
  def stream(
    pathname: String,
    files: js.Array[String],
    length: Double,
    startByte: Double,
    res: ServerResponse,
    callback: Callback
  ): Unit = js.native
}

