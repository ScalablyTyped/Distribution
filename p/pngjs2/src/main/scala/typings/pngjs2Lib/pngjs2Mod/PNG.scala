package typings
package pngjs2Lib.pngjs2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pngjs2", "PNG")
@js.native
class PNG ()
  extends nodeLib.streamMod.Writable {
  def this(options: PNGOptions) = this()
  var data: nodeLib.Buffer = js.native
  var gamma: scala.Double = js.native
  var height: scala.Double = js.native
  var width: scala.Double = js.native
  def bitblt(
    dst: PNG,
    srcX: scala.Double,
    srcY: scala.Double,
    width: scala.Double,
    height: scala.Double,
    deltaX: scala.Double,
    deltaY: scala.Double
  ): PNG = js.native
  def on(event: java.lang.String, callback: js.Function): this.type = js.native
  @JSName("on")
  def on_error(
    event: pngjs2Lib.pngjs2LibStrings.error,
    callback: js.Function1[/* err */ stdLib.Error, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_metadata(
    event: pngjs2Lib.pngjs2LibStrings.metadata,
    callback: js.Function1[/* metadata */ PNGMetadata, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_parsed(
    event: pngjs2Lib.pngjs2LibStrings.parsed,
    callback: js.Function1[/* data */ nodeLib.Buffer, scala.Unit]
  ): this.type = js.native
  def pack(): PNG = js.native
  def parse(data: java.lang.String): PNG = js.native
  def parse(
    data: java.lang.String,
    callback: js.Function2[/* err */ stdLib.Error, /* data */ nodeLib.Buffer, scala.Unit]
  ): PNG = js.native
  def parse(data: nodeLib.Buffer): PNG = js.native
  def parse(
    data: nodeLib.Buffer,
    callback: js.Function2[/* err */ stdLib.Error, /* data */ nodeLib.Buffer, scala.Unit]
  ): PNG = js.native
}

/* static members */
@JSImport("pngjs2", "PNG")
@js.native
object PNG extends js.Object {
  def bitblt(
    src: pngjs2Lib.pngjs2Mod.PNG,
    dst: pngjs2Lib.pngjs2Mod.PNG,
    srcX: scala.Double,
    srcY: scala.Double,
    width: scala.Double,
    height: scala.Double,
    deltaX: scala.Double,
    deltaY: scala.Double
  ): scala.Unit = js.native
}

