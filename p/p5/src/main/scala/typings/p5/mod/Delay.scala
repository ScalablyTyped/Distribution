package typings.p5.mod

import typings.std.DelayNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Delay extends Effect {
  /**
    *   The p5.Delay is built with two  Web Audio Delay
    *   Nodes, one for each stereo channel.
    */
  var leftDelay: DelayNode = js.native
  /**
    *   The p5.Delay is built with two  Web Audio Delay
    *   Nodes, one for each stereo channel.
    */
  var rightDelay: DelayNode = js.native
  /**
    *   Set the delay (echo) time, in seconds. Usually
    *   this value will be a floating point number between
    *   0.0 and 1.0.
    *   @param delayTime Time (in seconds) of the delay
    */
  def delayTime(delayTime: Double): Unit = js.native
  def feedback(feedback: js.Object): Double = js.native
  /**
    *   Feedback occurs when Delay sends its signal back
    *   through its input in a loop. The feedback amount
    *   determines how much signal to send each time
    *   through the loop. A feedback greater than 1.0 is
    *   not desirable because it will increase the overall
    *   output each time through the loop, creating an
    *   infinite feedback loop. The default value is 0.5
    *   @param feedback 0.0 to 1.0, or an object such as
    *   an Oscillator that can be used to modulate this
    *   param
    *   @return Feedback value
    */
  def feedback(feedback: Double): Double = js.native
  def filter(cutoffFreq: js.Object, res: js.Object): Unit = js.native
  def filter(cutoffFreq: js.Object, res: Double): Unit = js.native
  def filter(cutoffFreq: Double, res: js.Object): Unit = js.native
  /**
    *   Set a lowpass filter frequency for the delay. A
    *   lowpass filter will cut off any frequencies higher
    *   than the filter frequency.
    *   @param cutoffFreq A lowpass filter will cut off
    *   any frequencies higher than the filter frequency.
    *   @param res Resonance of the filter frequency
    *   cutoff, or an object (i.e. a p5.Oscillator) that
    *   can be used to modulate this parameter. High
    *   numbers (i.e. 15) will produce a resonance, low
    *   numbers (i.e. .2) will produce a slope.
    */
  def filter(cutoffFreq: Double, res: Double): Unit = js.native
  /**
    *   Add delay to an audio signal according to a set of
    *   delay parameters.
    *   @param Signal An object that outputs audio
    *   @param [delayTime] Time (in seconds) of the
    *   delay/echo. Some browsers limit delayTime to 1
    *   second.
    *   @param [feedback] sends the delay back through
    *   itself in a loop that decreases in volume each
    *   time.
    *   @param [lowPass] Cutoff frequency. Only
    *   frequencies below the lowPass will be part of the
    *   delay.
    */
  def process(Signal: js.Object): Unit = js.native
  def process(Signal: js.Object, delayTime: Double): Unit = js.native
  def process(Signal: js.Object, delayTime: Double, feedback: Double): Unit = js.native
  def process(Signal: js.Object, delayTime: Double, feedback: Double, lowPass: Double): Unit = js.native
  /**
    *   Choose a preset type of delay. 'pingPong' bounces
    *   the signal from the left to the right channel to
    *   produce a stereo effect. Any other parameter will
    *   revert to the default delay setting.
    *   @param type 'pingPong' (1) or 'default' (0)
    */
  def setType(`type`: String): Unit = js.native
  def setType(`type`: Double): Unit = js.native
}

