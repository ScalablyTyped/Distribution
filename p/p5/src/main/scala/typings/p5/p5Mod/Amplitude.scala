package typings.p5.p5Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Amplitude extends js.Object {
  /**
    *   Returns a single Amplitude reading at the moment
    *   it is called. For continuous readings, run in the
    *   draw loop.
    *   @param [channel] Optionally return only channel 0
    *   (left) or 1 (right)
    *   @return Amplitude as a number between 0.0 and 1.0
    */
  def getLevel(): Double = js.native
  def getLevel(channel: Double): Double = js.native
  /**
    *   Connects to the p5sound instance (master output)
    *   by default. Optionally, you can pass in a specific
    *   source (i.e. a soundfile).
    *   @param [snd] set the sound source (optional,
    *   defaults to master output)
    *   @param [smoothing] a range between 0.0 and 1.0 to
    *   smooth amplitude readings
    */
  def setInput(): Unit = js.native
  def setInput(snd: js.Any): Unit = js.native
  def setInput(snd: js.Any, smoothing: Double): Unit = js.native
  /**
    *   Smooth Amplitude analysis by averaging with the
    *   last analysis frame. Off by default.
    *   @param set smoothing from 0.0 <= 1
    */
  def smooth(set: Double): Unit = js.native
  /**
    *   Determines whether the results of
    *   Amplitude.process() will be Normalized. To
    *   normalize, Amplitude finds the difference the
    *   loudest reading it has processed and the maximum
    *   amplitude of 1.0. Amplitude adds this difference
    *   to all values to produce results that will
    *   reliably map between 0.0 and 1.0. However, if a
    *   louder moment occurs, the amount that Normalize
    *   adds to all the values will change. Accepts an
    *   optional boolean parameter (true or false).
    *   Normalizing is off by default.
    *   @param [boolean] set normalize to true (1) or
    *   false (0)
    */
  def toggleNormalize(): Unit = js.native
  def toggleNormalize(boolean: Boolean): Unit = js.native
}

