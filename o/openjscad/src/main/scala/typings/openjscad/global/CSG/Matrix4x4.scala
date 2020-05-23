package typings.openjscad.global.CSG

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CSG.Matrix4x4")
@js.native
class Matrix4x4 ()
  extends typings.openjscad.CSG.Matrix4x4 {
  def this(elements: js.Array[Double]) = this()
  /* CompleteClass */
  override var elements: js.Array[Double] = js.native
  /* CompleteClass */
  override def isMirroring(): Boolean = js.native
  /* CompleteClass */
  override def leftMultiply1x2Vector(v: typings.openjscad.CSG.Vector2D): typings.openjscad.CSG.Vector2D = js.native
  /* CompleteClass */
  override def leftMultiply1x3Vector(v: typings.openjscad.CSG.Vector3D): typings.openjscad.CSG.Vector3D = js.native
  /* CompleteClass */
  override def minus(m: typings.openjscad.CSG.Matrix4x4): typings.openjscad.CSG.Matrix4x4 = js.native
  /* CompleteClass */
  override def multiply(m: typings.openjscad.CSG.Matrix4x4): typings.openjscad.CSG.Matrix4x4 = js.native
  /* CompleteClass */
  override def plus(m: typings.openjscad.CSG.Matrix4x4): typings.openjscad.CSG.Matrix4x4 = js.native
  /* CompleteClass */
  override def rightMultiply1x2Vector(v: typings.openjscad.CSG.Vector2D): typings.openjscad.CSG.Vector2D = js.native
  /* CompleteClass */
  override def rightMultiply1x3Vector(v: typings.openjscad.CSG.Vector3D): typings.openjscad.CSG.Vector3D = js.native
}

/* static members */
@JSGlobal("CSG.Matrix4x4")
@js.native
object Matrix4x4 extends js.Object {
  def mirroring(plane: typings.openjscad.CSG.Plane): typings.openjscad.CSG.Matrix4x4 = js.native
  def rotation(
    rotationCenter: typings.openjscad.CSG.Vector3D,
    rotationAxis: typings.openjscad.CSG.Vector3D,
    degrees: Double
  ): typings.openjscad.CSG.Matrix4x4 = js.native
  def rotationX(degrees: Double): typings.openjscad.CSG.Matrix4x4 = js.native
  def rotationY(degrees: Double): typings.openjscad.CSG.Matrix4x4 = js.native
  def rotationZ(degrees: Double): typings.openjscad.CSG.Matrix4x4 = js.native
  def scaling(v: js.Array[Double]): typings.openjscad.CSG.Matrix4x4 = js.native
  def scaling(v: typings.openjscad.CSG.Vector3D): typings.openjscad.CSG.Matrix4x4 = js.native
  def translation(v: js.Array[Double]): typings.openjscad.CSG.Matrix4x4 = js.native
  def translation(v: typings.openjscad.CSG.Vector3D): typings.openjscad.CSG.Matrix4x4 = js.native
  def unity(): typings.openjscad.CSG.Matrix4x4 = js.native
}

