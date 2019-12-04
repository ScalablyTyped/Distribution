package typings.ol

import org.scalablytyped.runtime.StringDictionary
import typings.ol.coordinateMod.Coordinate
import typings.ol.extentMod.Extent
import typings.ol.renderCanvasMod.DeclutterGroup
import typings.ol.renderCanvasReplayGroupMod.CanvasReplayGroup
import typings.ol.renderReplayTypeMod.ReplayType
import typings.ol.transformMod.Transform
import typings.std.CanvasRenderingContext2D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/render/canvas/ReplayGroup", JSImport.Namespace)
@js.native
object renderCanvasReplayGroupMod extends js.Object {
  @js.native
  trait CanvasReplayGroup
    extends typings.ol.renderReplayGroupMod.default {
    def clip(context: CanvasRenderingContext2D, transform: Transform): Unit = js.native
    def finish(): Unit = js.native
    def forEachFeatureAtCoordinate[T](
      coordinate: Coordinate,
      resolution: Double,
      rotation: Double,
      hitTolerance: Double,
      skippedFeaturesHash: StringDictionary[Boolean],
      callback: js.Function1[/* p0 */ typings.ol.featureMod.default | typings.ol.renderFeatureMod.default, T],
      declutterReplays: StringDictionary[DeclutterGroup]
    ): js.UndefOr[T] = js.native
    def getClipCoords(transform: Transform): js.Array[Double] = js.native
    def getReplays(): StringDictionary[typings.ol.olStrings.CanvasReplayGroup with js.Any] = js.native
    def hasReplays(replays: js.Array[ReplayType]): Boolean = js.native
    def replay(
      context: CanvasRenderingContext2D,
      transform: Transform,
      viewRotation: Double,
      skippedFeaturesHash: StringDictionary[Boolean],
      snapToPixel: Boolean
    ): Unit = js.native
    def replay(
      context: CanvasRenderingContext2D,
      transform: Transform,
      viewRotation: Double,
      skippedFeaturesHash: StringDictionary[Boolean],
      snapToPixel: Boolean,
      opt_replayTypes: js.Array[ReplayType]
    ): Unit = js.native
    def replay(
      context: CanvasRenderingContext2D,
      transform: Transform,
      viewRotation: Double,
      skippedFeaturesHash: StringDictionary[Boolean],
      snapToPixel: Boolean,
      opt_replayTypes: js.Array[ReplayType],
      opt_declutterReplays: StringDictionary[DeclutterGroup]
    ): Unit = js.native
  }
  
  @js.native
  class default protected () extends CanvasReplayGroup {
    def this(
      tolerance: Double,
      maxExtent: Extent,
      resolution: Double,
      pixelRatio: Double,
      overlaps: Boolean,
      declutterTree: js.Any
    ) = this()
    def this(
      tolerance: Double,
      maxExtent: Extent,
      resolution: Double,
      pixelRatio: Double,
      overlaps: Boolean,
      declutterTree: js.Any,
      opt_renderBuffer: Double
    ) = this()
  }
  
  def getCircleArray(radius: Double): js.Array[js.Array[js.UndefOr[Boolean]]] = js.native
  def replayDeclutter(
    declutterReplays: StringDictionary[js.Array[_]],
    context: CanvasRenderingContext2D,
    rotation: Double,
    snapToPixel: Boolean
  ): Unit = js.native
}

