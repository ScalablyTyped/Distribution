package typings
package p5Lib.p5Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p5", "PeakDetect")
@js.native
/**
  *   PeakDetect works in conjunction with p5.FFT to
  *   look for onsets in some or all of the frequency
  *   spectrum.   To use p5.PeakDetect, call update in
  *   the draw loop and pass in a p5.FFT object.
  *
  *
  *   You can listen for a specific part of the
  *   frequency spectrum by setting the range between
  *   freq1 and freq2.
  *
  *   threshold is the threshold for detecting a peak,
  *   scaled between 0 and 1. It is logarithmic, so 0.1
  *   is half as loud as 1.0.
  *
  *
  *   The update method is meant to be run in the draw
  *   loop, and frames determines how many loops must
  *   pass before another peak can be detected. For
  *   example, if the frameRate() = 60, you could detect
  *   the beat of a 120 beat-per-minute song with this
  *   equation:  framesPerPeak = 60 / (estimatedBPM / 60
  *   );
  *
  *
  *   Based on example contribtued by @b2renger, and a
  *   simple beat detection explanation by a
  *   href="http://www.airtightinteractive.com/2013/10/making-audio-reactive-visuals/"
  *   target="_blank"Felix Turner.
  *
  *   @param [freq1] lowFrequency - defaults to 20Hz
  *   @param [freq2] highFrequency - defaults to 20000
  *   Hz
  *   @param [threshold] Threshold for detecting a beat
  *   between 0 and 1 scaled logarithmically where 0.1
  *   is 1/2 the loudness of 1.0. Defaults to 0.35.
  *   @param [framesPerPeak] Defaults to 20.
  */
class PeakDetect ()
  extends p5Lib.p5Mod.p5Ns.PeakDetect {
  def this(freq1: scala.Double) = this()
  def this(freq1: scala.Double, freq2: scala.Double) = this()
  def this(freq1: scala.Double, freq2: scala.Double, threshold: scala.Double) = this()
  def this(freq1: scala.Double, freq2: scala.Double, threshold: scala.Double, framesPerPeak: scala.Double) = this()
}

