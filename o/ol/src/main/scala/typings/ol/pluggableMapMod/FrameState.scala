package typings.ol.pluggableMapMod

import org.scalablytyped.runtime.StringDictionary
import typings.ol.coordinateMod.Coordinate
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
  var extent: Extent
  var focus: Coordinate
  var index: Double
  var layerStates: StringDictionary[State]
  var layerStatesArray: js.Array[State]
  var pixelRatio: Double
  var pixelToCoordinateTransform: Transform
  var postRenderFunctions: js.Array[PostRenderFunction]
  var size: Size
  var skippedFeatureUids: StringDictionary[Boolean]
  var tileQueue: typings.ol.tileQueueMod.default
  var time: Double
  var usedTiles: StringDictionary[StringDictionary[typings.ol.tileRangeMod.default]]
  var viewHints: js.Array[Double]
  var viewState: typings.ol.viewMod.State
  var wantedTiles: StringDictionary[StringDictionary[Boolean]]
}

object FrameState {
  @scala.inline
  def apply(
    animate: Boolean,
    coordinateToPixelTransform: Transform,
    extent: Extent,
    focus: Coordinate,
    index: Double,
    layerStates: StringDictionary[State],
    layerStatesArray: js.Array[State],
    pixelRatio: Double,
    pixelToCoordinateTransform: Transform,
    postRenderFunctions: js.Array[PostRenderFunction],
    size: Size,
    skippedFeatureUids: StringDictionary[Boolean],
    tileQueue: typings.ol.tileQueueMod.default,
    time: Double,
    usedTiles: StringDictionary[StringDictionary[typings.ol.tileRangeMod.default]],
    viewHints: js.Array[Double],
    viewState: typings.ol.viewMod.State,
    wantedTiles: StringDictionary[StringDictionary[Boolean]]
  ): FrameState = {
    val __obj = js.Dynamic.literal(animate = animate, coordinateToPixelTransform = coordinateToPixelTransform, extent = extent, focus = focus, index = index, layerStates = layerStates, layerStatesArray = layerStatesArray, pixelRatio = pixelRatio, pixelToCoordinateTransform = pixelToCoordinateTransform, postRenderFunctions = postRenderFunctions, size = size, skippedFeatureUids = skippedFeatureUids, tileQueue = tileQueue, time = time, usedTiles = usedTiles, viewHints = viewHints, viewState = viewState, wantedTiles = wantedTiles)
  
    __obj.asInstanceOf[FrameState]
  }
}

