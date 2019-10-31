package typings.node.http2Mod

import typings.node.Error
import typings.node.fsMod.promises.FileHandle
import typings.node.httpMod.OutgoingHttpHeaders
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServerHttp2Stream extends Http2Stream {
  val headersSent: Boolean = js.native
  val pushAllowed: Boolean = js.native
  def additionalHeaders(headers: OutgoingHttpHeaders): Unit = js.native
  def pushStream(headers: OutgoingHttpHeaders): Unit = js.native
  def pushStream(
    headers: OutgoingHttpHeaders,
    callback: js.Function3[
      /* err */ Error | Null, 
      /* pushStream */ this.type, 
      /* headers */ OutgoingHttpHeaders, 
      Unit
    ]
  ): Unit = js.native
  def pushStream(headers: OutgoingHttpHeaders, options: StreamPriorityOptions): Unit = js.native
  def pushStream(
    headers: OutgoingHttpHeaders,
    options: StreamPriorityOptions,
    callback: js.Function3[
      /* err */ Error | Null, 
      /* pushStream */ this.type, 
      /* headers */ OutgoingHttpHeaders, 
      Unit
    ]
  ): Unit = js.native
  def respond(): Unit = js.native
  def respond(headers: OutgoingHttpHeaders): Unit = js.native
  def respond(headers: OutgoingHttpHeaders, options: ServerStreamResponseOptions): Unit = js.native
  def respondWithFD(fd: Double): Unit = js.native
  def respondWithFD(fd: Double, headers: OutgoingHttpHeaders): Unit = js.native
  def respondWithFD(fd: Double, headers: OutgoingHttpHeaders, options: ServerStreamFileResponseOptions): Unit = js.native
  def respondWithFD(fd: FileHandle): Unit = js.native
  def respondWithFD(fd: FileHandle, headers: OutgoingHttpHeaders): Unit = js.native
  def respondWithFD(fd: FileHandle, headers: OutgoingHttpHeaders, options: ServerStreamFileResponseOptions): Unit = js.native
  def respondWithFile(path: java.lang.String): Unit = js.native
  def respondWithFile(path: java.lang.String, headers: OutgoingHttpHeaders): Unit = js.native
  def respondWithFile(
    path: java.lang.String,
    headers: OutgoingHttpHeaders,
    options: ServerStreamFileResponseOptionsWithError
  ): Unit = js.native
}

