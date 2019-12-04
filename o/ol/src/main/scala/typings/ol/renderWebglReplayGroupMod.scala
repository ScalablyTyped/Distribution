package typings.ol

import org.scalablytyped.runtime.StringDictionary
import typings.ol.coordinateMod.Coordinate
import typings.ol.extentMod.Extent
import typings.ol.renderWebglReplayGroupMod.WebGLReplayGroup
import typings.ol.sizeMod.Size
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/render/webgl/ReplayGroup", JSImport.Namespace)
@js.native
object renderWebglReplayGroupMod extends js.Object {
  @js.native
  trait WebGLReplayGroup
    extends typings.ol.renderReplayGroupMod.default {
    def finish(context: typings.ol.webglContextMod.default): Unit = js.native
    def forEachFeatureAtCoordinate[T](
      coordinate: Coordinate,
      context: typings.ol.webglContextMod.default,
      center: Coordinate,
      resolution: Double,
      rotation: Double,
      size: Size,
      pixelRatio: Double,
      opacity: Double,
      skippedFeaturesHash: StringDictionary[Boolean],
      callback: js.Function1[
          /* p0 */ typings.ol.featureMod.default | typings.ol.renderFeatureMod.default, 
          js.UndefOr[T]
        ]
    ): js.UndefOr[T] = js.native
    def getDeleteResourcesFunction(context: typings.ol.webglContextMod.default): js.Function0[Unit] = js.native
    def hasFeatureAtCoordinate(
      coordinate: Coordinate,
      context: typings.ol.webglContextMod.default,
      center: Coordinate,
      resolution: Double,
      rotation: Double,
      size: Size,
      pixelRatio: Double,
      opacity: Double,
      skippedFeaturesHash: StringDictionary[Boolean]
    ): Boolean = js.native
    def replay(
      context: typings.ol.webglContextMod.default,
      center: Coordinate,
      resolution: Double,
      rotation: Double,
      size: Size,
      pixelRatio: Double,
      opacity: Double,
      skippedFeaturesHash: StringDictionary[Boolean]
    ): Unit = js.native
  }
  
  @js.native
  class default protected () extends WebGLReplayGroup {
    def this(tolerance: Double, maxExtent: Extent) = this()
    def this(tolerance: Double, maxExtent: Extent, opt_renderBuffer: Double) = this()
  }
  
}

