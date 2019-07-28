package typings.paper.paperNs.PathNs

import typings.paper.paperNs.Path
import typings.paper.paperNs.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("paper.Path.RegularPolygon")
@js.native
class RegularPolygon protected () extends Path {
  /**
    * Creates a regular polygon shaped path item from the properties described by an object literal.
    * @param object - an object literal containing properties describing the path's attributes
    */
  def this(`object`: js.Any) = this()
  /**
    * Creates a regular polygon shaped path item.
    * @param center - the center point of the polygon
    * @param sides - the number of sides of the polygon
    * @param radius - the radius of the polygon
    */
  def this(center: Point, sides: Double, radius: Double) = this()
}

