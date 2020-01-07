package typings.ol.pluggableMapMod

import org.scalablytyped.runtime.StringDictionary
import typings.ol.extentMod.Extent
import typings.ol.layerLayerMod.State
import typings.ol.sizeMod.Size
import typings.ol.transformMod.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FrameState extends js.Object {
  var animate: Boolean
  var coordinateToPixelTransform: Transform
  var declutterItems: js.Array[DeclutterItems]
  var extent: Extent
  var index: Double
  var layerIndex: Double
  var layerStatesArray: js.Array[State]
  var pixelRatio: Double
  var pixelToCoordinateTransform: Transform
  var postRenderFunctions: js.Array[PostRenderFunction]
  var size: Size
  var tileQueue: typings.ol.tileQueueMod.default
  var time: Double
  var usedTiles: StringDictionary[StringDictionary[Boolean]]
  var viewHints: js.Array[Double]
  var viewState: typings.ol.viewMod.State
  var wantedTiles: StringDictionary[StringDictionary[Boolean]]
}

object FrameState {
  @scala.inline
  def apply(
    animate: Boolean,
    coordinateToPixelTransform: Transform,
    declutterItems: js.Array[DeclutterItems],
    extent: Extent,
    index: Double,
    layerIndex: Double,
    layerStatesArray: js.Array[State],
    pixelRatio: Double,
    pixelToCoordinateTransform: Transform,
    postRenderFunctions: js.Array[PostRenderFunction],
    size: Size,
    tileQueue: typings.ol.tileQueueMod.default,
    time: Double,
    usedTiles: StringDictionary[StringDictionary[Boolean]],
    viewHints: js.Array[Double],
    viewState: typings.ol.viewMod.State,
    wantedTiles: StringDictionary[StringDictionary[Boolean]]
  ): FrameState = {
    val __obj = js.Dynamic.literal(animate = animate.asInstanceOf[js.Any], coordinateToPixelTransform = coordinateToPixelTransform.asInstanceOf[js.Any], declutterItems = declutterItems.asInstanceOf[js.Any], extent = extent.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], layerIndex = layerIndex.asInstanceOf[js.Any], layerStatesArray = layerStatesArray.asInstanceOf[js.Any], pixelRatio = pixelRatio.asInstanceOf[js.Any], pixelToCoordinateTransform = pixelToCoordinateTransform.asInstanceOf[js.Any], postRenderFunctions = postRenderFunctions.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], tileQueue = tileQueue.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], usedTiles = usedTiles.asInstanceOf[js.Any], viewHints = viewHints.asInstanceOf[js.Any], viewState = viewState.asInstanceOf[js.Any], wantedTiles = wantedTiles.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FrameState]
  }
}

