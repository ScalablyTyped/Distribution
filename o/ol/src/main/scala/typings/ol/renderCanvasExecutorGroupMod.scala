package typings.ol

import org.scalablytyped.runtime.StringDictionary
import typings.ol.coordinateMod.Coordinate
import typings.ol.extentMod.Extent
import typings.ol.featureMod.FeatureLike
import typings.ol.pluggableMapMod.DeclutterItems
import typings.ol.renderCanvasBuilderTypeMod.BuilderType
import typings.ol.renderCanvasMod.DeclutterGroup
import typings.ol.transformMod.Transform
import typings.std.CanvasRenderingContext2D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/render/canvas/ExecutorGroup", JSImport.Namespace)
@js.native
object renderCanvasExecutorGroupMod extends js.Object {
  @js.native
  trait ExecutorGroup
    extends typings.ol.disposableMod.default {
    def clip(context: CanvasRenderingContext2D, transform: Transform): Unit = js.native
    def execute(
      context: CanvasRenderingContext2D,
      transform: Transform,
      viewRotation: Double,
      snapToPixel: Boolean
    ): Unit = js.native
    def execute(
      context: CanvasRenderingContext2D,
      transform: Transform,
      viewRotation: Double,
      snapToPixel: Boolean,
      opt_builderTypes: js.Array[BuilderType]
    ): Unit = js.native
    def execute(
      context: CanvasRenderingContext2D,
      transform: Transform,
      viewRotation: Double,
      snapToPixel: Boolean,
      opt_builderTypes: js.Array[BuilderType],
      opt_declutterReplays: StringDictionary[DeclutterGroup]
    ): Unit = js.native
    def forEachFeatureAtCoordinate[T](
      coordinate: Coordinate,
      resolution: Double,
      rotation: Double,
      hitTolerance: Double,
      callback: js.Function1[/* p0 */ FeatureLike, T],
      declutteredFeatures: js.Array[FeatureLike]
    ): T = js.native
    def getClipCoords(transform: Transform): js.Array[Double] = js.native
    def hasExecutors(executors: js.Array[BuilderType]): Boolean = js.native
    def isEmpty(): Boolean = js.native
  }
  
  @js.native
  class default protected () extends ExecutorGroup {
    def this(
      maxExtent: Extent,
      resolution: Double,
      pixelRatio: Double,
      overlaps: Boolean,
      allInstructions: StringDictionary[typings.ol.olStrings.default with js.Any]
    ) = this()
    def this(
      maxExtent: Extent,
      resolution: Double,
      pixelRatio: Double,
      overlaps: Boolean,
      allInstructions: StringDictionary[typings.ol.olStrings.default with js.Any],
      opt_renderBuffer: Double
    ) = this()
  }
  
  def getCircleArray(radius: Double): js.Array[js.Array[js.UndefOr[Boolean]]] = js.native
  def replayDeclutter(
    declutterReplays: StringDictionary[js.Array[_]],
    context: CanvasRenderingContext2D,
    rotation: Double,
    opacity: Double,
    snapToPixel: Boolean,
    declutterItems: js.Array[DeclutterItems]
  ): Unit = js.native
}

