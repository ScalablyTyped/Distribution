package typings.ol

import typings.ol.coordinateMod.Coordinate
import typings.ol.extentMod.Extent
import typings.ol.projectionMod.default
import typings.std.HTMLCanvasElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/reproj", JSImport.Namespace)
@js.native
object reprojMod extends js.Object {
  def calculateSourceResolution(sourceProj: default, targetProj: default, targetCenter: Coordinate, targetResolution: Double): Double = js.native
  def render(
    width: Double,
    height: Double,
    pixelRatio: Double,
    sourceResolution: Double,
    sourceExtent: Extent,
    targetResolution: Double,
    targetExtent: Extent,
    triangulation: typings.ol.triangulationMod.default,
    sources: js.Array[_],
    gutter: Double
  ): HTMLCanvasElement = js.native
  def render(
    width: Double,
    height: Double,
    pixelRatio: Double,
    sourceResolution: Double,
    sourceExtent: Extent,
    targetResolution: Double,
    targetExtent: Extent,
    triangulation: typings.ol.triangulationMod.default,
    sources: js.Array[_],
    gutter: Double,
    opt_renderEdges: Boolean
  ): HTMLCanvasElement = js.native
}

