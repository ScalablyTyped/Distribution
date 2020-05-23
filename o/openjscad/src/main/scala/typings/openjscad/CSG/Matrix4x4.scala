package typings.openjscad.CSG

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Matrix4x4 extends js.Object {
  var elements: js.Array[Double]
  def isMirroring(): Boolean
  def leftMultiply1x2Vector(v: Vector2D): Vector2D
  def leftMultiply1x3Vector(v: Vector3D): Vector3D
  def minus(m: Matrix4x4): Matrix4x4
  def multiply(m: Matrix4x4): Matrix4x4
  def plus(m: Matrix4x4): Matrix4x4
  def rightMultiply1x2Vector(v: Vector2D): Vector2D
  def rightMultiply1x3Vector(v: Vector3D): Vector3D
}

object Matrix4x4 {
  @scala.inline
  def apply(
    elements: js.Array[Double],
    isMirroring: () => Boolean,
    leftMultiply1x2Vector: Vector2D => Vector2D,
    leftMultiply1x3Vector: Vector3D => Vector3D,
    minus: Matrix4x4 => Matrix4x4,
    multiply: Matrix4x4 => Matrix4x4,
    plus: Matrix4x4 => Matrix4x4,
    rightMultiply1x2Vector: Vector2D => Vector2D,
    rightMultiply1x3Vector: Vector3D => Vector3D
  ): Matrix4x4 = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any], isMirroring = js.Any.fromFunction0(isMirroring), leftMultiply1x2Vector = js.Any.fromFunction1(leftMultiply1x2Vector), leftMultiply1x3Vector = js.Any.fromFunction1(leftMultiply1x3Vector), minus = js.Any.fromFunction1(minus), multiply = js.Any.fromFunction1(multiply), plus = js.Any.fromFunction1(plus), rightMultiply1x2Vector = js.Any.fromFunction1(rightMultiply1x2Vector), rightMultiply1x3Vector = js.Any.fromFunction1(rightMultiply1x3Vector))
    __obj.asInstanceOf[Matrix4x4]
  }
}

