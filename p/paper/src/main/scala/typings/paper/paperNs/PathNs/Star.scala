package typings.paper.paperNs.PathNs

import typings.paper.paperNs.Path
import typings.paper.paperNs.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("paper.Path.Star")
@js.native
class Star protected () extends Path {
  /**
    * Creates a star shaped path item from the properties described by an object literal.
    * @param object - an object literal containing properties describing the path's attributes
    */
  def this(`object`: js.Any) = this()
  /**
    * Creates a star shaped path item. The largest of radius1 and radius2 will be the outer radius of the star. The smallest of radius1 and radius2 will be the inner radius.
    * @param center - the center point of the star
    * @param points - the number of points of the star
    * @param radius1
    * @param radius2
    */
  def this(center: Point, points: Double, radius1: Double, radius2: Double) = this()
}

