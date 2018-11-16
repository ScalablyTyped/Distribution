package typings
package omggifLib.omggifMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("omggif", "GifReader")
@js.native
class GifReader protected () extends js.Object {
  def this(buf: nodeLib.Buffer) = this()
  def decodeAndBlitFrameBGRA(frame_num: scala.Double, pixels: js.Array[scala.Double]): scala.Unit = js.native
  def decodeAndBlitFrameRGBA(frame_num: scala.Double, pixels: js.Array[scala.Double]): scala.Unit = js.native
  def frameInfo(frame_num: scala.Double): Frame = js.native
  def loopCount(): scala.Double = js.native
  def numFrames(): scala.Double = js.native
}

