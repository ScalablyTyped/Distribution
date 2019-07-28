package typings.p5.p5Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Reverb extends Effect {
  /**
    *   Connect a source to the reverb, and assign reverb
    *   parameters.
    *   @param src p5.sound / Web Audio object with a
    *   sound output.
    *   @param [seconds] Duration of the reverb, in
    *   seconds. Min: 0, Max: 10. Defaults to 3.
    *   @param [decayRate] Percentage of decay with each
    *   echo. Min: 0, Max: 100. Defaults to 2.
    *   @param [reverse] Play the reverb backwards or
    *   forwards.
    */
  def process(src: js.Object): Unit = js.native
  def process(src: js.Object, seconds: Double): Unit = js.native
  def process(src: js.Object, seconds: Double, decayRate: Double): Unit = js.native
  def process(src: js.Object, seconds: Double, decayRate: Double, reverse: Boolean): Unit = js.native
  /**
    *   Set the reverb settings. Similar to .process(),
    *   but without assigning a new input.
    *   @param [seconds] Duration of the reverb, in
    *   seconds. Min: 0, Max: 10. Defaults to 3.
    *   @param [decayRate] Percentage of decay with each
    *   echo. Min: 0, Max: 100. Defaults to 2.
    *   @param [reverse] Play the reverb backwards or
    *   forwards.
    */
  def set(): Unit = js.native
  def set(seconds: Double): Unit = js.native
  def set(seconds: Double, decayRate: Double): Unit = js.native
  def set(seconds: Double, decayRate: Double, reverse: Boolean): Unit = js.native
}

