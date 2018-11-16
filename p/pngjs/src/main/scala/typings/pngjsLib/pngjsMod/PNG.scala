package typings
package pngjsLib.pngjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pngjs", "PNG")
@js.native
class PNG ()
  extends nodeLib.streamMod.Duplex {
  def this(options: PNGOptions) = this()
  var data: nodeLib.Buffer = js.native
  var gamma: scala.Double = js.native
  var height: scala.Double = js.native
  var width: scala.Double = js.native
  def adjustGamma(): scala.Unit = js.native
  def bitblt(
    dst: PNG,
    srcX: js.UndefOr[scala.Double],
    srcY: js.UndefOr[scala.Double],
    width: js.UndefOr[scala.Double],
    height: js.UndefOr[scala.Double],
    deltaX: js.UndefOr[scala.Double],
    deltaY: js.UndefOr[scala.Double]
  ): PNG = js.native
  @JSName("on")
  def on_error(
    event: pngjsLib.pngjsLibStrings.error,
    callback: js.Function1[/* error */ nodeLib.Error, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_metadata(
    event: pngjsLib.pngjsLibStrings.metadata,
    callback: js.Function1[/* metadata */ Metadata, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_parsed(
    event: pngjsLib.pngjsLibStrings.parsed,
    callback: js.Function1[/* data */ nodeLib.Buffer, scala.Unit]
  ): this.type = js.native
  def pack(): PNG = js.native
  def parse(data: java.lang.String): PNG = js.native
  def parse(
    data: java.lang.String,
    callback: js.Function2[/* error */ nodeLib.Error, /* data */ this.type, scala.Unit]
  ): PNG = js.native
  def parse(data: nodeLib.Buffer): PNG = js.native
  def parse(
    data: nodeLib.Buffer,
    callback: js.Function2[/* error */ nodeLib.Error, /* data */ this.type, scala.Unit]
  ): PNG = js.native
}

@JSImport("pngjs", "PNG")
@js.native
object PNG extends js.Object {
  var sync: pngjsLib.Anon_Write = js.native
  def adjustGamma(src: pngjsLib.pngjsMod.PNG): scala.Unit = js.native
  def bitblt(
    src: pngjsLib.pngjsMod.PNG,
    dst: pngjsLib.pngjsMod.PNG,
    srcX: js.UndefOr[scala.Double],
    srcY: js.UndefOr[scala.Double],
    width: js.UndefOr[scala.Double],
    height: js.UndefOr[scala.Double],
    deltaX: js.UndefOr[scala.Double],
    deltaY: js.UndefOr[scala.Double]
  ): scala.Unit = js.native
}

