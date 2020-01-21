package typings.p5.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FFT extends js.Object {
  /**
    *   Returns an array of amplitude values (between 0
    *   and 255) across the frequency spectrum. Length is
    *   equal to FFT bins (1024 by default). The array
    *   indices correspond to frequencies (i.e. pitches),
    *   from the lowest to the highest that humans can
    *   hear. Each value represents amplitude at that
    *   slice of the frequency spectrum. Must be called
    *   prior to using getEnergy().
    *   @param [bins] Must be a power of two between 16
    *   and 1024. Defaults to 1024.
    *   @param [scale] If "dB," returns decibel float
    *   measurements between -140 and 0 (max). Otherwise
    *   returns integers from 0-255.
    *   @return spectrum Array of energy
    *   (amplitude/volume) values across the frequency
    *   spectrum. Lowest energy (silence) = 0, highest
    *   possible is 255.
    */
  def analyze(): js.Array[_] = js.native
  def analyze(bins: Double): js.Array[_] = js.native
  def analyze(bins: Double, scale: Double): js.Array[_] = js.native
  /**
    *   Returns the  spectral centroid of the input
    *   signal. NOTE: analyze() must be called prior to
    *   getCentroid(). Analyze() tells the FFT to analyze
    *   frequency data, and getCentroid() uses the results
    *   determine the spectral centroid.
    *   @return Spectral Centroid Frequency Frequency of
    *   the spectral centroid in Hz.
    */
  def getCentroid(): Double = js.native
  def getEnergy(frequency1: String): Double = js.native
  def getEnergy(frequency1: String, frequency2: Double): Double = js.native
  /**
    *   Returns the amount of energy (volume) at a
    *   specific  frequency, or the average amount of
    *   energy between two frequencies. Accepts Number(s)
    *   corresponding to frequency (in Hz), or a String
    *   corresponding to predefined frequency ranges
    *   ("bass", "lowMid", "mid", "highMid", "treble").
    *   Returns a range between 0 (no energy/volume at
    *   that frequency) and 255 (maximum energy). NOTE:
    *   analyze() must be called prior to getEnergy().
    *   Analyze() tells the FFT to analyze frequency data,
    *   and getEnergy() uses the results determine the
    *   value at a specific frequency or range of
    *   frequencies.
    *   @param frequency1 Will return a value representing
    *   energy at this frequency. Alternately, the strings
    *   "bass", "lowMid" "mid", "highMid", and "treble"
    *   will return predefined frequency ranges.
    *   @param [frequency2] If a second frequency is
    *   given, will return average amount of energy that
    *   exists between the two frequencies.
    *   @return Energy Energy (volume/amplitude) from 0
    *   and 255.
    */
  def getEnergy(frequency1: Double): Double = js.native
  def getEnergy(frequency1: Double, frequency2: Double): Double = js.native
  /**
    *   Calculates and Returns the 1/N Octave Bands N
    *   defaults to 3 and minimum central frequency to
    *   15.625Hz. (1/3 Octave Bands ~= 31 Frequency Bands)
    *   Setting fCtr0 to a central value of a higher
    *   octave will ignore the lower bands and produce
    *   less frequency groups.
    *   @param N Specifies the 1/N type of generated
    *   octave bands
    *   @param fCtr0 Minimum central frequency for the
    *   lowest band
    *   @return octaveBands Array of octave band objects
    *   with their bounds
    */
  def getOctaveBands(N: Double, fCtr0: Double): js.Array[_] = js.native
  /**
    *   Returns an array of average amplitude values for a
    *   given number of frequency bands split equally. N
    *   defaults to 16. NOTE: analyze() must be called
    *   prior to linAverages(). Analyze() tells the FFT to
    *   analyze frequency data, and linAverages() uses the
    *   results to group them into a smaller set of
    *   averages.
    *   @param N Number of returned frequency groups
    *   @return linearAverages Array of average amplitude
    *   values for each group
    */
  def linAverages(N: Double): js.Array[_] = js.native
  /**
    *   Returns an array of average amplitude values of
    *   the spectrum, for a given set of  Octave Bands
    *   NOTE: analyze() must be called prior to
    *   logAverages(). Analyze() tells the FFT to analyze
    *   frequency data, and logAverages() uses the results
    *   to group them into a smaller set of averages.
    *   @param octaveBands Array of Octave Bands objects
    *   for grouping
    *   @return logAverages Array of average amplitude
    *   values for each group
    */
  def logAverages(octaveBands: js.Array[_]): js.Array[_] = js.native
  /**
    *   Set the input source for the FFT analysis. If no
    *   source is provided, FFT will analyze all sound in
    *   the sketch.
    *   @param [source] p5.sound object (or web audio API
    *   source node)
    */
  def setInput(): Unit = js.native
  def setInput(source: js.Object): Unit = js.native
  /**
    *   Smooth FFT analysis by averaging with the last
    *   analysis frame.
    *   @param smoothing 0.0 < smoothing < 1.0. Defaults
    *   to 0.8.
    */
  def smooth(smoothing: Double): Unit = js.native
  /**
    *   Returns an array of amplitude values (between -1.0
    *   and +1.0) that represent a snapshot of amplitude
    *   readings in a single buffer. Length will be equal
    *   to bins (defaults to 1024). Can be used to draw
    *   the waveform of a sound.
    *   @param [bins] Must be a power of two between 16
    *   and 1024. Defaults to 1024.
    *   @param [precision] If any value is provided, will
    *   return results in a Float32 Array which is more
    *   precise than a regular array.
    *   @return Array Array of amplitude values (-1 to 1)
    *   over time. Array length = bins.
    */
  def waveform(): js.Array[_] = js.native
  def waveform(bins: Double): js.Array[_] = js.native
  def waveform(bins: Double, precision: String): js.Array[_] = js.native
}

