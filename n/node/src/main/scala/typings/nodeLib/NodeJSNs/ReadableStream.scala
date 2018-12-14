package typings
package nodeLib.NodeJSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReadableStream extends EventEmitter {
  @JSName(org.scalablytyped.runtime.Symbol.asyncIterator)
  var asyncIterator: js.Function0[nodeLib.AsyncIterableIterator[java.lang.String | nodeLib.Buffer]] = js.native
  var readable: scala.Boolean = js.native
  def isPaused(): scala.Boolean = js.native
  def pause(): this.type = js.native
  def pipe[T /* <: WritableStream */](destination: T): T = js.native
  def pipe[T /* <: WritableStream */](destination: T, options: nodeLib.Anon_End): T = js.native
  def read(): java.lang.String | nodeLib.Buffer = js.native
  def read(size: scala.Double): java.lang.String | nodeLib.Buffer = js.native
  def resume(): this.type = js.native
  def setEncoding(encoding: java.lang.String): this.type = js.native
  def unpipe(): this.type = js.native
  def unpipe(destination: WritableStream): this.type = js.native
  def unshift(chunk: java.lang.String): scala.Unit = js.native
  def unshift(chunk: nodeLib.Buffer): scala.Unit = js.native
  def wrap(oldStream: ReadableStream): this.type = js.native
}

