package typings
package olLib.reprojTriangulationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Triangulation extends js.Object {
  def calculateSourceExtent(): olLib.extentMod.Extent
  def getTriangles(): js.Array[Triangle]
}

object Triangulation {
  @scala.inline
  def apply(calculateSourceExtent: () => olLib.extentMod.Extent, getTriangles: () => js.Array[Triangle]): Triangulation = {
    val __obj = js.Dynamic.literal(calculateSourceExtent = js.Any.fromFunction0(calculateSourceExtent), getTriangles = js.Any.fromFunction0(getTriangles))
  
    __obj.asInstanceOf[Triangulation]
  }
}

