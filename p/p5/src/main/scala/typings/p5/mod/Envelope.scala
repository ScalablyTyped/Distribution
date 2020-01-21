package typings.p5.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Envelope extends js.Object {
  /**
    *   Level once attack is complete.
    */
  var attackLevel: js.Any = js.native
  /**
    *   Time until envelope reaches attackLevel
    */
  var attackTime: js.Any = js.native
  /**
    *   Level after decay. The envelope will sustain here
    *   until it is released.
    */
  var decayLevel: js.Any = js.native
  /**
    *   Time until envelope reaches decayLevel.
    */
  var decayTime: js.Any = js.native
  /**
    *   Level at the end of the release.
    */
  var releaseLevel: js.Any = js.native
  /**
    *   Duration of the release portion of the envelope.
    */
  var releaseTime: js.Any = js.native
  /**
    *   Add a value to the p5.Oscillator's output
    *   amplitude, and return the oscillator. Calling this
    *   method again will override the initial add() with
    *   new values.
    *   @param number Constant number to add
    *   @return Envelope Returns this envelope with scaled
    *   output
    */
  def add(number: Double): Envelope = js.native
  /**
    *   Multiply the p5.Envelope's output amplitude by a
    *   fixed value. Calling this method again will
    *   override the initial mult() with new values.
    *   @param number Constant number to multiply
    *   @return Envelope Returns this envelope with scaled
    *   output
    */
  def mult(number: Double): Envelope = js.native
  /**
    *   Play tells the envelope to start acting on a given
    *   input. If the input is a p5.sound object (i.e.
    *   AudioIn, Oscillator, SoundFile), then Envelope
    *   will control its output volume. Envelopes can also
    *   be used to control any  Web Audio Audio Param.
    *   @param unit A p5.sound object or Web Audio Param.
    *   @param [startTime] time from now (in seconds) at
    *   which to play
    *   @param [sustainTime] time to sustain before
    *   releasing the envelope
    */
  def play(unit: js.Object): Unit = js.native
  def play(unit: js.Object, startTime: Double): Unit = js.native
  def play(unit: js.Object, startTime: Double, sustainTime: Double): Unit = js.native
  /**
    *   Exponentially ramp to a value using the first two
    *   values from setADSR(attackTime, decayTime) as
    *   time constants for simple exponential ramps. If
    *   the value is higher than current value, it uses
    *   attackTime, while a decrease uses decayTime.
    *   @param unit p5.sound Object or Web Audio Param
    *   @param secondsFromNow When to trigger the ramp
    *   @param v Target value
    *   @param [v2] Second target value (optional)
    */
  def ramp(unit: js.Object, secondsFromNow: Double, v: Double): Unit = js.native
  def ramp(unit: js.Object, secondsFromNow: Double, v: Double, v2: Double): Unit = js.native
  /**
    *   Scale this envelope's amplitude values to a given
    *   range, and return the envelope. Calling this
    *   method again will override the initial scale()
    *   with new values.
    *   @param inMin input range minumum
    *   @param inMax input range maximum
    *   @param outMin input range minumum
    *   @param outMax input range maximum
    *   @return Envelope Returns this envelope with scaled
    *   output
    */
  def scale(inMin: Double, inMax: Double, outMin: Double, outMax: Double): Envelope = js.native
  /**
    *   Reset the envelope with a series of time/value
    *   pairs.
    *   @param attackTime Time (in seconds) before level
    *   reaches attackLevel
    *   @param attackLevel Typically an amplitude between
    *   0.0 and 1.0
    *   @param decayTime Time
    *   @param decayLevel Amplitude (In a standard ADSR
    *   envelope, decayLevel = sustainLevel)
    *   @param releaseTime Release Time (in seconds)
    *   @param releaseLevel Amplitude
    */
  def set(
    attackTime: Double,
    attackLevel: Double,
    decayTime: Double,
    decayLevel: Double,
    releaseTime: Double,
    releaseLevel: Double
  ): Unit = js.native
  /**
    *   Set values like a traditional  ADSR envelope .
    *   @param attackTime Time (in seconds before envelope
    *   reaches Attack Level
    *   @param [decayTime] Time (in seconds) before
    *   envelope reaches Decay/Sustain Level
    *   @param [susRatio] Ratio between attackLevel and
    *   releaseLevel, on a scale from 0 to 1, where 1.0 =
    *   attackLevel, 0.0 = releaseLevel. The susRatio
    *   determines the decayLevel and the level at which
    *   the sustain portion of the envelope will sustain.
    *   For example, if attackLevel is 0.4, releaseLevel
    *   is 0, and susAmt is 0.5, the decayLevel would be
    *   0.2. If attackLevel is increased to 1.0 (using
    *   setRange), then decayLevel would increase
    *   proportionally, to become 0.5.
    *   @param [releaseTime] Time in seconds from now
    *   (defaults to 0)
    */
  def setADSR(attackTime: Double): Unit = js.native
  def setADSR(attackTime: Double, decayTime: Double): Unit = js.native
  def setADSR(attackTime: Double, decayTime: Double, susRatio: Double): Unit = js.native
  def setADSR(attackTime: Double, decayTime: Double, susRatio: Double, releaseTime: Double): Unit = js.native
  /**
    *   Set whether the envelope ramp is linear (default)
    *   or exponential. Exponential ramps can be useful
    *   because we perceive amplitude and frequency
    *   logarithmically.
    *   @param isExp true is exponential, false is linear
    */
  def setExp(isExp: Boolean): Unit = js.native
  /**
    *   Assign a parameter to be controlled by this
    *   envelope. If a p5.Sound object is given, then the
    *   p5.Envelope will control its output gain. If
    *   multiple inputs are provided, the env will control
    *   all of them.
    *   @param [inputs] A p5.sound object or Web Audio
    *   Param.
    */
  def setInput(): Unit = js.native
  def setInput(inputs: js.Object): Unit = js.native
  /**
    *   Set max (attackLevel) and min (releaseLevel) of
    *   envelope.
    *   @param aLevel attack level (defaults to 1)
    *   @param rLevel release level (defaults to 0)
    */
  def setRange(aLevel: Double, rLevel: Double): Unit = js.native
  /**
    *   Trigger the Attack, and Decay portion of the
    *   Envelope. Similar to holding down a key on a
    *   piano, but it will hold the sustain level until
    *   you let go. Input can be any p5.sound object, or a
    *   Web Audio Param.
    *   @param unit p5.sound Object or Web Audio Param
    *   @param secondsFromNow time from now (in seconds)
    */
  def triggerAttack(unit: js.Object, secondsFromNow: Double): Unit = js.native
  /**
    *   Trigger the Release of the Envelope. This is
    *   similar to releasing the key on a piano and
    *   letting the sound fade according to the release
    *   level and release time.
    *   @param unit p5.sound Object or Web Audio Param
    *   @param secondsFromNow time to trigger the release
    */
  def triggerRelease(unit: js.Object, secondsFromNow: Double): Unit = js.native
}

