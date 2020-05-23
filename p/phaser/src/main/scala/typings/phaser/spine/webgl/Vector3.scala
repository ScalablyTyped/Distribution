package typings.phaser.spine.webgl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Vector3 extends js.Object {
  var x: Double
  var y: Double
  var z: Double
  def add(v: Vector3): Vector3
  def cross(v: Vector3): Vector3
  def distance(v: Vector3): Double
  def dot(v: Vector3): Double
  def length(): Double
  def multiply(matrix: Matrix4): Vector3
  def normalize(): Vector3
  def project(matrix: Matrix4): Vector3
  def scale(s: Double): Vector3
  def set(x: Double, y: Double, z: Double): Vector3
  def setFrom(v: Vector3): Vector3
  def sub(v: Vector3): Vector3
}

object Vector3 {
  @scala.inline
  def apply(
    add: Vector3 => Vector3,
    cross: Vector3 => Vector3,
    distance: Vector3 => Double,
    dot: Vector3 => Double,
    length: () => Double,
    multiply: Matrix4 => Vector3,
    normalize: () => Vector3,
    project: Matrix4 => Vector3,
    scale: Double => Vector3,
    set: (Double, Double, Double) => Vector3,
    setFrom: Vector3 => Vector3,
    sub: Vector3 => Vector3,
    x: Double,
    y: Double,
    z: Double
  ): Vector3 = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), cross = js.Any.fromFunction1(cross), distance = js.Any.fromFunction1(distance), dot = js.Any.fromFunction1(dot), length = js.Any.fromFunction0(length), multiply = js.Any.fromFunction1(multiply), normalize = js.Any.fromFunction0(normalize), project = js.Any.fromFunction1(project), scale = js.Any.fromFunction1(scale), set = js.Any.fromFunction3(set), setFrom = js.Any.fromFunction1(setFrom), sub = js.Any.fromFunction1(sub), x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
    __obj.asInstanceOf[Vector3]
  }
}

