package typings.phaser.PhaserNs.MathNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Phaser.Math.Interpolation")
@js.native
object InterpolationNs extends js.Object {
  /**
    * A bezier interpolation method.
    * @param v The input array of values to interpolate between.
    * @param k The percentage of interpolation, between 0 and 1.
    */
  def Bezier(v: js.Array[Double], k: Double): Double = js.native
  /**
    * A Catmull-Rom interpolation method.
    * @param v The input array of values to interpolate between.
    * @param k The percentage of interpolation, between 0 and 1.
    */
  def CatmullRom(v: js.Array[Double], k: Double): Double = js.native
  /**
    * A cubic bezier interpolation method.
    * 
    * https://medium.com/@adrian_cooney/bezier-interpolation-13b68563313a
    * @param t The percentage of interpolation, between 0 and 1.
    * @param p0 The start point.
    * @param p1 The first control point.
    * @param p2 The second control point.
    * @param p3 The end point.
    */
  def CubicBezier(t: Double, p0: Double, p1: Double, p2: Double, p3: Double): Double = js.native
  /**
    * A linear interpolation method.
    * @param v The input array of values to interpolate between.
    * @param k The percentage of interpolation, between 0 and 1.
    */
  def Linear(v: js.Array[Double], k: Double): Double = js.native
  /**
    * A quadratic bezier interpolation method.
    * @param t The percentage of interpolation, between 0 and 1.
    * @param p0 The start point.
    * @param p1 The control point.
    * @param p2 The end point.
    */
  def QuadraticBezier(t: Double, p0: Double, p1: Double, p2: Double): Double = js.native
  /**
    * A Smooth Step interpolation method.
    * @param t The percentage of interpolation, between 0 and 1.
    * @param min The minimum value, also known as the 'left edge', assumed smaller than the 'right edge'.
    * @param max The maximum value, also known as the 'right edge', assumed greater than the 'left edge'.
    */
  def SmoothStep(t: Double, min: Double, max: Double): Double = js.native
  /**
    * A Smoother Step interpolation method.
    * @param t The percentage of interpolation, between 0 and 1.
    * @param min The minimum value, also known as the 'left edge', assumed smaller than the 'right edge'.
    * @param max The maximum value, also known as the 'right edge', assumed greater than the 'left edge'.
    */
  def SmootherStep(t: Double, min: Double, max: Double): Double = js.native
}

