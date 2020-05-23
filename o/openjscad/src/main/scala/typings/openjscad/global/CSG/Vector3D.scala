package typings.openjscad.global.CSG

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CSG.Vector3D")
@js.native
class Vector3D protected ()
  extends typings.openjscad.CSG.Vector3D {
  def this(v2: js.Array[Double]) = this()
  def this(v2: typings.openjscad.CSG.Vector2D) = this()
  def this(v3: typings.openjscad.CSG.Vector3D) = this()
  def this(x: Double, y: Double) = this()
  def this(x: Double, y: Double, z: Double) = this()
}

/* static members */
@JSGlobal("CSG.Vector3D")
@js.native
object Vector3D extends js.Object {
  def Create(x: Double, y: Double, z: Double): typings.openjscad.CSG.Vector3D = js.native
}

