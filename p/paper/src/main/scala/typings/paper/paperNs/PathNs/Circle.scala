package typings.paper.paperNs.PathNs

import typings.paper.paperNs.Path
import typings.paper.paperNs.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("paper.Path.Circle")
@js.native
class Circle protected () extends Path {
  /**
    * Creates a circular path item from the properties described by an object literal.
    * @param object - an object literal containing properties describing the path's attributes
    */
  def this(`object`: js.Any) = this()
  /**
    * Creates a circular path item.
    * @param center - the center point of the circle
    * @param radius - the radius of the circle
    */
  def this(center: Point, radius: Double) = this()
}

