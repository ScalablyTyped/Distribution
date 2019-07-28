package typings.p5.p5Mod

import typings.std.AudioNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Compressor extends Effect {
  /**
    *   The p5.Compressor is built with a Web Audio
    *   Dynamics Compressor Node
    */
  var compressor: AudioNode = js.native
  /**
    *   Get current attack or set value w/ time ramp
    *   @param [attack] Attack is the amount of time (in
    *   seconds) to reduce the gain by 10dB, default =
    *   .003, range 0 - 1
    *   @param [time] Assign time value to schedule the
    *   change in value
    */
  def attack(): Unit = js.native
  def attack(attack: Double): Unit = js.native
  def attack(attack: Double, time: Double): Unit = js.native
  /**
    *   Get current knee or set value w/ time ramp
    *   @param [knee] A decibel value representing the
    *   range above the threshold where the curve smoothly
    *   transitions to the "ratio" portion. default = 30,
    *   range 0 - 40
    *   @param [time] Assign time value to schedule the
    *   change in value
    */
  def knee(): Unit = js.native
  def knee(knee: Double): Unit = js.native
  def knee(knee: Double, time: Double): Unit = js.native
  /**
    *   Performs the same function as .connect, but also
    *   accepts optional parameters to set compressor's
    *   audioParams
    *   @param src Sound source to be connected
    *   @param [attack] The amount of time (in seconds) to
    *   reduce the gain by 10dB, default = .003, range 0 -
    *   1
    *   @param [knee] A decibel value representing the
    *   range above the threshold where the curve smoothly
    *   transitions to the "ratio" portion. default = 30,
    *   range 0 - 40
    *   @param [ratio] The amount of dB change in input
    *   for a 1 dB change in output default = 12, range 1
    *   - 20
    *   @param [threshold] The decibel value above which
    *   the compression will start taking effect default =
    *   -24, range -100 - 0
    *   @param [release] The amount of time (in seconds)
    *   to increase the gain by 10dB default = .25, range
    *   0 - 1
    */
  def process(src: js.Object): Unit = js.native
  def process(src: js.Object, attack: Double): Unit = js.native
  def process(src: js.Object, attack: Double, knee: Double): Unit = js.native
  def process(src: js.Object, attack: Double, knee: Double, ratio: Double): Unit = js.native
  def process(src: js.Object, attack: Double, knee: Double, ratio: Double, threshold: Double): Unit = js.native
  def process(src: js.Object, attack: Double, knee: Double, ratio: Double, threshold: Double, release: Double): Unit = js.native
  /**
    *   Get current ratio or set value w/ time ramp
    *   @param [ratio] The amount of dB change in input
    *   for a 1 dB change in output default = 12, range 1
    *   - 20
    *   @param [time] Assign time value to schedule the
    *   change in value
    */
  def ratio(): Unit = js.native
  def ratio(ratio: Double): Unit = js.native
  def ratio(ratio: Double, time: Double): Unit = js.native
  /**
    *   Return the current reduction value
    *   @return Value of the amount of gain reduction that
    *   is applied to the signal
    */
  def reduction(): Double = js.native
  /**
    *   Get current release or set value w/ time ramp
    *   @param release The amount of time (in seconds) to
    *   increase the gain by 10dB default = .25, range 0 -
    *   1
    *   @param [time] Assign time value to schedule the
    *   change in value
    */
  def release(release: Double): Unit = js.native
  def release(release: Double, time: Double): Unit = js.native
  /**
    *   Set the paramters of a compressor.
    *   @param attack The amount of time (in seconds) to
    *   reduce the gain by 10dB, default = .003, range 0 -
    *   1
    *   @param knee A decibel value representing the range
    *   above the threshold where the curve smoothly
    *   transitions to the "ratio" portion. default = 30,
    *   range 0 - 40
    *   @param ratio The amount of dB change in input for
    *   a 1 dB change in output default = 12, range 1 - 20
    *   @param threshold The decibel value above which the
    *   compression will start taking effect default =
    *   -24, range -100 - 0
    *   @param release The amount of time (in seconds) to
    *   increase the gain by 10dB default = .25, range 0 -
    *   1
    */
  def set(attack: Double, knee: Double, ratio: Double, threshold: Double, release: Double): Unit = js.native
  /**
    *   Get current threshold or set value w/ time ramp
    *   @param threshold The decibel value above which the
    *   compression will start taking effect default =
    *   -24, range -100 - 0
    *   @param [time] Assign time value to schedule the
    *   change in value
    */
  def threshold(threshold: Double): Unit = js.native
  def threshold(threshold: Double, time: Double): Unit = js.native
}

