package typings.openjscad.CSG

import typings.openjscad.CxG
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrthoNormalBasis extends CxG {
  var plane: Plane = js.native
  var planeorigin: Vector3D = js.native
  var u: Vector3D = js.native
  var v: Vector3D = js.native
  def getInverseProjectionMatrix(): Matrix4x4 = js.native
  def getProjectionMatrix(): Matrix4x4 = js.native
  def line2Dto3D(line2d: Line2D): Line3D = js.native
  def line3Dto2D(line3d: Line3D): Line2D = js.native
  def to2D(vec3: Vector3D): Vector2D = js.native
  def to3D(vec2: Vector2D): Vector3D = js.native
}

