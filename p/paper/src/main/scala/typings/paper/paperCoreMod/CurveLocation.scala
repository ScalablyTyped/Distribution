package typings.paper.paperCoreMod

import typings.paper.paper.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("paper/dist/paper-core", "CurveLocation")
@js.native
class CurveLocation protected ()
  extends typings.paper.paper.CurveLocation {
  /** 
    * Creates a new CurveLocation object.
    */
  def this(curve: typings.paper.paper.Curve, time: Double) = this()
  def this(curve: typings.paper.paper.Curve, time: Double, point: Point) = this()
}

