package typings.paper.paperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("paper", "Rectangle")
@js.native
class Rectangle protected ()
  extends typings.paper.paperNs.Rectangle {
  /**
    * Creates a Rectangle object.
    * @param object - an object containing properties to be set on the rectangle.
    */
  def this(`object`: js.Any) = this()
  /**
    * Creates a new rectangle object from the passed rectangle object.
    * @param rt - the rectangle to copy from
    */
  def this(rt: typings.paper.paperNs.Rectangle) = this()
  /**
    * Creates a rectangle object from the passed points. These do not necessarily need to be the top left and bottom right corners, the constructor figures out how to fit a rectangle between them.
    * @param from - The first point defining the rectangle
    * @param to - The second point defining the rectangle
    */
  def this(from: typings.paper.paperNs.Point, to: typings.paper.paperNs.Point) = this()
  /**
    * Creates a Rectangle object.
    * @param point - the top-left point of the rectangle
    * @param size - the size of the rectangle
    */
  def this(point: typings.paper.paperNs.Point, size: typings.paper.paperNs.Size) = this()
  /**
    * Creates a rectangle object.
    * @param x - the left coordinate
    * @param y - the top coordinate
    * @param width - the width
    * @param height - the height
    */
  def this(x: Double, y: Double, width: Double, height: Double) = this()
}

