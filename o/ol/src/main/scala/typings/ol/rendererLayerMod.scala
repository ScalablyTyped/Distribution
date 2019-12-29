package typings.ol

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typings.ol.coordinateMod.Coordinate
import typings.ol.extentMod.Extent
import typings.ol.featureMod.FeatureLike
import typings.ol.pluggableMapMod.FrameState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/renderer/Layer", JSImport.Namespace)
@js.native
object rendererLayerMod extends js.Object {
  @js.native
  trait LayerRenderer
    extends typings.ol.observableMod.default {
    /* protected */ def createLoadedTileFinder(
      source: typings.ol.sourceTileMod.default,
      projection: typings.ol.projProjectionMod.default,
      tiles: NumberDictionary[StringDictionary[typings.ol.tileMod.default]]
    ): js.Function2[/* p0 */ Double, /* p1 */ typings.ol.tileRangeMod.default, Boolean] = js.native
    def forEachFeatureAtCoordinate[T](
      coordinate: Coordinate,
      frameState: FrameState,
      hitTolerance: Double,
      callback: js.Function2[/* p0 */ FeatureLike, /* p1 */ typings.ol.layerLayerMod.default, T]
    ): T | Unit = js.native
    def getLayer(): typings.ol.layerLayerMod.default = js.native
    def hasFeatureAtCoordinate(coordinate: Coordinate, frameState: FrameState): Boolean = js.native
    /* protected */ def loadImage(image: typings.ol.imageBaseMod.default): Boolean = js.native
    /* protected */ def manageTilePyramid[T](
      frameState: FrameState,
      tileSource: typings.ol.sourceTileMod.default,
      tileGrid: typings.ol.tilegridTileGridMod.default,
      pixelRatio: Double,
      projection: typings.ol.projProjectionMod.default,
      extent: Extent,
      currentZ: Double,
      preload: Double
    ): Unit = js.native
    /* protected */ def manageTilePyramid[T](
      frameState: FrameState,
      tileSource: typings.ol.sourceTileMod.default,
      tileGrid: typings.ol.tilegridTileGridMod.default,
      pixelRatio: Double,
      projection: typings.ol.projProjectionMod.default,
      extent: Extent,
      currentZ: Double,
      preload: Double,
      opt_tileCallback: js.Function0[Unit]
    ): Unit = js.native
    /* protected */ def manageTilePyramid[T](
      frameState: FrameState,
      tileSource: typings.ol.sourceTileMod.default,
      tileGrid: typings.ol.tilegridTileGridMod.default,
      pixelRatio: Double,
      projection: typings.ol.projProjectionMod.default,
      extent: Extent,
      currentZ: Double,
      preload: Double,
      opt_tileCallback: js.Function0[Unit],
      opt_this: T
    ): Unit = js.native
    /* protected */ def renderIfReadyAndVisible(): Unit = js.native
    /* protected */ def scheduleExpireCache(frameState: FrameState, tileSource: typings.ol.sourceTileMod.default): Unit = js.native
    /* protected */ def updateUsedTiles(
      usedTiles: StringDictionary[StringDictionary[typings.ol.tileRangeMod.default]],
      tileSource: typings.ol.sourceTileMod.default,
      z: Double,
      tileRange: typings.ol.tileRangeMod.default
    ): Unit = js.native
  }
  
  @js.native
  class default protected () extends LayerRenderer {
    def this(layer: typings.ol.layerLayerMod.default) = this()
  }
  
}

