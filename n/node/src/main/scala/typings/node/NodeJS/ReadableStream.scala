package typings.node.NodeJS

import typings.node.Anon_End
import typings.node.Buffer
import typings.node.BufferEncoding
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReadableStream extends EventEmitter {
  var readable: Boolean = js.native
  def isPaused(): Boolean = js.native
  def pause(): this.type = js.native
  def pipe[T /* <: WritableStream */](destination: T): T = js.native
  def pipe[T /* <: WritableStream */](destination: T, options: Anon_End): T = js.native
  def read(): java.lang.String | Buffer = js.native
  def read(size: Double): java.lang.String | Buffer = js.native
  def resume(): this.type = js.native
  def setEncoding(encoding: java.lang.String): this.type = js.native
  def unpipe(): this.type = js.native
  def unpipe(destination: WritableStream): this.type = js.native
  def unshift(chunk: java.lang.String): Unit = js.native
  def unshift(chunk: java.lang.String, encoding: BufferEncoding): Unit = js.native
  def unshift(chunk: Uint8Array): Unit = js.native
  def unshift(chunk: Uint8Array, encoding: BufferEncoding): Unit = js.native
  def wrap(oldStream: ReadableStream): this.type = js.native
}

