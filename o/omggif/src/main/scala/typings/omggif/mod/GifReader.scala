package typings.omggif.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("omggif", "GifReader")
@js.native
class GifReader protected () extends js.Object {
  def this(buf: Buffer) = this()
  def decodeAndBlitFrameBGRA(frame_num: Double, pixels: js.Array[Double]): Unit = js.native
  def decodeAndBlitFrameRGBA(frame_num: Double, pixels: js.Array[Double]): Unit = js.native
  def frameInfo(frame_num: Double): Frame = js.native
  def loopCount(): Double = js.native
  def numFrames(): Double = js.native
}

