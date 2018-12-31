package typings
package paperLib.paperNs.PathNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("paper.Path.Star")
@js.native
class Star protected ()
  extends paperLib.paperNs.Path {
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
  def this(center: paperLib.paperNs.Point, points: scala.Double, radius1: scala.Double, radius2: scala.Double) = this()
}

