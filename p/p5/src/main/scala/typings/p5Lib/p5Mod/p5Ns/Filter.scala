package typings
package p5Lib.p5Mod.p5Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Filter
  extends p5Lib.p5Mod.Effect {
  /**
       *   The p5.Filter is built with a  Web Audio
       *   BiquadFilter Node.
       */
  var biquadFilter: stdLib.DelayNode = js.native
  /**
       *   Set the filter frequency, in Hz, from 10 to 22050
       *   (the range of human hearing, although in reality
       *   most people hear in a narrower range).
       *   @param freq Filter Frequency
       *   @param [timeFromNow] schedule this event to happen
       *   seconds from now
       *   @return value Returns the current frequency value
       */
  def freq(freq: scala.Double): scala.Double = js.native
  /**
       *   Set the filter frequency, in Hz, from 10 to 22050
       *   (the range of human hearing, although in reality
       *   most people hear in a narrower range).
       *   @param freq Filter Frequency
       *   @param [timeFromNow] schedule this event to happen
       *   seconds from now
       *   @return value Returns the current frequency value
       */
  def freq(freq: scala.Double, timeFromNow: scala.Double): scala.Double = js.native
  /**
       *   Controls the gain attribute of a Biquad Filter.
       *   This is distinctly different from .amp() which is
       *   inherited from p5.Effect .amp() controls the
       *   volume via the output gain node p5.Filter.gain()
       *   controls the gain parameter of a Biquad Filter
       *   node.
       *   @return Returns the current or updated gain value
       */
  def gain(gain: scala.Double): scala.Double = js.native
  /**
       *   Filter an audio signal according to a set of
       *   filter parameters.
       *   @param Signal An object that outputs audio
       *   @param [freq] Frequency in Hz, from 10 to 22050
       *   @param [res] Resonance/Width of the filter
       *   frequency from 0.001 to 1000
       */
  def process(Signal: js.Object): scala.Unit = js.native
  /**
       *   Filter an audio signal according to a set of
       *   filter parameters.
       *   @param Signal An object that outputs audio
       *   @param [freq] Frequency in Hz, from 10 to 22050
       *   @param [res] Resonance/Width of the filter
       *   frequency from 0.001 to 1000
       */
  def process(Signal: js.Object, freq: scala.Double): scala.Unit = js.native
  /**
       *   Filter an audio signal according to a set of
       *   filter parameters.
       *   @param Signal An object that outputs audio
       *   @param [freq] Frequency in Hz, from 10 to 22050
       *   @param [res] Resonance/Width of the filter
       *   frequency from 0.001 to 1000
       */
  def process(Signal: js.Object, freq: scala.Double, res: scala.Double): scala.Unit = js.native
  /**
       *   Controls either width of a bandpass frequency, or
       *   the resonance of a low/highpass cutoff frequency.
       *   @param res Resonance/Width of filter freq from
       *   0.001 to 1000
       *   @param [timeFromNow] schedule this event to happen
       *   seconds from now
       *   @return value Returns the current res value
       */
  def res(res: scala.Double): scala.Double = js.native
  /**
       *   Controls either width of a bandpass frequency, or
       *   the resonance of a low/highpass cutoff frequency.
       *   @param res Resonance/Width of filter freq from
       *   0.001 to 1000
       *   @param [timeFromNow] schedule this event to happen
       *   seconds from now
       *   @return value Returns the current res value
       */
  def res(res: scala.Double, timeFromNow: scala.Double): scala.Double = js.native
  /**
       *   Set the frequency and the resonance of the filter.
       *   @param [freq] Frequency in Hz, from 10 to 22050
       *   @param [res] Resonance (Q) from 0.001 to 1000
       *   @param [timeFromNow] schedule this event to happen
       *   seconds from now
       */
  def set(): scala.Unit = js.native
  /**
       *   Set the frequency and the resonance of the filter.
       *   @param [freq] Frequency in Hz, from 10 to 22050
       *   @param [res] Resonance (Q) from 0.001 to 1000
       *   @param [timeFromNow] schedule this event to happen
       *   seconds from now
       */
  def set(freq: scala.Double): scala.Unit = js.native
  /**
       *   Set the frequency and the resonance of the filter.
       *   @param [freq] Frequency in Hz, from 10 to 22050
       *   @param [res] Resonance (Q) from 0.001 to 1000
       *   @param [timeFromNow] schedule this event to happen
       *   seconds from now
       */
  def set(freq: scala.Double, res: scala.Double): scala.Unit = js.native
  /**
       *   Set the frequency and the resonance of the filter.
       *   @param [freq] Frequency in Hz, from 10 to 22050
       *   @param [res] Resonance (Q) from 0.001 to 1000
       *   @param [timeFromNow] schedule this event to happen
       *   seconds from now
       */
  def set(freq: scala.Double, res: scala.Double, timeFromNow: scala.Double): scala.Unit = js.native
  /**
       *   Set the type of a p5.Filter. Possible types
       *   include: "lowpass" (default), "highpass",
       *   "bandpass", "lowshelf", "highshelf", "peaking",
       *   "notch", "allpass".
       */
  def setType(t: java.lang.String): scala.Unit = js.native
  /**
       *   Toggle function. Switches between the specified
       *   type and allpass
       *   @return [Toggle value]
       */
  def toggle(): scala.Boolean = js.native
}

