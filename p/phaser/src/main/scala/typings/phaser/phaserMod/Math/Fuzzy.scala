package typings.phaser.phaserMod.Math

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("phaser", "Math.Fuzzy")
@js.native
object Fuzzy extends js.Object {
  /**
    * Calculate the fuzzy ceiling of the given value.
    * @param value The value.
    * @param epsilon The epsilon. Default 0.0001.
    */
  def Ceil(value: Double): Double = js.native
  def Ceil(value: Double, epsilon: Double): Double = js.native
  /**
    * Check whether the given values are fuzzily equal.
    * 
    * Two numbers are fuzzily equal if their difference is less than `epsilon`.
    * @param a The first value.
    * @param b The second value.
    * @param epsilon The epsilon. Default 0.0001.
    */
  def Equal(a: Double, b: Double): Boolean = js.native
  def Equal(a: Double, b: Double, epsilon: Double): Boolean = js.native
  /**
    * Calculate the fuzzy floor of the given value.
    * @param value The value.
    * @param epsilon The epsilon. Default 0.0001.
    */
  def Floor(value: Double): Double = js.native
  def Floor(value: Double, epsilon: Double): Double = js.native
  /**
    * Check whether `a` is fuzzily greater than `b`.
    * 
    * `a` is fuzzily greater than `b` if it is more than `b - epsilon`.
    * @param a The first value.
    * @param b The second value.
    * @param epsilon The epsilon. Default 0.0001.
    */
  def GreaterThan(a: Double, b: Double): Boolean = js.native
  def GreaterThan(a: Double, b: Double, epsilon: Double): Boolean = js.native
  /**
    * Check whether `a` is fuzzily less than `b`.
    * 
    * `a` is fuzzily less than `b` if it is less than `b + epsilon`.
    * @param a The first value.
    * @param b The second value.
    * @param epsilon The epsilon. Default 0.0001.
    */
  def LessThan(a: Double, b: Double): Boolean = js.native
  def LessThan(a: Double, b: Double, epsilon: Double): Boolean = js.native
}

