package typings.openjscad.CSG

import typings.openjscad.CxG
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CSG.Connector")
@js.native
class Connector protected () extends CxG {
  def this(point: js.Array[Double], axisvector: js.Array[Double], normalvector: js.Array[Double]) = this()
  def this(point: js.Array[Double], axisvector: js.Array[Double], normalvector: Vector3D) = this()
  def this(point: js.Array[Double], axisvector: Vector3D, normalvector: js.Array[Double]) = this()
  def this(point: Vector3D, axisvector: js.Array[Double], normalvector: js.Array[Double]) = this()
  def this(point: Vector3D, axisvector: js.Array[Double], normalvector: Vector3D) = this()
  def this(point: Vector3D, axisvector: Vector3D, normalvector: Vector3D) = this()
  var axisvector: Vector3D = js.native
  var normalvector: Vector3D = js.native
  var point: Vector3D = js.native
  def axisLine(): Line3D = js.native
  def extend(distance: Double): Connector = js.native
  def getTransformationTo(other: Connector, mirror: Boolean, normalrotation: Double): Matrix4x4 = js.native
  def normalized(): Connector = js.native
}

