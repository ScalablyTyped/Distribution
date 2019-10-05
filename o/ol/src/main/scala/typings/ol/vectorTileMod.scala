package typings.ol

import typings.ol.extentMod.Extent
import typings.ol.featureMod.FeatureLike
import typings.ol.featureloaderMod.FeatureLoader
import typings.ol.tileMod.LoadFunction
import typings.ol.tileMod.Options
import typings.ol.tileStateMod.TileState
import typings.ol.tilecoordMod.TileCoord
import typings.ol.vectorTileMod.VectorTile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/VectorTile", JSImport.Namespace)
@js.native
object vectorTileMod extends js.Object {
  @js.native
  trait VectorTile
    extends typings.ol.tileMod.default {
    def getExtent(): Extent = js.native
    def getFeatures(): js.Array[FeatureLike] = js.native
    def getFormat(): typings.ol.formatFeatureMod.default = js.native
    def getProjection(): typings.ol.projProjectionMod.default = js.native
    def getReplayGroup(layer: typings.ol.layerLayerMod.default, key: String): typings.ol.renderReplayGroupMod.default = js.native
    def onError(): Unit = js.native
    def onLoad(
      features: js.Array[typings.ol.featureMod.default],
      dataProjection: typings.ol.projProjectionMod.default,
      extent: Extent
    ): Unit = js.native
    def setExtent(extent: Extent): Unit = js.native
    def setFeatures(features: js.Array[typings.ol.featureMod.default]): Unit = js.native
    def setLoader(loader: FeatureLoader): Unit = js.native
    def setProjection(projection: typings.ol.projProjectionMod.default): Unit = js.native
    def setReplayGroup(
      layer: typings.ol.layerLayerMod.default,
      key: String,
      replayGroup: typings.ol.renderReplayGroupMod.default
    ): Unit = js.native
  }
  
  @js.native
  class default protected () extends VectorTile {
    def this(
      tileCoord: TileCoord,
      state: TileState,
      src: String,
      format: typings.ol.formatFeatureMod.default,
      tileLoadFunction: LoadFunction
    ) = this()
    def this(
      tileCoord: TileCoord,
      state: TileState,
      src: String,
      format: typings.ol.formatFeatureMod.default,
      tileLoadFunction: LoadFunction,
      opt_options: Options
    ) = this()
  }
  
}

