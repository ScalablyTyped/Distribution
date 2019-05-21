package typings
package paperLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Max
  extends org.scalablytyped.runtime.Instantiable2[/* x */ scala.Double, /* y */ scala.Double, paperLib.paperNs.Point] {
  /**
    * Returns a new point object with the largest x and y of the supplied points.
    * @param point1 -
    * @param point2 -
    */
  def max(point1: paperLib.paperNs.Point, point2: paperLib.paperNs.Point): paperLib.paperNs.Point = js.native
  /**
    * Returns a new point object with the smallest x and y of the supplied points.
    * @param point1 -
    * @param point2 -
    */
  def min(point1: paperLib.paperNs.Point, point2: paperLib.paperNs.Point): paperLib.paperNs.Point = js.native
  /**
    * Returns a point object with random x and y values between 0 and 1.
    */
  def random(): paperLib.paperNs.Point = js.native
}

