package typings
package omggifLib.omggifMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("omggif", "GifWriter")
@js.native
class GifWriter protected () extends js.Object {
  def this(buf: nodeLib.Buffer, width: scala.Double, height: scala.Double) = this()
  def this(buf: nodeLib.Buffer, width: scala.Double, height: scala.Double, gopts: GifOptions) = this()
  var height: scala.Double = js.native
  var width: scala.Double = js.native
  def addFrame(
    x: scala.Double,
    y: scala.Double,
    w: scala.Double,
    h: scala.Double,
    indexed_pixels: js.Array[scala.Double]
  ): scala.Double = js.native
  def addFrame(
    x: scala.Double,
    y: scala.Double,
    w: scala.Double,
    h: scala.Double,
    indexed_pixels: js.Array[scala.Double],
    opts: FrameOptions
  ): scala.Double = js.native
  def end(): scala.Double = js.native
  def getOutputBuffer(): nodeLib.Buffer = js.native
  def getOutputBufferPosition(): scala.Double = js.native
  def setOutputBuffer(v: nodeLib.Buffer): scala.Unit = js.native
  def setOutputBufferPosition(v: scala.Double): scala.Unit = js.native
}

