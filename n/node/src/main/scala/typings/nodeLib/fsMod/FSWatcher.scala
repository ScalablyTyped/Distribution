package typings
package nodeLib.fsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FSWatcher
  extends nodeLib.eventsMod.EventEmitter {
  @JSName("addListener")
  def addListener_change(
    event: nodeLib.nodeLibStrings.change,
    listener: js.Function2[
      /* eventType */ java.lang.String, 
      /* filename */ java.lang.String | nodeLib.Buffer, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_error(event: nodeLib.nodeLibStrings.error, listener: js.Function1[/* error */ nodeLib.Error, scala.Unit]): this.type = js.native
  def close(): scala.Unit = js.native
  @JSName("on")
  def on_change(
    event: nodeLib.nodeLibStrings.change,
    listener: js.Function2[
      /* eventType */ java.lang.String, 
      /* filename */ java.lang.String | nodeLib.Buffer, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_error(event: nodeLib.nodeLibStrings.error, listener: js.Function1[/* error */ nodeLib.Error, scala.Unit]): this.type = js.native
  @JSName("once")
  def once_change(
    event: nodeLib.nodeLibStrings.change,
    listener: js.Function2[
      /* eventType */ java.lang.String, 
      /* filename */ java.lang.String | nodeLib.Buffer, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_error(event: nodeLib.nodeLibStrings.error, listener: js.Function1[/* error */ nodeLib.Error, scala.Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_change(
    event: nodeLib.nodeLibStrings.change,
    listener: js.Function2[
      /* eventType */ java.lang.String, 
      /* filename */ java.lang.String | nodeLib.Buffer, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_error(event: nodeLib.nodeLibStrings.error, listener: js.Function1[/* error */ nodeLib.Error, scala.Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_change(
    event: nodeLib.nodeLibStrings.change,
    listener: js.Function2[
      /* eventType */ java.lang.String, 
      /* filename */ java.lang.String | nodeLib.Buffer, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_error(event: nodeLib.nodeLibStrings.error, listener: js.Function1[/* error */ nodeLib.Error, scala.Unit]): this.type = js.native
}

