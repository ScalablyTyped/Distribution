package typings.ol

import typings.ol.coordinateMod.Coordinate
import typings.ol.extentMod.Extent
import typings.ol.projProjectionMod.default
import typings.std.HTMLCanvasElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reprojMod {
  
  @JSImport("ol/reproj", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def calculateSourceExtentResolution(sourceProj: default, targetProj: default, targetExtent: Extent, targetResolution: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("calculateSourceExtentResolution")(sourceProj.asInstanceOf[js.Any], targetProj.asInstanceOf[js.Any], targetExtent.asInstanceOf[js.Any], targetResolution.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def calculateSourceResolution(sourceProj: default, targetProj: default, targetCenter: Coordinate, targetResolution: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("calculateSourceResolution")(sourceProj.asInstanceOf[js.Any], targetProj.asInstanceOf[js.Any], targetCenter.asInstanceOf[js.Any], targetResolution.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def render(
    width: Double,
    height: Double,
    pixelRatio: Double,
    sourceResolution: Double,
    sourceExtent: Extent,
    targetResolution: Double,
    targetExtent: Extent,
    triangulation: typings.ol.reprojTriangulationMod.default,
    sources: js.Array[Any],
    gutter: Double
  ): HTMLCanvasElement = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], pixelRatio.asInstanceOf[js.Any], sourceResolution.asInstanceOf[js.Any], sourceExtent.asInstanceOf[js.Any], targetResolution.asInstanceOf[js.Any], targetExtent.asInstanceOf[js.Any], triangulation.asInstanceOf[js.Any], sources.asInstanceOf[js.Any], gutter.asInstanceOf[js.Any])).asInstanceOf[HTMLCanvasElement]
  inline def render(
    width: Double,
    height: Double,
    pixelRatio: Double,
    sourceResolution: Double,
    sourceExtent: Extent,
    targetResolution: Double,
    targetExtent: Extent,
    triangulation: typings.ol.reprojTriangulationMod.default,
    sources: js.Array[Any],
    gutter: Double,
    opt_renderEdges: Boolean
  ): HTMLCanvasElement = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], pixelRatio.asInstanceOf[js.Any], sourceResolution.asInstanceOf[js.Any], sourceExtent.asInstanceOf[js.Any], targetResolution.asInstanceOf[js.Any], targetExtent.asInstanceOf[js.Any], triangulation.asInstanceOf[js.Any], sources.asInstanceOf[js.Any], gutter.asInstanceOf[js.Any], opt_renderEdges.asInstanceOf[js.Any])).asInstanceOf[HTMLCanvasElement]
  inline def render(
    width: Double,
    height: Double,
    pixelRatio: Double,
    sourceResolution: Double,
    sourceExtent: Extent,
    targetResolution: Double,
    targetExtent: Extent,
    triangulation: typings.ol.reprojTriangulationMod.default,
    sources: js.Array[Any],
    gutter: Double,
    opt_renderEdges: Boolean,
    opt_contextOptions: Any
  ): HTMLCanvasElement = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], pixelRatio.asInstanceOf[js.Any], sourceResolution.asInstanceOf[js.Any], sourceExtent.asInstanceOf[js.Any], targetResolution.asInstanceOf[js.Any], targetExtent.asInstanceOf[js.Any], triangulation.asInstanceOf[js.Any], sources.asInstanceOf[js.Any], gutter.asInstanceOf[js.Any], opt_renderEdges.asInstanceOf[js.Any], opt_contextOptions.asInstanceOf[js.Any])).asInstanceOf[HTMLCanvasElement]
  inline def render(
    width: Double,
    height: Double,
    pixelRatio: Double,
    sourceResolution: Double,
    sourceExtent: Extent,
    targetResolution: Double,
    targetExtent: Extent,
    triangulation: typings.ol.reprojTriangulationMod.default,
    sources: js.Array[Any],
    gutter: Double,
    opt_renderEdges: Unit,
    opt_contextOptions: Any
  ): HTMLCanvasElement = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], pixelRatio.asInstanceOf[js.Any], sourceResolution.asInstanceOf[js.Any], sourceExtent.asInstanceOf[js.Any], targetResolution.asInstanceOf[js.Any], targetExtent.asInstanceOf[js.Any], triangulation.asInstanceOf[js.Any], sources.asInstanceOf[js.Any], gutter.asInstanceOf[js.Any], opt_renderEdges.asInstanceOf[js.Any], opt_contextOptions.asInstanceOf[js.Any])).asInstanceOf[HTMLCanvasElement]
}
