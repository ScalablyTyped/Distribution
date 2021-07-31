package typings.ol

import typings.ol.extentMod.Extent
import typings.ol.olFeatureMod.FeatureLike
import typings.ol.olMod.Transform
import typings.ol.pixelMod.Pixel
import typings.ol.sizeMod.Size
import typings.ol.styleStyleMod.StyleFunction
import typings.std.ImageData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hitdetetMod {
  
  @JSImport("ol/render/canvas/hitdetet", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def createHitDetectionImageData(
    size: Size,
    transforms: js.Array[Transform],
    features: js.Array[FeatureLike],
    styleFunction: Unit,
    extent: Extent,
    resolution: Double,
    rotation: Double
  ): ImageData = (^.asInstanceOf[js.Dynamic].applyDynamic("createHitDetectionImageData")(size.asInstanceOf[js.Any], transforms.asInstanceOf[js.Any], features.asInstanceOf[js.Any], styleFunction.asInstanceOf[js.Any], extent.asInstanceOf[js.Any], resolution.asInstanceOf[js.Any], rotation.asInstanceOf[js.Any])).asInstanceOf[ImageData]
  @scala.inline
  def createHitDetectionImageData(
    size: Size,
    transforms: js.Array[Transform],
    features: js.Array[FeatureLike],
    styleFunction: StyleFunction,
    extent: Extent,
    resolution: Double,
    rotation: Double
  ): ImageData = (^.asInstanceOf[js.Dynamic].applyDynamic("createHitDetectionImageData")(size.asInstanceOf[js.Any], transforms.asInstanceOf[js.Any], features.asInstanceOf[js.Any], styleFunction.asInstanceOf[js.Any], extent.asInstanceOf[js.Any], resolution.asInstanceOf[js.Any], rotation.asInstanceOf[js.Any])).asInstanceOf[ImageData]
  
  @scala.inline
  def hitDetect(pixel: Pixel, features: js.Array[FeatureLike], imageData: ImageData): js.Array[FeatureLike] = (^.asInstanceOf[js.Dynamic].applyDynamic("hitDetect")(pixel.asInstanceOf[js.Any], features.asInstanceOf[js.Any], imageData.asInstanceOf[js.Any])).asInstanceOf[js.Array[FeatureLike]]
}
