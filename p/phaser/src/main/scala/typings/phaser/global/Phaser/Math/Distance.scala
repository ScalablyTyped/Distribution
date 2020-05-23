package typings.phaser.global.Phaser.Math

import typings.phaser.Phaser.Types.Math.Vector2Like
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
    * Calculate the distance between two points.
    * @param a The first point.
    * @param b The second point.
    */
  def BetweenPoints(a: Vector2Like, b: Vector2Like): Double = js.native
  /**
    * Calculate the squared distance between two points.
    * @param a The first point.
    * @param b The second point.
    */
  def BetweenPointsSquared(a: Vector2Like, b: Vector2Like): Double = js.native
  /**
    * Calculate the Chebyshev distance between two sets of coordinates (points).
    * 
    * Chebyshev distance (or chessboard distance) is the maximum of the horizontal and vertical distances.
    * It's the effective distance when movement can be horizontal, vertical, or diagonal.
    * @param x1 The x coordinate of the first point.
    * @param y1 The y coordinate of the first point.
    * @param x2 The x coordinate of the second point.
    * @param y2 The y coordinate of the second point.
    */
  def Chebyshev(x1: Double, y1: Double, x2: Double, y2: Double): Double = js.native
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
    * Calculate the snake distance between two sets of coordinates (points).
    * 
    * Snake distance (rectilinear distance, Manhattan distance) is the sum of the horizontal and vertical distances.
    * It's the effective distance when movement is allowed only horizontally or vertically (but not both).
    * @param x1 The x coordinate of the first point.
    * @param y1 The y coordinate of the first point.
    * @param x2 The x coordinate of the second point.
    * @param y2 The y coordinate of the second point.
    */
  def Snake(x1: Double, y1: Double, x2: Double, y2: Double): Double = js.native
  /**
    * Calculate the distance between two sets of coordinates (points), squared.
    * @param x1 The x coordinate of the first point.
    * @param y1 The y coordinate of the first point.
    * @param x2 The x coordinate of the second point.
    * @param y2 The y coordinate of the second point.
    */
  def Squared(x1: Double, y1: Double, x2: Double, y2: Double): Double = js.native
}

