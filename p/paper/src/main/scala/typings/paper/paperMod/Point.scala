package typings.paper.paperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("paper", "Point")
@js.native
class Point protected ()
  extends typings.paper.paper.Point {
  /**
    * Creates a Point object using the properties in the given object.
    * @param object - the object describing the point's properties
    */
  def this(`object`: js.Any) = this()
  /**
    * Creates a Point object using the coordinates of the given Point object.
    * @param point - the point to copy
    */
  def this(point: typings.paper.paper.Point) = this()
  /**
    * Creates a Point object using the width and height values of the given Size object.
    * @param size - the size width and height to use
    */
  def this(size: typings.paper.paper.Size) = this()
  /**
    * Creates a Point object using the numbers in the given array as coordinates.
    * @param array - an array of numbers to use as coordinates
    */
  def this(values: js.Array[Double]) = this()
  /**
    * Creates a Point object with the given x and y coordinates.
    * @param x - the x coordinate
    * @param y - the y coordinate
    */
  def this(x: Double, y: Double) = this()
}

/* static members */
@JSImport("paper", "Point")
@js.native
object Point extends js.Object {
  /**
    * Returns a new point object with the largest x and y of the supplied points.
    * @param point1 -
    * @param point2 -
    */
  def max(point1: typings.paper.paper.Point, point2: typings.paper.paper.Point): typings.paper.paper.Point = js.native
  /**
    * Returns a new point object with the smallest x and y of the supplied points.
    * @param point1 -
    * @param point2 -
    */
  def min(point1: typings.paper.paper.Point, point2: typings.paper.paper.Point): typings.paper.paper.Point = js.native
  /**
    * Returns a point object with random x and y values between 0 and 1.
    */
  def random(): typings.paper.paper.Point = js.native
}

