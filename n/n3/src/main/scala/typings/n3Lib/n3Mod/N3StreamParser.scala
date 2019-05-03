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
  /* InferMemberOverrides */
  override def addListener(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def addListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def emit(event: java.lang.String, args: js.Any*): scala.Boolean = js.native
  /* InferMemberOverrides */
  override def emit(event: js.Symbol, args: js.Any*): scala.Boolean = js.native
  /* InferMemberOverrides */
  override def eventNames(): js.Array[java.lang.String | js.Symbol] = js.native
  /* InferMemberOverrides */
  override def getMaxListeners(): scala.Double = js.native
  def isPaused(): scala.Boolean = js.native
  /* InferMemberOverrides */
  override def listenerCount(`type`: java.lang.String): scala.Double = js.native
  /* InferMemberOverrides */
  override def listenerCount(`type`: js.Symbol): scala.Double = js.native
  /* InferMemberOverrides */
  override def listeners(event: java.lang.String): js.Array[js.Function] = js.native
  /* InferMemberOverrides */
  override def listeners(event: js.Symbol): js.Array[js.Function] = js.native
  /* InferMemberOverrides */
  override def off(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def off(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def on(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def on(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def once(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def once(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  def pause(): this.type = js.native
  def pipe(destination: nodeLib.NodeJSNs.WritableStream): nodeLib.NodeJSNs.WritableStream = js.native
  def pipe(destination: nodeLib.NodeJSNs.WritableStream, options: n3Lib.Anon_End): nodeLib.NodeJSNs.WritableStream = js.native
  def pipe(destination: rdfDashJsLib.rdfDashJsMod.Stream[Q]): rdfDashJsLib.rdfDashJsMod.Stream[Q] = js.native
  def pipe(destination: rdfDashJsLib.rdfDashJsMod.Stream[Q], options: n3Lib.Anon_End): rdfDashJsLib.rdfDashJsMod.Stream[Q] = js.native
  // Added in Node 6...
  /* InferMemberOverrides */
  override def prependListener(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def prependListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def prependOnceListener(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def prependOnceListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def rawListeners(event: java.lang.String): js.Array[js.Function] = js.native
  /* InferMemberOverrides */
  override def rawListeners(event: js.Symbol): js.Array[js.Function] = js.native
  /* InferMemberOverrides */
  override def removeAllListeners(): this.type = js.native
  /* InferMemberOverrides */
  override def removeAllListeners(event: java.lang.String): this.type = js.native
  /* InferMemberOverrides */
  override def removeAllListeners(event: js.Symbol): this.type = js.native
  /* InferMemberOverrides */
  override def removeListener(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def removeListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  def resume(): this.type = js.native
  def setEncoding(): scala.Unit = js.native
  // read(size?: number): string | Buffer; // Overwritten by RDF.Stream
  def setEncoding(encoding: java.lang.String): scala.Unit = js.native
  /* InferMemberOverrides */
  override def setMaxListeners(n: scala.Double): this.type = js.native
  def unpipe(): scala.Unit = js.native
  def unpipe(destination: nodeLib.NodeJSNs.WritableStream): scala.Unit = js.native
  def unpipe(destination: rdfDashJsLib.rdfDashJsMod.Stream[Q]): scala.Unit = js.native
  def unshift(chunk: java.lang.String): scala.Unit = js.native
  def unshift(chunk: nodeLib.Buffer): scala.Unit = js.native
  def wrap(oldStream: nodeLib.NodeJSNs.ReadableStream): nodeLib.NodeJSNs.ReadableStream = js.native
  def wrap(oldStream: rdfDashJsLib.rdfDashJsMod.Stream[Q]): nodeLib.NodeJSNs.ReadableStream = js.native
}

