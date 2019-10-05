package typings.phaser.Phaser.Math

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Phaser.Math.Distance")
@js.native
object Distance extends js.Object {
  /**
    * Calculate the distance between two sets of coordinates (points).
    * @param x1 The x coordinate of the first point.
    * @param y1 The y coordinate of the first point.
    * @param x2 The x coordinate of the second point.
    * @param y2 The y coordinate of the second point.
    */
  def Between(x1: Double, y1: Double, x2: Double, y2: Double): Double = js.native
  /**
    * Calculate the distance between two sets of coordinates (points) to the power of `pow`.
    * @param x1 The x coordinate of the first point.
    * @param y1 The y coordinate of the first point.
    * @param x2 The x coordinate of the second point.
    * @param y2 The y coordinate of the second point.
    * @param pow The exponent.
    */
  def Power(x1: Double, y1: Double, x2: Double, y2: Double, pow: Double): Double = js.native
  /**
    * Calculate the distance between two sets of coordinates (points), squared.
    * @param x1 The x coordinate of the first point.
    * @param y1 The y coordinate of the first point.
    * @param x2 The x coordinate of the second point.
    * @param y2 The y coordinate of the second point.
    */
  def Squared(x1: Double, y1: Double, x2: Double, y2: Double): Double = js.native
}

