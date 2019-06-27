package typings
package olLib.renderCanvasReplayGroupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CanvasReplayGroup
  extends olLib.renderReplayGroupMod.default {
  def clip(context: stdLib.CanvasRenderingContext2D, transform: olLib.transformMod.Transform): scala.Unit = js.native
  def finish(): scala.Unit = js.native
  def forEachFeatureAtCoordinate[T](
    coordinate: olLib.coordinateMod.Coordinate,
    resolution: scala.Double,
    rotation: scala.Double,
    hitTolerance: scala.Double,
    skippedFeaturesHash: org.scalablytyped.runtime.StringDictionary[scala.Boolean],
    callback: js.Function1[/* p0 */ olLib.featureMod.default | olLib.renderFeatureMod.default, T],
    declutterReplays: org.scalablytyped.runtime.StringDictionary[olLib.renderCanvasMod.DeclutterGroup]
  ): T = js.native
  def getClipCoords(transform: olLib.transformMod.Transform): js.Array[scala.Double] = js.native
  def getReplays(): org.scalablytyped.runtime.StringDictionary[olLib.olLibStrings.CanvasReplayGroup with js.Any] = js.native
  def hasReplays(replays: js.Array[olLib.renderReplayTypeMod.ReplayType]): scala.Boolean = js.native
  def replay(
    context: stdLib.CanvasRenderingContext2D,
    transform: olLib.transformMod.Transform,
    viewRotation: scala.Double,
    skippedFeaturesHash: org.scalablytyped.runtime.StringDictionary[scala.Boolean],
    snapToPixel: scala.Boolean
  ): scala.Unit = js.native
  def replay(
    context: stdLib.CanvasRenderingContext2D,
    transform: olLib.transformMod.Transform,
    viewRotation: scala.Double,
    skippedFeaturesHash: org.scalablytyped.runtime.StringDictionary[scala.Boolean],
    snapToPixel: scala.Boolean,
    opt_replayTypes: js.Array[olLib.renderReplayTypeMod.ReplayType]
  ): scala.Unit = js.native
  def replay(
    context: stdLib.CanvasRenderingContext2D,
    transform: olLib.transformMod.Transform,
    viewRotation: scala.Double,
    skippedFeaturesHash: org.scalablytyped.runtime.StringDictionary[scala.Boolean],
    snapToPixel: scala.Boolean,
    opt_replayTypes: js.Array[olLib.renderReplayTypeMod.ReplayType],
    opt_declutterReplays: org.scalablytyped.runtime.StringDictionary[olLib.renderCanvasMod.DeclutterGroup]
  ): scala.Unit = js.native
}

