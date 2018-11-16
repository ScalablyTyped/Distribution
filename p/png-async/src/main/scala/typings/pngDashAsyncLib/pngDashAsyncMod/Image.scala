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
  var data: nodeLib.Buffer = js.native
  var gamma: scala.Double = js.native
  var height: scala.Double = js.native
  var width: scala.Double = js.native
  def bitblt(
    dst: Image,
    sx: scala.Double,
    sy: scala.Double,
    w: scala.Double,
    h: scala.Double,
    dx: scala.Double,
    dy: scala.Double
  ): Image = js.native
  def pack(): Image = js.native
  def parse(data: nodeLib.Buffer): Image = js.native
  def parse(
    data: nodeLib.Buffer,
    callback: js.Function2[/* err */ nodeLib.Error, /* image */ this.type, scala.Unit]
  ): Image = js.native
  def write(data: js.Any, cb: js.Any): scala.Boolean = js.native
}

