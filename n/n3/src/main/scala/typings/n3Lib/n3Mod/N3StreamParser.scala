package typings
package n3Lib.n3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait N3StreamParser[Q /* <: BaseQuad */]
  extends rdfDashJsLib.rdfDashJsMod.Stream[Q]
     with nodeLib.NodeJSNs.WritableStream
     with rdfDashJsLib.rdfDashJsMod.Sink[Q] {
  // Below are the NodeJS.ReadableStream methods,
  // we can not extend the interface directly,
  // as `read` clashes with RDF.Sink.
  var readable: scala.Boolean = js.native
  def isPaused(): scala.Boolean = js.native
  def pause(): this.type = js.native
  def pipe[T /* <: nodeLib.NodeJSNs.WritableStream | rdfDashJsLib.rdfDashJsMod.Stream[Q] */](destination: T): T = js.native
  def pipe[T /* <: nodeLib.NodeJSNs.WritableStream | rdfDashJsLib.rdfDashJsMod.Stream[Q] */](destination: T, options: n3Lib.Anon_End): T = js.native
  def resume(): this.type = js.native
  // read(size?: number): string | Buffer; // Overwritten by RDF.Stream
  def setEncoding(): scala.Unit = js.native
  // read(size?: number): string | Buffer; // Overwritten by RDF.Stream
  def setEncoding(encoding: java.lang.String): scala.Unit = js.native
  def unpipe(): scala.Unit = js.native
  def unpipe(destination: nodeLib.NodeJSNs.WritableStream): scala.Unit = js.native
  def unpipe(destination: rdfDashJsLib.rdfDashJsMod.Stream[Q]): scala.Unit = js.native
  def unshift(chunk: java.lang.String): scala.Unit = js.native
  def unshift(chunk: nodeLib.Buffer): scala.Unit = js.native
  def wrap(oldStream: nodeLib.NodeJSNs.ReadableStream): nodeLib.NodeJSNs.ReadableStream = js.native
  def wrap(oldStream: rdfDashJsLib.rdfDashJsMod.Stream[Q]): nodeLib.NodeJSNs.ReadableStream = js.native
}

