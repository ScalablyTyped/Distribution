package typings.paper

import org.scalablytyped.runtime.Instantiable2
import typings.paper.paper.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofClassPoint extends Instantiable2[/* x */ Double, /* y */ Double, Point] {
  /**
    * Returns a new point object with the largest x and y of the supplied points.
    * @param point1 -
    * @param point2 -
    */
  def max(point1: Point, point2: Point): Point = js.native
  /**
    * Returns a new point object with the smallest x and y of the supplied points.
    * @param point1 -
    * @param point2 -
    */
  def min(point1: Point, point2: Point): Point = js.native
  /**
    * Returns a point object with random x and y values between 0 and 1.
    */
  def random(): Point = js.native
}

