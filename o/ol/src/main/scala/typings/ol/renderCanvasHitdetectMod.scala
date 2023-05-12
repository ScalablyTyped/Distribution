package typings.ol

import typings.ol.extentMod.Extent
import typings.ol.featureMod.FeatureLike
import typings.ol.olDoubles.`0.5`
import typings.ol.pixelMod.Pixel
import typings.ol.sizeMod.Size
import typings.ol.styleStyleMod.StyleFunction
import typings.ol.transformMod.Transform
import typings.std.ImageData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object renderCanvasHitdetectMod {
  
  @JSImport("ol/render/canvas/hitdetect", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ol/render/canvas/hitdetect", "HIT_DETECT_RESOLUTION")
  @js.native
  val HIT_DETECT_RESOLUTION: `0.5` = js.native
  
  inline def createHitDetectionImageData(
    size: Size,
    transforms: js.Array[Transform],
    features: js.Array[FeatureLike],
    styleFunction: Unit,
    extent: Extent,
    resolution: Double,
    rotation: Double
  ): ImageData = (^.asInstanceOf[js.Dynamic].applyDynamic("createHitDetectionImageData")(size.asInstanceOf[js.Any], transforms.asInstanceOf[js.Any], features.asInstanceOf[js.Any], styleFunction.asInstanceOf[js.Any], extent.asInstanceOf[js.Any], resolution.asInstanceOf[js.Any], rotation.asInstanceOf[js.Any])).asInstanceOf[ImageData]
  inline def createHitDetectionImageData(
    size: Size,
    transforms: js.Array[Transform],
    features: js.Array[FeatureLike],
    styleFunction: StyleFunction,
    extent: Extent,
    resolution: Double,
    rotation: Double
  ): ImageData = (^.asInstanceOf[js.Dynamic].applyDynamic("createHitDetectionImageData")(size.asInstanceOf[js.Any], transforms.asInstanceOf[js.Any], features.asInstanceOf[js.Any], styleFunction.asInstanceOf[js.Any], extent.asInstanceOf[js.Any], resolution.asInstanceOf[js.Any], rotation.asInstanceOf[js.Any])).asInstanceOf[ImageData]
  
  inline def hitDetect[F /* <: FeatureLike */](pixel: Pixel, features: js.Array[F], imageData: ImageData): js.Array[F] = (^.asInstanceOf[js.Dynamic].applyDynamic("hitDetect")(pixel.asInstanceOf[js.Any], features.asInstanceOf[js.Any], imageData.asInstanceOf[js.Any])).asInstanceOf[js.Array[F]]
}
