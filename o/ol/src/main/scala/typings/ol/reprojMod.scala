package typings.ol

import typings.ol.coordinateMod.Coordinate
import typings.ol.extentMod.Extent
import typings.ol.projProjectionMod.default
import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import typings.std.HTMLVideoElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reprojMod {
  
  @JSImport("ol/reproj", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def calculateSourceExtentResolution(sourceProj: default, targetProj: default, targetExtent: Extent, targetResolution: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("calculateSourceExtentResolution")(sourceProj.asInstanceOf[js.Any], targetProj.asInstanceOf[js.Any], targetExtent.asInstanceOf[js.Any], targetResolution.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def calculateSourceResolution(sourceProj: default, targetProj: default, targetCenter: Coordinate, targetResolution: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("calculateSourceResolution")(sourceProj.asInstanceOf[js.Any], targetProj.asInstanceOf[js.Any], targetCenter.asInstanceOf[js.Any], targetResolution.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @JSImport("ol/reproj", "canvasPool")
  @js.native
  val canvasPool: js.Array[HTMLCanvasElement] = js.native
  
  inline def render(
    width: Double,
    height: Double,
    pixelRatio: Double,
    sourceResolution: Double,
    sourceExtent: Extent,
    targetResolution: Double,
    targetExtent: Extent,
    triangulation: typings.ol.reprojTriangulationMod.default,
    sources: js.Array[ImageExtent],
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
    sources: js.Array[ImageExtent],
    gutter: Double,
    renderEdges: Boolean
  ): HTMLCanvasElement = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], pixelRatio.asInstanceOf[js.Any], sourceResolution.asInstanceOf[js.Any], sourceExtent.asInstanceOf[js.Any], targetResolution.asInstanceOf[js.Any], targetExtent.asInstanceOf[js.Any], triangulation.asInstanceOf[js.Any], sources.asInstanceOf[js.Any], gutter.asInstanceOf[js.Any], renderEdges.asInstanceOf[js.Any])).asInstanceOf[HTMLCanvasElement]
  inline def render(
    width: Double,
    height: Double,
    pixelRatio: Double,
    sourceResolution: Double,
    sourceExtent: Extent,
    targetResolution: Double,
    targetExtent: Extent,
    triangulation: typings.ol.reprojTriangulationMod.default,
    sources: js.Array[ImageExtent],
    gutter: Double,
    renderEdges: Boolean,
    interpolate: Boolean
  ): HTMLCanvasElement = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], pixelRatio.asInstanceOf[js.Any], sourceResolution.asInstanceOf[js.Any], sourceExtent.asInstanceOf[js.Any], targetResolution.asInstanceOf[js.Any], targetExtent.asInstanceOf[js.Any], triangulation.asInstanceOf[js.Any], sources.asInstanceOf[js.Any], gutter.asInstanceOf[js.Any], renderEdges.asInstanceOf[js.Any], interpolate.asInstanceOf[js.Any])).asInstanceOf[HTMLCanvasElement]
  inline def render(
    width: Double,
    height: Double,
    pixelRatio: Double,
    sourceResolution: Double,
    sourceExtent: Extent,
    targetResolution: Double,
    targetExtent: Extent,
    triangulation: typings.ol.reprojTriangulationMod.default,
    sources: js.Array[ImageExtent],
    gutter: Double,
    renderEdges: Unit,
    interpolate: Boolean
  ): HTMLCanvasElement = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], pixelRatio.asInstanceOf[js.Any], sourceResolution.asInstanceOf[js.Any], sourceExtent.asInstanceOf[js.Any], targetResolution.asInstanceOf[js.Any], targetExtent.asInstanceOf[js.Any], triangulation.asInstanceOf[js.Any], sources.asInstanceOf[js.Any], gutter.asInstanceOf[js.Any], renderEdges.asInstanceOf[js.Any], interpolate.asInstanceOf[js.Any])).asInstanceOf[HTMLCanvasElement]
  
  trait ImageExtent extends StObject {
    
    /**
      * Extent.
      */
    var extent: Extent
    
    /**
      * Image.
      */
    var image: HTMLCanvasElement | HTMLImageElement | HTMLVideoElement
  }
  object ImageExtent {
    
    inline def apply(extent: Extent, image: HTMLCanvasElement | HTMLImageElement | HTMLVideoElement): ImageExtent = {
      val __obj = js.Dynamic.literal(extent = extent.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any])
      __obj.asInstanceOf[ImageExtent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ImageExtent] (val x: Self) extends AnyVal {
      
      inline def setExtent(value: Extent): Self = StObject.set(x, "extent", value.asInstanceOf[js.Any])
      
      inline def setExtentVarargs(value: Double*): Self = StObject.set(x, "extent", js.Array(value*))
      
      inline def setImage(value: HTMLCanvasElement | HTMLImageElement | HTMLVideoElement): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    }
  }
}
