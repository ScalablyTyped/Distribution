package typings
package p5Lib.p5Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p5", "FFT")
@js.native
/**
  *   FFT (Fast Fourier Transform) is an analysis
  *   algorithm that isolates individual  audio
  *   frequencies within a waveform. Once instantiated,
  *   a p5.FFT object can return an array based on two
  *   types of analyses:
  *
  *   • FFT.waveform() computes amplitude values along
  *   the time domain. The array indices correspond to
  *   samples across a brief moment in time. Each value
  *   represents amplitude of the waveform at that
  *   sample of time.
  *
  *   • FFT.analyze()  computes amplitude values along
  *   the frequency domain. The array indices correspond
  *   to frequencies (i.e. pitches), from the lowest to
  *   the highest that humans can hear. Each value
  *   represents amplitude at that slice of the
  *   frequency spectrum. Use with getEnergy() to
  *   measure amplitude at specific frequencies, or
  *   within a range of frequencies.
  *
  *   FFT analyzes a very short snapshot of sound called
  *   a sample buffer. It returns an array of amplitude
  *   measurements, referred to as bins. The array is
  *   1024 bins long by default. You can change the bin
  *   array length, but it must be a power of 2 between
  *   16 and 1024 in order for the FFT algorithm to
  *   function correctly. The actual size of the FFT
  *   buffer is twice the number of bins, so given a
  *   standard sample rate, the buffer is 2048/44100
  *   seconds long.
  *
  *   @param [smoothing] Smooth results of Freq
  *   Spectrum. 0.0 < smoothing < 1.0. Defaults to 0.8.
  *   @param [bins] Length of resulting array. Must be a
  *   power of two between 16 and 1024. Defaults to
  *   1024.
  */
class FFT ()
  extends p5Lib.p5Mod.p5Ns.FFT {
  def this(smoothing: scala.Double) = this()
  def this(smoothing: scala.Double, bins: scala.Double) = this()
}

