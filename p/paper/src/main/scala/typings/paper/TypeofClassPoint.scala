package typings.paper

import org.scalablytyped.runtime.Instantiable2
import typings.paper.paper.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofClassPoint extends Instantiable2[/* x */ Double, /* y */ Double, Point] {
  /** 
    * Returns a new point object with the largest {@link #x} and
    * {@link #y} of the supplied points.
    * 
    * @return the newly created point object
    */
  def max(point1: Point, point2: Point): Point = js.native
  /** 
    * Returns a new point object with the smallest {@link #x} and
    * {@link #y} of the supplied points.
    * 
    * @return the newly created point object
    */
  def min(point1: Point, point2: Point): Point = js.native
  /** 
    * Returns a point object with random {@link #x} and {@link #y} values
    * between `0` and `1`.
    * 
    * @return the newly created point object
    */
  def random(): Point = js.native
}

