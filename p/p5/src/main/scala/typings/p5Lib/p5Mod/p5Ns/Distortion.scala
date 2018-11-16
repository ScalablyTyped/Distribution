package typings
package p5Lib.p5Mod.p5Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Distortion
  extends p5Lib.p5Mod.Effect {
  /**
       *   The p5.Distortion is built with a  Web Audio
       *   WaveShaper Node.
       */
  var WaveShaperNode: stdLib.AudioNode = js.native
  /**
       *   Return the distortion amount, typically between
       *   0-1.
       *   @return Unbounded distortion amount. Normal values
       *   range from 0-1.
       */
  def getAmount(): scala.Double = js.native
  /**
       *   Return the oversampling.
       *   @return Oversample can either be 'none', '2x', or
       *   '4x'.
       */
  def getOversample(): java.lang.String = js.native
  /**
       *   Process a sound source, optionally specify amount
       *   and oversample values.
       *   @param [amount] Unbounded distortion amount.
       *   Normal values range from 0-1.
       *   @param [oversample] 'none', '2x', or '4x'.
       */
  def process(): scala.Unit = js.native
  /**
       *   Process a sound source, optionally specify amount
       *   and oversample values.
       *   @param [amount] Unbounded distortion amount.
       *   Normal values range from 0-1.
       *   @param [oversample] 'none', '2x', or '4x'.
       */
  def process(amount: scala.Double): scala.Unit = js.native
  /**
       *   Process a sound source, optionally specify amount
       *   and oversample values.
       *   @param [amount] Unbounded distortion amount.
       *   Normal values range from 0-1.
       *   @param [oversample] 'none', '2x', or '4x'.
       */
  def process(amount: scala.Double, oversample: java.lang.String): scala.Unit = js.native
  /**
       *   Set the amount and oversample of the waveshaper
       *   distortion.
       *   @param [amount] Unbounded distortion amount.
       *   Normal values range from 0-1.
       *   @param [oversample] 'none', '2x', or '4x'.
       */
  def set(): scala.Unit = js.native
  /**
       *   Set the amount and oversample of the waveshaper
       *   distortion.
       *   @param [amount] Unbounded distortion amount.
       *   Normal values range from 0-1.
       *   @param [oversample] 'none', '2x', or '4x'.
       */
  def set(amount: scala.Double): scala.Unit = js.native
  /**
       *   Set the amount and oversample of the waveshaper
       *   distortion.
       *   @param [amount] Unbounded distortion amount.
       *   Normal values range from 0-1.
       *   @param [oversample] 'none', '2x', or '4x'.
       */
  def set(amount: scala.Double, oversample: java.lang.String): scala.Unit = js.native
}

