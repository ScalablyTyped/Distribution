package typings
package olLib.reprojTriangulationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/reproj/Triangulation", JSImport.Default)
@js.native
class default protected () extends Triangulation {
  def this(sourceProj: olLib.projProjectionMod.default, targetProj: olLib.projProjectionMod.default, targetExtent: olLib.extentMod.Extent, maxSourceExtent: olLib.extentMod.Extent, errorThreshold: scala.Double) = this()
  /* CompleteClass */
  override def calculateSourceExtent(): olLib.extentMod.Extent = js.native
  /* CompleteClass */
  override def getTriangles(): js.Array[Triangle] = js.native
}

