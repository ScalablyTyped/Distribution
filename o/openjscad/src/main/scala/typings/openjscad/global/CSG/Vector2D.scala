package typings.openjscad.global.CSG

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CSG.Vector2D")
@js.native
class Vector2D protected ()
  extends typings.openjscad.CSG.Vector2D {
  def this(x: js.Array[Double]) = this()
  def this(x: typings.openjscad.CSG.Vector2D) = this()
  def this(x: Double, y: Double) = this()
}

/* static members */
@JSGlobal("CSG.Vector2D")
@js.native
object Vector2D extends js.Object {
  def Create(x: Double, y: Double): typings.openjscad.CSG.Vector2D = js.native
  def fromAngle(radians: Double): typings.openjscad.CSG.Vector2D = js.native
  def fromAngleDegrees(degrees: Double): typings.openjscad.CSG.Vector2D = js.native
  def fromAngleRadians(radians: Double): typings.openjscad.CSG.Vector2D = js.native
}

