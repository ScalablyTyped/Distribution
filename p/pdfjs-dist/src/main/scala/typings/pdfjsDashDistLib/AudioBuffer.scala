package typings
package pdfjsDashDistLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AudioBuffer extends js.Object {
  val duration: scala.Double = js.native
  val length: scala.Double = js.native
  val numberOfChannels: scala.Double = js.native
  val sampleRate: scala.Double = js.native
  def copyFromChannel(destination: stdLib.Float32Array, channelNumber: scala.Double): scala.Unit = js.native
  def copyFromChannel(destination: stdLib.Float32Array, channelNumber: scala.Double, startInChannel: scala.Double): scala.Unit = js.native
  def copyToChannel(source: stdLib.Float32Array, channelNumber: scala.Double): scala.Unit = js.native
  def copyToChannel(source: stdLib.Float32Array, channelNumber: scala.Double, startInChannel: scala.Double): scala.Unit = js.native
  def getChannelData(channel: scala.Double): stdLib.Float32Array = js.native
}

@JSGlobal("AudioBuffer")
@js.native
object AudioBuffer
  extends org.scalablytyped.runtime.Instantiable1[/* options */ AudioBufferOptions, AudioBuffer]

