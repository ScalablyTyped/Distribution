package typings.n3.n3Mod

import typings.n3.Anon_End
import typings.node.Buffer
import typings.node.NodeJS.ReadableStream
import typings.node.NodeJS.WritableStream
import typings.node.eventsMod.EventEmitter
import typings.rdfDashJs.rdfDashJsMod.Sink
import typings.rdfDashJs.rdfDashJsMod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait N3StreamParser[Q /* <: BaseQuad */]
  extends Stream[Q]
     with WritableStream
     with Sink[EventEmitter, Stream[Q]] {
  // Below are the NodeJS.ReadableStream methods,
  // we can not extend the interface directly,
  // as `read` clashes with RDF.Sink.
  var readable: Boolean = js.native
  def isPaused(): Boolean = js.native
  def pause(): this.type = js.native
  def pipe(destination: WritableStream): WritableStream = js.native
  def pipe(destination: WritableStream, options: Anon_End): WritableStream = js.native
  def pipe(destination: Stream[Q]): Stream[Q] = js.native
  def pipe(destination: Stream[Q], options: Anon_End): Stream[Q] = js.native
  def resume(): this.type = js.native
  def setEncoding(): Unit = js.native
  // read(size?: number): string | Buffer; // Overwritten by RDF.Stream
  def setEncoding(encoding: String): Unit = js.native
  def unpipe(): Unit = js.native
  def unpipe(destination: WritableStream): Unit = js.native
  def unpipe(destination: Stream[Q]): Unit = js.native
  def unshift(chunk: String): Unit = js.native
  def unshift(chunk: Buffer): Unit = js.native
  def wrap(oldStream: ReadableStream): ReadableStream = js.native
  def wrap(oldStream: Stream[Q]): ReadableStream = js.native
}

