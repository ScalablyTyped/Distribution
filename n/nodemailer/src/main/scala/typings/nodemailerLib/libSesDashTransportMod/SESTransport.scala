package typings
package nodemailerLib.libSesDashTransportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SESTransport
  extends nodeLib.eventsMod.EventEmitter
     with nodemailerLib.nodemailerMod.Transport {
  var connections: scala.Double = js.native
  var idling: scala.Boolean = js.native
  var logger: nodemailerLib.libSharedMod.Logger = js.native
  @JSName("mailer")
  var mailer_SESTransport: nodemailerLib.libMailerMod.^ = js.native
  var maxConnections: scala.Double = js.native
  var options: Options = js.native
  var pending: js.Array[nodemailerLib.Anon_Callback] = js.native
  var rateInterval: scala.Double = js.native
  var rateMessages: js.Array[nodemailerLib.Anon_Pending] = js.native
  var sendingRate: scala.Double = js.native
  var sendingRateTTL: scala.Double | scala.Null = js.native
  var ses: js.Any = js.native
  /* InferMemberOverrides */
  override def addListener(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def addListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_idle(event: nodemailerLib.nodemailerLibStrings.idle, listener: js.Function0[scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def emit(event: java.lang.String, args: js.Any*): scala.Boolean = js.native
  /* InferMemberOverrides */
  override def emit(event: js.Symbol, args: js.Any*): scala.Boolean = js.native
  @JSName("emit")
  def emit_idle(event: nodemailerLib.nodemailerLibStrings.idle): scala.Boolean = js.native
  /* InferMemberOverrides */
  override def eventNames(): js.Array[java.lang.String | js.Symbol] = js.native
  /* InferMemberOverrides */
  override def getMaxListeners(): scala.Double = js.native
  /** Returns true if there are free slots in the queue */
  def isIdle(): scala.Boolean = js.native
  /* InferMemberOverrides */
  override def listenerCount(`type`: java.lang.String): scala.Double = js.native
  /* InferMemberOverrides */
  override def listenerCount(`type`: js.Symbol): scala.Double = js.native
  /* InferMemberOverrides */
  override def listeners(event: java.lang.String): js.Array[js.Function] = js.native
  /* InferMemberOverrides */
  override def listeners(event: js.Symbol): js.Array[js.Function] = js.native
  @JSName("listeners")
  def listeners_idle(event: nodemailerLib.nodemailerLibStrings.idle): js.Array[js.Function0[scala.Unit]] = js.native
  /* InferMemberOverrides */
  override def off(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def off(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def on(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def on(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  @JSName("on")
  def on_idle(event: nodemailerLib.nodemailerLibStrings.idle, listener: js.Function0[scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def once(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def once(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  @JSName("once")
  def once_idle(event: nodemailerLib.nodemailerLibStrings.idle, listener: js.Function0[scala.Unit]): this.type = js.native
  // Added in Node 6...
  /* InferMemberOverrides */
  override def prependListener(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def prependListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_idle(event: nodemailerLib.nodemailerLibStrings.idle, listener: js.Function0[scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def prependOnceListener(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def prependOnceListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_idle(event: nodemailerLib.nodemailerLibStrings.idle, listener: js.Function0[scala.Unit]): this.type = js.native
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
  /* InferMemberOverrides */
  override def setMaxListeners(n: scala.Double): this.type = js.native
  @JSName("verify")
  def verify_MSESTransport(): js.Promise[nodemailerLib.nodemailerLibNumbers.`true`] = js.native
  /** Verifies SES configuration */
  @JSName("verify")
  def verify_true(
    callback: js.Function2[
      /* err */ stdLib.Error | scala.Null, 
      nodemailerLib.nodemailerLibNumbers.`true`, 
      scala.Unit
    ]
  ): scala.Unit = js.native
}

