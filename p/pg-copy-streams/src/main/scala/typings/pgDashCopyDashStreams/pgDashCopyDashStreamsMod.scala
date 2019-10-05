package typings.pgDashCopyDashStreams

import typings.node.Anon_End
import typings.node.NodeJS.WritableStream
import typings.node.streamMod.Transform
import typings.node.streamMod.TransformOptions
import typings.pg.pgMod.Connection
import typings.pg.pgMod.Submittable
import typings.pgDashCopyDashStreams.pgDashCopyDashStreamsMod.CopyStreamQuery
import typings.pgDashCopyDashStreams.pgDashCopyDashStreamsMod.CopyToStreamQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pg-copy-streams", JSImport.Namespace)
@js.native
object pgDashCopyDashStreamsMod extends js.Object {
  @js.native
  class CopyStreamQuery ()
    extends Transform
       with Submittable {
    /* InferMemberOverrides */
    override def addListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    /* InferMemberOverrides */
    override def addListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    /* InferMemberOverrides */
    override def emit(event: String, args: js.Any*): Boolean = js.native
    /* InferMemberOverrides */
    override def emit(event: js.Symbol, args: js.Any*): Boolean = js.native
    /* InferMemberOverrides */
    override def eventNames(): js.Array[String | js.Symbol] = js.native
    /* InferMemberOverrides */
    override def getMaxListeners(): Double = js.native
    /* InferMemberOverrides */
    override def listenerCount(`type`: String): Double = js.native
    /* InferMemberOverrides */
    override def listenerCount(`type`: js.Symbol): Double = js.native
    /* InferMemberOverrides */
    override def listeners(event: String): js.Array[js.Function] = js.native
    /* InferMemberOverrides */
    override def listeners(event: js.Symbol): js.Array[js.Function] = js.native
    /* InferMemberOverrides */
    override def off(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    /* InferMemberOverrides */
    override def off(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    /* InferMemberOverrides */
    override def on(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    /* InferMemberOverrides */
    override def on(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    /* InferMemberOverrides */
    override def once(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    /* InferMemberOverrides */
    override def once(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def pipe[T /* <: WritableStream */](destination: T): T = js.native
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def pipe[T /* <: WritableStream */](destination: T, options: Anon_End): T = js.native
    // Added in Node 6...
    /* InferMemberOverrides */
    override def prependListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    /* InferMemberOverrides */
    override def prependListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    /* InferMemberOverrides */
    override def prependOnceListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    /* InferMemberOverrides */
    override def prependOnceListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    /* InferMemberOverrides */
    override def rawListeners(event: String): js.Array[js.Function] = js.native
    /* InferMemberOverrides */
    override def rawListeners(event: js.Symbol): js.Array[js.Function] = js.native
    /* InferMemberOverrides */
    override def removeAllListeners(): this.type = js.native
    /* InferMemberOverrides */
    override def removeAllListeners(event: String): this.type = js.native
    /* InferMemberOverrides */
    override def removeAllListeners(event: js.Symbol): this.type = js.native
    /* InferMemberOverrides */
    override def removeListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    /* InferMemberOverrides */
    override def removeListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    /* InferMemberOverrides */
    override def setMaxListeners(n: Double): this.type = js.native
    /* CompleteClass */
    override def submit(connection: Connection): Unit = js.native
  }
  
  @js.native
  class CopyToStreamQuery ()
    extends Transform
       with Submittable {
    /* InferMemberOverrides */
    override def addListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    /* InferMemberOverrides */
    override def addListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    /* InferMemberOverrides */
    override def emit(event: String, args: js.Any*): Boolean = js.native
    /* InferMemberOverrides */
    override def emit(event: js.Symbol, args: js.Any*): Boolean = js.native
    /* InferMemberOverrides */
    override def eventNames(): js.Array[String | js.Symbol] = js.native
    /* InferMemberOverrides */
    override def getMaxListeners(): Double = js.native
    /* InferMemberOverrides */
    override def listenerCount(`type`: String): Double = js.native
    /* InferMemberOverrides */
    override def listenerCount(`type`: js.Symbol): Double = js.native
    /* InferMemberOverrides */
    override def listeners(event: String): js.Array[js.Function] = js.native
    /* InferMemberOverrides */
    override def listeners(event: js.Symbol): js.Array[js.Function] = js.native
    /* InferMemberOverrides */
    override def off(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    /* InferMemberOverrides */
    override def off(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    /* InferMemberOverrides */
    override def on(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    /* InferMemberOverrides */
    override def on(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    /* InferMemberOverrides */
    override def once(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    /* InferMemberOverrides */
    override def once(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def pipe[T /* <: WritableStream */](destination: T): T = js.native
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def pipe[T /* <: WritableStream */](destination: T, options: Anon_End): T = js.native
    // Added in Node 6...
    /* InferMemberOverrides */
    override def prependListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    /* InferMemberOverrides */
    override def prependListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    /* InferMemberOverrides */
    override def prependOnceListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    /* InferMemberOverrides */
    override def prependOnceListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    /* InferMemberOverrides */
    override def rawListeners(event: String): js.Array[js.Function] = js.native
    /* InferMemberOverrides */
    override def rawListeners(event: js.Symbol): js.Array[js.Function] = js.native
    /* InferMemberOverrides */
    override def removeAllListeners(): this.type = js.native
    /* InferMemberOverrides */
    override def removeAllListeners(event: String): this.type = js.native
    /* InferMemberOverrides */
    override def removeAllListeners(event: js.Symbol): this.type = js.native
    /* InferMemberOverrides */
    override def removeListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    /* InferMemberOverrides */
    override def removeListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    /* InferMemberOverrides */
    override def setMaxListeners(n: Double): this.type = js.native
    /* CompleteClass */
    override def submit(connection: Connection): Unit = js.native
  }
  
  def from(txt: String): CopyStreamQuery = js.native
  def from(txt: String, options: TransformOptions): CopyStreamQuery = js.native
  def to(txt: String): CopyToStreamQuery = js.native
  def to(txt: String, options: TransformOptions): CopyToStreamQuery = js.native
}

