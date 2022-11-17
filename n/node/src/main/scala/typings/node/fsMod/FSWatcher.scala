package typings.node.fsMod

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FSWatcher extends StObject {
  
  @JSName("addListener")
  @scala.annotation.targetName("addListener_close")
  def addListener(event: "close", listener: js.Function0[Unit]): this.type = js.native
  @JSName("addListener")
  @scala.annotation.targetName("addListener_error")
  def addListener(event: "error", listener: js.Function1[/* error */ js.Error, Unit]): this.type = js.native
  @JSName("addListener")
  @scala.annotation.targetName("addListener_change")
  def addListener(
    event: "change",
    listener: js.Function2[/* eventType */ String, /* filename */ String | Buffer, Unit]
  ): this.type = js.native
  /**
    * events.EventEmitter
    *   1. change
    *   2. error
    */
  def addListener(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  
  /**
    * Stop watching for changes on the given `fs.FSWatcher`. Once stopped, the `fs.FSWatcher` object is no longer usable.
    * @since v0.5.8
    */
  def close(): Unit = js.native
  
  @JSName("on")
  @scala.annotation.targetName("on_close")
  def on(event: "close", listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  @scala.annotation.targetName("on_error")
  def on(event: "error", listener: js.Function1[/* error */ js.Error, Unit]): this.type = js.native
  @JSName("on")
  @scala.annotation.targetName("on_change")
  def on(
    event: "change",
    listener: js.Function2[/* eventType */ String, /* filename */ String | Buffer, Unit]
  ): this.type = js.native
  def on(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  
  @JSName("once")
  @scala.annotation.targetName("once_close")
  def once(event: "close", listener: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_error")
  def once(event: "error", listener: js.Function1[/* error */ js.Error, Unit]): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_change")
  def once(
    event: "change",
    listener: js.Function2[/* eventType */ String, /* filename */ String | Buffer, Unit]
  ): this.type = js.native
  def once(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  
  @JSName("prependListener")
  @scala.annotation.targetName("prependListener_close")
  def prependListener(event: "close", listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependListener")
  @scala.annotation.targetName("prependListener_error")
  def prependListener(event: "error", listener: js.Function1[/* error */ js.Error, Unit]): this.type = js.native
  @JSName("prependListener")
  @scala.annotation.targetName("prependListener_change")
  def prependListener(
    event: "change",
    listener: js.Function2[/* eventType */ String, /* filename */ String | Buffer, Unit]
  ): this.type = js.native
  def prependListener(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  
  @JSName("prependOnceListener")
  @scala.annotation.targetName("prependOnceListener_close")
  def prependOnceListener(event: "close", listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependOnceListener")
  @scala.annotation.targetName("prependOnceListener_error")
  def prependOnceListener(event: "error", listener: js.Function1[/* error */ js.Error, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  @scala.annotation.targetName("prependOnceListener_change")
  def prependOnceListener(
    event: "change",
    listener: js.Function2[/* eventType */ String, /* filename */ String | Buffer, Unit]
  ): this.type = js.native
  def prependOnceListener(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
}
