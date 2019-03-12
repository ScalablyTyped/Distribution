package typings
package pgDashCopyDashStreamsLib.pgDashCopyDashStreamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pg-copy-streams", "CopyToStreamQuery")
@js.native
class CopyToStreamQuery ()
  extends nodeLib.streamMod.Transform
     with pgLib.pgMod.Submittable {
  /* InferMemberOverrides */
  /* InferMemberOverrides */
  override def _destroy(
    error: nodeLib.Error,
    callback: js.Function1[/* error */ js.UndefOr[nodeLib.Error | scala.Null], scala.Unit]
  ): scala.Unit = js.native
  /* InferMemberOverrides */
  /* InferMemberOverrides */
  override def _destroy(
    error: scala.Null,
    callback: js.Function1[/* error */ js.UndefOr[nodeLib.Error | scala.Null], scala.Unit]
  ): scala.Unit = js.native
  /**
    * Event emitter
    * The defined events on documents including:
    * 1. close
    * 2. drain
    * 3. error
    * 4. finish
    * 5. pipe
    * 6. unpipe
    */
  /* InferMemberOverrides */
  /* InferMemberOverrides */
  @JSName("addListener")
  override def addListener_close(event: nodeLib.nodeLibStrings.close, listener: js.Function0[scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  /* InferMemberOverrides */
  @JSName("addListener")
  override def addListener_error(event: nodeLib.nodeLibStrings.error, listener: js.Function1[/* err */ nodeLib.Error, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  /* InferMemberOverrides */
  override def destroy(): scala.Unit = js.native
  /* InferMemberOverrides */
  /* InferMemberOverrides */
  override def destroy(error: nodeLib.Error): scala.Unit = js.native
  /* InferMemberOverrides */
  /* InferMemberOverrides */
  @JSName("emit")
  override def emit_close(event: nodeLib.nodeLibStrings.close): scala.Boolean = js.native
  /* InferMemberOverrides */
  /* InferMemberOverrides */
  @JSName("emit")
  override def emit_error(event: nodeLib.nodeLibStrings.error, err: nodeLib.Error): scala.Boolean = js.native
  /* InferMemberOverrides */
  /* InferMemberOverrides */
  @JSName("on")
  override def on_close(event: nodeLib.nodeLibStrings.close, listener: js.Function0[scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  /* InferMemberOverrides */
  @JSName("on")
  override def on_error(event: nodeLib.nodeLibStrings.error, listener: js.Function1[/* err */ nodeLib.Error, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  /* InferMemberOverrides */
  @JSName("once")
  override def once_close(event: nodeLib.nodeLibStrings.close, listener: js.Function0[scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  /* InferMemberOverrides */
  @JSName("once")
  override def once_error(event: nodeLib.nodeLibStrings.error, listener: js.Function1[/* err */ nodeLib.Error, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  /* InferMemberOverrides */
  override def pipe[T /* <: nodeLib.NodeJSNs.WritableStream */](destination: T): T = js.native
  /* InferMemberOverrides */
  /* InferMemberOverrides */
  override def pipe[T /* <: nodeLib.NodeJSNs.WritableStream */](destination: T, options: nodeLib.Anon_End): T = js.native
  /* InferMemberOverrides */
  /* InferMemberOverrides */
  @JSName("prependListener")
  override def prependListener_close(event: nodeLib.nodeLibStrings.close, listener: js.Function0[scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  /* InferMemberOverrides */
  @JSName("prependListener")
  override def prependListener_error(event: nodeLib.nodeLibStrings.error, listener: js.Function1[/* err */ nodeLib.Error, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  /* InferMemberOverrides */
  @JSName("prependOnceListener")
  override def prependOnceListener_close(event: nodeLib.nodeLibStrings.close, listener: js.Function0[scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  /* InferMemberOverrides */
  @JSName("prependOnceListener")
  override def prependOnceListener_error(event: nodeLib.nodeLibStrings.error, listener: js.Function1[/* err */ nodeLib.Error, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  /* InferMemberOverrides */
  @JSName("removeListener")
  override def removeListener_close(event: nodeLib.nodeLibStrings.close, listener: js.Function0[scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  /* InferMemberOverrides */
  @JSName("removeListener")
  override def removeListener_error(event: nodeLib.nodeLibStrings.error, listener: js.Function1[/* err */ nodeLib.Error, scala.Unit]): this.type = js.native
  /* CompleteClass */
  override def submit(connection: pgLib.pgMod.Connection): scala.Unit = js.native
}

