package typings
package pngDashAsyncLib.pngDashAsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("png-async", "Image")
@js.native
class Image ()
  extends nodeLib.streamMod.Duplex {
  def this(option: IImageOptions) = this()
  var _gamma: js.Any = js.native
  var _handleClose: js.Any = js.native
  var _metadata: js.Any = js.native
  var _packer: js.Any = js.native
  var _parser: js.Any = js.native
  var data: nodeLib.Buffer = js.native
  var gamma: scala.Double = js.native
  var height: scala.Double = js.native
  var width: scala.Double = js.native
  def _read(): scala.Unit = js.native
  def _write(data: js.Any, encoding: js.Any, callback: js.Any): scala.Boolean = js.native
  def bitblt(
    dst: Image,
    sx: scala.Double,
    sy: scala.Double,
    w: scala.Double,
    h: scala.Double,
    dx: scala.Double,
    dy: scala.Double
  ): this.type = js.native
  def pack(): Image = js.native
  def parse(data: nodeLib.Buffer): Image = js.native
  def parse(
    data: nodeLib.Buffer,
    callback: js.Function2[/* err */ nodeLib.Error, /* image */ this.type, scala.Unit]
  ): Image = js.native
}

