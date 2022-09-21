package typings.node.streamWebMod

import typings.node.anon.PreventCancel
import typings.std.AsyncIterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This Streams API interface represents a readable stream of byte data. */
@js.native
trait ReadableStream[R] extends StObject {
  
  def cancel(): js.Promise[Unit] = js.native
  def cancel(reason: Any): js.Promise[Unit] = js.native
  
  def getReader(): ReadableStreamDefaultReader[R] = js.native
  
  val locked: Boolean = js.native
  
  def pipeThrough[T](transform: ReadableWritablePair[T, R]): ReadableStream[T] = js.native
  def pipeThrough[T](transform: ReadableWritablePair[T, R], options: StreamPipeOptions): ReadableStream[T] = js.native
  
  def pipeTo(destination: WritableStream[R]): js.Promise[Unit] = js.native
  def pipeTo(destination: WritableStream[R], options: StreamPipeOptions): js.Promise[Unit] = js.native
  
  def tee(): js.Tuple2[ReadableStream[R], ReadableStream[R]] = js.native
  
  def values(): AsyncIterableIterator[R] = js.native
  def values(options: PreventCancel): AsyncIterableIterator[R] = js.native
}
