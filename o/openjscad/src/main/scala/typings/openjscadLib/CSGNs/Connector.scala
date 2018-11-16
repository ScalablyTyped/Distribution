package typings
package openjscadLib.CSGNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CSG.Connector")
@js.native
class Connector protected ()
  extends openjscadLib.CxG {
  def this(point: js.Array[scala.Double], axisvector: js.Array[scala.Double], normalvector: js.Array[scala.Double]) = this()
  def this(point: js.Array[scala.Double], axisvector: js.Array[scala.Double], normalvector: Vector3D) = this()
  def this(point: js.Array[scala.Double], axisvector: Vector3D, normalvector: js.Array[scala.Double]) = this()
  def this(point: Vector3D, axisvector: js.Array[scala.Double], normalvector: js.Array[scala.Double]) = this()
  def this(point: Vector3D, axisvector: js.Array[scala.Double], normalvector: Vector3D) = this()
  def this(point: Vector3D, axisvector: Vector3D, normalvector: Vector3D) = this()
  var axisvector: Vector3D = js.native
  var normalvector: Vector3D = js.native
  var point: Vector3D = js.native
  def axisLine(): Line3D = js.native
  def extend(distance: scala.Double): Connector = js.native
  def getTransformationTo(other: Connector, mirror: scala.Boolean, normalrotation: scala.Double): Matrix4x4 = js.native
  def normalized(): Connector = js.native
}

