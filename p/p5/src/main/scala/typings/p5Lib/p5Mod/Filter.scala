package typings
package p5Lib.p5Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p5", "Filter")
@js.native
class Filter ()
  extends p5Lib.p5Mod.p5Ns.Filter {
  /**
       *   A p5.Filter uses a Web Audio Biquad Filter to
       *   filter the frequency response of an input source.
       *   Subclasses include:
       *
       *   - p5.LowPass: Allows frequencies below the cutoff
       *   frequency to pass through, and attenuates
       *   frequencies above the cutoff.
       *   - p5.HighPass: The opposite of a lowpass filter.
       *   - p5.BandPass: Allows a range of frequencies to
       *   pass through and attenuates the frequencies below
       *   and above this frequency range.
       *
       *   The .res() method controls either width of the
       *   bandpass, or resonance of the low/highpass cutoff
       *   frequency.
       *
       *   This class extends p5.Effect.
       *   Methods amp(), chain(), drywet(), connect(), and
       *   disconnect() are available.
       *
       *   @param [type] 'lowpass' (default), 'highpass',
       *   'bandpass'
       */
  def this(`type`: java.lang.String) = this()
}

