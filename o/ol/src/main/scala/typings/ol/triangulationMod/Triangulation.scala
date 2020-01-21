package typings.ol.triangulationMod

import typings.ol.extentMod.Extent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Triangulation extends js.Object {
  def calculateSourceExtent(): Extent
  def getTriangles(): js.Array[Triangle]
}

object Triangulation {
  @scala.inline
  def apply(calculateSourceExtent: () => Extent, getTriangles: () => js.Array[Triangle]): Triangulation = {
    val __obj = js.Dynamic.literal(calculateSourceExtent = js.Any.fromFunction0(calculateSourceExtent), getTriangles = js.Any.fromFunction0(getTriangles))
  
    __obj.asInstanceOf[Triangulation]
  }
}

