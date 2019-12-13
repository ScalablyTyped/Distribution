package typings.node.fsMod

import typings.node.Buffer
import typings.node.Error
import typings.node.eventsMod.EventEmitter
import typings.node.nodeStrings.change
import typings.node.nodeStrings.error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FSWatcher extends EventEmitter {
  @JSName("addListener")
  def addListener_change(
    event: change,
    listener: js.Function2[/* eventType */ java.lang.String, /* filename */ java.lang.String | Buffer, Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_close(event: typings.node.nodeStrings.close, listener: js.Function0[Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_error(event: error, listener: js.Function1[/* error */ Error, Unit]): this.type = js.native
  def close(): Unit = js.native
  @JSName("on")
  def on_change(
    event: change,
    listener: js.Function2[/* eventType */ java.lang.String, /* filename */ java.lang.String | Buffer, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_close(event: typings.node.nodeStrings.close, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_error(event: error, listener: js.Function1[/* error */ Error, Unit]): this.type = js.native
  @JSName("once")
  def once_change(
    event: change,
    listener: js.Function2[/* eventType */ java.lang.String, /* filename */ java.lang.String | Buffer, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_close(event: typings.node.nodeStrings.close, listener: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_error(event: error, listener: js.Function1[/* error */ Error, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_change(
    event: change,
    listener: js.Function2[/* eventType */ java.lang.String, /* filename */ java.lang.String | Buffer, Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_close(event: typings.node.nodeStrings.close, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_error(event: error, listener: js.Function1[/* error */ Error, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_change(
    event: change,
    listener: js.Function2[/* eventType */ java.lang.String, /* filename */ java.lang.String | Buffer, Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_close(event: typings.node.nodeStrings.close, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_error(event: error, listener: js.Function1[/* error */ Error, Unit]): this.type = js.native
}

