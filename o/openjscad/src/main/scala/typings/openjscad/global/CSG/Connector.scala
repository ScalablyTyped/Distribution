package typings.openjscad.global.CSG

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CSG.Connector")
@js.native
class Connector protected ()
  extends typings.openjscad.CSG.Connector {
  def this(point: js.Array[Double], axisvector: js.Array[Double], normalvector: js.Array[Double]) = this()
  def this(
    point: js.Array[Double],
    axisvector: js.Array[Double],
    normalvector: typings.openjscad.CSG.Vector3D
  ) = this()
  def this(
    point: js.Array[Double],
    axisvector: typings.openjscad.CSG.Vector3D,
    normalvector: js.Array[Double]
  ) = this()
  def this(
    point: typings.openjscad.CSG.Vector3D,
    axisvector: js.Array[Double],
    normalvector: js.Array[Double]
  ) = this()
  def this(
    point: typings.openjscad.CSG.Vector3D,
    axisvector: js.Array[Double],
    normalvector: typings.openjscad.CSG.Vector3D
  ) = this()
  def this(
    point: typings.openjscad.CSG.Vector3D,
    axisvector: typings.openjscad.CSG.Vector3D,
    normalvector: typings.openjscad.CSG.Vector3D
  ) = this()
}

