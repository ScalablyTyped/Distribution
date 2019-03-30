package typings
package nodeLib.http2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("http2", "ServerHttp2Stream")
@js.native
class ServerHttp2Stream protected () extends Http2Stream {
  val headersSent: scala.Boolean = js.native
  val pushAllowed: scala.Boolean = js.native
  def additionalHeaders(headers: nodeLib.httpMod.OutgoingHttpHeaders): scala.Unit = js.native
  def pushStream(headers: nodeLib.httpMod.OutgoingHttpHeaders): scala.Unit = js.native
  def pushStream(
    headers: nodeLib.httpMod.OutgoingHttpHeaders,
    callback: js.Function3[
      /* err */ nodeLib.Error | scala.Null, 
      /* pushStream */ this.type, 
      /* headers */ nodeLib.httpMod.OutgoingHttpHeaders, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def pushStream(headers: nodeLib.httpMod.OutgoingHttpHeaders, options: StreamPriorityOptions): scala.Unit = js.native
  def pushStream(
    headers: nodeLib.httpMod.OutgoingHttpHeaders,
    options: StreamPriorityOptions,
    callback: js.Function3[
      /* err */ nodeLib.Error | scala.Null, 
      /* pushStream */ this.type, 
      /* headers */ nodeLib.httpMod.OutgoingHttpHeaders, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def respond(): scala.Unit = js.native
  def respond(headers: nodeLib.httpMod.OutgoingHttpHeaders): scala.Unit = js.native
  def respond(headers: nodeLib.httpMod.OutgoingHttpHeaders, options: ServerStreamResponseOptions): scala.Unit = js.native
  def respondWithFD(fd: scala.Double): scala.Unit = js.native
  def respondWithFD(fd: scala.Double, headers: nodeLib.httpMod.OutgoingHttpHeaders): scala.Unit = js.native
  def respondWithFD(
    fd: scala.Double,
    headers: nodeLib.httpMod.OutgoingHttpHeaders,
    options: ServerStreamFileResponseOptions
  ): scala.Unit = js.native
  def respondWithFile(path: java.lang.String): scala.Unit = js.native
  def respondWithFile(path: java.lang.String, headers: nodeLib.httpMod.OutgoingHttpHeaders): scala.Unit = js.native
  def respondWithFile(
    path: java.lang.String,
    headers: nodeLib.httpMod.OutgoingHttpHeaders,
    options: ServerStreamFileResponseOptionsWithError
  ): scala.Unit = js.native
}

