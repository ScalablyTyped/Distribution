package typings.pngjs.mod

import typings.node.Buffer
import typings.node.streamMod.Duplex
import typings.pngjs.AnonRead
import typings.pngjs.pngjsStrings.close
import typings.pngjs.pngjsStrings.error
import typings.pngjs.pngjsStrings.metadata
import typings.pngjs.pngjsStrings.parsed
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pngjs", "PNG")
@js.native
class PNG () extends Duplex {
  def this(options: PNGOptions) = this()
  var data: Buffer = js.native
  var gamma: Double = js.native
  var height: Double = js.native
  var width: Double = js.native
  def adjustGamma(): Unit = js.native
  def bitblt(
    dst: PNG,
    srcX: js.UndefOr[Double],
    srcY: js.UndefOr[Double],
    width: js.UndefOr[Double],
    height: js.UndefOr[Double],
    deltaX: js.UndefOr[Double],
    deltaY: js.UndefOr[Double]
  ): PNG = js.native
  def on(event: String, callback: js.ThisFunction1[/* this */ this.type, /* repeated */ js.Any, Unit]): this.type = js.native
  @JSName("on")
  def on_close(event: close, callback: js.ThisFunction0[/* this */ this.type, Unit]): this.type = js.native
  @JSName("on")
  def on_error(event: error, callback: js.ThisFunction1[/* this */ this.type, /* error */ Error, Unit]): this.type = js.native
  @JSName("on")
  def on_metadata(event: metadata, callback: js.ThisFunction1[/* this */ this.type, /* metadata */ Metadata, Unit]): this.type = js.native
  @JSName("on")
  def on_parsed(event: parsed, callback: js.ThisFunction1[/* this */ this.type, /* data */ Buffer, Unit]): this.type = js.native
  def pack(): PNG = js.native
  def parse(data: String): PNG = js.native
  def parse(data: String, callback: js.Function2[/* error */ Error, /* data */ this.type, Unit]): PNG = js.native
  def parse(data: Buffer): PNG = js.native
  def parse(data: Buffer, callback: js.Function2[/* error */ Error, /* data */ this.type, Unit]): PNG = js.native
}

/* static members */
@JSImport("pngjs", "PNG")
@js.native
object PNG extends js.Object {
  var sync: AnonRead = js.native
  def adjustGamma(src: PNG): Unit = js.native
  def bitblt(
    src: PNG,
    dst: PNG,
    srcX: js.UndefOr[Double],
    srcY: js.UndefOr[Double],
    width: js.UndefOr[Double],
    height: js.UndefOr[Double],
    deltaX: js.UndefOr[Double],
    deltaY: js.UndefOr[Double]
  ): Unit = js.native
}

