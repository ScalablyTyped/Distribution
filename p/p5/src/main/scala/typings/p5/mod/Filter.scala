package typings.p5.mod

import typings.std.DelayNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Filter extends Effect {
  /**
    *   The p5.Filter is built with a  Web Audio
    *   BiquadFilter Node.
    */
  var biquadFilter: DelayNode = js.native
  /**
    *   Set the filter frequency, in Hz, from 10 to 22050
    *   (the range of human hearing, although in reality
    *   most people hear in a narrower range).
    *   @param freq Filter Frequency
    *   @param [timeFromNow] schedule this event to happen
    *   seconds from now
    *   @return value Returns the current frequency value
    */
  def freq(freq: Double): Double = js.native
  def freq(freq: Double, timeFromNow: Double): Double = js.native
  /**
    *   Controls the gain attribute of a Biquad Filter.
    *   This is distinctly different from .amp() which is
    *   inherited from p5.Effect .amp() controls the
    *   volume via the output gain node p5.Filter.gain()
    *   controls the gain parameter of a Biquad Filter
    *   node.
    *   @return Returns the current or updated gain value
    */
  def gain(gain: Double): Double = js.native
  /**
    *   Filter an audio signal according to a set of
    *   filter parameters.
    *   @param Signal An object that outputs audio
    *   @param [freq] Frequency in Hz, from 10 to 22050
    *   @param [res] Resonance/Width of the filter
    *   frequency from 0.001 to 1000
    */
  def process(Signal: js.Object): Unit = js.native
  def process(Signal: js.Object, freq: Double): Unit = js.native
  def process(Signal: js.Object, freq: Double, res: Double): Unit = js.native
  /**
    *   Controls either width of a bandpass frequency, or
    *   the resonance of a low/highpass cutoff frequency.
    *   @param res Resonance/Width of filter freq from
    *   0.001 to 1000
    *   @param [timeFromNow] schedule this event to happen
    *   seconds from now
    *   @return value Returns the current res value
    */
  def res(res: Double): Double = js.native
  def res(res: Double, timeFromNow: Double): Double = js.native
  /**
    *   Set the frequency and the resonance of the filter.
    *   @param [freq] Frequency in Hz, from 10 to 22050
    *   @param [res] Resonance (Q) from 0.001 to 1000
    *   @param [timeFromNow] schedule this event to happen
    *   seconds from now
    */
  def set(): Unit = js.native
  def set(freq: Double): Unit = js.native
  def set(freq: Double, res: Double): Unit = js.native
  def set(freq: Double, res: Double, timeFromNow: Double): Unit = js.native
  /**
    *   Set the type of a p5.Filter. Possible types
    *   include: "lowpass" (default), "highpass",
    *   "bandpass", "lowshelf", "highshelf", "peaking",
    *   "notch", "allpass".
    */
  def setType(t: String): Unit = js.native
  /**
    *   Toggle function. Switches between the specified
    *   type and allpass
    *   @return [Toggle value]
    */
  def toggle(): Boolean = js.native
}

