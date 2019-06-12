package typings
package nodemailerLib.libDkimRelaxedDashBodyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Streams through a message body and calculates relaxed body hash
  */
@js.native
trait RelaxedBody
  extends nodeLib.streamMod.Transform {
  def addListener(
    event: nodemailerLib.nodemailerLibStrings.hash,
    listener: js.Function2[
      /* digest */ nodeLib.Buffer, 
      /* debugBody */ nodeLib.Buffer | nodemailerLib.nodemailerLibNumbers.`false`, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_close(event: nodemailerLib.nodemailerLibStrings.close, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_data(
    event: nodemailerLib.nodemailerLibStrings.data,
    listener: js.Function1[/* chunk */ js.Any, scala.Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_end(event: nodemailerLib.nodemailerLibStrings.end, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_error(
    event: nodemailerLib.nodemailerLibStrings.error,
    listener: js.Function1[/* err */ stdLib.Error, scala.Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_readable(event: nodemailerLib.nodemailerLibStrings.readable, listener: js.Function0[scala.Unit]): this.type = js.native
  def emit(
    event: nodemailerLib.nodemailerLibStrings.hash,
    digest: nodeLib.Buffer,
    debugBody: nodemailerLib.nodemailerLibNumbers.`false`
  ): scala.Boolean = js.native
  @JSName("emit")
  def emit_close(event: nodemailerLib.nodemailerLibStrings.close): scala.Boolean = js.native
  @JSName("emit")
  def emit_data(event: nodemailerLib.nodemailerLibStrings.data, chunk: js.Any): scala.Boolean = js.native
  @JSName("emit")
  def emit_end(event: nodemailerLib.nodemailerLibStrings.end): scala.Boolean = js.native
  @JSName("emit")
  def emit_error(event: nodemailerLib.nodemailerLibStrings.error, err: stdLib.Error): scala.Boolean = js.native
  @JSName("emit")
  def emit_hash(event: nodemailerLib.nodemailerLibStrings.hash, digest: nodeLib.Buffer, debugBody: nodeLib.Buffer): scala.Boolean = js.native
  @JSName("emit")
  def emit_readable(event: nodemailerLib.nodemailerLibStrings.readable): scala.Boolean = js.native
  def on(
    event: nodemailerLib.nodemailerLibStrings.hash,
    listener: js.Function2[
      /* digest */ nodeLib.Buffer, 
      /* debugBody */ nodeLib.Buffer | nodemailerLib.nodemailerLibNumbers.`false`, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_close(event: nodemailerLib.nodemailerLibStrings.close, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("on")
  def on_data(
    event: nodemailerLib.nodemailerLibStrings.data,
    listener: js.Function1[/* chunk */ js.Any, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_end(event: nodemailerLib.nodemailerLibStrings.end, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("on")
  def on_error(
    event: nodemailerLib.nodemailerLibStrings.error,
    listener: js.Function1[/* err */ stdLib.Error, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_readable(event: nodemailerLib.nodemailerLibStrings.readable, listener: js.Function0[scala.Unit]): this.type = js.native
  def once(
    event: nodemailerLib.nodemailerLibStrings.hash,
    listener: js.Function2[
      /* digest */ nodeLib.Buffer, 
      /* debugBody */ nodeLib.Buffer | nodemailerLib.nodemailerLibNumbers.`false`, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_close(event: nodemailerLib.nodemailerLibStrings.close, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("once")
  def once_data(
    event: nodemailerLib.nodemailerLibStrings.data,
    listener: js.Function1[/* chunk */ js.Any, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_end(event: nodemailerLib.nodemailerLibStrings.end, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("once")
  def once_error(
    event: nodemailerLib.nodemailerLibStrings.error,
    listener: js.Function1[/* err */ stdLib.Error, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_readable(event: nodemailerLib.nodemailerLibStrings.readable, listener: js.Function0[scala.Unit]): this.type = js.native
  def prependListener(
    event: nodemailerLib.nodemailerLibStrings.hash,
    listener: js.Function2[
      /* digest */ nodeLib.Buffer, 
      /* debugBody */ nodeLib.Buffer | nodemailerLib.nodemailerLibNumbers.`false`, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_close(event: nodemailerLib.nodemailerLibStrings.close, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_data(
    event: nodemailerLib.nodemailerLibStrings.data,
    listener: js.Function1[/* chunk */ js.Any, scala.Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_end(event: nodemailerLib.nodemailerLibStrings.end, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_error(
    event: nodemailerLib.nodemailerLibStrings.error,
    listener: js.Function1[/* err */ stdLib.Error, scala.Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_readable(event: nodemailerLib.nodemailerLibStrings.readable, listener: js.Function0[scala.Unit]): this.type = js.native
  def prependOnceListener(
    event: nodemailerLib.nodemailerLibStrings.hash,
    listener: js.Function2[
      /* digest */ nodeLib.Buffer, 
      /* debugBody */ nodeLib.Buffer | nodemailerLib.nodemailerLibNumbers.`false`, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_close(event: nodemailerLib.nodemailerLibStrings.close, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_data(
    event: nodemailerLib.nodemailerLibStrings.data,
    listener: js.Function1[/* chunk */ js.Any, scala.Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_end(event: nodemailerLib.nodemailerLibStrings.end, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_error(
    event: nodemailerLib.nodemailerLibStrings.error,
    listener: js.Function1[/* err */ stdLib.Error, scala.Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_readable(event: nodemailerLib.nodemailerLibStrings.readable, listener: js.Function0[scala.Unit]): this.type = js.native
  def removeListener(
    event: nodemailerLib.nodemailerLibStrings.hash,
    listener: js.Function2[
      /* digest */ nodeLib.Buffer, 
      /* debugBody */ nodeLib.Buffer | nodemailerLib.nodemailerLibNumbers.`false`, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_close(event: nodemailerLib.nodemailerLibStrings.close, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_data(
    event: nodemailerLib.nodemailerLibStrings.data,
    listener: js.Function1[/* chunk */ js.Any, scala.Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_end(event: nodemailerLib.nodemailerLibStrings.end, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_error(
    event: nodemailerLib.nodemailerLibStrings.error,
    listener: js.Function1[/* err */ stdLib.Error, scala.Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_readable(event: nodemailerLib.nodemailerLibStrings.readable, listener: js.Function0[scala.Unit]): this.type = js.native
}

