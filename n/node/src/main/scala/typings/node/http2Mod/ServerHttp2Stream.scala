package typings.node.http2Mod

import typings.node.httpMod.OutgoingHttpHeaders
import typings.node.promisesMod.FileHandle
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServerHttp2Stream extends Http2Stream {
  
  def additionalHeaders(headers: OutgoingHttpHeaders): Unit = js.native
  
  val headersSent: Boolean = js.native
  
  val pushAllowed: Boolean = js.native
  
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
  def pushStream(
    headers: OutgoingHttpHeaders,
    options: js.UndefOr[scala.Nothing],
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
  def respond(headers: js.UndefOr[scala.Nothing], options: ServerStreamResponseOptions): Unit = js.native
  def respond(headers: OutgoingHttpHeaders): Unit = js.native
  def respond(headers: OutgoingHttpHeaders, options: ServerStreamResponseOptions): Unit = js.native
  
  def respondWithFD(fd: Double): Unit = js.native
  def respondWithFD(fd: Double, headers: js.UndefOr[scala.Nothing], options: ServerStreamFileResponseOptions): Unit = js.native
  def respondWithFD(fd: Double, headers: OutgoingHttpHeaders): Unit = js.native
  def respondWithFD(fd: Double, headers: OutgoingHttpHeaders, options: ServerStreamFileResponseOptions): Unit = js.native
  def respondWithFD(fd: FileHandle): Unit = js.native
  def respondWithFD(fd: FileHandle, headers: js.UndefOr[scala.Nothing], options: ServerStreamFileResponseOptions): Unit = js.native
  def respondWithFD(fd: FileHandle, headers: OutgoingHttpHeaders): Unit = js.native
  def respondWithFD(fd: FileHandle, headers: OutgoingHttpHeaders, options: ServerStreamFileResponseOptions): Unit = js.native
  
  def respondWithFile(path: String): Unit = js.native
  def respondWithFile(
    path: String,
    headers: js.UndefOr[scala.Nothing],
    options: ServerStreamFileResponseOptionsWithError
  ): Unit = js.native
  def respondWithFile(path: String, headers: OutgoingHttpHeaders): Unit = js.native
  def respondWithFile(path: String, headers: OutgoingHttpHeaders, options: ServerStreamFileResponseOptionsWithError): Unit = js.native
}
