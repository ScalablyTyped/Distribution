package typings.node

import typings.node.NodeJS.Timer
import typings.node.domainMod.Domain
import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("domain", JSImport.Namespace)
@js.native
object domainMod extends js.Object {
  @js.native
  class Domain ()
    extends EventEmitter
       with typings.node.NodeJS.Domain {
    var members: js.Array[EventEmitter | Timer] = js.native
    def add(emitter: EventEmitter): Unit = js.native
    /* InferMemberOverrides */
    override def addListener(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    /* InferMemberOverrides */
    override def addListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    /* InferMemberOverrides */
    override def emit(event: java.lang.String, args: js.Any*): Boolean = js.native
    /* InferMemberOverrides */
    override def emit(event: js.Symbol, args: js.Any*): Boolean = js.native
    def enter(): Unit = js.native
    /* InferMemberOverrides */
    override def eventNames(): js.Array[java.lang.String | js.Symbol] = js.native
    def exit(): Unit = js.native
    /* InferMemberOverrides */
    override def getMaxListeners(): Double = js.native
    /* InferMemberOverrides */
    override def listenerCount(`type`: java.lang.String): Double = js.native
    /* InferMemberOverrides */
    override def listenerCount(`type`: js.Symbol): Double = js.native
    /* InferMemberOverrides */
    override def listeners(event: java.lang.String): js.Array[js.Function] = js.native
    /* InferMemberOverrides */
    override def listeners(event: js.Symbol): js.Array[js.Function] = js.native
    /* InferMemberOverrides */
    override def off(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    /* InferMemberOverrides */
    override def off(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    /* InferMemberOverrides */
    override def on(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    /* InferMemberOverrides */
    override def on(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    /* InferMemberOverrides */
    override def once(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    /* InferMemberOverrides */
    override def once(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    // Added in Node 6...
    /* InferMemberOverrides */
    override def prependListener(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    /* InferMemberOverrides */
    override def prependListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    /* InferMemberOverrides */
    override def prependOnceListener(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    /* InferMemberOverrides */
    override def prependOnceListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    /* InferMemberOverrides */
    override def rawListeners(event: java.lang.String): js.Array[js.Function] = js.native
    /* InferMemberOverrides */
    override def rawListeners(event: js.Symbol): js.Array[js.Function] = js.native
    def remove(emitter: EventEmitter): Unit = js.native
    /* InferMemberOverrides */
    override def removeAllListeners(): this.type = js.native
    /* InferMemberOverrides */
    override def removeAllListeners(event: java.lang.String): this.type = js.native
    /* InferMemberOverrides */
    override def removeAllListeners(event: js.Symbol): this.type = js.native
    /* InferMemberOverrides */
    override def removeListener(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    /* InferMemberOverrides */
    override def removeListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    /* InferMemberOverrides */
    override def setMaxListeners(n: Double): this.type = js.native
  }
  
  def create(): Domain = js.native
}

