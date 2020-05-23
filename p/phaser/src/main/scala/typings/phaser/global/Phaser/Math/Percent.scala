package typings.phaser.global.Phaser.Math

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Phaser.Math.Percent")
@js.native
object Percent extends js.Object {
  /**
    * Work out what percentage `value` is of the range between `min` and `max`.
    * If `max` isn't given then it will return the percentage of `value` to `min`.
    * 
    * You can optionally specify an `upperMax` value, which is a mid-way point in the range that represents 100%, after which the % starts to go down to zero again.
    * @param value The value to determine the percentage of.
    * @param min The minimum value.
    * @param max The maximum value.
    * @param upperMax The mid-way point in the range that represents 100%.
    */
  def apply(value: Double, min: Double): Double = js.native
  def apply(value: Double, min: Double, max: Double): Double = js.native
  def apply(value: Double, min: Double, max: Double, upperMax: Double): Double = js.native
}

