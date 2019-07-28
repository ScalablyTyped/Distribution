package typings.paper.paperNs.PathNs

import typings.paper.paperNs.Path
import typings.paper.paperNs.Point
import typings.paper.paperNs.Size
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("paper.Path.Rectangle")
@js.native
class Rectangle protected () extends Path {
  /**
    * Creates a rectangular path item from the properties described by an object literal.
    * @param object - an object literal containing properties describing the path's attributes
    */
  def this(`object`: js.Any) = this()
  /**
    * Creates a rectangular path item, with optionally rounded corners.
    * @param rectangle - the rectangle object describing the geometry of the rectangular path to be created.
    * @param radius [optional] - the size of the rounded corners default: null
    */
  def this(rectangle: typings.paper.paperNs.Rectangle) = this()
  /**
    * Creates a rectangular path item from the passed points. These do not necessarily need to be the top left and bottom right corners, the constructor figures out how to fit a rectangle between them.
    * @param from - the first point defining the rectangle
    * @param to - the second point defining the rectangle
    */
  def this(from: Point, to: Point) = this()
  /**
    * Creates a rectangular path item from a point and a size object.
    * @param point - the rectangle's top-left corner.
    * @param size - the rectangle's size.
    */
  def this(point: Point, size: Size) = this()
  def this(rectangle: typings.paper.paperNs.Rectangle, radius: Double) = this()
}

