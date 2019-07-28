package typings.p5.p5Mod

import typings.std.AudioNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Distortion extends Effect {
  /**
    *   The p5.Distortion is built with a  Web Audio
    *   WaveShaper Node.
    */
  var WaveShaperNode: AudioNode = js.native
  /**
    *   Return the distortion amount, typically between
    *   0-1.
    *   @return Unbounded distortion amount. Normal values
    *   range from 0-1.
    */
  def getAmount(): Double = js.native
  /**
    *   Return the oversampling.
    *   @return Oversample can either be 'none', '2x', or
    *   '4x'.
    */
  def getOversample(): String = js.native
  /**
    *   Process a sound source, optionally specify amount
    *   and oversample values.
    *   @param [amount] Unbounded distortion amount.
    *   Normal values range from 0-1.
    *   @param [oversample] 'none', '2x', or '4x'.
    */
  def process(): Unit = js.native
  def process(amount: Double): Unit = js.native
  def process(amount: Double, oversample: String): Unit = js.native
  /**
    *   Set the amount and oversample of the waveshaper
    *   distortion.
    *   @param [amount] Unbounded distortion amount.
    *   Normal values range from 0-1.
    *   @param [oversample] 'none', '2x', or '4x'.
    */
  def set(): Unit = js.native
  def set(amount: Double): Unit = js.native
  def set(amount: Double, oversample: String): Unit = js.native
}

