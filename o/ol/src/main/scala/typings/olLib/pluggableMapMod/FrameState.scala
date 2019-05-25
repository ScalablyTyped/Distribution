package typings
package olLib.pluggableMapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FrameState extends js.Object {
  var animate: scala.Boolean
  var coordinateToPixelTransform: olLib.transformMod.Transform
  var extent: olLib.extentMod.Extent
  var focus: olLib.coordinateMod.Coordinate
  var index: scala.Double
  var layerStates: org.scalablytyped.runtime.StringDictionary[olLib.layerLayerMod.State]
  var layerStatesArray: js.Array[olLib.layerLayerMod.State]
  var pixelRatio: scala.Double
  var pixelToCoordinateTransform: olLib.transformMod.Transform
  var postRenderFunctions: js.Array[PostRenderFunction]
  var size: olLib.sizeMod.Size
  var skippedFeatureUids: org.scalablytyped.runtime.StringDictionary[scala.Boolean]
  var tileQueue: olLib.tileQueueMod.default
  var time: scala.Double
  var usedTiles: org.scalablytyped.runtime.StringDictionary[org.scalablytyped.runtime.StringDictionary[olLib.tileRangeMod.default]]
  var viewHints: js.Array[scala.Double]
  var viewState: olLib.viewMod.State
  var wantedTiles: org.scalablytyped.runtime.StringDictionary[org.scalablytyped.runtime.StringDictionary[scala.Boolean]]
}

object FrameState {
  @scala.inline
  def apply(
    animate: scala.Boolean,
    coordinateToPixelTransform: olLib.transformMod.Transform,
    extent: olLib.extentMod.Extent,
    focus: olLib.coordinateMod.Coordinate,
    index: scala.Double,
    layerStates: org.scalablytyped.runtime.StringDictionary[olLib.layerLayerMod.State],
    layerStatesArray: js.Array[olLib.layerLayerMod.State],
    pixelRatio: scala.Double,
    pixelToCoordinateTransform: olLib.transformMod.Transform,
    postRenderFunctions: js.Array[PostRenderFunction],
    size: olLib.sizeMod.Size,
    skippedFeatureUids: org.scalablytyped.runtime.StringDictionary[scala.Boolean],
    tileQueue: olLib.tileQueueMod.default,
    time: scala.Double,
    usedTiles: org.scalablytyped.runtime.StringDictionary[org.scalablytyped.runtime.StringDictionary[olLib.tileRangeMod.default]],
    viewHints: js.Array[scala.Double],
    viewState: olLib.viewMod.State,
    wantedTiles: org.scalablytyped.runtime.StringDictionary[org.scalablytyped.runtime.StringDictionary[scala.Boolean]]
  ): FrameState = {
    val __obj = js.Dynamic.literal(animate = animate, coordinateToPixelTransform = coordinateToPixelTransform, extent = extent, focus = focus, index = index, layerStates = layerStates, layerStatesArray = layerStatesArray, pixelRatio = pixelRatio, pixelToCoordinateTransform = pixelToCoordinateTransform, postRenderFunctions = postRenderFunctions, size = size, skippedFeatureUids = skippedFeatureUids, tileQueue = tileQueue, time = time, usedTiles = usedTiles, viewHints = viewHints, viewState = viewState, wantedTiles = wantedTiles)
  
    __obj.asInstanceOf[FrameState]
  }
}

