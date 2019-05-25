package typings
package olLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/reproj", JSImport.Namespace)
@js.native
object reprojMod extends js.Object {
  def calculateSourceResolution(
    sourceProj: olLib.projProjectionMod.default,
    targetProj: olLib.projProjectionMod.default,
    targetCenter: olLib.coordinateMod.Coordinate,
    targetResolution: scala.Double
  ): scala.Double = js.native
  def render(
    width: scala.Double,
    height: scala.Double,
    pixelRatio: scala.Double,
    sourceResolution: scala.Double,
    sourceExtent: olLib.extentMod.Extent,
    targetResolution: scala.Double,
    targetExtent: olLib.extentMod.Extent,
    triangulation: olLib.reprojTriangulationMod.default,
    sources: js.Array[_],
    gutter: scala.Double
  ): stdLib.HTMLCanvasElement = js.native
  def render(
    width: scala.Double,
    height: scala.Double,
    pixelRatio: scala.Double,
    sourceResolution: scala.Double,
    sourceExtent: olLib.extentMod.Extent,
    targetResolution: scala.Double,
    targetExtent: olLib.extentMod.Extent,
    triangulation: olLib.reprojTriangulationMod.default,
    sources: js.Array[_],
    gutter: scala.Double,
    opt_renderEdges: scala.Boolean
  ): stdLib.HTMLCanvasElement = js.native
}

