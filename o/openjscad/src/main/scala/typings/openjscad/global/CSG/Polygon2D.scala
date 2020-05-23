package typings.openjscad.global.CSG

import typings.openjscad.CAG
import typings.openjscad.CxG
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CSG.Polygon2D")
@js.native
class Polygon2D protected () extends CAG {
  def this(points: js.Array[typings.openjscad.CSG.Vector2D]) = this()
  /* CompleteClass */
  override def center(cAxes: js.Array[String]): CxG = js.native
}

