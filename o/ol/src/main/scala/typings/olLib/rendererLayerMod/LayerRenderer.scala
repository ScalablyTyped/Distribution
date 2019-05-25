package typings
package olLib.rendererLayerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LayerRenderer
  extends olLib.observableMod.default {
  /* protected */ def createLoadedTileFinder(
    source: olLib.sourceTileMod.default,
    projection: olLib.projProjectionMod.default,
    tiles: org.scalablytyped.runtime.NumberDictionary[org.scalablytyped.runtime.StringDictionary[olLib.tileMod.default]]
  ): js.Function2[/* param0 */ scala.Double, /* param1 */ olLib.tileRangeMod.default, scala.Boolean] = js.native
  def forEachFeatureAtCoordinate[T](
    coordinate: olLib.coordinateMod.Coordinate,
    frameState: olLib.pluggableMapMod.FrameState,
    hitTolerance: scala.Double,
    callback: js.Function2[
      /* param0 */ olLib.featureMod.FeatureLike, 
      /* param1 */ olLib.layerLayerMod.default, 
      T
    ]
  ): T | scala.Unit = js.native
  def getLayer(): olLib.layerLayerMod.default = js.native
  def hasFeatureAtCoordinate(coordinate: olLib.coordinateMod.Coordinate, frameState: olLib.pluggableMapMod.FrameState): scala.Boolean = js.native
  /* protected */ def loadImage(image: olLib.imageBaseMod.default): scala.Boolean = js.native
  /* protected */ def manageTilePyramid[T](
    frameState: olLib.pluggableMapMod.FrameState,
    tileSource: olLib.sourceTileMod.default,
    tileGrid: olLib.tilegridTileGridMod.default,
    pixelRatio: scala.Double,
    projection: olLib.projProjectionMod.default,
    extent: olLib.extentMod.Extent,
    currentZ: scala.Double,
    preload: scala.Double
  ): scala.Unit = js.native
  /* protected */ def manageTilePyramid[T](
    frameState: olLib.pluggableMapMod.FrameState,
    tileSource: olLib.sourceTileMod.default,
    tileGrid: olLib.tilegridTileGridMod.default,
    pixelRatio: scala.Double,
    projection: olLib.projProjectionMod.default,
    extent: olLib.extentMod.Extent,
    currentZ: scala.Double,
    preload: scala.Double,
    opt_tileCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  /* protected */ def manageTilePyramid[T](
    frameState: olLib.pluggableMapMod.FrameState,
    tileSource: olLib.sourceTileMod.default,
    tileGrid: olLib.tilegridTileGridMod.default,
    pixelRatio: scala.Double,
    projection: olLib.projProjectionMod.default,
    extent: olLib.extentMod.Extent,
    currentZ: scala.Double,
    preload: scala.Double,
    opt_tileCallback: js.Function0[scala.Unit],
    opt_this: T
  ): scala.Unit = js.native
  /* protected */ def renderIfReadyAndVisible(): scala.Unit = js.native
  /* protected */ def scheduleExpireCache(frameState: olLib.pluggableMapMod.FrameState, tileSource: olLib.sourceTileMod.default): scala.Unit = js.native
  /* protected */ def updateUsedTiles(
    usedTiles: org.scalablytyped.runtime.StringDictionary[org.scalablytyped.runtime.StringDictionary[olLib.tileRangeMod.default]],
    tileSource: olLib.sourceTileMod.default,
    z: scala.Double,
    tileRange: olLib.tileRangeMod.default
  ): scala.Unit = js.native
}

