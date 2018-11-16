package typings
package openjscadLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CxG")
@js.native
class CxG () extends js.Object {
  def getBounds(): js.Array[CxG] = js.native
  def mirrored(plane: openjscadLib.CSGNs.Plane): CxG = js.native
  def mirroredX(): CxG = js.native
  def mirroredY(): CxG = js.native
  def mirroredZ(): CxG = js.native
  def rotate(
    rotationCenter: openjscadLib.CSGNs.Vector3D,
    rotationAxis: openjscadLib.CSGNs.Vector3D,
    degrees: scala.Double
  ): CxG = js.native
  def rotateEulerAngles(alpha: scala.Double, beta: scala.Double, gamma: scala.Double, position: js.Array[scala.Double]): CxG = js.native
  def rotateX(deg: scala.Double): CxG = js.native
  def rotateY(deg: scala.Double): CxG = js.native
  def rotateZ(deg: scala.Double): CxG = js.native
  def scale(f: openjscadLib.CSGNs.Vector3D): CxG = js.native
  def toAMFString(): scala.Unit = js.native
  def toAMFString(AMFStringOptions: IAMFStringOptions): scala.Unit = js.native
  def toStlBinary(): scala.Unit = js.native
  def toStlString(): java.lang.String = js.native
  def transform(matrix4x4: openjscadLib.CSGNs.Matrix4x4): CxG = js.native
  def translate(v: js.Array[scala.Double]): CxG = js.native
  def translate(v: openjscadLib.CSGNs.Vector3D): CxG = js.native
}

