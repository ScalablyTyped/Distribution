package typings.openjscad.global.CSG

import typings.openjscad.CSG.IArcOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CSG.Path2D")
@js.native
class Path2D protected ()
  extends typings.openjscad.CSG.Path2D {
  def this(points: js.Array[Double | typings.openjscad.CSG.Vector2D]) = this()
  def this(points: js.Array[Double | typings.openjscad.CSG.Vector2D], closed: Boolean) = this()
}

/* static members */
@JSGlobal("CSG.Path2D")
@js.native
object Path2D extends js.Object {
  def arc(options: IArcOptions): typings.openjscad.CSG.Path2D = js.native
}

